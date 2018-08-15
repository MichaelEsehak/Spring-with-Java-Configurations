/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conf;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *
 * @author Michael
 */

@Configuration
//@PropertySource("E:\\Michael\\1-M\\NetBeansProjects\\MProject\\src\\main\\java\\mysql.properties")
public class DataSourceConfig {
    
    
//    @Value("${driverClassName}")
//    private String driverClassName;
//    @Value("${url}")
//    private String url;
//    @Value("${user}")
//    private String username;
//    @Value("${password}")
//    private String password;
//    
    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        
          try {

            HikariConfig hikariConfig = new HikariConfig();
            //datasource connection data
            hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
            hikariConfig.setJdbcUrl("jdbc:mysql://localhost/test");
            hikariConfig.setUsername("root");
            hikariConfig.setPassword("root");
            //connection pool specific configuration
            hikariConfig.setMaximumPoolSize(5);
            hikariConfig.setConnectionTestQuery("SELECT 1");
            hikariConfig.setPoolName("springHikariCP");
            hikariConfig.addDataSourceProperty("dataSource.cachePrepStmts", "true");
            hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSize", "250");
            hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSqlLimit", "2048");
            hikariConfig.addDataSourceProperty("dataSource.useServerPrepStmts", "true");

            HikariDataSource dataSource = new HikariDataSource(hikariConfig);

            return dataSource;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
}
