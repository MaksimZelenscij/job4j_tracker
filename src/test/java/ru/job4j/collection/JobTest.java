package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {

    @Test
    public void jobAscByName() {
        JobAcsByName jobAcsByName = new JobAcsByName();
        int rsl = jobAcsByName.compare(new Job("Impl task", 1), new Job("Fix bug", 2));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void jobDesByName() {
        JobDescByName jobDescByName = new JobDescByName();
        int rsl = jobDescByName.compare(new Job("Impl task", 1), new Job("Fix bug", 2));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void jobAcsPriority() {
        JobAscPriority jobAscPriority = new JobAscPriority();
        int rsl = jobAscPriority.compare(new Job("Impl task", 1), new Job("Fix bug", 2));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void jobDescByPriority() {
        JobDescByPriority jobDescByPriority = new JobDescByPriority();
        int rsl = jobDescByPriority.compare(new Job("Fix", 1), new Job("Clean", 2));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAcsNameAndAcsPriority() {
        Comparator<Job> cmpNamePriority = new JobAcsByName().thenComparing(new JobAscPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAscPriorAndByAcsName() {
        Comparator<Job> cmpNamePrior = new JobAscPriority().thenComparing(new JobAcsByName());
        int rsl = cmpNamePrior.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorDescAndNameDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}