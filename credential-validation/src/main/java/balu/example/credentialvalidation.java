package balu.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class credentialvalidation {
    private Map<String, String> storedCredentials;

    public credentialvalidation() {
        storedCredentials = new HashMap<>();
        // Add predefined credentials
        storedCredentials.put("20MIC0113", "BALAJIG");
        storedCredentials.put("user2", "password2");
    }

    public boolean validateCredentials(String username, String password) {
        String storedPassword = storedCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public static void main(String[] args) {
    	credentialvalidation validator = new credentialvalidation();


    	    // Create a Scanner to read user input
    	    Scanner scanner = new Scanner(System.in);

    	    System.out.print("Enter username: ");
    	    String inputUsername = scanner.nextLine();

    	    System.out.print("Enter password: ");
    	    String inputPassword = scanner.nextLine();

    	    scanner.close(); // Close the scanner when done with input

    	    if (validator.validateCredentials(inputUsername, inputPassword)) {
    	        System.out.println("Authentication successful.");
    	    } else {
    	        System.out.println("Authentication failed.");
    	    }
    	}

    }

