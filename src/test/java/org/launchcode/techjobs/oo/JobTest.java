package org.launchcode.techjobs.oo;


import org.junit.Test;
import org.junit.Assert;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        Assert.assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Assert.assertTrue(testJob.getName() instanceof String);
        Assert.assertEquals("Product tester", testJob.getName());

        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertEquals("ACME", testJob.getEmployer().getValue());

        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertEquals("Desert", testJob.getLocation().getValue());

        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertEquals("Quality control", testJob.getPositionType().getValue());

        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Junior Engineer", new Employer("ABC Corp"),
                new Location("Remote"), new PositionType("Software Engineer"),
                new CoreCompetency("Java"));
        Job testJob2 = new Job("Junior Engineer", new Employer("ABC Corp"),
                new Location("Remote"), new PositionType("Software Engineer"),
                new CoreCompetency("Java"));

        Assert.assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String jobToString = testJob.toString();
        Assert.assertTrue(jobToString.startsWith(System.lineSeparator()));
        Assert.assertTrue(jobToString.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String testString = testJob.toString();
        int jobId = testJob.getId();
        String correctString = (System.lineSeparator() +
                                    "ID: " + jobId + System.lineSeparator() +
                                    "Name: Product tester" + System.lineSeparator() +
                                    "Employer: ACME" + System.lineSeparator() +
                                    "Location: Desert" + System.lineSeparator() +
                                    "Position Type: Quality control" + System.lineSeparator() +
                                    "Core Competency: Persistence" + System.lineSeparator());
        Assert.assertEquals(correctString, testString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Product tester", new Employer(),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String testString = testJob.toString();
        int jobId = testJob.getId();
        String correctString = (System.lineSeparator() +
                "ID: " + jobId + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator());
        Assert.assertEquals(correctString, testString);
    }
}
