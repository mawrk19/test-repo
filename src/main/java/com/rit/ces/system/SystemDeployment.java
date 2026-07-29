package com.rit.ces.system;

import com.rit.ces.deployment.Tomcat7DeploymentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemDeployment {
    @Autowired
    private Tomcat7DeploymentConfig tomcat7DeploymentConfig;

    public void deploySystem() {
        // Deploy the system on Tomcat 7
        System.out.println("Deploying system on Tomcat 7...");
        // Use tomcat7DeploymentConfig to get deployment properties
    }
}