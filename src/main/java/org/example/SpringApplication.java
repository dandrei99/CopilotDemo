package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}

//explain line 9
// The @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It's a convenience annotation that adds all of the following:
// @Configuration: Tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

//explain line 8

// The @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It's a convenience annotation that adds all of the following:

//explain public static void main(String[] args)
// The main() method is the entry point of the application. It's a standard method that must be present in all Java programs. The main() method is called by the JVM, and it's the method from where execution of any Java program begins. The main() method must be public, static, and void. It must accept a single argument of type String array.

//explain org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
// The SpringApplication.run() method is used to launch a Spring application from a Java main method. It creates an appropriate ApplicationContext instance and registers a CommandLineRunner (if any) to call the run() method. The run() method then calls the run(String... args) method of the SpringApplication class, which in turn creates an ApplicationContext instance and runs the application.

//explain SpringApplication.class
// The SpringApplication class is the main class of the Spring Boot application. It is responsible for starting the Spring application context and running the application. The SpringApplication class is typically annotated with the @SpringBootApplication annotation, which triggers auto-configuration and component scanning. The SpringApplication class also contains the main() method, which is the entry point of the application.

