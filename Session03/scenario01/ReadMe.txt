Scenario 1: 
a) Student registration page will have the following fields to be filled.
Student Name, Address, Grade (Year 1 to 13 loaded in ComboBox), Parent Name
b) User can enter these values and click "Register"
c) Here Student Name and Grade are mandatory fields
d) System will validate for those mandatory fields and will show a error message in the response page
e) If validation succeeds, show up the details of the registered student.

Additional Step
a) Add a filter to print the Student Name in the console for each of the requests.
b) Think about registering many students and display them under "View Students" page.

To do : 2~3 jsp pages, one Model class and 1~2 controllers controller

************************************************************************************************************
Create a Maven web based project
mvn archetype:generate -DgroupId=org.ymini.yschool -DartifactId=scenario01 -DarchetypeArtifactId=maven-archetype-webapp

To convert the maven project to eclipse dynamic web project 
mvn eclipse:eclipse -Dwtpversion=2.0

https://github.com/Jeyakaran/yschool-mini-jeyakaran/tree/master/Session03/scenario01/src

git@github.com:Jeyakaran/yschool-mini-jeyakaran.git/Session03/scenario01