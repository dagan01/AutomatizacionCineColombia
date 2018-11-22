package com.cinecolombia.compra.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InformOfMovie {
		
	public static final Target CINE_HORA = Target.the("Hora").locatedBy("//*[@id=\"todas-las-funciones\"]/div[2]/div/div/div[2]/div[2]/a");
	public static final Target CINE = Target.the("cine").locatedBy("//*[@id='todas-las-funciones']/div[2]/h3");

}
