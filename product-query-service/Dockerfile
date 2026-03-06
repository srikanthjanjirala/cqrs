FROM amazoncorretto:17-alpine

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 9292

ENTRYPOINT ["java","-jar","app.jar"]