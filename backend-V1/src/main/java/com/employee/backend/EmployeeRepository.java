package com.employee.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * represents a custom Mongo repository that stores GuestBookEntry objects
 */
public interface EmployeeRepository extends
    MongoRepository<Employee, String> { }
