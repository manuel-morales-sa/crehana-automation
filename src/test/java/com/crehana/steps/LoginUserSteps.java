package com.crehana.steps;

import com.crehana.tasks.LoginTask;
import com.crehana.tasks.UserLoginTask;
import com.crehana.ui.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {

    @Managed(driver = "chrome")
    private WebDriver driver;

    private HomePage homePage = new HomePage();

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("b2b_user");
    }
    @Given("user in the home page")
    public void userInTheHomePage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(homePage));
        theActorInTheSpotlight().attemptsTo(LoginTask.clickLoginButton());

    }
    @When("^user enter the (.*) and (.*)$")
    public void userEnterTheEmailAndPassword(String user, String password) {
        theActorInTheSpotlight().wasAbleTo(
                UserLoginTask.datosLogin(user, password)
        );
    }
    @Then("user sees the content")
    public void userSeesTheContent() {

    }
}
