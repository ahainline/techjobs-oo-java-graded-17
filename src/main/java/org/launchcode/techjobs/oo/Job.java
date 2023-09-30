package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String printName;
        String printEmployer;
        String printLocation;
        String printPositionType;
        String printCoreCompetency;

        if (this.getName() != null && !this.getName().isEmpty()) {
            printName = this.getName();
        } else {
            printName = "Data not available";
        }

        if (this.getEmployer().toString() != null && !this.getEmployer().toString().isEmpty()) {
            printEmployer = this.getEmployer().toString();
        } else {
            printEmployer = "Data not available";
        }

        if (this.getLocation().toString() != null && !this.getLocation().toString().isEmpty()) {
            printLocation = this.getLocation().toString();
        } else {
            printLocation = "Data not available";
        }

        if (this.getPositionType().toString() != null && !this.getPositionType().toString().isEmpty()) {
            printPositionType = this.getPositionType().toString();
        } else {
            printPositionType = "Data not available";
        }

        if (this.getCoreCompetency().toString() != null && !this.getCoreCompetency().toString().isEmpty()) {
            printCoreCompetency = this.getCoreCompetency().toString();
        } else {
            printCoreCompetency = "Data not available";
        }

        return System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + printName + System.lineSeparator() +
                "Employer: " + printEmployer + System.lineSeparator() +
                "Location: " + printLocation + System.lineSeparator() +
                "Position Type: " + printPositionType + System.lineSeparator() +
                "Core Competency: " + printCoreCompetency +
                System.lineSeparator();
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
