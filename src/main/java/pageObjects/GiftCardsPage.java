package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftCardsPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//label[@for='Occasions']")
	WebElement optOccasions;
	
	@FindBy(xpath="//h3[contains(text(),'Staycation')]")
	WebElement btnStaycation;

	public GiftCardsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOccasions() {
		optOccasions.click();	
	}
	
	public void clickStaycation() {
		wait.until(ExpectedConditions.elementToBeClickable(btnStaycation));
		js.executeScript("arguments[0].click();",btnStaycation);	
		
	}

}
