package day01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class baidu {
		@Test
		public void firefox() {
			System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.baidu.com");
			driver.findElement(By.linkText("пбне")).click();
			int aa=driver.findElements(By.tagName("a")).size();
			System.out.println(aa);
		}
}
