package com.ksm.ecom.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan (basePackages= {"com.ksm.ecom"})
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfiguration {

    private static final String JDBCDRIVER_CLASSNAME = "jdbc.driverClassName";
	private static final String JDBC_USERNAME = "jdbc.username";
	private static final String JDBC_PASSWORD = "jdbc.password";
	
	
	@Autowired
    private Environment environment;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "com.ksm.ecom.entity" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }
	
    @Bean
   /* @Primary*/
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty(JDBCDRIVER_CLASSNAME));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url1"));
        dataSource.setUsername(environment.getRequiredProperty(JDBC_USERNAME));
        dataSource.setPassword(environment.getRequiredProperty(JDBC_PASSWORD));
        return dataSource;
    }
    
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto","create");
        
/*        properties.put("org.hibernate.envers.audit_table_suffix",environment.getRequiredProperty("org.hibernate.envers.audit_table_suffix"));
*/      properties.put("connection.pool_size",environment.getRequiredProperty("connection.pool_size"));
       
        return properties;        
    }
    
	@Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
}

