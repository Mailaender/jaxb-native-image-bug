Tested on Ubuntu 20.04

## Installation
Follow the instructions at https://www.graalvm.org/22.0/reference-manual/native-image/

```bash
gu install native-image
sudo apt-get install build-essential libz-dev zlib1g-dev maven
```

## Configuration

```bash
GRAALVM_HOME=$HOME/Downloads/graalvm-ce-java11-22.0.0.2/
export GRAALVM_HOME=$GRAALVM_HOME
export JAVA_HOME="${GRAALVM_HOME}"
export PATH="${GRAALVM_HOME}/bin:$PATH"
```

Run this only once:
```bash
java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar target/example-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

## Build

```bash
mvn clean package -PNATIVE_IMAGE
```

## Run

```bash
./target/example
```
