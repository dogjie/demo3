package day01;




import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class testBaidu {
	@Test
	
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
	
//	System.setProperty("webdriver.chrome.bin", ".//tools//chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com");
//		driver.get("https://www.taobao.com");
				
		String a=driver.getTitle();
		System.out.println(a);
		String b=driver.getCurrentUrl();
		System.out.println(b);
//		driver.navigate().back();//回退
//		driver.navigate().forward();//向前
//		driver.manage().window().maximize();//最大化
	}
	
}
