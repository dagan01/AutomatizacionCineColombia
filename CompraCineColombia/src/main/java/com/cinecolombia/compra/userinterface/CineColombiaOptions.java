package com.cinecolombia.compra.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CineColombiaOptions {

	public static final Target CINECOLOMBIA_CANCEL = Target.the("Cine Colombia cancel buttom").located(By.id("cboxClose"));
	public static final Target CINECOLOMBIA_SELECT_CARTELERA = Target.the("Cine Colombia cartelera name").located(By.xpath("//*[@id=\"primary-menu-bar\"]/nav/ul/li[2]/a"));
}
