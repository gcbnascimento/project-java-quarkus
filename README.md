Teste Coopersystem

Comandos para executar o projeto:

microServiceA - irá gerar o jar do projeto microServiceA
mvn clean install
java -jar target/micro-service-a-1.0.0.jar

microServiceB - irá gerar o jar do projeto microServiceB
mvn clean install
java -jar target/micro-service-b-1.0.0.jar

Na pasta raiz, executar:
docker-compose up --build

Após, acessar:

Swagger Micro Service A -> http://0.0.0.0:8081/microservicea/q/swagger-ui
Swagger Micro Service B -> http://0.0.0.0:8082/microserviceb/q/swagger-ui