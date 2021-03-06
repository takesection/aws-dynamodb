name := """aws-dynamodb"""

version := "1.0"

scalaVersion := "2.11.7"

// https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-dynamodb
libraryDependencies += "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.11.86"

// https://mvnrepository.com/artifact/org.specs2/specs2-core_2.11
libraryDependencies += "org.specs2" % "specs2-core_2.11" % "3.8.7" % Test

// https://mvnrepository.com/artifact/io.spray/spray-json_2.11
libraryDependencies += "io.spray" % "spray-json_2.11" % "1.3.3"
