#!/bin/bash

# Compile the project
javac -d out src/**/*.java

# Create JAR file if necessary
# jar cvf myapp.jar -C out/ .

echo "Build completed successfully."
