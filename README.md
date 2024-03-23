# GraalVM Native Support
Cara supaya spring-boot App bisa jadi native image
```console
mvn clean package -DskipTest
```
``` 
./mvnw -Pnative native:compile -DskipTests```
```
Cara jalanin nya
```console
./target/demo-native         
```

# coba Spring Boot DevTools
```pom
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```
command + f9  (build/compile file) nanti dia otomatis restart