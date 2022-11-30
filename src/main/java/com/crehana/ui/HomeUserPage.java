package com.crehana.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUserPage {
    public static final Target ASSERT_USER_LOGIN = Target.the("User login validation").
        locatedBy("//strong[@class=\"font-bold\"]");
}
