package com.codedrinker.migration;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by codedrinker on 29/07/2017.
 */
@Component
public class Migrations implements InitializingBean {
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    public void migrate() {
        try {
            System.out.println("start migration");
            Flyway flyway = new Flyway();
            flyway.setDataSource(url, username, password);
            flyway.repair();// repair migration data schema before migrating
            flyway.migrate();
        } catch (FlywayException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        migrate();
    }
}
