


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebElement;




public class Report{
	//	static WebDriver driver;
	static BufferedWriter bw = null;
	static BufferedWriter bw1 = null;
	static String htmlname;
	static String objType;
	static String objName;
	static String TestData;
	static String rootPath;
	static int report;


	static Date cur_dt = null;
	static String filenamer;
	static String TestReport;
	int rowcnt;
	static String exeStatus = "True";
	static int iflag = 0;
	static int j = 1;

	static String fireFoxBrowser;
	static String chromeBrowser;

	static String result;

	static int intRowCount = 0;
	static String dataTablePath;
	static int i;
	static String browserName;
	
	/* Name of the Method: enterText
	 * Brief description: Enter text value to text boxes 
	 * Arguments: obj --> webelement Object, textVal --> text to be entered, objName --> Object Name
	 * Created By: TechPirates 
	 * Creation Date: June 29 2016
	 * Last Modified: June 29 2016
	 * */
	public static void enterText(WebElement obj, String textVal, String objName) throws IOException{


		if(obj.isDisplayed()){
			obj.sendKeys(textVal);
			Update_Report("Pass", "enterText", textVal+ "  is entered in " + objName + " field");
		}else{
			Update_Report("Fail", "enterText", objName + " field is not displayed please check your application ");
		}

	}

	/* Name of the Method: clickButton
	 * Brief description: Click on Web Button 
	 * Arguments: obj --> webelement Object,objName --> Object Name
	 * Created By: TechPirates 
	 * Creation Date: June 29 2016
	 * Last Modified: June 29 2016
	 * */
	public static void click(WebElement obj, String objName) throws IOException{
		if(obj.isDisplayed()){
			obj.click();
			Update_Report("Pass", "clickButton", objName + " is clicked");
		}
		else{
			Update_Report("Fail", "clickButton",  objName + " Button is not displayed please check your application");

		}
	}
	/* Name of the Method: validateTextMessage
	 * Brief description: validating Text message
	 * Arguments: obj --> webelement Object,objName --> Object Name
	 * Created By: TechPirates 
	 * Creation Date: June 29 2016
	 * Last Modified: June 29 2016
	 * */
	public static void validateErrorMessage(WebElement obj, String expectedMsg, String objname) throws IOException{


		if(obj.isDisplayed()){
			String actualMsg = obj.getText().trim();
			if(expectedMsg.equals(actualMsg)){

				Update_Report("Pass","validateTextMessage", "Actual Message " + actualMsg+" is matched with expectedErrMsg "+expectedMsg);

			}
			else{

				Update_Report("Fail","validateTextMessage", "Actual Message " + actualMsg+" is not matched with expectedErrMsg "+expectedMsg);

			}
		}
		else{
			Update_Report("Fail", "validateTextMessage",  objname + " Button is not displayed please check your application");

		}



	}

	/* Name of the Method: chkBoxSelect
	 * Brief description: Select Check box
	 * Arguments: obj --> webelement Object,objName --> Object Name
	 * Created By: TechPirates 
	 * Creation Date: June 29 2016
	 * Last Modified: June 29 2016
	 * */
	public static void chkBoxSelect(WebElement obj, String objName ) throws IOException{
		if(obj.isDisplayed()){
			if(obj.isSelected()){
				Update_Report("Pass", "chkBoxSelect", objName + " is already selected");
			}
			else{
				obj.click();
				Update_Report("Pass", "chkBoxSelect", objName + " is selected");
			}
		}
		else{
			Update_Report("Fail", "chkBoxSelect", objName + " is not displayed Please check your application");
		}
	}

	/* Name of the Method: chkBoxDeSelect
	 * Brief description: De-Select Check box
	 * Arguments: obj --> webelement Object,objName --> Object Name
	 * Created By: TechPirates 
	 * Creation Date: June 29 2016
	 * Last Modified: June 29 2016
	 * */
	public static void chkBoxDeSelect(WebElement obj, String objName ) throws IOException{
		if(obj.isDisplayed()){
			if(obj.isSelected()){
				obj.click();
				Update_Report("Pass", "chkBoxDeSelect", objName + " is De-selected");
			}
			else{
				Update_Report("Pass", "chkBoxDeSelect", objName + " is already de-selected");
			}
		}
		else{
			Update_Report("Fail", "chkBoxDeSelect", objName + " is not displayed Please check your application");
		}
	}
	
	public static String[][] readExcel(String dtTablePath, String sheetName ) throws IOException{

		/*Step 1: Get the XL Path*/
		File xlFile = new File(dtTablePath);

		/*step2: Access the Xl File*/
		FileInputStream xlDoc = new FileInputStream(xlFile);

		/*Step3: Access the work book (POI jar file) */
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);

		/*Step4: Access the Sheet */
		HSSFSheet sheet = wb.getSheet(sheetName);

		int iRowCount = sheet.getLastRowNum()+1;
		int iColCount = sheet.getRow(0).getLastCellNum();


		String[][] xlData = new String[iRowCount][iColCount];

		for(int i =0; i<iRowCount; i++){
			for(int j = 0; j <iColCount; j++){
				xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}

		}
		return xlData;
	}
	
public static void writeExcel(String dtTablePath, String sheetName, int iRow, int iCol, String textVal) throws IOException{
		
		try{
		/*Step 1: Get the XL Path*/
		File xlFile = new File(dtTablePath);

		/*step2: Access the Xl File*/
		FileInputStream xlDoc = new FileInputStream(xlFile);

		/*Step3: Access the work book (POI jar file) */
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);

		/*Step4: Access the Sheet */
		HSSFSheet sheet = wb.getSheet(sheetName);

		/*Access Row*/
		HSSFRow   row = sheet.getRow(iRow);
		
		/*Access Cell*/
		HSSFCell cell = row.getCell(iCol);
		
		cell.setCellValue(HSSFCell.CELL_TYPE_STRING);
		cell.setCellValue(textVal);
		
//		HSSFCellStyle titleStyle = wb.createCellStyle();
//		titleStyle.setFillForegroundColor(new HSSFColor.BLUE_GREY().getIndex());
//		titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
//		cell.setCellStyle(titleStyle);
		
		
		FileOutputStream fout = new FileOutputStream(dtTablePath);
		wb.write(fout);
		fout.flush();
		fout.close();
		}
		catch(Exception e)
		{
			
		}
		
	}



	public static void startReport(String scriptName, String ReportsPath) throws IOException{

		String strResultPath = null;


		String testScriptName =scriptName;


		cur_dt = new Date(); 
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String strTimeStamp = dateFormat.format(cur_dt);

		if (ReportsPath == "") { 

			ReportsPath = "C:\\";
		}

		if (ReportsPath.endsWith("\\")) { 
			ReportsPath = ReportsPath + "\\";
		}

		strResultPath = ReportsPath + "Log" + "/" +testScriptName +"/"; 
		File f = new File(strResultPath);
		f.mkdirs();
		htmlname = strResultPath  + testScriptName + "_" + strTimeStamp 
				+ ".html";



		bw = new BufferedWriter(new FileWriter(htmlname));

		bw.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TR><TD BGCOLOR=#66699 WIDTH=27%><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Browser Name</B></FONT></TD><TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"
				+ "FireFox " + "</B></FONT></TD></TR>");
		bw.write("<HTML><BODY><TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TR COLS=7><TD BGCOLOR=#BDBDBD WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>SL No</B></FONT></TD>"
				+ "<TD BGCOLOR=##BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Step description</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Execution Time</B></FONT></TD> "
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Status</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=47%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Detail Report</B></FONT></TD></TR>");

  
	}

	public static void Update_Report(String Res_type,String Action, String result) throws IOException {
		String str_time;
		Date exec_time = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		str_time = dateFormat.format(exec_time);
		if (Res_type.startsWith("Pass")) {
			bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
					+ (j++)
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+Action
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+ str_time
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
					+ "Passed"
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
					+ result + "</FONT></TD></TR>");

		} else if (Res_type.startsWith("Fail")) {
			exeStatus = "Failed";
			report = 1;
			bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
					+ (j++)
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+Action
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+ str_time
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
					+ "<a href= "
					+ htmlname
					+ "  style=\"color: #FF0000\"> Failed </a>"

				+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
				+ result + "</FONT></TD></TR>");

		} 
	}
}

