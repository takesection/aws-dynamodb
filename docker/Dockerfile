FROM ubuntu:latest

MAINTAINER Pigumer Group Inc.

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install openjdk-8-jre-headless curl -y && \
    mkdir -p /dynamodb && \
    cd /dynamodb && \
    curl -O https://s3-ap-northeast-1.amazonaws.com/dynamodb-local-tokyo/dynamodb_local_latest.tar.gz && \
    tar xvzf dynamodb_local_latest.tar.gz

EXPOSE 8000

CMD ["/usr/bin/java", "-Djava.library.path=/dynamodb/DynamoDBLocal_lib", "-jar", "/dynamodb/DynamoDBLocal.jar", "-port", "8000", "-inMemory"]
