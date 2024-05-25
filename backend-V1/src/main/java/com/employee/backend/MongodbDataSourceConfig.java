package com.employee.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * Manages Mongo configuration data
 */
@Configuration
public class MongodbDataSourceConfig extends AbstractMongoClientConfiguration {

    /**
     * The name of the mongo database to use
     */
    @Override
    public final String getDatabaseName() {
        return "employeeBook";
    }

    /**
     * Manages connects to the mongo service address passed in as an
     * environment variable
     */
    @Override
    public final MongoClient mongoClient() {
        String dbAddress = System.getenv("EMPLOYEE_DB_ADDR");
        String username = System.getenv("MONGO_INITDB_ROOT_USERNAME");
        String password = System.getenv("MONGO_INITDB_ROOT_PASSWORD");
        ConnectionString connectionString =
                new ConnectionString(String.format("mongodb://%s:%s@%s", username, password, dbAddress));
        return MongoClients.create(connectionString);
    }
}
