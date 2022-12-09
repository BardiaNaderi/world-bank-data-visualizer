package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnalysisFactoryRandoopTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) 'a', "", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        analysisGenerator.AnalysisFactory analysisFactory0 = new analysisGenerator.AnalysisFactory();
        java.lang.Class<?> wildcardClass1 = analysisFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 100, "hi!", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(0, "hi!", (int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "", (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 10, "", (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 10, "", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 1, "hi!", (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 100, "", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 1, "", (int) ' ', 0);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 0, "hi!", (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(100, "", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) 'a', "hi!", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 100, "hi!", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "", (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "", (int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(10, "hi!", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 10, "hi!", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) -1, "", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "hi!", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "hi!", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 0, "hi!", (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 1, "", 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "hi!", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) 'a', "", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "hi!", (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "hi!", (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 100, "", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 100, "", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) -1, "", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(100, "hi!", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(100, "", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) -1, "", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(0, "hi!", (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 10, "hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 100, "hi!", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(100, "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '4', "", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "", (int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 0, "hi!", (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "hi!", (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '4', "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "hi!", (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) 'a', "hi!", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(100, "hi!", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 100, "", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(100, "", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '4', "hi!", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) -1, "", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "", (int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '4', "", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "hi!", (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 10, "", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) 'a', "hi!", (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((-1), "", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(10, "", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(0, "hi!", (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "hi!", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) '#', "hi!", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "", (int) (short) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) -1, "", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(1, "hi!", (int) (byte) -1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "hi!", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) -1, "", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(0, "hi!", (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "hi!", (int) (byte) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) ' ', "", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 0, "hi!", (int) (short) -1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (byte) 0, "hi!", (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis(0, "hi!", 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = analysis4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        // The following exception was thrown during execution in test generation
        try {
            analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) 'a', "", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invaid Analysis code: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        analysisGenerator.Analysis analysis4 = analysisGenerator.AnalysisFactory.createAnalysis((int) (short) 1, "hi!", (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysis4);
    }
}

