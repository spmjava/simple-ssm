package com.spmjava.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 齐伟超
 * @date 2018-08-03 15:30
 * @since 1.0.0
 **/

@Configuration
@ComponentScan(basePackageClasses = {MarkerInterface.class})
public class SpringConfig {
}
