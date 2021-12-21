For the election application to work, you need to run this backend service locally. 
In order to do that, you need to:
1. create a schema called "election" 
2. create a file called "application.properties" in src/main/resources
3. fill your application.properties with this data (replace credentials accordingly):
   
 spring.jpa.hibernate.ddl-auto=create <br>
   spring.datasource.url=jdbc:mysql://localhost:3306/election <br>
   spring.datasource.username={replace} <br>
   spring.datasource.password={replace} <br>
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver <br>
   spring.jpa.show-sql=true <br>
   spring.jackson.serialization.indent-output=true <br>
   server.port = 9191 <br>

The frontend application repo is https://github.com/shpomp/election-frontend <br>
Deployment of latest master branch version is https://election-frenzy.herokuapp.com/
