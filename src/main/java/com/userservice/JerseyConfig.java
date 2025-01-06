package com.userservice;


import com.userservice.Controller.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register(UserResource.class);
        property(ServerProperties.RESPONSE_SET_STATUS_OVER_SEND_ERROR,true);
    }



}
