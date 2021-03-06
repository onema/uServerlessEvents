
organization := "io.onema"

name := "uServerlessEvents"

version := "0.0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= {
  Seq(
    // Testing
    "org.scalatest"                  %% "scalatest"                  % "3.0.5"       % "test",
    "io.onema"                       % "json-extensions_2.12"        % "0.3.0"       % "test"
  )
}

// Maven Central Repo boilerplate configuration
pomIncludeRepository := { _ => false }
licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("https://github.com/onema/uServerlessEvents"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/onema/uServerlessEvents"),
    "scm:git@github.com:onema/uServerlessEvents.git"
  )
)
developers := List(
  Developer(
    id    = "onema",
    name  = "Juan Manuel Torres",
    email = "software@onema.io",
    url   = url("https://github.com/onema/")
  )
)
publishMavenStyle := true
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
publishArtifact in Test := false