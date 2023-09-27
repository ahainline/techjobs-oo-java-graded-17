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
        Assert.assertEquals(testJob.getName(), "Product tester");

        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertEquals(testJob.getEmployer().getValue(), "ACME");

        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertEquals(testJob.getLocation().getValue(), "Desert");

        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertEquals(testJob.getPositionType().getValue(), "Quality control");

        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
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
}
