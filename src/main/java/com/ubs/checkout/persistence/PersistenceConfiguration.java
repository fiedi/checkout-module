package com.ubs.checkout.persistence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource({"classpath:mysql.properties"})
@ComponentScan({"com.ubs.checkout.persistence"})
public class PersistenceConfiguration {

}
