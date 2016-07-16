
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationScript extends Report{
	static WebDriver driver;

	public static void testcase1() throws IOException, InterruptedException {
		
		String recdata[][]=readExcel("C:/Users/aditi/Desktop/Training Material/testcase1.xls","Sheet1");
		String url=recdata[1][1];
		Module.Launch(url);
		bw.close();
	}
	public static void testcase1111() throws IOException {
		startReport("Launch the Amazon application","C:/Users/aditi/Desktop/Training Material/Report/");
		Update_Report("PASS","Launch Amazon","Launched");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/");


		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Update_Report("PASS","Launch Amazon","Launched");
		
		driver.quit();
		bw.close();
	}

	public static void testcase2() throws IOException {

		startReport("Verify Drop Down Option","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		Update_Report("PASS", "Launch Amazon", "Launched");


		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter search-iphone
		WebElement search=driver.findElement(By.xpath("//div[@id='nav-search']/form/div[3]/div/input"));
		enterText(search,"iphone","twotabsearchtextbox");

		Update_Report("PASS", "Type in Search Box", "Typed");


		//first suggestion
		WebElement sug1=driver.findElement(By.xpath("//div[@id='suggestions']/div"));
		sug1.click();  

		Update_Report("PASS", "Check 1st Drop Down Search Engine Display ", "first suggestion displayed");


		//second suggestion
		//WebElement sug2=driver.findElement(By.xpath("//div[@id='suggestions']/div[2]"));
		//sug2.click(); 
 driver.quit();
		bw.close();
	}

	public static void testcase3() throws IOException, InterruptedException {

		startReport("Search Button after Ipone entered ","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		Update_Report("PASS", "Launch Amazon", "Launched");


		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter search-iphone
		WebElement search=driver.findElement(By.xpath("//div[@id='nav-search']/form/div[3]/div/input"));
		enterText(search,"iphone","twotabsearchtextbox");
		Update_Report("PASS", "Type in Search Box", "Typed");


		Thread.sleep(5000);
		//click search 
		WebElement searchclick=driver.findElement(By.xpath("//div[@id='nav-search']/form/div[2]/div/input"));
		searchclick.click();    
		Update_Report("PASS", "Search button", "Search button submitted");

		bw.close();
	}

	public static void testcase4() throws IOException {

		startReport("Cell Phones & Accessories Header","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//first option Cell phone accessories

		WebElement sug1=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/div[2]/ul[1]/li[3]/a/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(sug1).build().perform();

		//WebElement sug1=driver.findElement(By.xpath("//div[@id='refinements']/div[2]/ul/li[3]/a/span"));
		//sug1.click();  


		//second option cell phone cases
		WebElement sug2=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/div[2]/ul[1]/li[5]/a/span[2]"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(sug2).build().perform();

		//WebElement sug2=driver.findElement(By.xpath("//div[@id='refinements']/div[2]/ul/li[5]/a/span"));
		//sug2.click(); 

		//See more option
		WebElement sug3=driver.findElement(By.xpath("//ul[@id='seeAllDepartmentClosed1']/li/span/a/span[2]"));
		sug3.click(); 

		bw.close();
	}

	public static void testcase5() throws IOException {

		startReport("Cell Phones & Accessories Header","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Portable power banks

		WebElement sug1=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/div[2]/ul[1]/li[7]/a/span[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(sug1).build().perform();

		//smart phones
		WebElement sug2=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/div[2]/ul[1]/li[8]/a/span[1]"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(sug2).build().perform();

		//WebElement sug2=driver.findElement(By.xpath("//div[@id='refinements']/div[2]/ul/li[5]/a/span"));
		//sug2.click(); 

		//See more option
		//WebElement sug3=driver.findElement(By.xpath("//ul[@id='seeAllDepartmentClosed1']/li/span/a/span[2]"));
		//sug3.click(); 

		bw.close();
	}


	public static void testcase6() throws IOException {

		startReport("Cell Phones & Accessories Header","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Portable power banks

		WebElement sug1=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/div[2]/ul[1]/li[7]/a/span[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(sug1).build().perform();

		//smart phones
		WebElement sug2=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/div[2]/ul[1]/li[8]/a/span[1]"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(sug2).build().perform();

		//WebElement sug2=driver.findElement(By.xpath("//div[@id='refinements']/div[2]/ul/li[5]/a/span"));
		//sug2.click(); 

		//See more option
		//WebElement sug3=driver.findElement(By.xpath("//ul[@id='seeAllDepartmentClosed1']/li/span/a/span[2]"));
		//sug3.click(); 

		bw.close();
	}


	public static void testcase7() throws IOException {

		startReport("Cell Phones & Accessories Header","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Amazon prime

		WebElement prim=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/ul[1]/li/a/div/span/i"));
		Actions action = new Actions(driver);
		action.moveToElement(prim).build().perform();

		//if obj is displayed
		WebElement elipr=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/h2[2]"));

		if(elipr.isDisplayed()){
			Update_Report("Pass", "clickButton", " is clicked");
		}
		else{
			Update_Report("Fail", "clickButton",   " Button is not displayed please check your application");

		}

		//eligible pime
		WebElement eli=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/ul[2]/li/a/span"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(eli).build().perform();

		//apple brand
		WebElement appl=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/ul[4]/li[1]/a/span"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(appl).build().perform();

		//4G brand
		WebElement brand=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/ul[5]/li[2]/a/span"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(brand).build().perform();

		//global eligible
		WebElement global=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[3]/div[2]/div/ul[6]/li/a/span"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(global).build().perform();

		bw.close();
	}

	public static void testcase8() throws IOException {

		startReport("Cell Phones & Accessories Header","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//your amazon

		WebElement amz=driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div/div/a[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(amz).build().perform();

		//todays deals
		WebElement tod=driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div/div/a[2]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(tod).build().perform();

		//gift card
		WebElement gift=driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div/div/a[3]"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(gift).build().perform();

		//sell
		WebElement sell=driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div/div/a[4]"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(sell).build().perform();

		//help
		WebElement help=driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div/div/a[5]"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(help).build().perform();
		
		bw.close();
	}

	public static void testcase9() throws IOException {
		startReport("Validate Department dropdown list ","C:/Users/aditi/Desktop/Training Material/Report/");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//dept
		WebElement dept=driver.findElement(By.xpath("//a[@id='nav-link-shopall']/span[2]"));
		dept.click(); 
		Update_Report("PASS", "Validate Department dropdown list", "dropdown shown");

		bw.close();
	}
	public static void testcase10() throws IOException {
		startReport("Validate Your Account dropdown list ","C:/Users/aditi/Desktop/Training Material/Report/");
		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//accounts
		WebElement acct=driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[2]"));
		acct.click(); 
		Update_Report("PASS", "Account dropdown", "dropdown displayed");

		bw.close();
	}



	public static void testcase11() throws IOException {
		startReport("Validate Try Prime dropdown list ","C:/Users/aditi/Desktop/Training Material/Report/");
		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//try prime
		WebElement prime=driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"));
		prime.click(); 
		Update_Report("PASS", "Try Prme dropdown", "try prime dropdown listed");


		bw.close();
	}

	public static void testcase12() throws IOException {
		startReport("Validate Lists dropdown list","C:/Users/aditi/Desktop/Training Material/Report/");
		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		Update_Report("PASS", "Launch Amazon", "Launched");

		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//list
		WebElement prime=driver.findElement(By.xpath("//a[@id='nav-link-wishlist']/span[2]/span"));
		prime.click(); 
		Update_Report("PASS", " Lists dropdown list", "dropdown listed");


		bw.close();
	}


	public static void attribues() {
		driver=new FirefoxDriver();
		driver.get("https://www.salesforce.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement login=driver.findElement(By.id("button-login"));
		login.click();

		WebElement userName=driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("aditirane1990@gmail.com");

		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("goa@2020");


		WebElement remember=driver.findElement(By.id("rememberUn"));


		WebElement sdfcLogin=driver.findElement(By.id("Login"));
		sdfcLogin.click();
	}














}




