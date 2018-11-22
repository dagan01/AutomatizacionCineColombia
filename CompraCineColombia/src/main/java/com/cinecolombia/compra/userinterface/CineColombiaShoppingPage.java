package com.cinecolombia.compra.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.cinecolombia.com/cartelera/bogota")
public class CineColombiaShoppingPage extends PageObject {
	
	
	public static Target PELICULA=Target.the("La pelicula")
			.located(By.xpath("//*[@id=\"content\"]/div/div[2]/div[3]/div[2]/h3/a"));
	
	public static Target PELICULA2;
	
	
	public static Target Pelicula(String pelicula) {
		
			PELICULA2=Target.the("la pelicula")
					.located(By.xpath("//*[@id=\"content\"]/div/div[2]/div["+pelicula+"]/div[2]/h3/a"));
			
		
		return PELICULA2;
	}
	
}


