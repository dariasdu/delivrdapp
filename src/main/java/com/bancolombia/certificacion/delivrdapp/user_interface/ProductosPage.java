package com.bancolombia.certificacion.delivrdapp.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {
	
	public static final Target PAGINA_PRODUCTO=Target.the("pagina producto").locatedBy("//*[@class='title' and contains(.,'Products')]");
	public static final Target ADD_PRODUCTO=Target.the("agregar producto").locatedBy("//*[@class='btn default yellow-stripe add-delivrd' and contains(.,' Add Product')]");
	public static final Target NOMBRE_PRODUCTO=Target.the("noombre producto").locatedBy("//*[@id='maxlength_productname']");
	public static final Target DESCRIPCION_PRODUCTO=Target.the("descripcion producto").locatedBy("//*[@id='ProductDescription']");
	public static final Target SKU_PRODUCTO=Target.the("id producto").locatedBy("//*[@id='ProductSku']");
	public static final Target PRECIO_PRODUCTO=Target.the("precio producto").locatedBy("//*[@id='ProductValue']");

}
