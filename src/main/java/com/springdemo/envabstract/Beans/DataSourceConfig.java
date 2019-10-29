package com.springdemo.envabstract.Beans;

import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorH2DatabaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * 测试DataSourceBean
 * 2019/10/30 00:40
 *
 * @author konglinghan
 * @version 1.0
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @Profile("dev")
    public DataSource dataSource() {
        new JdbcDataSource
    }
}
