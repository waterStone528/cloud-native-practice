FROM adoptopenjdk/openjdk11:jre-11.0.14.1_1-ubuntu
RUN mkdir /opt/app
EXPOSE 9010
COPY ./app-1.0-SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]