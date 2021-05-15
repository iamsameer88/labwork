package com.cg.lab1_2config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions.
 **/

@Configuration
@ComponentScan("com.cg.lab1_2entities")
public class MyConfig {

}
