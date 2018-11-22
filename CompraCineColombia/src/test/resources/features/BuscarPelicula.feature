#Author: kta_mesa@yahoo.es
#Author: kta_mesa@yahoo.es

Feature: Find a movie in cine colombia
  As a Web User
  I want to go t cine colombia
  to search a movie

  Scenario: Search a movie in cine colombia page
    Given that user want to open cine colombia page
    When user go to cartelera option
    Then he see all the movie to select
