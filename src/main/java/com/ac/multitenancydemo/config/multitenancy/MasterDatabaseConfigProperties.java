package com.ac.multitenancydemo.config.multitenancy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("multitenancy.mtapp.master.datasource")
public class MasterDatabaseConfigProperties {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
   



    public String getUrl() {
        return url;
    }

    public MasterDatabaseConfigProperties setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MasterDatabaseConfigProperties setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MasterDatabaseConfigProperties setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public MasterDatabaseConfigProperties setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        return this;
    }

}