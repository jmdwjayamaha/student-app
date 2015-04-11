Product: Single Page Web Application with REST for Student information handling.

Pre-requisites:

 - Maven 3.x
 - Java 1.7 or above
 - JBoss AS 7

Used Technologies/Frameworks:

 - Spring v4.0
 - MongoDB
 - AngularJS v1.3.0
 - Bootstrap v3.1.1

Tested Platform: 

 - Microsoft WINDOWS V-8

Steps to follow in setting integration test.

 1. Create a clone or download the zip file of the git repository.

 2. Configure MongoDB instance details in "config.properties" file in the location "student-app/src/main/resources".
       
      i)   mongodb.host     - Host name of the MongoDB instance.
      ii)  mongodb.port     - Hosted port number (Default port number is: 27017).
      iii) mongodb.database - The name of the database to be used (Default value is set to 'student_info').
	
 3. Navigate to "student-app" directory containing the pom.xml file and run the following command.
      $ mvn clean install

 4. Deploy the file "studentApp.war" in the location "student-app/target" to JBoss.

 5. Use the following URL format to access the deployed application.
      http://{Host_Name}:{Port}/studentApp/
		