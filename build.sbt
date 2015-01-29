name := "scala-activerecord-issue58"

version := "0.3.0"

scalaVersion := "2.11.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % "0.3.0",
  "com.github.aselab" %% "scala-activerecord-play2" % "0.3.0",
  jdbc,
  "com.h2database" % "h2" % "1.4.185",
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "bootstrap" % "3.3.2"
)

TwirlKeys.templateImports += "com.github.aselab.activerecord.views.dsl._"
