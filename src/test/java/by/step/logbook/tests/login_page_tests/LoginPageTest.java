package by.step.logbook.tests.login_page_tests;

import by.step.logbook.tests.base.BaseUITestsClass;
import by.step.logbook.tests.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageTest extends BaseUITestsClass {

    private LoginService loginService;

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://logbook.itstep.org/");
    }

    @Test
    public void verifyLoginInputVisibility () {
        //Given
        loginService = new LoginService(driver);

        //Then
        Assertions.assertEquals(false, loginService.getLoginPage().getLoginBlock().loginField.isDisplayed());

    }

    @Test
    public void verifyLoginInputValidParameters () {
        //Given
        String initialWrongLoginString = "qwerty";
        String initialPassword = "12345";

        loginService = new LoginService(driver);
        loginService.getLoginPage().getLoginBlock().loginField.sendKeys(initialWrongLoginString);
        loginService.getLoginPage().getLoginBlock().passwordField.sendKeys(initialPassword);

        //When
        loginService.getLoginPage().getLoginBlock().loginButton.click();

        //Then
        //Assertions.assertEquals(expectedErrormessage, actualErrorMessageText);
    }

    @Test
    public void verifyLoginInputInvalidParameters () {
        //Given
        String initialWrongLoginString = "qwerty";
        String initialPassword = "12345";
        String expectedErrormessage = "User not found";
        loginService = new LoginService(driver);
        loginService.getLoginPage().getLoginBlock().loginField.sendKeys(initialWrongLoginString);
        loginService.getLoginPage().getLoginBlock().passwordField.sendKeys(initialPassword);

        //When
        loginService.getLoginPage().getLoginBlock().loginButton.click();

        //Then
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginService.getLoginPage().getLoginBlock().errorMessageBy));

        String actualErrorMessageText = loginService.getLoginPage().getLoginBlock().errorMessage.getText();
        Assertions.assertEquals(expectedErrormessage, actualErrorMessageText);
    }
}
