package org.launchcode.techjobs.oo;

import java.util.HashMap;
import java.util.Map;
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
        HashMap<String, String> printValues = new HashMap<>();
        printValues.put("name", getName());
        printValues.put("employer", getEmployer().toString());
        printValues.put("location", getLocation().toString());
        printValues.put("positionType", getPositionType().toString());
        printValues.put("coreCompetency", getCoreCompetency().toString());
        int emptyCount = 0;

        for (Map.Entry<String, String> printable : printValues.entrySet()) {
            String key = printable.getKey();
            if (printable.getValue().isEmpty()) {
                printValues.replace(key, "Data not available");
                emptyCount++;
            }
        }

        if (emptyCount == printValues.size()){
            return "OOPS! This job does not seem to exist.";
        }

        return System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + printValues.get("name") + System.lineSeparator() +
                "Employer: " + printValues.get("employer") + System.lineSeparator() +
                "Location: " + printValues.get("location") + System.lineSeparator() +
                "Position Type: " + printValues.get("positionType") + System.lineSeparator() +
                "Core Competency: " + printValues.get("coreCompetency") +
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
