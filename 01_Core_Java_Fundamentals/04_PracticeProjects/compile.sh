#!/bin/bash
# compile.sh — compile all .java in src/ into build/

SRC_DIR=src
BUILD_DIR=build

# clean previous build
rm -rf "$BUILD_DIR"
mkdir -p "$BUILD_DIR"

# compile all .java files, placing .class under build/
javac -d "$BUILD_DIR" $(find "$SRC_DIR" -name "*.java")

echo "Compilation complete. .class files are under '$BUILD_DIR/'"
