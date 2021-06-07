package com.gittigidiyor.step_definitions;
import com.gittigidiyor.utilities.ConfigurationReader;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
public class ApiStepDefinitions {
    @BeforeClass
    public void beforeClass()   {baseURI= ConfigurationReader.get("trello_api"); }
Response response;

    @Given("the user has logged in")
    public void the_user_has_logged_in() {
        given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().queryParam("username","mstfemrezglc@icloud.com")
                .and().queryParam("password","12345678a.")
                .when().get("/login")
                .then().statusCode(200);
    }


    @When("the user create a board")
    public void the_user_create_a_board() {
        //I created a map to keep request json body information
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("key","6ad823b7cdccc2b39aaed4c99c933d80");
        requestMap.put("token","29947bc69611b52beccbd74f2e971166aa8f3e06d73dea4e362ea6f638f86e06");
        requestMap.put("name","newBoard");
        given().log().all().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(requestMap)
                .when()
                .post("/1/boards")
                .then().log().all();


    }

    @Then("the status code should be {int}, and content-type should be {string}")
    public void the_status_code_should_be_and_content_type_should_be(int statusCode, String string) {
        Assert.assertEquals(statusCode,response.statusCode());
        Assert.assertTrue(response.contentType().contains(string));
    }

    @When("the user adds two card to the board")
    public void the_user_adds_two_card_to_the_board() {
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("key","6ad823b7cdccc2b39aaed4c99c933d80");
        requestMap.put("token","29947bc69611b52beccbd74f2e971166aa8f3e06d73dea4e362ea6f638f86e06");
        requestMap.put("idList","FirstCard");
        //requestMap.put("idList","SecondCard");
        given().log().all().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(requestMap)
                .when()
                .post("/1/boards")
                .then().log().all();
    }

    @Then("the status code should be {int}")
    public void the_status_code_should_be(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());

    }

    @When("the user update one of the card")
    public void the_user_update_one_of_the_card() {
        //Map<String,Object> putRequestMap = new HashMap<>();
        //putRequestMap.put("key","6ad823b7cdccc2b39aaed4c99c933d80");
        //putRequestMap.put("token","29947bc69611b52beccbd74f2e971166aa8f3e06d73dea4e362ea6f638f86e06");
        //putRequestMap.put("FirstCard","ChangedCard");
    }

    @When("delete all cards and board")
    public void delete_all_cards_and_board() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
