addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
//addSbtPlugin("org.scalameta"  %% "sbt-scalafmt"          % "2.7.5")

libraryDependencies ++= Seq {
  "com.typesafe.slick" %% "slick"         % "3.3.2"
  "org.slf4j"           % "slf4j-nop"     % "1.6.4"
  "com.typesafe.slick" %% "slick-codegen" % "3.0.0"
  "org.scalatest"      %% "scalatest"     % "3.0.5"  % Test
  "org.mockito"         % "mockito-core"  % "2.21.0" % Test
}

scalacOptions ++= Seq("-encoding", "UTF-8")
