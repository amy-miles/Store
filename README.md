# Store This Java project demonstrates the usage of Maven and JUnit. 
I created a project then converted to a Maven project and added the JUnit dependencies.
I simulated a store using a superclass Product and two child classes Soda and Soup. 
In the class ProBusinessLogic I created two methods. First, calculateSalePrice(Product product) that calculated the sale price of 10% off an item 
and second, checkInStock(Product product) which returns boolean true if the product is in stock, or false.
I created two JUnit tests files. One for the Soda class and one for Soup. 
All tests were placed in a test suite called AllTests.
And included is a TestRunner file, which will run all tests efficiently.
