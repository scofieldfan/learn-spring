package com.example.springboothelloworld.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component

@PropertySource(value = "classpath:config/remote.properties",encoding = "utf-8")
public class RemoteProperties {

    @Value("${remote.title}")
    private String title;
}