name := "SparkScala"

version := "0.1"

scalaVersion := "2.11.8"

version

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
//libraryDependencies +=  "org.scala-sbt" %% "compiler-bridge" % "1.3.0-M3" % Test