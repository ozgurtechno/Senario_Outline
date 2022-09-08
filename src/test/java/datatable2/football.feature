Feature: football stadiums

Scenario: Listing football club stadiums - the verbose way
  Given Juventus play their home games at Allianz Stadium
  And AC Milan play their home games at San Siro
  And AS Roma play their home games at Stadio Olimpico

  Scenario: Listing football squad players - the verbose way
    Given Cristiano Ronaldo of Portugal, born on 05-02-1985, plays for Juventus since the 2018/2019 season
    And Matthijs de Ligt of the Netherlands, born on 12-08-1999, plays for Juventus since the 2019/2020 season
    And Giorgio Chiellini of Italy, born on 14-08-1984, plays for Juventus since the 2005/2006 season


























#  Scenario: Listing football club stadiums - the clear way
#    Given the following clubs and their stadiums
#      | Juventus | Allianz Stadium |
#      | AC Milan | San Siro        |
#      | AS Roma  | Stadio Olimpico |


#  Scenario: Listing football squad players - the clear way
#    Given the following Juventus players
#      | name              | nationality     | dateOfBirth | atJuventusSince |
#      | Cristiano Ronaldo | Portugal        | 05-02-1985  | 2018/2019       |
#      | Matthijs de Ligt  | the Netherlands | 12-08-1999  | 2019/2020       |
#      | Giorgio Chiellini | Italy           | 14-08-1984  | 2005/2006       |