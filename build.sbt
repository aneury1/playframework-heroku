name := """simpleserver2"""
organization := "com.chiripeando"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
enablePlugins(JavaAppPackaging)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.chiripeando.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.chiripeando.binders._"
