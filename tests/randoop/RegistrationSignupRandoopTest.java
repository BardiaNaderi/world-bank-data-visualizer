package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationSignupRandoopTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = userLogin.RegistrationSignup.idCount("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        userLogin.User user0 = null;
        // The following exception was thrown during execution in test generation
        try {
            userLogin.RegistrationSignup.writeToDB(user0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userLogin.User.getName()\" because \"account\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        userLogin.User user0 = null;
        // The following exception was thrown during execution in test generation
        try {
            userLogin.RegistrationSignup.writeToDB(user0, "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = userLogin.RegistrationSignup.idCount("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        java.lang.Class<?> wildcardClass1 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass2 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass4 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass5 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass6 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass3 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass7 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass9 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass8 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass11 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass10 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass12 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass13 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass15 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass16 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass14 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass17 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass18 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass19 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass21 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass20 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        java.lang.Class<?> wildcardClass22 = registrationSignup0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        userLogin.RegistrationSignup registrationSignup0 = new userLogin.RegistrationSignup();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
        registrationSignup0.doAction();
    }
}

