# heroku-spring-boot-mybatis-mysql-flyway
This is a small demo application for showing how to run a [Spring Boot](http://projects.spring.io/spring-boot/)
application on [Heroku](http://heroku.com). Integration [MySQL](https://devcenter.heroku.com/articles/cleardb), [MyBatis](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/#), [Flyway Database Migration](https://flywaydb.org/), [Logging](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-logging.html), [Spring Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html) etc.

## Running the application
Before starting the application you should execute the following commands to change to default db to MySQL.
```
heroku addons:destroy heroku-postgresql
heroku addons:create cleardb:ignite
```
To run the application from your IDE, simply run the `com.codedrinker.Application` class as
a Java Application with `dev` [profile](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html).  
<img src="http://www.majiang.life/repository/asserts/spring-profile.png" width="350">
If does not work, input `-Dspring.profiles.active=dev` to VM Options.
Also you can start from the termial using maven with `mvn spring-boot:run -Dspring.profiles.active=dev`  

To run the application on Heroku is automated. We just get the `Procfic` for Heroku.
```
web: java -jar -Dspring.profiles.active=production target/heroku-spring-boot-mybatis-mysql-flyway-1.0.0.jar
```

## 中文说明
当前项目是修改之前 Heroku 官方的示例，添加了 Spring，MyBatis，Druid，Flyway，Lombok等方便的功能。  
使用过程中，克隆代码以后需要修改一些地方

### 修改
```bash
V1__Create_admin_table.sql 内容修改
index.html 文案
app.json 内容和描述
pom.xml 项目名称和ID
Procfile 对应的项目名称
application-dev.yml 对应的H2地址
Readme 相关内容
```
### 运行
直接按照下图运行即可  
<img src="http://www.majiang.life/repository/asserts/spring-profile.png" width="350">  
或者使用`-Dspring.profiles.active=dev` 参数配置。
如果使用 jar 的方式运行使用如下命令

```
java -jar -Dspring.profiles.active=production target/heroku-spring-boot-mybatis-mysql-flyway-1.0.0.jar
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
