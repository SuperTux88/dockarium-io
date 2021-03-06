resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.0")

addSbtPlugin("com.vmunier" % "sbt-play-scalajs" % "0.2.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")
