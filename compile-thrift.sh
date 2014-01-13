#  This requires that you install Thrift binaries and compiler
#
#!/bin/sh

scriptDir=$(dirname $0)
includeDir=$scriptDir
thriftSrcDir=src/main/java/com/talool/iris/thrift

rm -rf $thriftSrcDir
rm -rf $scriptDir/gen-cocoa

echo "*** Generating Java ***"
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/iris.thrift

echo "*** Generating Cocoa ***"
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/iris.thrift

echo "*** Moving $scriptDir/gen-java/* to src/main/java/. ***"
cp -r  $scriptDir/gen-java/* src/main/java/.
rm -rf $scriptDir/gen-java

