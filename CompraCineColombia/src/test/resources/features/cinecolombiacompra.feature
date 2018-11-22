#Author: your.email@your.domain.com

Feature: buy movie ticket
  I as a user of cinecolombia wish to buy a ticket online

  Scenario Outline: select movie
    Given that malory wants to enter the cinecolombia page
    When select the movie <pelicula>
    Then she can see the page of the movie and its <title>

    Examples: 
      | pelicula | title |
      | 3 | BOHEMIAN RHAPSODY, LA HISTORIA DE FREDDIE MERCURY |

