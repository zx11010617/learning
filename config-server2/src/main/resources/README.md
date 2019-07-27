# Getting Started

### 步骤
##
在hosts文件中加入如下配置

127.0.0.1 peer1  
127.0.0.1 peer2  

* java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
* java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

* 这里要用到application.properties文件，且要改两个false为两个true
* eureka.client.register-with-eureka ：表示是否将自己注册到Eureka Server，默认为true。
* eureka.client.fetch-registry ：表示是否从Eureka Server获取注册信息，默认为true。


