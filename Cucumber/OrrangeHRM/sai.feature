Feature:OrangeHRM Application Functionalities Testing
Background:
Given User should launch the Chrome Browser
@All
@Smoke
Scenario:Validating OrangeHRM Application LogIn Page

#Given User should launch the Chrome Browser
When user enters OrangeHRM Application URL Address
Then User Should be at the LogIn Page
Then User Should Close the Application


@Smoke @Sanity
Scenario:Validating OrangeHRM Application LogIn Page


#Given User should launch the Chrome Browser
When user enters OrangeHRM Application URL Address
Then User Should be at the LogIn Page
When User enters Username and Password and Click on Log in button
Then User Should be navigated to HomePage of OrangeHRM Application
Then User Should Close the Application 

@ApplicationFunctionalityWithTestData
Scenario Outline: Validating OrangeHRM Application LogIn Functionality With

#Given User should launch the Chrome Browser
When user enters OrangeHRM Application URL Address
Then User Should be at the LogIn Page
When User enters "<Username>" and "<Password>" and Click on Log in button
Then User Should be navigated to HomePage of OrangeHRM Application
Then User Should Close the Application 

Examples:
|  Username   |  Password  |
|  pavansai   |  Pavansai@1234$  |
|  pavansai   |  Pavansai@1234$  |
|  pavansai   |  Pavansai@1234$  |








