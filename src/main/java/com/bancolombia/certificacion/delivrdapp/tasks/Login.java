package com.bancolombia.certificacion.delivrdapp.tasks;

import com.bancolombia.certificacion.delivrdapp.models.Usuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static com.bancolombia.certificacion.delivrdapp.user_interface.LoginPage.*;

public class Login implements Task {

	private Usuario usuario;

	public Login(Usuario usuario) {
		this.usuario = usuario;

	}

	@Step
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario.getUsuario()).into(TXT_USER),
				Enter.theValue(usuario.getPassword()).into(TXT_PASSWORD), Click.on(BTN_INICIARSESION));
	}

	public static Login conLasCredenciales(Usuario usuario) {
		return Tasks.instrumented(Login.class, usuario);
	}

}
