package com.assessment.tax.client.converters;


import junit.framework.TestCase;
import org.junit.Test;

public class InputConverterTest extends TestCase {


    @Test
    public void testGetFormattedAmountLessOrEqualToFive() throws Exception {
        assertEquals("54.65" , InputConverter.getFormattedAmount(54.625));
        assertEquals("54.15" , InputConverter.getFormattedAmount(54.115));
    }
    @Test
    public void testGetFormattedAmountBiggerThanFive() throws Exception {
        assertEquals("54.70" , InputConverter.getFormattedAmount(54.675));
    }
}