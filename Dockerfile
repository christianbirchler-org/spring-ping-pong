FROM eclipse-temurin:23

RUN mkdir /opt/app

COPY target/spring-ping-pong-0.0.1.jar /opt/app

CMD ["java", "-jar", "/opt/app/spring-ping-pong-0.0.1.jar"]
