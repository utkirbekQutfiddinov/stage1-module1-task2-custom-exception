package com.epam.mjc;

public class StudentNotFoundException extends  IllegalArgumentException{

    public StudentNotFoundException(String s) {
        super("Could not find student with ID "+s);
    }
}
