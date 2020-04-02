package com.demo;

import com.demo.resources.UserResource;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.Configuration;
import io.dropwizard.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoApplication extends Application<Configuration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
    
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }
    @Override
    public void run(Configuration demoConfiguration, Environment environment) throws Exception {
        LOGGER.info("Registering REST resources");
        environment.jersey().register(new UserResource());
    }
    
    public static void main(String[] args) throws Exception {
        (new DemoApplication()).run(args);
    }
}
