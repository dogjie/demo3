package day01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baidu {
	@Test
	public void firefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.baidu.com");				
		String a=driver.getTitle();
		System.out.println(a);
		String b=driver.getCurrentUrl();
		System.out.println(b);
		driver.manage().window().maximize();
		driver.get("https://www.sina.com");
	}
}
