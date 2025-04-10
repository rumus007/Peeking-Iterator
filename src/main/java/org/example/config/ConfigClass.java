package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")  // Adjust to your project structure
public class ConfigClass {
    // No need to manually define beans; ComponentScan will auto-detect them
}
