enablePlugins(ScalaJSPlugin)

name := "Bloom"
scalaVersion := "2.12.1"

libraryDependencies += "com.zoepepper"  %%% "scalajs-jsjoda"              % "1.1.1"
libraryDependencies += "com.zoepepper"  %%% "scalajs-jsjoda-as-java-time" % "1.1.1"
libraryDependencies += "be.doeraene"    %%% "scalajs-jquery"              % "0.9.1"
libraryDependencies += "org.scala-js"   %%% "scalajs-dom"                 % "0.9.1"

scalaJSUseMainModuleInitializer := true
