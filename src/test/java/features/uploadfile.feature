@functionaTest
Feature: register into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site1
Then click signin

Scenario: negative test validating login
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site1
Then capture sscreenshot

Scenario: positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site1
Then click login button

Scenario: Add to cart
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then Add to cart

Scenario: Order Placement with guest checkout
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then checkout with guest user

Scenario: upload file
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then upload file

Scenario: update user profile
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then update user profile

Scenario: check product is availale
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then product availability

Scenario: check product is availale
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then esitimate shipping and taxes


Scenario: remove item from cart
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then remove item from cart

Scenario: apply coupn
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then apply coupn code

Scenario: catupre coupn warning
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then catupre coupn warning

Scenario: sorting
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then sorting

Scenario: update profile
Given Initialize the browser with chrome
And Navigate to "https://demo.opencart.com/" Site
Then update profile

