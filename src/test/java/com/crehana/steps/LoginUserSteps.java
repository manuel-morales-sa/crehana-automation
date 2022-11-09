package com.crehana.steps;

import com.crehana.tasks.UserLoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("b2b_user");
    }
    @Given("user in the home page")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.crehana.com/co/"));

    }
    @When("user enter the email and password")
    public void userEnterTheEmailAndPassword() {
        theActorInTheSpotlight().attemptsTo(UserLoginTask.makeinformation());

    }
    @Then("user sees the content")
    public void userSeesTheContent() {

    }
}
