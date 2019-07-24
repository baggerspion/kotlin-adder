# kotlin-adder
A simply Kotlin-based microservice which will add two numbers together.

- To build: `./gradlew bootJar`
- To build/run: `./gradlew bootRun`

## Docker
- First build, as above
- Build your Docker image: `docker build --build-arg JAR_FILE=build/libs/service-demo-0.0.1-SNAPSHOT.jar -t therealpadams/adder .`
- Run: `docker run -d -p 8080:8080 therealpadams/adder`

## To Test
- `curl -H "Content-Type: application/json" -X POST -d '{"operand1": 21, "operand2": 12}' localhost:8080/add`
