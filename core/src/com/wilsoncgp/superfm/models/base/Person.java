package com.wilsoncgp.superfm.models.base;

import java.util.Date;

/**
 * Created by Liam on 12/10/2014.
 */
public class Person {
    protected String name;
    protected Date dateOfBirth;

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
