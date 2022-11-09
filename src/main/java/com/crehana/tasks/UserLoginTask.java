package com.crehana.tasks;

import com.crehana.ui.Entrar;
import com.crehana.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.LOGIN),
                SendKeys.of("b2b@mailinator.com").into(Entrar.EMAIL),
                SendKeys.of("1234567890").into(Entrar.PASSWORD),
                Click.on(Entrar.LOGIN_BUTTON)
        );
    }
    public static UserLoginTask makeinformation(){
        return instrumented(UserLoginTask.class);
    }
}
