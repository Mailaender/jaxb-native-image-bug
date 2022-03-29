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

## Build

```bash
mvn clean package -PNATIVE_IMAGE
```

## Run

```bash
./target/classes.main
```
