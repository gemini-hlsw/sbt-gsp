
inThisBuild(
  (homepage := Some(url("https://github.com/gemini-hlsw/sbt-lucuma"))) +: lucumaPublishSettings
)

addSbtPlugin("de.heikoseeberger"         % "sbt-header"   % "5.6.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.20")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix" % "0.9.29")

lazy val sbtLucuma = (project in file("."))
  .disablePlugins(LucumaPlugin)
  .enablePlugins(SbtPlugin)
  .enablePlugins(AutomateHeaderPlugin)
  .settings(
    name := "sbt-lucuma",
  )
  .settings(lucumaHeaderSettings)

