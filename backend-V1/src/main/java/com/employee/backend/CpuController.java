package com.employee.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpu")
public class CpuController {

    @GetMapping("/stress")
    public String stressCpu() {
        long start = System.currentTimeMillis();
        // Run a CPU-intensive task for a certain period
        while (System.currentTimeMillis() - start < 10) { 
            double x = Math.random();
            for (int i = 0; i < 1000000; i++) {
                x = Math.sin(x);
            }
        }
        return "CPU stress task completed!";
    }
}
