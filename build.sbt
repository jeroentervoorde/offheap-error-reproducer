name := """repr"""

version := "1.0"

scalaVersion := "2.11.7"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

libraryDependencies += "sh.den" %% "scala-offheap" % "0.1"
