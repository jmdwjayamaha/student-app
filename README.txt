Product: Single Page Application with REST for Student information handling

Pre-requisites:

 - Maven 3.x
 - Java 1.6 or above
 - JBoss AS 7

Tested Platform: 

 - Microsoft WINDOWS V-8

Steps to follow in setting integration test.

 1. Create a clone of the repository.

 2. Configure MongoDB instance details in "servletConfig.xml" file in the location "student-app/src/main/webapp/WEB-INF/config".
       
      i)   host     - Host name of the MongoDB instance.
      ii)  post     - Hosted port number (Default is: 27017).
      iii) database - The name of the database to be used (Default value is set to 'student_info').
	
 3. Navigate to "student-app" directory containing the pom.xml file and run the following command.
      $ mvn clean install

 4. Copy the file "studentApp.war" from the location "student-app/target" to the deployment directory of JBoss.
		