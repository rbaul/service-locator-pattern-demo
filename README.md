# Service Locator Pattern Demo
> [See Example](src\test\java\com\github\rbaul\servicelocatorpattern\demo\ServiceLocatorPatternDemoApplicationTests.java)

# Build on
> Java 8

> Spring Boot 2.2.4

# Getting Started
> Run `ServiceLocatorPatternDemoApplication.java`

```log
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.4.RELEASE)

2020-01-27 11:18:57.938  INFO 11244 --- [           main] s.d.ServiceLocatorPatternDemoApplication : Starting ServiceLocatorPatternDemoApplication on RBAUL02 with PID 11244 (C:\github\service-locator-pattern-demo-2\out\production\classes started by rbaul in C:\github\service-locator-pattern-demo-2)
2020-01-27 11:18:57.944  INFO 11244 --- [           main] s.d.ServiceLocatorPatternDemoApplication : No active profile set, falling back to default profiles: default
2020-01-27 11:19:00.609  INFO 11244 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-01-27 11:19:00.620  INFO 11244 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-01-27 11:19:00.620  INFO 11244 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.30]
2020-01-27 11:19:00.769  INFO 11244 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-01-27 11:19:00.769  INFO 11244 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2728 ms
2020-01-27 11:19:01.371  INFO 11244 --- [           main] pertySourcedRequestMappingHandlerMapping : Mapped URL path [/v2/api-docs] onto method [springfox.documentation.swagger2.web.Swagger2Controller#getDocumentation(String, HttpServletRequest)]
2020-01-27 11:19:01.473  INFO 11244 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-01-27 11:19:01.636  INFO 11244 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
2020-01-27 11:19:01.732  INFO 11244 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
2020-01-27 11:19:01.786  INFO 11244 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
2020-01-27 11:19:01.890  INFO 11244 --- [           main] .d.s.w.r.o.CachingOperationNameGenerator : Generating unique operation named: executeByPluginTypeUsingGET_1
2020-01-27 11:19:01.985  INFO 11244 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-01-27 11:19:01.989  INFO 11244 --- [           main] s.d.ServiceLocatorPatternDemoApplication : Started ServiceLocatorPatternDemoApplication in 14.746 seconds (JVM running for 15.582)
2020-01-27 11:19:01.990  INFO 11244 --- [           main] c.g.r.s.d.service.impl.ExpressionBean    : Expression Plugin
Default Output
2020-01-27 11:19:01.991  INFO 11244 --- [           main] c.g.r.s.d.service.impl.ExpressionBean    : Default Plugin with @Primary
2020-01-27 11:19:01.991  INFO 11244 --- [           main] c.g.r.s.demo.plugins.Type2Plugin         : Default output of pluginType2
2020-01-27 11:19:01.991  INFO 11244 --- [           main] c.g.r.s.d.service.impl.ExpressionBean    : All Plugins
Default Output
Default Output
Default Output
2020-01-27 11:19:01.992  INFO 11244 --- [           main] c.g.r.s.demo.plugins.Type2Plugin         : Default output of pluginType2
Default Output
```

### Swagger UI
> Open browser `http://localhost:8080/swagger-ui.html`

## License

Licensed under the [Apache License, Version 2.0].  

[Apache License, Version 2.0]: LICENSE