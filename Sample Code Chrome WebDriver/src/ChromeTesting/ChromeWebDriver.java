package ChromeTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeWebDriver {
	public WebDriver driver;

  @Test
  public void chrom() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lo0ol\\"
	  		+ "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.navigate().to("https://sda.edu.sa/");
			 // driver.close();
  }
}
