Feature: wikipedia user run tests on different browsers


  Scenario Outline: Open page on 2 browsers

    Given User choose the "<BrowserName>" browser
    When The Home page is load
    Then Close the browser

    Examples:
      | TCID | BrowserName |
      | 01   | chrome      |
      | 02   | firefox     |

  @Wiki
  Scenario Outline: Select Language

    Given User choose the "<BrowserName>" browser
    When The Home page is load
    And Language "<Language>"  is Selected


    Examples:
      | TCID | BrowserName | Language |
      | 01   | chrome      | English  |

