#Author: david.ordonez@udea.edu.co


Feature: Compra de pelicula en Cinecolombia
  Yo como usuario quiero poder realizar la busqueda, selección y compra de una pelica en Cinemark 
  I want to use this template for my feature file


  Scenario Outline: Compra de pelicula en Cinemas Cinecolombia
    Given Un cliente puede acceder a la pagina de cinemark
    And Puede acceder al contenido de las peliculas en cartelera
    When Selecciono una pelicula de interes <|namepelicula|>
    Then Puedo realizar la compra de la pelicula
    And Verificar verifico compra
     
    Examples:
    |namepelicula																											|
    |ANIMALES FANTÁSTICOS: LOS CRÍMENES DE GRINDELWALD - CINE COLOMBIA|
		    