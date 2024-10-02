package com.hoantran.test.jmeter;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Define the command to execute
        String[] command = {
            "jmeter", 
            "-n", 
            "-t", 
            "/Users/kalaiyarasan/Documents/JMETER/jmeter-webload-example-master/src/test/jmeter/page-load.jmx", 
            "-l", 
            "results.jtl"
        };

        // Create a ProcessBuilder
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        
        // Set the working directory
        processBuilder.directory(new File("/Users/kalaiyarasan/Documents/JMETER/jmeter-webload-example-master"));

        try {
            // Start the process
            Process process = processBuilder.start();

            // Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("Process finished with exit code: " + exitCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
