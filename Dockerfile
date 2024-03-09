FROM openjdk:11
WORKDIR /usr/src/myapp
COPY ./Main.java /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]