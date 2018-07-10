package hello.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class DataSourceConfig
{
	@Bean
	public DataSource getDataSource() throws SQLException
	{
		OracleDataSource datasource = new OracleDataSource();
		datasource.setUser("coco");
		datasource.setPassword("coco");
		datasource.setURL("jdbc:oracle:thin:@localhost:1521/orcl");
		return datasource;
	}
}
