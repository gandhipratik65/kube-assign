package com.employee.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memory")
public class MemoryController {

    @GetMapping("/stress")
    public String stressMemory() {
        int arraySize = 10000000; // Size of the array to allocate
        int[] memoryFillIntVar = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            memoryFillIntVar[i] = i;
        }
        // Perform some operations to keep the CPU busy
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 10000) { // 10 seconds
            for (int i = 0; i < arraySize; i++) {
                memoryFillIntVar[i] = memoryFillIntVar[i] * 2;
            }
        }
        return "Memory stress task completed!";
    }
}