package testWebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magang.webhadirdika.driver.DriverSingleton;

public class ServerSettingPage {
	
private WebDriver driver;
	
	public ServerSettingPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#sidenav-main > div > div > ul > li:nth-child(2) > a")
	private WebElement btnServerSetting;
	
	@FindBy(css ="#t1 > i")
	private WebElement btnUbahData;
	
	@FindBy(xpath="//*[@id=\"exampleModalLabel\"]")
	private WebElement txtDisplayName0;	
	
	
	public void gotoServerSetting() {
		btnServerSetting.click();
		btnUbahData.click();
	}
	
	public void getEditServer() {
		try {
            Thread.sleep(3000);
        } catch (Exception e) {
        	// TODO: handle exception
        }	
	}

}
