# 관련 소스

* [second-api]
* [local config](https://github.com/poscoict-glueframework/template-config/blob/master/second-api-local.yml)
* [vdi config](https://github.com/poscoict-glueframework/template-config/blob/master/second-api-vdi.yml)

```
git clone https://github.com/poscoict-glueframework/msa-second.git second
```

# second-api 마이크로 서비스

```
cd second
mvn -Plocal clean install
java -jar second-spring-boot/target/second-spring-boot-0.0.2-SNAPSHOT.jar
```

## 확인

* -Plocal 로 빌드한 경우 :

```
http://localhost:9180/actuator
http://localhost:9180/adapter/second?name=1st
http://localhost:9180/adapter/second?name=2nd
http://localhost:9180/swagger-ui.html
```

* -Pvdi 로 빌드한 경우 :

```
http://second-api:8280/actuator
http://second-api:8280/adapter/second?name=1st
http://second-api:8280/adapter/second?name=2nd
http://second-api:8280/swagger-ui.html
```
