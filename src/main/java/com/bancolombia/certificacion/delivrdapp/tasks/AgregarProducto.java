package com.bancolombia.certificacion.delivrdapp.tasks;

import static com.bancolombia.certificacion.delivrdapp.user_interface.ProductosPage.*;

import com.bancolombia.certificacion.delivrdapp.models.DatosProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class AgregarProducto implements Task{
	
	private DatosProducto datosProducto;
	
	public AgregarProducto(DatosProducto datosProducto) {
		this.datosProducto=datosProducto;
	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PAGINA_PRODUCTO),Click.on(ADD_PRODUCTO));
		actor.attemptsTo(Enter.theValue(datosProducto.getNombre()).into(NOMBRE_PRODUCTO));
		actor.attemptsTo(Enter.theValue(datosProducto.getDescripcion()).into(DESCRIPCION_PRODUCTO));
		actor.attemptsTo(Enter.theValue(datosProducto.getSku()).into(SKU_PRODUCTO));
		actor.attemptsTo(Enter.theValue(datosProducto.getPrecio()).into(PRECIO_PRODUCTO));
		
	}
	
	public static AgregarProducto conlosDatos(DatosProducto agregarProducto) {
		return Tasks.instrumented(AgregarProducto.class, agregarProducto);
	}

}
