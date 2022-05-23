name := "test-join-wiz"

version := "0.1"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "io.github.salamahin" %% "joinwiz_core" % "0.3.2",
  "org.apache.spark"   %% "spark-sql"    % "2.4.5"
)