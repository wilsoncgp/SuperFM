package com.wilsoncgp.superfm.models.base;

import com.wilsoncgp.superfm.base.BaseModel;

import java.util.Date;

/**
 * Created by Liam on 12/10/2014.
 */
public class Person extends BaseModel {
    protected String name;
    protected Date dateOfBirth;

    public Person(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
