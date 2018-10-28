package homepagetest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;

public class HomePageTest {
	static WebDriver wd = null;
	@Given("^Open browser as (.*)$")
	public void OpenBrowser(String Browser){
		if(wd==null){
		wd = new FirefoxDriver();
		}
		wd.get("http://www.ntltaxi.com/");
		System.out.println("Browser Opened  Successfully"+Browser);
	}
	@Then ("^Enter username as (.*)$")
	public void username(String username){
		
		//wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[2]")).sendKeys("yuvaraj");
		Homepage.enterUserName(wd, username);
		System.out.println("username"+username);
		
	}
	@Then ("^Enter Mobile Number as (.*)$")
	public void MobileNumber(String MobileNumber){
		//wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[3]")).sendKeys("123456");
		Homepage.enterMobile(wd, MobileNumber);
		System.out.println("MobileNumber"+MobileNumber);
	}
	@Then ("^Enter Pickup Address as (.*)$")
	public void Pickup(String Pickup){
		
		//wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[5]")).sendKeys("Adyar");
		Homepage.enterPick(wd, Pickup);
		System.out.println("Pickup"+Pickup);
	}
	@And ("^Enter Drop Address as (.*)$")
	public void Drop(String Drop){
		//wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[6]")).sendKeys("medavakkam");
		Homepage.enterDrop(wd, Drop);
		System.out.println("Drop"+Drop);
	}
	@And ("^Select cab type as (.*)$")
	public void cab(String cab){
		/*WebElement data =wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select"));
		List<WebElement> input=data.findElements(By.tagName("Option"));
		for (int i=0; i<input.size();i++){
			String data1 =input.get(i).getText();
			if(data1.trim().equals("Sedan".trim())){
				input.get(i).click();
			}
		}*/
		
		Homepage.selectcab(wd, cab);
		System.out.println("cab"+cab);
		
		
	}
	@When ("^Click Book later$")
	public void Click(){
		//wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/input[7]")).click();
		
		System.out.println("Click");
	}
	@But ("^Don't click Book$")
	public void clickBook(){
		
		System.out.println("clickBook");
		Homepage.clickbook(wd);
	}
	@After
	public void teardown(Scenario s) throws IOException{
		if(s.isFailed()){
			File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			InputStream stream =new FileInputStream(src);
			s.embed(IOUtils.toByteArray(stream), "image/jpeg");
			
				

			System.out.println("test cases failed");
		}
		
	}

}