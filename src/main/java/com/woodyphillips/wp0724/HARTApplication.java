package com.woodyphillips.wp0724;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Hashtable;
import com.woodyphillips.wp0724.Tool.ToolBuilder;

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

    // Utility method in creating a rental agreement; doing it this way as it is faster to test this one piece put together
    // by the builder steps than to test each step of the builder in each test that builds a RentalAgreement.
    // Steps to test the builder can be separated from this easier this way.
    public RentalAgreement createRental(String toolCode, Date date, int rentalDays, int discountPercent) {
        // Build tool
        Tool tool = null;


        RentalAgreement rentalAgreement = new RentalAgreement(tool, date, rentalDays, discountPercent);
        return null;
    }
}
