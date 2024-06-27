FROM openjdk:17
EXPOSE 8080
ADD target/demodummy.jar demodummy.jar
ENTRYPOINT [ "java", "-jar" ,"demodummy.jar" ]