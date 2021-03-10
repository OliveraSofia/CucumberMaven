Feature: wikipedia user run tests on different browsers


  Scenario Outline: Open page on 2 browsers

    Given User choose the "<BrowserName>" browser
    When The Home page is load
    Then Close the browser

    Examples:
      | TCID | BrowserName |
      | 01   | chrome      |
      | 02   | firefox     |


  Scenario Outline: Select Language and go to login Page

    Given User choose the "<BrowserName>" browser
    When The Home page is load
    And Language "<Language>" is Selected
    When User clicks on access Link


    Examples:
      | TCID | BrowserName | Language |
      | 01   | chrome      | Japanese |
      | 02   | chrome      | Español  |
      | 03   | chrome      | Russian  |

# Language options: "English","Español","Japanese","Deutsch","French","Chinese", "Polski", "Russian", "Italian", "Portugues".

  @Wiki
  Scenario Outline: Login on Chrome

    Given English user is on login Page
    When User login with "<username>" and "<password>"
    And Click on submit button

    Examples:
      | TCID | username  | password    |
      | 01   | Solive7   | ganeshA108  |