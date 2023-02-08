package by.step.logbook.tests.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock{

    public LoginBlock (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='login']")
    public WebElement loginField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//span[contains(@class, 'md-toast-text')]")
    public WebElement errorMessage;

    public By errorMessageBy = By.xpath("//span[contains(@class, 'md-toast-text')]");

    @FindBy (xpath = "//button[contains(@class, 'btn-login')]")
    public WebElement loginButton;

}
