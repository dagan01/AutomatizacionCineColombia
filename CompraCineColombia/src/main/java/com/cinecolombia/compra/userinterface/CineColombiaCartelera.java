package com.cinecolombia.compra.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CineColombiaCartelera extends PageObject{

	public static final Target PELICULA=Target.the("La pelicula")
			.locatedBy("//img[@title='ANIMALES FANT�STICOS: LOS CR�MENES DE GRINDELWALD - CINE COLOMBIA']");
}
