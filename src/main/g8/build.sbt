
organization := "$package$"
scalaVersion := "2.12.8"
version      := "0.1.0-SNAPSHOT"
name         := "$name$"

val dispatchVersion = "1.0.1"

libraryDependencies ++= Seq(
  "net.databinder.dispatch"     %%  "dispatch-core"           % dispatchVersion,
  "net.databinder.dispatch"     %%  "dispatch-json4s-native"  % dispatchVersion,
  "org.json4s"                  %%  "json4s-ext"              % "3.6.5",
  "ch.qos.logback"              %   "logback-classic"         % "1.2.3",
  "io.sqooba"    	            %%  "sq-conf"                 % "0.5.1",
  "com.typesafe.scala-logging"  %%  "scala-logging"           % "3.7.2",
  "org.scalatest"               %%  "scalatest"               % "3.0.7"             % Test,
  "org.mockito"                 %   "mockito-all"             % "1.10.19"           % Test
)

excludeDependencies ++= Seq("org.slf4j" % "slf4j-log4j12", "log4j" % "log4j")

testOptions in Test += Tests.Argument("-l", "ExternalSpec")

lazy val External = config("ext").extend(Test)
configs(External)
inConfig(External)(Defaults.testTasks)
testOptions in External -= Tests.Argument("-l", "ExternalSpec")
testOptions in External += Tests.Argument("-n", "ExternalSpec")
