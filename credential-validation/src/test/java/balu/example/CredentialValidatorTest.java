package balu.example;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CredentialValidatorTest {
    private credentialvalidation validator;

    @Before
    public void setUp() {
        validator = new credentialvalidation();
    }

    @Test
    public void testValidCredentials() {
        assertTrue(validator.validateCredentials("20MIC0113", "BALAJIG"));
    }

    @Test
    public void testInvalidCredentials() {
        assertFalse(validator.validateCredentials("user1", "wrongPassword"));
    }
}

