package com.crehana.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Entrar {

    public static final Target EMAIL = Target.the("email").
            located(By.id("username"));

    public static final Target PASSWORD = Target.the("password").
            located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("login_button").
            locatedBy("//button[@class=\"tw-mb-2 tw-mx-auto tw-btn-primary-s tw-w-full tw-flex tw-justify-center\"]");

}
