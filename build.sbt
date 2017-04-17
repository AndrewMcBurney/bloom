enablePlugins(ScalaJSPlugin)

name := "Bloom"
scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom"    % "0.9.1"
  "be.doeraene"  %%% "scalajs-jquery" % "0.9.1"
)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
