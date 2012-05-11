Scenario 3: 
a) Student marks can be entered entered in the following way
Student Name (StudentName loaded in ComboBox), Grade (1-13 ComboBox), Subject, Marks
b) User can enter these values and click "Add"
c) Here all those fields are mandatory and marks cannot be more than 100
d) System should validate those fields and show it in the response page

Additional Step
Add a filter to print the following incident
If marks is more than 80. It will print a message saying "Very well done " + [student name]

To do : 2 jsp page, one Model class and a controller

************************************************************************************************************
Create a Maven web based project
mvn archetype:generate -DgroupId=org.ymini.yschool -DartifactId=scenario03 -DarchetypeArtifactId=maven-archetype-webapp