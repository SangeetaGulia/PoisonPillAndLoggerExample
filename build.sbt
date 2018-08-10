name := "LoggerDemoProject"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % "2.5.13")
  // https://mvnrepository.com/artifact/log4j/log4j
  libraryDependencies += "log4j" % "log4j" % "1.2.17"

