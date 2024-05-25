package com.employee.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Mongo repository that stores Employee objects
 */
public interface EmployeeRepository extends
    MongoRepository<Employee, String> { }
