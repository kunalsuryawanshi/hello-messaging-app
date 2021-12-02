package com.bridgelabz.hellomessagingapp.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class User {
    public static final Logger logger = LoggerFactory.getLogger(User.class);
    private String firstName;
    private String lastName;

    public String getFirstName() {
        logger.info("*** Getting First Name ***");
        return firstName;
    }

    public void setFirstName(String firstName) {
        logger.info("*** Setting First Name ***");
        this.firstName = firstName;
    }

    public String getLastName() {
        logger.info("*** Getting Last Name ***");
        return lastName;
    }

    public void setLastName(String lastName) {
        logger.info("*** Setting Last Name ***");
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
