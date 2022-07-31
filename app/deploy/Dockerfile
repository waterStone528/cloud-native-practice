FROM adoptopenjdk/openjdk11:x86_64-ubuntu-jre-11.0.15_10
RUN mkdir /opt/app
EXPOSE 9010
COPY ./app-1.0-SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]