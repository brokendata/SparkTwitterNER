name := "spark-twitter-lang-classifier"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.1.0"

libraryDependencies += "com.google.code.gson" % "gson" % "2.3"

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.5"

libraryDependencies += "commons-cli" % "commons-cli" % "1.2"

libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.3.0"

libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.3.0" classifier "models"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"