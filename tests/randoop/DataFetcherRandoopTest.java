package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataFetcherRandoopTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test01");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test03");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test04");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray3 = dataFetcher0.fetchData(analysis1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test05");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test06");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        java.lang.Class<?> wildcardClass1 = dataFetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test07");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test08");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test09");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray3 = dataFetcher0.fetchData(analysis1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test10");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test11");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray5 = dataFetcher0.fetchData(analysis1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test12");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test13");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test14");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test15");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test16");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test17");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray5 = dataFetcher0.fetchData(analysis1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test18");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray4 = dataFetcher0.fetchData(analysis1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test19");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray5 = dataFetcher0.fetchData(analysis1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test20");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test21");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test22");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test23");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = dataFetcher0.fetchData(analysis1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test24");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = dataFetcher0.fetchData(analysis1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test25");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = dataFetcher0.fetchData(analysis1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test26");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray4 = dataFetcher0.fetchData(analysis1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test27");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test28");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = dataFetcher0.fetchData(analysis1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test29");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test30");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test31");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test32");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = dataFetcher0.fetchData(analysis1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test33");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test34");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test35");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test36");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test37");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray5 = dataFetcher0.fetchData(analysis1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test38");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test39");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = dataFetcher0.fetchData(analysis1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test40");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test41");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test42");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test43");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test44");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test45");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test46");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray7 = dataFetcher0.fetchData(analysis1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test47");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test48");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray9 = dataFetcher0.fetchData(analysis1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataFetcherRandoopTest.test49");
        dataManagement.DataFetcher dataFetcher0 = dataManagement.DataFetcher.getFetcher();
        analysisGenerator.Analysis analysis1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray8 = dataFetcher0.fetchData(analysis1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"analysisGenerator.Analysis.getCountry()\" because \"analysis\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }
}

