# sbt-seed.g8
SBT seed that includes some libs I like to use.

Create new project with:
`sbt new pietrotull/sbt-seed.g8`

### Versions:
- Scala 2.12.4
- sbt 1.1.0

### Includes the following libs:
```
- net.databinder.dispatch     % dispatch-core            % 0.13.3
- net.databinder.dispatch     % dispatch-json4s-native   % 0.13.3
- org.json4s                  % json4s-ext               % 3.5.3
- ch.qos.logback              % logback-classic          % 1.2.3
- com.typesafe                % config                   % 1.3.1
- com.typesafe.scala-logging  % scala-logging            % 3.7.2
```

### Testing
```
- org.scalatest               % scalatest                % 3.0.4
- org.mockito                 % mockito-all              % 1.10.19
```

### Other
- scala style config
- basic logback config
