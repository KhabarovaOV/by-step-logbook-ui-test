package by.step.logbook.tests.login_page_tests;

import by.step.logbook.tests.base.BaseUITestsClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseUITestsClass {

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://vitstep.by/");
        Thread.sleep(5000);
    }

    @Test
    public void verifyLoginInputVisibility(){

        //Given
        //
        String initialLoginString = "qwerty";
        String expectedErrormessage = "";

        //When
        String actualErrormessage="";

        //Then


    }

    @Test
    public void verifyLoginValidParameters(){

    }

    @Test
    public void verifyLoginInvalidParameters(){

    }

}
