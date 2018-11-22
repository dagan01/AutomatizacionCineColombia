package com.cinecolombia.compra.task;

import com.cinecolombia.compra.userinterface.CineColombiaShoppingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task{

	// CREAR CONSTRUCTOR PARA ENVIAR EL NUMERO DE PELICULA AL
	// CLICK ON
	private String MovieNumber;
	
	public Select(String MovieNumber) {
		this.MovieNumber=MovieNumber;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CineColombiaShoppingPage.Pelicula(MovieNumber)));		
		
	}

	public static Performable TheMovie(String MovieNumber) {
		// TODO Auto-generated method stub
		 return Tasks.instrumented(Select.class,MovieNumber);
	}

	
	
}
