package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyzerTestTest {
    @Test
    public void testMoodAnalysis() throws Exception {

        Assert.assertEquals(1,1);
    }

    @Test
    public void testMood() throws Exception {
        MoodAnalyzerTest moodAnalyzerTest = new MoodAnalyzerTest();
        String mood = moodAnalyzerTest.analyzeMood("this is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));

    }




}