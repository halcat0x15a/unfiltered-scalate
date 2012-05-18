resolvers ++= Seq(
  "coda" at "http://repo.codahale.com")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.1")

resolvers <+= (sbtVersion)(_ split('.') match {
  case Array("0", "11", "2") =>
    "less is" at "http://repo.lessis.me"
  case _ =>
    Resolver.url("sbt-plugin-releases",
      new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
       Resolver.ivyStylePatterns)
})
