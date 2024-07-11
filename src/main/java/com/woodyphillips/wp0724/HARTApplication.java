package com.woodyphillips.wp0724;

import org.springframework.stereotype.Component;

import java.util.Hashtable;

@Component
public class HARTApplication {
    private Hashtable<String, HardwareTool> toolsDataBase;

    public HARTApplication() {
        // Initialize your tools database or other dependencies
        this.toolsDataBase = new Hashtable<>();
    }

    // Example method for handling input or processing
    public void handleInput(String input) {
        // Logic to handle input
        System.out.println("Received input: " + input);
        // Example: check for "exit" command to stop the application
        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Exiting application...");
            System.exit(0); // or set a flag to exit gracefully
        }
    }

    // Example method for processing business logic
    public void processBusinessLogic() {
        // Example business logic
        System.out.println("Processing business logic...");
    }

    public boolean receivedInput(String s) {
        return s != null && !s.isEmpty();
    }
}
