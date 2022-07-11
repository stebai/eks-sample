FROM eclipse-temurin:11
ADD target/eks.jar eks.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "eks.jar"]
