package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    private static int nextId = 1;
    private int id;
    private String value;

    public CoreCompetency() {
        id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // The 'id' field should not have a setter, only a getter.
    public int getId() {
        return id;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


// TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.



