package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnnualPercentageChangeRandoopTest {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnualPercentageChangeRandoopTest.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnualPercentageChangeRandoopTest.test2");
        calculations.AnnualPercentageChange annualPercentageChange0 = new calculations.AnnualPercentageChange();
        java.lang.Class<?> wildcardClass1 = annualPercentageChange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnualPercentageChangeRandoopTest.test3");
        calculations.AnnualPercentageChange annualPercentageChange0 = new calculations.AnnualPercentageChange();
        com.google.gson.JsonArray[] jsonArrayArray1 = new com.google.gson.JsonArray[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Integer, java.lang.Float> intMap2 = annualPercentageChange0.execute(jsonArrayArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonArrayArray1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnualPercentageChangeRandoopTest.test4");
        calculations.AnnualPercentageChange annualPercentageChange0 = new calculations.AnnualPercentageChange();
        com.google.gson.JsonArray jsonArray1 = null;
        com.google.gson.JsonArray[] jsonArrayArray2 = new com.google.gson.JsonArray[] { jsonArray1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Integer, java.lang.Float> intMap3 = annualPercentageChange0.execute(jsonArrayArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.JsonArray.get(int)\" because \"firstData\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonArrayArray2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AnnualPercentageChangeRandoopTest.test5");
        calculations.AnnualPercentageChange annualPercentageChange0 = new calculations.AnnualPercentageChange();
        com.google.gson.JsonArray[] jsonArrayArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Integer, java.lang.Float> intMap2 = annualPercentageChange0.execute(jsonArrayArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

