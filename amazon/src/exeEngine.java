

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class exeEngine {

	public static void main(String[] args) throws IOException, InterruptedException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/*Method ts= AutomationScript.class.getMethod("loginErrorMessage");
		ts.invoke(ts);*/


		AutomationScript.testcase1();

		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",2,1,"Pass");

		AutomationScript.testcase2();	
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",3,1,"Pass");


		AutomationScript.testcase3();
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",4,1,"Pass");

		AutomationScript.testcase4();	
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",5,1,"Pass");



		AutomationScript.testcase5();	
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",6,1,"Pass");


		AutomationScript.testcase6();
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",7,1,"Pass");


		AutomationScript.testcase7();	
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",8,1,"Pass");


		AutomationScript.testcase8();
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",9,1,"Pass");


		AutomationScript.testcase9();
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",10,1,"Pass");


		AutomationScript.testcase10(); 
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",11,1,"Pass");

		AutomationScript.testcase11();
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",12,1,"Pass");

		AutomationScript.testcase12();
		Report.writeExcel("C:/Users/aditi/Desktop/Training Material/Book1.xls","Sheet1",13,1,"Pass");





	}

}
