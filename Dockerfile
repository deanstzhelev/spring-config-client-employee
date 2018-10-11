FROM openjdk:9-jdk


ADD build/libs/employee-search-service-*.jar /home/employee-search.jar

CMD ["-jar", "home/employee-search.jar"]

EXPOSE 8081