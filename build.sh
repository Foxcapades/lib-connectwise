#!/usr/bin/env bash

set -e

# Get current branch
BRANCH=$(git branch | sed -rn 's/^  ([^(]+)/\1/ p')
echo "Running build on branch $BRANCH."

# Execute Build
./gradlew clean build jacocoTestReport

# Only execute the maven deploy steps on master
if [ "$BRANCH" = "master" ]; then
  ./gradlew bintrayUpload
fi
