# heroku-spring-boot-mybatis-mysql-flyway
This is a small demo application for showing how to run a [Spring Boot](http://projects.spring.io/spring-boot/)
application on [Heroku](http://heroku.com). Integration [MySQL](https://devcenter.heroku.com/articles/cleardb), [MyBatis](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/#), [Flyway Database Migration](https://flywaydb.org/), [Logging](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-logging.html), [Spring Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html) etc.

## Running the application
To run the application from your IDE, simply run the `com.codedrinker.Application` class as
a Java Application with `dev` [profile](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html).  
<img src="http://www.majiang.life/repository/asserts/spring-profile.png" width="350">  
Also you can start from the termial using maven with `mvn spring-boot:run -Dspring.profiles.active=dev`  

To run the application on Heroku is automated. We just get the `Procfic` for Heroku.
```
web: java -jar -Dspring.profiles.active=production target/heroku-spring-boot-mybatis-mysql-flyway-1.0.0.jar
```

## License

The MIT License (MIT)

Copyright (c) 2017 Chunlei Wang

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
