package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationLoginRandoopTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test01");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (The system cannot find the path specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test02");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test03");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test04");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test05");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test07");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        java.lang.Class<?> wildcardClass1 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test08");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass3 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test09");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass2 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test10");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test11");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("", "", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test12");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass4 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test13");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userLogin.RegistrationLogin.verify("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test14");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass5 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test15");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass6 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test16");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass7 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test17");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass9 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test18");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass8 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test19");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass10 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test20");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass12 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test21");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass14 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test22");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass13 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test23");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass11 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test24");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass15 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test25");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass16 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test26");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass18 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test27");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass17 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test28");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass19 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegistrationLoginRandoopTest.test29");
        userLogin.RegistrationLogin registrationLogin0 = new userLogin.RegistrationLogin();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        registrationLogin0.doAction();
        java.lang.Class<?> wildcardClass21 = registrationLogin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

