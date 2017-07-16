Feature: Test login for a user on www.linkedin.com
User should be on the linkedin home page
User should be enter username and password
User should be do click on button login
If the user is not registered, he does not access
else the user should be able to login successfully and search for a contact

  Scenario: test login with unregistered credentials
       Given Open chrome and start the linkedin home page 
       When I enter an unregistered username and an unregistered password
       Then User can not successfully login 
       
 Scenario: test successful login with valid credentials and search for a contact 
       Given Open chrome and start the linkedin home page 
       When I enter an valid username and valid password
       Then User should be able to login successfully login 
       And and search for a contact 
       
        