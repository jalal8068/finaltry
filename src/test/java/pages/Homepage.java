package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
		public static void loadURL(WebDriver wd, String url){
			wd.get("http://www.ntltaxi.com/");
		}
		public static void enterUserName(WebDriver wd, String UserName){
			wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]")).sendKeys("Yuvaraj");
		}
		public static void enterMobile(WebDriver wd, String Mobile){
			wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]")).sendKeys("9888446622");
		}
		public static void enterPick(WebDriver wd, String Pick){
			wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[5]")).sendKeys("Adyar");
		}
		public static void enterDrop(WebDriver wd, String Drop){
			wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[6]")).sendKeys("Adyar");
			
		}
		public static void selectcab(WebDriver wd, String cab){
			WebElement cars =  wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select"));
			Select s = new Select(cars);
			s.selectByVisibleText("Premium");
		}
		public static void clickbook(WebDriver wd){
			wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]")).click();
		}

	
}
