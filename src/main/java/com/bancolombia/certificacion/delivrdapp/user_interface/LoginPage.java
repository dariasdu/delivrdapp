package com.bancolombia.certificacion.delivrdapp.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target TXT_USER=Target.the("user").locatedBy("//*[@id='UserEmail']");
	public static final Target TXT_PASSWORD=Target.the("password").locatedBy("//*[@id='UserPassword']");
	public static final Target BTN_INICIARSESION=Target.the("iniciarsesion").locatedBy("//*[@class='btn btn-primary btn-block uppercase']");

}
