package com.woodyphillips.wp0724;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InputHandler {
    private final HARTApplication hartApplication;

    @Autowired
    public InputHandler(HARTApplication hartApplication) {
        this.hartApplication = hartApplication;
    }

    public void startInputLoop() {
        LineReader reader = LineReaderBuilder.builder().build();

        try {
            String line;
            while ((line = reader.readLine("Enter command (type 'exit' to quit): ")) != null) {
                hartApplication.handleInput(line.trim());
            }
        } catch (UserInterruptException e) {
            // Handle user interrupt (Ctrl+C)
            System.out.println("User interrupted. Exiting...");
        }
    }
}
