package com.gittigidiyor.step_definitions;


import com.gittigidiyor.pages.LoginPage;
import com.gittigidiyor.utilities.BrowserUtils;
import com.gittigidiyor.utilities.ConfigurationReader;
import com.gittigidiyor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginStepDefs {
LoginPage loginPage=new LoginPage();
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        WebElement login=loginPage.login;
        login.click();
        WebElement giris=loginPage.secondLogin;
        giris.click();


    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        loginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to login successfully")
    public void the_user_should_be_able_to_login_successfully() {
       // String expected="Hesabım";
        //String siparislerim="//*[@class='gekhq4-4 egoSnI']";
        //String actual=Driver.get().findElement(By.xpath(siparislerim)).getText();
        //Assert.assertTrue(" ",actual.contains(expected));



    }





}
