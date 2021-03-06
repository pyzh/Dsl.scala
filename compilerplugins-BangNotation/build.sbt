libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value % Provided

scalacOptions ++= {
  if (scalaBinaryVersion.value == "2.11") {
    Seq("–Yexperimental")
  } else {
    Seq()
  }
}

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.6-SNAP1" % Test
