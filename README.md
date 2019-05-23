# sbt-seed.g8
SBT seed that includes some libs I like to use.

Create new project with:
`sbt new pietrotull/sbt-seed.g8`

### Versions:
- Scala 2.12.4
- sbt 1.1.0

### Includes the following libs:
```
- net.databinder.dispatch     % dispatch-core            % 1.0.1
- net.databinder.dispatch     % dispatch-json4s-native   % 1.0.1
- org.json4s                  % json4s-ext               % 3.6.5
- ch.qos.logback              % logback-classic          % 1.2.3
- io.sqooba                	  % sq-conf                  % 0.5.1
- com.typesafe.scala-logging  % scala-logging            % 3.7.2
```

### Testing
```
- org.scalatest               % scalatest                % 3.0.7
- org.mockito                 % mockito-all              % 1.10.19
```

### Other
- scala style config
- basic logback config
