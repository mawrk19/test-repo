package com.rit.ces.deployment;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:tomcat7.properties")
public class Tomcat7DeploymentConfig {
    // Configuration for Tomcat 7 deployment
}