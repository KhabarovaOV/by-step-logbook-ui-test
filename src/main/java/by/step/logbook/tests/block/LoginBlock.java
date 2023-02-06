package by.step.logbook.tests.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock{

    public LoginBlock (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public WebElement loginField = driver.findElement(By.xpath(""));
}
