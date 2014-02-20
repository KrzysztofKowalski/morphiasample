import sbt._
import sbt.Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName = "MorphiaSample"
  val appVersion = "0.1.0-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    filters,
    "commons-net" % "commons-net" % "3.+",
    "com.google.guava" % "guava" % "14.0",
    "k7k" %% "play2-morphia-plugin" % "0.0.18"	
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers ++= Seq(
      "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases",
      "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      "java-net" at "http://download.java.net/maven/2",
      "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
      "spray repo" at "http://repo.spray.io",
      "Big Bee Consultants" at "http://repo.bigbeeconsultants.co.uk/repo",
      Resolver.url("My GitHub Play Repository", url("http://krzysztofkowalski.github.io/releases/"))(Resolver.ivyStylePatterns),
      // maven repo
      Resolver.url("maven.org", url("http://repo1.maven.org/maven2/"))(Resolver.ivyStylePatterns),
      // secure social
      Resolver.url("sbt-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns)
    )

  )

}
