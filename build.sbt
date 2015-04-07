name := """play2-angular-83"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "angularjs" % "1.3.4",
  "org.webjars" % "bootstrap" % "3.3.1" exclude("org.webjars", "jquery"),
  "org.webjars" % "requirejs" % "2.1.15" exclude("org.webjars", "jquery")
)
