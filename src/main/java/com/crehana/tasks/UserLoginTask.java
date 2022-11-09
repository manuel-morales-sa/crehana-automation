package com.crehana.tasks;

import com.crehana.ui.EntrarPage;
import com.crehana.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOGIN),
                SendKeys.of("b2b@mailinator.com").into(EntrarPage.EMAIL),
                SendKeys.of("1234567890").into(EntrarPage.PASSWORD),
                Click.on(EntrarPage.LOGIN_BUTTON)
        );
    }
    public static UserLoginTask makeinformation(){
        return instrumented(UserLoginTask.class);
    }
}
