import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module extends AutomationScript{

	public static void Launch(String url) throws IOException, InterruptedException
	{
		startReport("Launch the Amazon application","C:/Users/aditi/Desktop/Training Material/Report/");
		Update_Report("PASS","Launch Amazon","Launched");

		//Launch Firefox
		driver=new FirefoxDriver();
		driver.get(url);


		//Maximze Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Update_Report("PASS","Launch Amazon","Launched");
	}
}
