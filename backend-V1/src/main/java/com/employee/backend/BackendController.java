package com.employee.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * This class defines the REST endpoints managed by the server.
 */
@RestController
public class BackendController {

    @Autowired private EmployeeRepository repository;


    /**
     * Endpoint for retrieving all employee stored in database
     * @return a list of Employee objects
     */
    @GetMapping("/version")
    public final String getDeployedVersion() {
        return "v1  Version Deployed";
    }
    /**
     * Endpoint for retrieving all employee stored in database
     * @return a list of Employee objects
     */
    @GetMapping("/employee")
    public final List<Employee> getMessages() {
        Sort byCreation = Sort.by(Sort.Direction.DESC, "_id");
        List<Employee> msgList = repository.findAll(byCreation);
        return msgList;
    }

    /**
     * Endpoint for adding a new employee entry to the database
     * @param message a message object passed in the HTTP POST request
     */
    @PostMapping("/employee")
    public final void addMessage(@RequestBody Employee message) {
        repository.save(message);
    }
}
