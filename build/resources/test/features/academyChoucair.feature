#Autor: Juan Fernando Carvajal
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: trying to make a login into the web page Utest.com, making a new user and completing the formulary
    Given we want to optimize how we register new users into the web page
    When The user clicks on the option to register and proceeds to complete the form
      | str_First_Name | str_Last_Name | str_Email | str_City | str_Zip | str_Country | str_Computer | str_Version | str_Language | str_MobilDev | str_Model | str_OS | str_Pass |
      | JuanF | Carvajal | pruebaaa32tt4y79@hotmail.com | Envigado    | 055421 | Colombia   | Windows     | 10         | Spanish     | Apple          | Iphone 11  | iOS 16.0 | IMadeItHappened21 |
    Then The form was completed successfully
      | str_Platform_Text|
      | Participate in the uTest Academy |