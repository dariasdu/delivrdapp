package com.bancolombia.certificacion.delivrdapp.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.bancolombia.certificacion.delivrdapp.drivers.OwnWebDriver;
import com.bancolombia.certificacion.delivrdapp.models.DatosProducto;
import com.bancolombia.certificacion.delivrdapp.models.Usuario;
import com.bancolombia.certificacion.delivrdapp.tasks.AgregarProducto;
import com.bancolombia.certificacion.delivrdapp.tasks.Login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class DelivrdappStepsDefinitions {
	private Actor didier;
	private Usuario iniciosesion;
	private AgregarProducto datos;
	
	
	@Before
	public void setup() {
		didier=Actor.named("Pedro");
		didier.can(BrowseTheWeb.with(OwnWebDriver.onUrl("https://delivrdapp.com/app/users/login")));	
	}
	
	@Given("^me encuentro logeado en la pagina (.*) (.*)$")
	public void meEncuentroLogeadoEnLaPagina(String usuario, String password) throws Exception {
		iniciosesion=Usuario.IniciaSesion(usuario, password);
		didier.attemptsTo(Login.conLasCredenciales(iniciosesion));
		
	   
	}

	@When("^agrego un nuevo producto$")
	public void agregoUnNuevoProducto(List<Map<String, String>>datosProducto) throws Exception {
		//agregarProducto=AgregarProducto.conlosDatos(datosProducto.get(0).get("nombre"));
		didier.attemptsTo(AgregarProducto.conlosDatos(new DatosProducto(datosProducto)));
	    
	}

	@Then("^puedo visualizar los productos$")
	public void puedoVisualizarLosProductos() throws Exception {
	    
	}


}
