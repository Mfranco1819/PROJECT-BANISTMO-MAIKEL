#Maikel Jose Franco Brito

  Feature: Download pdf file from Banistmo
    As a user, I want to download the PDF file from the website

  Scenario: Search the PDF file
    Given the user wants to download pdf file from the page banistmo
    When the user search the document
    Then  PDF validation is successful
    | strurl                                                                                                                                                                        |
    | https://www.banistmo.com/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-  |

