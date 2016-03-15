name := "spark-lab"

version := "1.0"

scalaVersion := "2.10.6"

scalacOptions ++= Seq("-feature")
scalacOptions ++= Seq("-deprecation")

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.6.0"
libraryDependencies += "org.apache.spark" % "spark-catalyst_2.10" % "1.6.0"

