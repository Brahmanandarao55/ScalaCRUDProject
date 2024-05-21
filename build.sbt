//ThisBuild / version := "0.1.0-SNAPSHOT"
//
//ThisBuild / scalaVersion := "3.3.3"
//
//lazy val root = (project in file("."))
//  .settings(
//    name := "ScalaCRUDProject"
//  )
//libraryDependencies ++= Seq(
//  "org.scalatest" %% "scalatest" % "3.2.18" % Test,
//  "io.cucumber" %% "cucumber-scala" % "8.6.0" % Test,
//  "io.cucumber" % "cucumber-junit" % "6.10.4" % Test,
//  "junit" % "junit" % "4.13.2" % Test
//)
//testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD")




name := "ScalaCRUDProject"

//version := "0.1"
//
//scalaVersion := "2.13.6"
//
//libraryDependencies ++= Seq(
//  "org.scalatest" %% "scalatest" % "3.2.18" % Test,
//  "io.cucumber" %% "cucumber-scala" % "8.6.0" % Test,
//  "io.cucumber" % "cucumber-junit" % "8.0.1" % Test,
//  "junit" % "junit" % "4.13.2" % Test
//)
//
//testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD")


name := "ScalaCRUDProject"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  "io.cucumber" %% "cucumber-scala" % "6.10.0" % Test,
  "io.cucumber" % "cucumber-junit" % "6.10.0" % Test,
  "junit" % "junit" % "4.13.2" % Test
)

testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD")
