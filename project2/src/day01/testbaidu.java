package day01;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testbaidu {
	
	WebDriver driver;
	@Before
	public void firefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		String ur1="file:///D:/%E5%AD%A6%E4%B9%A0/%E9%BB%84%E7%BB%A2/index.html";		
		driver.get(ur1);
		String a=driver.getTitle();
		System.out.println(a);
		System.out.println(ur1);

		
	}
	@Test
	public void shopping() throws InterruptedException {
//		//��λ�����
//				WebElement input1=driver.findElement(By.id("user"));
//				input1.sendKeys("��������");
//		//��λ������
//				WebElement s1=driver.findElement(By.id("moreSelect"));
//				Select s=new Select(s1);
//				s.selectByIndex(3);
//				Thread.sleep(1000);
//				s.selectByValue("iphone");
//				Thread.sleep(1000);
//				s.selectByVisibleText("oppe");
//		//��λ��ѡ��ť
//				WebElement r1=driver.findElement(By.className("Saab"));
//				System.out.println(r1.isSelected());
//				r1.click();
//				System.out.println(r1.isSelected());
//		//��λ��ѡ��ť
//				WebElement c1=driver.findElement(By.name("checkbox1"));
//				c1.click();
//				WebElement c2=driver.findElement(By.name("checkbox2"));
//				c2.click();
//		
//				WebElement b1=driver.findElement(By.name("buttonhtml"));
//				System.out.println(b1.isSelected());
//				
//				WebElement a1=driver.findElement(By.className("alert"));
//				a1.click();
//				Alert aa=driver.switchTo().alert();
//				//System.out.println(aa.getText());
//				aa.accept();//ȷ��
//		//��λconfirm��
//				WebElement com1=driver.findElement(By.className("confirm"));
//				com1.click();
//				Alert com=driver.switchTo().alert();				
//				com.dismiss();//ȡ��
//				com.accept();//ȷ��
//				
//				WebElement pr1=driver.findElement(By.className("prompt"));
//				pr1.click();
//				Alert prm=driver.switchTo().alert();
//				prm.sendKeys("test");
//				prm.accept();//ȷ��
//				System.out.println(prm.getText());
//				prm.accept();//ȷ��
//		//�ϴ���ť
//				String lujin="D:\\test.txt";
//				WebElement up=driver.findElement(By.id("load"));
//				up.sendKeys(lujin);
//		
//		//��λҳ����ת
//				WebElement link1=driver.findElement(By.linkText("Open new window"));
//				link1.click();
//		//��ȡ���еľ��
//				Set<String> windowHandles=driver.getWindowHandles();
//				for(String handler:windowHandles) {
//			//��ӡ�˵�ǰҳ��ľ��
//					System.out.println(handler);
//			//��ȡ��ǰҳ��ı���
//					driver.switchTo().window(handler);
//			//�Աȱ��⣬������������Ҫ��һ�£�ִ�����²���
//					String title=driver.getTitle();
//					if("UIAutomation iFrame".equals(title)) {
//						WebElement user=driver.findElement(By.id("user"));
//						user.sendKeys("test");
//					}
//				}
//				driver.switchTo().frame("aa");//ֱ��дframe��ID����name
				driver.switchTo().frame(0);//����
				driver.findElement(By.id("user")).sendKeys("test");
		//һ��һ���������
//				driver.switchTo().parentFrame();
				driver.switchTo().defaultContent();
				driver.findElement(By.id("user")).sendKeys("test");
				WebElement link1=driver.findElement(By.linkText("Open new window"));
				link1.click();
				
//		driver.findElement(By.linkText("ע��")).click();
//		driver.findElement(By.name("name")).sendKeys("AQA");
//		driver.findElement(By.name("password")).sendKeys("123");
//		driver.findElement(By.name("passwordOne")).sendKeys("123");
//		driver.findElement(By.name("reallyName")).sendKeys("����");
//		driver.findElement(By.name("age")).sendKeys("18");
//		driver.findElement(By.name("profession")).sendKeys("ѧ��");
//		driver.findElement(By.name("email")).sendKeys("123@qq.com");
//		driver.findElement(By.name("question")).sendKeys("����˭��");
//		driver.findElement(By.name("result")).sendKeys("����");	
//		driver.findElement(By.className("input1")).click();
		
	}
	
	
	@After
public void login() throws InterruptedException{
		
//		Thread.sleep(10000);
//		driver.findElement(By.name("name")).sendKeys("AQA");
//		driver.findElement(By.name("password")).sendKeys("123");
//		driver.findElement(By.className("input1")).click();
	}
}
