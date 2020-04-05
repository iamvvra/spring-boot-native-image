.PHONY: build
build:
	mvn clean package -DskipTests
	mkdir target/dependency
	(cd target/dependency; tar -zxf ../*.jar)
	docker build -t localhost:5000/spring-boot-native-image:${version} .