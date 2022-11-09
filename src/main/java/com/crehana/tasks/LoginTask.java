package com.crehana.tasks;

import com.crehana.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOGIN)
                /*SendKeys.of("b2b@mailinator.com").into(EntrarPage.EMAIL),
                SendKeys.of("1234567890").into(EntrarPage.PASSWORD),
                Click.on(EntrarPage.LOGIN_BUTTON)*/
        );
    }
    public static LoginTask clickLoginButton(){
        return instrumented(LoginTask.class);
    }
}
