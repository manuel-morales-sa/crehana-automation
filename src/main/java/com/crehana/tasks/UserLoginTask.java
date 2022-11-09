package com.crehana.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.crehana.ui.EntrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserLoginTask implements Task {

    private String user;
    private String password;
    public UserLoginTask(String user, String password){
        this.user = user;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(EMAIL),
                //SelectFromOptions.byVisibleText(password).from(),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static UserLoginTask datosLogin(String user, String password) {
        return instrumented(UserLoginTask.class, user, password);
    }
}
