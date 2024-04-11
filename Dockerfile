FROM eclipse-temurin:17
COPY target/Mywebapp.jar Mywebapp.jar
CMD [ "java","-jar=","Mywebapp.jar" ]