 package edu.calvin.cs262.homework2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Players
 */
public class Player {

    private int id;
    private String name;
    private String email;


    public Player(int id, String name, String email) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getId() {
        return "" + id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}

