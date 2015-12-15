#!/bin/bash

java -jar swagger-codegen-cli-2.1.4.jar generate \
  -i ../src/main/resources/api.yaml \
  -l spring-mvc