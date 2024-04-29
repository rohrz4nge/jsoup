import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        int int8 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException2);
        java.lang.Class<?> wildcardClass5 = serializationException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray8 = httpStatusException3.getSuppressed();
        int int9 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.String str15 = httpStatusException10.getUrl();
        java.lang.String str16 = httpStatusException10.getUrl();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException17);
        int int21 = httpStatusException17.getStatusCode();
        java.lang.Throwable[] throwableArray22 = httpStatusException17.getSuppressed();
        java.lang.String str23 = httpStatusException17.getUrl();
        java.lang.String str24 = httpStatusException17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: " + "'", str23, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str24, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.Throwable[] throwableArray16 = httpStatusException14.getSuppressed();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str18 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException8.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str18 = httpStatusException17.getUrl();
        int int19 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException17);
        httpStatusException6.addSuppressed((java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray25 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException24.getSuppressed();
        httpStatusException17.addSuppressed((java.lang.Throwable) serializationException24);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) serializationException31);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException31);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException31);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
        java.lang.Class<?> wildcardClass2 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int16 = httpStatusException15.getStatusCode();
        int int17 = httpStatusException15.getStatusCode();
        java.lang.String str18 = httpStatusException15.getUrl();
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Class<?> wildcardClass25 = serializationException22.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]", throwable1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException12);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException12);
        java.lang.String str18 = httpStatusException12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str18, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        serializationException15.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray27 = serializationException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException26.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException26.getSuppressed();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException26);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException30);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray34 = serializationException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = serializationException33.getSuppressed();
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException38);
        serializationException33.addSuppressed((java.lang.Throwable) serializationException38);
        serializationException31.addSuppressed((java.lang.Throwable) serializationException33);
        serializationException23.addSuppressed((java.lang.Throwable) serializationException33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str13 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray14 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException13);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 1, "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass5 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str13 = httpStatusException12.getUrl();
        int int14 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException12);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException12);
        java.lang.String str17 = httpStatusException12.getUrl();
        int int18 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException12);
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException24);
        java.lang.String str26 = httpStatusException24.getUrl();
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException31);
        httpStatusException24.addSuppressed((java.lang.Throwable) serializationException32);
        serializationException20.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException18.getSuppressed();
        serializationException16.addSuppressed((java.lang.Throwable) serializationException18);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (java.lang.Throwable) serializationException8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException9);
        java.lang.Class<?> wildcardClass14 = serializationException13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.getUrl();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.String str9 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str9, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str17 = httpStatusException16.getUrl();
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        java.lang.Class<?> wildcardClass19 = serializationException11.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException3.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray13 = serializationException9.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException18);
        java.lang.String str20 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException30.getSuppressed();
        serializationException28.addSuppressed((java.lang.Throwable) serializationException30);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException28);
        java.lang.String str36 = serializationException28.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str36, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str20 = httpStatusException19.getUrl();
        int int21 = httpStatusException19.getStatusCode();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException19);
        serializationException14.addSuppressed((java.lang.Throwable) httpStatusException19);
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException19);
        int int25 = httpStatusException19.getStatusCode();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray28 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = serializationException27.getSuppressed();
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException31);
        httpStatusException19.addSuppressed((java.lang.Throwable) serializationException32);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int24 = httpStatusException23.getStatusCode();
        int int25 = httpStatusException23.getStatusCode();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException23);
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int33 = httpStatusException32.getStatusCode();
        java.lang.String str34 = httpStatusException32.getUrl();
        java.lang.Throwable[] throwableArray35 = httpStatusException32.getSuppressed();
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray40 = serializationException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = serializationException39.getSuppressed();
        java.lang.Throwable[] throwableArray42 = serializationException39.getSuppressed();
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException45);
        httpStatusException32.addSuppressed((java.lang.Throwable) serializationException46);
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException32);
        java.lang.Class<?> wildcardClass49 = httpStatusException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int28 = httpStatusException27.getStatusCode();
        int int29 = httpStatusException27.getStatusCode();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException27);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException27);
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException27);
        java.lang.String str34 = httpStatusException27.getUrl();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.lang.Throwable throwable0 = null;
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException(throwable0);
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException(throwable0);
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str19 = httpStatusException18.getUrl();
        int int20 = httpStatusException18.getStatusCode();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException18);
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException18);
        httpStatusException7.addSuppressed((java.lang.Throwable) httpStatusException18);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray26 = serializationException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = serializationException25.getSuppressed();
        httpStatusException18.addSuppressed((java.lang.Throwable) serializationException25);
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException18);
        int int33 = httpStatusException18.getStatusCode();
        java.lang.Class<?> wildcardClass34 = httpStatusException18.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (int) 'a', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int11 = httpStatusException10.getStatusCode();
        int int12 = httpStatusException10.getStatusCode();
        java.lang.String str13 = httpStatusException10.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int21 = httpStatusException20.getStatusCode();
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray26 = serializationException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException25.getSuppressed();
        serializationException23.addSuppressed((java.lang.Throwable) serializationException25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.Throwable throwable0 = null;
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException(throwable0);
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException(throwable0);
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) -1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
        java.lang.String str6 = httpStatusException4.getUrl();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException6);
        int int8 = httpStatusException6.getStatusCode();
        java.lang.Throwable[] throwableArray9 = httpStatusException6.getSuppressed();
        int int10 = httpStatusException6.getStatusCode();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException6);
        java.lang.String str12 = httpStatusException6.getUrl();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) (byte) -1, "hi!");
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException9);
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]" + "'", str12, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.getUrl();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.String str9 = httpStatusException3.getUrl();
        java.lang.String str10 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) serializationException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int8 = httpStatusException7.getStatusCode();
        int int9 = httpStatusException7.getStatusCode();
        java.lang.String str10 = httpStatusException7.getUrl();
        java.lang.String str11 = httpStatusException7.getUrl();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        httpStatusException7.addSuppressed((java.lang.Throwable) serializationException16);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str10 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int11 = httpStatusException10.getStatusCode();
        int int12 = httpStatusException10.getStatusCode();
        java.lang.String str13 = httpStatusException10.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int21 = httpStatusException20.getStatusCode();
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        java.lang.String str24 = httpStatusException20.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]" + "'", str24, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=32, URL=[org.jsoup.SerializationException: ]", 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str27 = httpStatusException26.getUrl();
        int int28 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException26);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException26);
        java.lang.String str31 = httpStatusException26.getUrl();
        int int32 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException26);
        serializationException14.addSuppressed((java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        serializationException6.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray20 = serializationException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException19.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException19.getSuppressed();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str29 = httpStatusException28.getUrl();
        int int30 = httpStatusException28.getStatusCode();
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException28);
        java.lang.String str33 = httpStatusException28.getUrl();
        int int34 = httpStatusException28.getStatusCode();
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException28);
        serializationException16.addSuppressed((java.lang.Throwable) serializationException35);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException35);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException35);
        java.lang.String str39 = serializationException38.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.jsoup.SerializationException: " + "'", str39, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str9 = httpStatusException3.getUrl();
        int int10 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        int int8 = httpStatusException3.getStatusCode();
        java.lang.String str9 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str9, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException7);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str16 = httpStatusException15.getUrl();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException22.getSuppressed();
        httpStatusException15.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException15);
        java.lang.Throwable[] throwableArray30 = httpStatusException15.getSuppressed();
        int int31 = httpStatusException15.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = serializationException7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        java.lang.String str14 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException18);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        java.lang.String str21 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass22 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException12);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        int int17 = httpStatusException12.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException21);
        httpStatusException12.addSuppressed((java.lang.Throwable) httpStatusException21);
        int int24 = httpStatusException12.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException29 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException34 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException34);
        httpStatusException29.addSuppressed((java.lang.Throwable) httpStatusException34);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException34);
        int int38 = httpStatusException34.getStatusCode();
        httpStatusException12.addSuppressed((java.lang.Throwable) httpStatusException34);
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException34);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass7 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass5 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str4, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!", throwable1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("hi!", (int) (byte) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        serializationException15.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException17);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException17);
        java.lang.String str24 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str26 = httpStatusException3.getUrl();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str24, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str26, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int12 = httpStatusException3.getStatusCode();
        java.lang.String str13 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", 35, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        java.lang.String str14 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException18);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        java.lang.String str21 = httpStatusException3.getUrl();
        int int22 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int24 = httpStatusException23.getStatusCode();
        int int25 = httpStatusException23.getStatusCode();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException23);
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.Throwable[] throwableArray28 = httpStatusException23.getSuppressed();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        java.lang.String str30 = httpStatusException23.getUrl();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 97, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException12);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray20 = serializationException19.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException21);
        java.lang.Class<?> wildcardClass24 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int11 = httpStatusException10.getStatusCode();
        int int12 = httpStatusException10.getStatusCode();
        java.lang.String str13 = httpStatusException10.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int21 = httpStatusException20.getStatusCode();
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        java.lang.String str24 = httpStatusException20.getUrl();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.SerializationException: " + "'", str24, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str7 = httpStatusException6.getUrl();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException6);
        java.lang.Class<?> wildcardClass9 = httpStatusException6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        java.lang.String str14 = httpStatusException3.getUrl();
        int int15 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray16 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray17 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (int) (byte) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str13 = httpStatusException12.getUrl();
        int int14 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException18.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException18);
        java.lang.Throwable[] throwableArray22 = serializationException18.getSuppressed();
        httpStatusException12.addSuppressed((java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException12.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException27);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        int int9 = httpStatusException4.getStatusCode();
        int int10 = httpStatusException4.getStatusCode();
        java.lang.String str11 = httpStatusException4.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int6 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int17 = httpStatusException16.getStatusCode();
        int int18 = httpStatusException16.getStatusCode();
        java.lang.String str19 = httpStatusException16.getUrl();
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException23);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.getUrl();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.String str9 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str11 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str11, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        serializationException10.addSuppressed((java.lang.Throwable) serializationException15);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException10);
        java.lang.Throwable[] throwableArray20 = serializationException19.getSuppressed();
        java.lang.String str21 = serializationException19.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.jsoup.SerializationException: " + "'", str21, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException8);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) '#', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        java.lang.String str11 = serializationException10.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException5);
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Class<?> wildcardClass17 = serializationException15.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.Throwable[] throwableArray16 = httpStatusException14.getSuppressed();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str18 = httpStatusException14.getUrl();
        java.lang.Throwable[] throwableArray19 = httpStatusException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str16 = httpStatusException15.getUrl();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException22.getSuppressed();
        httpStatusException15.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException15);
        java.lang.Throwable[] throwableArray30 = httpStatusException15.getSuppressed();
        java.lang.Throwable[] throwableArray31 = httpStatusException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", (int) '4', "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str21 = httpStatusException20.getUrl();
        int int22 = httpStatusException20.getStatusCode();
        int int23 = httpStatusException20.getStatusCode();
        int int24 = httpStatusException20.getStatusCode();
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.Throwable[] throwableArray26 = httpStatusException16.getSuppressed();
        java.lang.String str27 = httpStatusException16.getUrl();
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException29);
        java.lang.Class<?> wildcardClass31 = serializationException30.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) serializationException6);
        java.lang.String str8 = serializationException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str8, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int12 = httpStatusException11.getStatusCode();
        int int13 = httpStatusException11.getStatusCode();
        java.lang.String str14 = httpStatusException11.getUrl();
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException16);
        java.lang.String str19 = serializationException16.toString();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str19, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (int) 'a', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException20);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int27 = httpStatusException26.getStatusCode();
        int int28 = httpStatusException26.getStatusCode();
        java.lang.String str29 = httpStatusException26.getUrl();
        serializationException22.addSuppressed((java.lang.Throwable) httpStatusException26);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException22);
        java.lang.String str32 = serializationException22.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.jsoup.SerializationException: " + "'", str32, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int12 = httpStatusException11.getStatusCode();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException11);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int16 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.String str23 = httpStatusException20.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str23, "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int19 = httpStatusException18.getStatusCode();
        int int20 = httpStatusException18.getStatusCode();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException18);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray25 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException24.getSuppressed();
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException24);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException28);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray32 = serializationException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException31.getSuppressed();
        java.lang.Throwable[] throwableArray34 = serializationException31.getSuppressed();
        serializationException29.addSuppressed((java.lang.Throwable) serializationException31);
        serializationException21.addSuppressed((java.lang.Throwable) serializationException29);
        httpStatusException12.addSuppressed((java.lang.Throwable) serializationException29);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException29);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException29);
        java.lang.String str40 = serializationException39.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str40, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.Throwable throwable0 = null;
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException(throwable0);
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException(throwable0);
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int14 = httpStatusException13.getStatusCode();
        int int15 = httpStatusException13.getStatusCode();
        java.lang.String str16 = httpStatusException13.getUrl();
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str22 = httpStatusException21.getUrl();
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException21);
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException21);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException21);
        java.lang.String str26 = serializationException25.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str22, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str26, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str21 = httpStatusException20.getUrl();
        int int22 = httpStatusException20.getStatusCode();
        int int23 = httpStatusException20.getStatusCode();
        int int24 = httpStatusException20.getStatusCode();
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.Throwable[] throwableArray26 = httpStatusException16.getSuppressed();
        java.lang.String str27 = httpStatusException16.getUrl();
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException16);
        java.lang.String str29 = serializationException12.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str29, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", 97, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.String str23 = httpStatusException22.getUrl();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException22);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException22);
        int int26 = httpStatusException22.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str23, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int16 = httpStatusException15.getStatusCode();
        int int17 = httpStatusException15.getStatusCode();
        java.lang.String str18 = httpStatusException15.getUrl();
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray28 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = serializationException27.getSuppressed();
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException31);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray35 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException34.getSuppressed();
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException34);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException39);
        serializationException34.addSuppressed((java.lang.Throwable) serializationException39);
        serializationException32.addSuppressed((java.lang.Throwable) serializationException34);
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException32);
        serializationException24.addSuppressed((java.lang.Throwable) serializationException32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int12 = httpStatusException11.getStatusCode();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException11);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int16 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException20);
        int int23 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException33);
        httpStatusException28.addSuppressed((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException33);
        int int37 = httpStatusException33.getStatusCode();
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException33);
        int int39 = httpStatusException33.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", throwable1);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (java.lang.Throwable) serializationException14);
        java.lang.Class<?> wildcardClass16 = serializationException15.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.String str9 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str9, "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        java.lang.Class<?> wildcardClass11 = serializationException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str18 = httpStatusException17.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException17);
        java.lang.Throwable[] throwableArray20 = httpStatusException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException21);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.String str3 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str3, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int24 = httpStatusException23.getStatusCode();
        java.lang.String str25 = httpStatusException23.getUrl();
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.String str27 = httpStatusException23.getUrl();
        java.lang.Throwable[] throwableArray28 = httpStatusException23.getSuppressed();
        java.lang.String str29 = httpStatusException23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str29, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 97, "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int8 = httpStatusException7.getStatusCode();
        int int9 = httpStatusException7.getStatusCode();
        java.lang.String str10 = httpStatusException7.getUrl();
        java.lang.String str11 = httpStatusException7.getUrl();
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException7.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", 97, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        java.lang.String str8 = serializationException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: " + "'", str8, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        int int11 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray12 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException12.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str22 = httpStatusException21.getUrl();
        int int23 = httpStatusException21.getStatusCode();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException21);
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException21);
        java.lang.String str26 = httpStatusException21.getUrl();
        int int27 = httpStatusException21.getStatusCode();
        int int28 = httpStatusException21.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int33 = httpStatusException32.getStatusCode();
        int int34 = httpStatusException32.getStatusCode();
        java.lang.String str35 = httpStatusException32.getUrl();
        int int36 = httpStatusException32.getStatusCode();
        httpStatusException21.addSuppressed((java.lang.Throwable) httpStatusException32);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException32);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray10 = serializationException6.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray12 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = serializationException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]]");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str6 = httpStatusException5.getUrl();
        int int7 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException15);
        java.lang.Class<?> wildcardClass20 = httpStatusException15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        java.lang.String str6 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException15);
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) '#', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]", (int) '4', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) serializationException30);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException30);
        java.lang.Class<?> wildcardClass33 = serializationException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        java.lang.String str9 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (java.lang.Throwable) serializationException10);
        java.lang.Class<?> wildcardClass13 = serializationException12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException18);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        serializationException15.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException17);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        java.lang.Class<?> wildcardClass25 = serializationException24.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 97, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException12);
        java.lang.String str14 = httpStatusException12.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.Class<?> wildcardClass8 = serializationException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        java.lang.String str8 = httpStatusException5.getUrl();
        java.lang.String str9 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int17 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int28 = httpStatusException27.getStatusCode();
        int int29 = httpStatusException27.getStatusCode();
        java.lang.String str30 = httpStatusException27.getUrl();
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException16);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int40 = httpStatusException39.getStatusCode();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException44);
        org.jsoup.HttpStatusException httpStatusException50 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int51 = httpStatusException50.getStatusCode();
        int int52 = httpStatusException50.getStatusCode();
        java.lang.String str53 = httpStatusException50.getUrl();
        serializationException46.addSuppressed((java.lang.Throwable) httpStatusException50);
        org.jsoup.SerializationException serializationException55 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        httpStatusException39.addSuppressed((java.lang.Throwable) serializationException46);
        org.jsoup.SerializationException serializationException57 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException57);
        java.lang.Throwable[] throwableArray59 = serializationException57.getSuppressed();
        serializationException34.addSuppressed((java.lang.Throwable) serializationException57);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException57);
        org.jsoup.SerializationException serializationException62 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException57);
        java.lang.Class<?> wildcardClass63 = serializationException62.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        java.lang.Class<?> wildcardClass8 = serializationException6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        java.lang.String str9 = serializationException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException14);
        httpStatusException10.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str17 = httpStatusException10.getUrl();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException10);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        int int8 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException", throwable1);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (java.lang.Throwable) serializationException14);
        java.lang.Class<?> wildcardClass16 = serializationException14.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException22);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str33 = httpStatusException32.getUrl();
        int int34 = httpStatusException32.getStatusCode();
        int int35 = httpStatusException32.getStatusCode();
        int int36 = httpStatusException32.getStatusCode();
        httpStatusException28.addSuppressed((java.lang.Throwable) httpStatusException32);
        java.lang.Throwable[] throwableArray38 = httpStatusException28.getSuppressed();
        java.lang.String str39 = httpStatusException28.getUrl();
        serializationException24.addSuppressed((java.lang.Throwable) httpStatusException28);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        java.lang.Throwable throwable43 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException28.addSuppressed(throwable43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException33);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        java.lang.String str40 = httpStatusException39.getUrl();
        httpStatusException33.addSuppressed((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException43);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (short) 100, "org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=100, URL=[org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=100, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray10 = serializationException6.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        java.lang.Class<?> wildcardClass12 = serializationException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int13 = httpStatusException11.getStatusCode();
        java.lang.String str14 = httpStatusException11.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.SerializationException: " + "'", str14, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = httpStatusException4.getUrl();
        int int11 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        int int18 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int23 = httpStatusException22.getStatusCode();
        int int24 = httpStatusException22.getStatusCode();
        java.lang.String str25 = httpStatusException22.getUrl();
        int int26 = httpStatusException22.getStatusCode();
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException22);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException11);
        java.lang.Throwable[] throwableArray29 = httpStatusException11.getSuppressed();
        int int30 = httpStatusException11.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", 100, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        java.lang.String str6 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) serializationException7);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass5 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str16 = httpStatusException15.getUrl();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException22.getSuppressed();
        httpStatusException15.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException15);
        java.lang.Throwable[] throwableArray30 = httpStatusException15.getSuppressed();
        int int31 = httpStatusException15.getStatusCode();
        java.lang.Class<?> wildcardClass32 = httpStatusException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        java.lang.String str9 = httpStatusException4.getUrl();
        int int10 = httpStatusException4.getStatusCode();
        java.lang.String str11 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 97, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        int int11 = httpStatusException8.getStatusCode();
        java.lang.Throwable[] throwableArray12 = httpStatusException8.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.String str14 = httpStatusException8.getUrl();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException8);
        int int16 = httpStatusException8.getStatusCode();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray12 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        int int14 = httpStatusException13.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) -1, "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray11 = httpStatusException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException15);
        int int17 = httpStatusException8.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray9 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray10 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", 1, "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        java.lang.String str20 = serializationException19.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str20, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int6 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        java.lang.Throwable[] throwableArray8 = httpStatusException5.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str10 = httpStatusException5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str9 = httpStatusException4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str9, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray11 = httpStatusException8.getSuppressed();
        java.lang.String str12 = httpStatusException8.getUrl();
        int int13 = httpStatusException8.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str12, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int10 = httpStatusException9.getStatusCode();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException13);
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str6 = httpStatusException5.getUrl();
        int int7 = httpStatusException5.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (java.lang.Throwable) serializationException7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.String str2 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str2, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        serializationException15.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException17);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException17);
        java.lang.Throwable[] throwableArray24 = serializationException17.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        serializationException17.addSuppressed((java.lang.Throwable) httpStatusException28);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        java.lang.String str9 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException20);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int27 = httpStatusException26.getStatusCode();
        int int28 = httpStatusException26.getStatusCode();
        java.lang.String str29 = httpStatusException26.getUrl();
        serializationException22.addSuppressed((java.lang.Throwable) httpStatusException26);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray36 = serializationException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = serializationException35.getSuppressed();
        java.lang.Throwable[] throwableArray38 = serializationException35.getSuppressed();
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException35);
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException39);
        org.jsoup.HttpStatusException httpStatusException44 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str45 = httpStatusException44.getUrl();
        int int46 = httpStatusException44.getStatusCode();
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException44);
        serializationException39.addSuppressed((java.lang.Throwable) httpStatusException44);
        java.lang.String str49 = httpStatusException44.getUrl();
        int int50 = httpStatusException44.getStatusCode();
        org.jsoup.SerializationException serializationException51 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException44);
        serializationException22.addSuppressed((java.lang.Throwable) serializationException51);
        httpStatusException17.addSuppressed((java.lang.Throwable) serializationException51);
        org.jsoup.SerializationException serializationException56 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray57 = serializationException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = serializationException56.getSuppressed();
        org.jsoup.SerializationException serializationException59 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException56);
        org.jsoup.HttpStatusException httpStatusException63 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException59.addSuppressed((java.lang.Throwable) httpStatusException63);
        httpStatusException17.addSuppressed((java.lang.Throwable) httpStatusException63);
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException63);
        int int67 = httpStatusException63.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 1, "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]]");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        java.lang.String str15 = httpStatusException12.getUrl();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException25);
        org.jsoup.HttpStatusException httpStatusException30 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str31 = httpStatusException30.getUrl();
        int int32 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException30);
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException30);
        java.lang.String str35 = httpStatusException30.getUrl();
        int int36 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException30);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException37);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException37);
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str44 = httpStatusException43.getUrl();
        java.lang.String str45 = httpStatusException43.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException43);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException43);
        java.lang.Class<?> wildcardClass48 = httpStatusException43.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str23 = httpStatusException22.getUrl();
        int int24 = httpStatusException22.getStatusCode();
        int int25 = httpStatusException22.getStatusCode();
        int int26 = httpStatusException22.getStatusCode();
        httpStatusException18.addSuppressed((java.lang.Throwable) httpStatusException22);
        java.lang.Throwable[] throwableArray28 = httpStatusException18.getSuppressed();
        java.lang.String str29 = httpStatusException18.getUrl();
        serializationException14.addSuppressed((java.lang.Throwable) httpStatusException18);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException18);
        int int32 = httpStatusException18.getStatusCode();
        java.lang.String str33 = httpStatusException18.getUrl();
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException18);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.String str15 = httpStatusException10.getUrl();
        int int16 = httpStatusException10.getStatusCode();
        java.lang.Class<?> wildcardClass17 = httpStatusException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException12);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        java.lang.String str17 = httpStatusException12.getUrl();
        int int18 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (java.lang.Throwable) httpStatusException12);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException33);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        java.lang.String str40 = httpStatusException39.getUrl();
        httpStatusException33.addSuppressed((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException39);
        int int43 = httpStatusException39.getStatusCode();
        java.lang.Throwable[] throwableArray44 = httpStatusException39.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException(throwable1);
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException(throwable1);
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", (java.lang.Throwable) serializationException6);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException30.getSuppressed();
        serializationException28.addSuppressed((java.lang.Throwable) serializationException30);
        serializationException20.addSuppressed((java.lang.Throwable) serializationException28);
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException28);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException28);
        java.lang.String str38 = serializationException28.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str38, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray11 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        serializationException2.addSuppressed((java.lang.Throwable) serializationException14);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str16 = httpStatusException15.getUrl();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException22.getSuppressed();
        httpStatusException15.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException15.addSuppressed((java.lang.Throwable) httpStatusException32);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException32);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException34);
        java.lang.String str36 = serializationException34.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str36, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.String str9 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str13 = httpStatusException11.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str13, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException30.getSuppressed();
        serializationException28.addSuppressed((java.lang.Throwable) serializationException30);
        serializationException20.addSuppressed((java.lang.Throwable) serializationException28);
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException28);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException28);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int12 = httpStatusException11.getStatusCode();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException11);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int16 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        int int24 = httpStatusException11.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException7);
        java.lang.String str11 = httpStatusException7.getUrl();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException9);
        int int13 = httpStatusException9.getStatusCode();
        int int14 = httpStatusException9.getStatusCode();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException22);
        java.lang.Throwable[] throwableArray24 = httpStatusException22.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]", 97, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", 10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        java.lang.String str15 = httpStatusException12.getUrl();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException25);
        org.jsoup.HttpStatusException httpStatusException30 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str31 = httpStatusException30.getUrl();
        int int32 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException30);
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException30);
        java.lang.String str35 = httpStatusException30.getUrl();
        int int36 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException30);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException37);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray43 = serializationException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = serializationException42.getSuppressed();
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException42);
        org.jsoup.HttpStatusException httpStatusException49 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException45.addSuppressed((java.lang.Throwable) httpStatusException49);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException49);
        java.lang.String str52 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str52, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass7 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        int int10 = httpStatusException4.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int15 = httpStatusException14.getStatusCode();
        int int16 = httpStatusException14.getStatusCode();
        java.lang.String str17 = httpStatusException14.getUrl();
        java.lang.String str18 = httpStatusException14.getUrl();
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException14.addSuppressed((java.lang.Throwable) httpStatusException22);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int29 = httpStatusException28.getStatusCode();
        int int30 = httpStatusException28.getStatusCode();
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray35 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray37 = serializationException34.getSuppressed();
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException34);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException38);
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray42 = serializationException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = serializationException41.getSuppressed();
        java.lang.Throwable[] throwableArray44 = serializationException41.getSuppressed();
        serializationException39.addSuppressed((java.lang.Throwable) serializationException41);
        serializationException31.addSuppressed((java.lang.Throwable) serializationException39);
        httpStatusException22.addSuppressed((java.lang.Throwable) serializationException39);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException39);
        java.lang.String str49 = httpStatusException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str49, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str17 = httpStatusException16.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException16);
        java.lang.String str19 = serializationException4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.SerializationException: " + "'", str19, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException5);
        int int8 = httpStatusException5.getStatusCode();
        java.lang.String str9 = httpStatusException5.getUrl();
        int int10 = httpStatusException5.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int7 = httpStatusException6.getStatusCode();
        int int8 = httpStatusException6.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException12.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray20 = serializationException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException19.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException19.getSuppressed();
        serializationException17.addSuppressed((java.lang.Throwable) serializationException19);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        int int16 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        serializationException1.addSuppressed((java.lang.Throwable) serializationException16);
        java.lang.Throwable[] throwableArray20 = serializationException16.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray6 = serializationException2.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (int) (short) 100, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException8);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int17 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        java.lang.String str19 = httpStatusException16.getUrl();
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException16);
        java.lang.Throwable[] throwableArray21 = httpStatusException16.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str19, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException6);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) -1, "");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        java.lang.String str10 = httpStatusException7.getUrl();
        java.lang.String str11 = httpStatusException7.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int19 = httpStatusException18.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException18);
        serializationException13.addSuppressed((java.lang.Throwable) serializationException20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int24 = httpStatusException23.getStatusCode();
        java.lang.String str25 = httpStatusException23.getUrl();
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.String str27 = httpStatusException23.getUrl();
        java.lang.String str28 = httpStatusException23.getUrl();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray13 = serializationException9.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException9);
        java.lang.String str15 = httpStatusException3.getUrl();
        java.lang.String str16 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str16, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.Throwable throwable2 = null;
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", throwable2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]]", throwable2);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException17);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException18);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException18);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException20);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray11 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 10, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException7);
        java.lang.String str12 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 35, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass10 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray15 = serializationException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException14.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException14);
        java.lang.Throwable[] throwableArray18 = serializationException14.getSuppressed();
        httpStatusException8.addSuppressed((java.lang.Throwable) serializationException14);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException23);
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.Class<?> wildcardClass27 = serializationException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException30.getSuppressed();
        serializationException28.addSuppressed((java.lang.Throwable) serializationException30);
        serializationException20.addSuppressed((java.lang.Throwable) serializationException28);
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException28);
        java.lang.String str37 = httpStatusException11.getUrl();
        java.lang.String str38 = httpStatusException11.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.jsoup.SerializationException: " + "'", str37, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.jsoup.SerializationException: " + "'", str38, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) -1, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        serializationException16.addSuppressed((java.lang.Throwable) serializationException21);
        serializationException14.addSuppressed((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException16);
        java.lang.Throwable[] throwableArray26 = serializationException25.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException25);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        java.lang.String str6 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = httpStatusException4.getUrl();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) '#', "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=100, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException11);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray8 = httpStatusException3.getSuppressed();
        java.lang.String str9 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str9, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        java.lang.String str9 = httpStatusException4.getUrl();
        int int10 = httpStatusException4.getStatusCode();
        java.lang.String str11 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass5 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException18.getSuppressed();
        serializationException16.addSuppressed((java.lang.Throwable) serializationException18);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException16);
        int int24 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass25 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", 32, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int13 = httpStatusException12.getStatusCode();
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException26);
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str32 = httpStatusException31.getUrl();
        int int33 = httpStatusException31.getStatusCode();
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException31);
        serializationException26.addSuppressed((java.lang.Throwable) httpStatusException31);
        httpStatusException20.addSuppressed((java.lang.Throwable) httpStatusException31);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray39 = serializationException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = serializationException38.getSuppressed();
        java.lang.Throwable[] throwableArray41 = serializationException38.getSuppressed();
        java.lang.Throwable[] throwableArray42 = serializationException38.getSuppressed();
        java.lang.Throwable[] throwableArray43 = serializationException38.getSuppressed();
        httpStatusException31.addSuppressed((java.lang.Throwable) serializationException38);
        org.jsoup.HttpStatusException httpStatusException48 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException31.addSuppressed((java.lang.Throwable) httpStatusException48);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException31);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException31);
        org.jsoup.SerializationException serializationException52 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException31);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException3);
        java.lang.Throwable[] throwableArray13 = serializationException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException5);
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int14 = httpStatusException13.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray21 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException20.getSuppressed();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException20);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException23);
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException37 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str38 = httpStatusException37.getUrl();
        int int39 = httpStatusException37.getStatusCode();
        int int40 = httpStatusException37.getStatusCode();
        int int41 = httpStatusException37.getStatusCode();
        httpStatusException33.addSuppressed((java.lang.Throwable) httpStatusException37);
        java.lang.Throwable[] throwableArray43 = httpStatusException33.getSuppressed();
        java.lang.String str44 = httpStatusException33.getUrl();
        serializationException29.addSuppressed((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException33);
        httpStatusException13.addSuppressed((java.lang.Throwable) serializationException47);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException12);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException15);
        java.lang.Class<?> wildcardClass17 = serializationException16.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        java.lang.String str7 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str9 = httpStatusException4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str9, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str15 = httpStatusException14.getUrl();
        int int16 = httpStatusException14.getStatusCode();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException14);
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str19 = httpStatusException14.getUrl();
        int int20 = httpStatusException14.getStatusCode();
        int int21 = httpStatusException14.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException25 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int26 = httpStatusException25.getStatusCode();
        int int27 = httpStatusException25.getStatusCode();
        java.lang.String str28 = httpStatusException25.getUrl();
        int int29 = httpStatusException25.getStatusCode();
        httpStatusException14.addSuppressed((java.lang.Throwable) httpStatusException25);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException14);
        java.lang.String str32 = httpStatusException14.getUrl();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException14);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray38 = serializationException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = serializationException37.getSuppressed();
        java.lang.Throwable[] throwableArray40 = serializationException37.getSuppressed();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException41);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray45 = serializationException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = serializationException44.getSuppressed();
        java.lang.Throwable[] throwableArray47 = serializationException44.getSuppressed();
        serializationException42.addSuppressed((java.lang.Throwable) serializationException44);
        org.jsoup.HttpStatusException httpStatusException52 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int53 = httpStatusException52.getStatusCode();
        int int54 = httpStatusException52.getStatusCode();
        serializationException42.addSuppressed((java.lang.Throwable) httpStatusException52);
        java.lang.Throwable[] throwableArray56 = serializationException42.getSuppressed();
        serializationException34.addSuppressed((java.lang.Throwable) serializationException42);
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException34);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        int int20 = httpStatusException11.getStatusCode();
        java.lang.String str21 = httpStatusException11.getUrl();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int28 = httpStatusException27.getStatusCode();
        int int29 = httpStatusException27.getStatusCode();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException27);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException27);
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException27);
        java.lang.String str33 = httpStatusException27.getUrl();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        int int18 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int23 = httpStatusException22.getStatusCode();
        int int24 = httpStatusException22.getStatusCode();
        java.lang.String str25 = httpStatusException22.getUrl();
        int int26 = httpStatusException22.getStatusCode();
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException22);
        java.lang.String str28 = httpStatusException22.getUrl();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException22);
        java.lang.String str30 = httpStatusException22.getUrl();
        java.lang.String str31 = httpStatusException22.getUrl();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (short) -1, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) 1, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str16 = httpStatusException15.getUrl();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        java.lang.String str20 = httpStatusException15.getUrl();
        int int21 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException23);
        java.lang.String str26 = httpStatusException3.getUrl();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]" + "'", str26, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray13 = serializationException9.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException18);
        java.lang.String str20 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException30.getSuppressed();
        serializationException28.addSuppressed((java.lang.Throwable) serializationException30);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException28);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", 97, "");
        serializationException28.addSuppressed((java.lang.Throwable) httpStatusException39);
        java.lang.String str41 = serializationException28.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str41, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        java.lang.String str15 = httpStatusException12.getUrl();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException25);
        org.jsoup.HttpStatusException httpStatusException30 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str31 = httpStatusException30.getUrl();
        int int32 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException30);
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException30);
        java.lang.String str35 = httpStatusException30.getUrl();
        int int36 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException30);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException37);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray43 = serializationException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = serializationException42.getSuppressed();
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException42);
        org.jsoup.HttpStatusException httpStatusException49 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException45.addSuppressed((java.lang.Throwable) httpStatusException49);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException49);
        int int52 = httpStatusException3.getStatusCode();
        int int53 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 97, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", 10, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) (byte) -1, "hi!");
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int15 = httpStatusException14.getStatusCode();
        int int16 = httpStatusException14.getStatusCode();
        httpStatusException9.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = serializationException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]]");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.String str11 = httpStatusException8.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException8);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) 100, "");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str27 = httpStatusException26.getUrl();
        int int28 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException26);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException26);
        java.lang.String str31 = httpStatusException26.getUrl();
        int int32 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException26);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException33);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (int) (short) -1, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException38);
        java.lang.String str40 = serializationException4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.jsoup.SerializationException: " + "'", str40, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException17);
        int int21 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        java.lang.Class<?> wildcardClass24 = serializationException23.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) '#', "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str9 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str9, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray25 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException24.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException24);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException29);
        serializationException24.addSuppressed((java.lang.Throwable) serializationException29);
        serializationException22.addSuppressed((java.lang.Throwable) serializationException24);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int39 = httpStatusException38.getStatusCode();
        int int40 = httpStatusException38.getStatusCode();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException38);
        serializationException33.addSuppressed((java.lang.Throwable) httpStatusException38);
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        serializationException13.addSuppressed((java.lang.Throwable) serializationException33);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException2);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.String str13 = serializationException5.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str13, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.Throwable[] throwableArray12 = httpStatusException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", (java.lang.Throwable) httpStatusException10);
        int int14 = httpStatusException10.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        java.lang.Throwable[] throwableArray18 = httpStatusException11.getSuppressed();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        java.lang.Class<?> wildcardClass20 = httpStatusException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException9);
        java.lang.Throwable[] throwableArray14 = httpStatusException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        int int10 = httpStatusException3.getStatusCode();
        int int11 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str7 = httpStatusException6.getUrl();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException6);
        java.lang.Throwable[] throwableArray9 = httpStatusException6.getSuppressed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (int) 'a', "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        int int11 = httpStatusException8.getStatusCode();
        int int12 = httpStatusException8.getStatusCode();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray14 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException16.getSuppressed();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException29 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException29);
        java.lang.Throwable[] throwableArray31 = httpStatusException29.getSuppressed();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException29);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException29);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.String str15 = httpStatusException10.getUrl();
        int int16 = httpStatusException10.getStatusCode();
        int int17 = httpStatusException10.getStatusCode();
        java.lang.Throwable[] throwableArray18 = httpStatusException10.getSuppressed();
        int int19 = httpStatusException10.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=32, URL=[org.jsoup.SerializationException: ]", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        java.lang.String str9 = httpStatusException7.getUrl();
        java.lang.String str10 = httpStatusException7.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", 35, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Class<?> wildcardClass3 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass10 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (byte) 100, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException5);
        int int7 = httpStatusException5.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException5.getSuppressed();
        int int9 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str11 = httpStatusException5.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str11, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) (byte) -1, "hi!");
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException10);
        java.lang.Class<?> wildcardClass13 = serializationException12.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray15 = serializationException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException14.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException14);
        java.lang.Throwable[] throwableArray18 = serializationException14.getSuppressed();
        httpStatusException8.addSuppressed((java.lang.Throwable) serializationException14);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException23);
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException4);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str22 = httpStatusException21.getUrl();
        int int23 = httpStatusException21.getStatusCode();
        int int24 = httpStatusException21.getStatusCode();
        int int25 = httpStatusException21.getStatusCode();
        httpStatusException17.addSuppressed((java.lang.Throwable) httpStatusException21);
        java.lang.Throwable[] throwableArray27 = httpStatusException17.getSuppressed();
        java.lang.String str28 = httpStatusException17.getUrl();
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        org.jsoup.HttpStatusException httpStatusException36 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int37 = httpStatusException36.getStatusCode();
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException36);
        int int39 = httpStatusException36.getStatusCode();
        serializationException31.addSuppressed((java.lang.Throwable) httpStatusException36);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str10 = serializationException9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) -1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]]", 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        java.lang.String str14 = httpStatusException10.getUrl();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str14, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) -1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (-1), "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException15.getSuppressed();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str25 = httpStatusException24.getUrl();
        int int26 = httpStatusException24.getStatusCode();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException24);
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException24);
        httpStatusException13.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray32 = serializationException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException31.getSuppressed();
        java.lang.Throwable[] throwableArray34 = serializationException31.getSuppressed();
        java.lang.Throwable[] throwableArray35 = serializationException31.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException31.getSuppressed();
        httpStatusException24.addSuppressed((java.lang.Throwable) serializationException31);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException24);
        java.lang.Throwable[] throwableArray39 = serializationException38.getSuppressed();
        serializationException8.addSuppressed((java.lang.Throwable) serializationException38);
        java.lang.Class<?> wildcardClass41 = serializationException8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        java.lang.String str13 = httpStatusException12.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        java.lang.Throwable[] throwableArray15 = serializationException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int8 = httpStatusException7.getStatusCode();
        int int9 = httpStatusException7.getStatusCode();
        java.lang.String str10 = httpStatusException7.getUrl();
        java.lang.String str11 = httpStatusException7.getUrl();
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException7.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int22 = httpStatusException21.getStatusCode();
        int int23 = httpStatusException21.getStatusCode();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException21);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray28 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = serializationException27.getSuppressed();
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException31);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray35 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray37 = serializationException34.getSuppressed();
        serializationException32.addSuppressed((java.lang.Throwable) serializationException34);
        serializationException24.addSuppressed((java.lang.Throwable) serializationException32);
        httpStatusException15.addSuppressed((java.lang.Throwable) serializationException32);
        java.lang.String str41 = httpStatusException15.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.jsoup.SerializationException: " + "'", str41, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        httpStatusException13.addSuppressed((java.lang.Throwable) httpStatusException17);
        java.lang.String str20 = httpStatusException13.getUrl();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException13);
        int int22 = httpStatusException13.getStatusCode();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException13);
        java.lang.String str24 = httpStatusException13.getUrl();
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (byte) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) '4', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException20);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int27 = httpStatusException26.getStatusCode();
        int int28 = httpStatusException26.getStatusCode();
        java.lang.String str29 = httpStatusException26.getUrl();
        serializationException22.addSuppressed((java.lang.Throwable) httpStatusException26);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray35 = serializationException34.getSuppressed();
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException34);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException36);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException37);
        serializationException22.addSuppressed((java.lang.Throwable) serializationException38);
        org.jsoup.HttpStatusException httpStatusException44 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int45 = httpStatusException44.getStatusCode();
        int int46 = httpStatusException44.getStatusCode();
        java.lang.String str47 = httpStatusException44.getUrl();
        java.lang.String str48 = httpStatusException44.getUrl();
        org.jsoup.HttpStatusException httpStatusException52 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException44.addSuppressed((java.lang.Throwable) httpStatusException52);
        org.jsoup.HttpStatusException httpStatusException58 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int59 = httpStatusException58.getStatusCode();
        int int60 = httpStatusException58.getStatusCode();
        org.jsoup.SerializationException serializationException61 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException58);
        org.jsoup.SerializationException serializationException64 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray65 = serializationException64.getSuppressed();
        java.lang.Throwable[] throwableArray66 = serializationException64.getSuppressed();
        java.lang.Throwable[] throwableArray67 = serializationException64.getSuppressed();
        org.jsoup.SerializationException serializationException68 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException64);
        org.jsoup.SerializationException serializationException69 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException68);
        org.jsoup.SerializationException serializationException71 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray72 = serializationException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = serializationException71.getSuppressed();
        java.lang.Throwable[] throwableArray74 = serializationException71.getSuppressed();
        serializationException69.addSuppressed((java.lang.Throwable) serializationException71);
        serializationException61.addSuppressed((java.lang.Throwable) serializationException69);
        httpStatusException52.addSuppressed((java.lang.Throwable) serializationException69);
        org.jsoup.SerializationException serializationException78 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException69);
        org.jsoup.SerializationException serializationException79 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException69);
        serializationException22.addSuppressed((java.lang.Throwable) serializationException79);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 1, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=1, URL=[org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=1, URL=[org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.Throwable[] throwableArray16 = httpStatusException14.getSuppressed();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str18 = httpStatusException14.getUrl();
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException23);
        httpStatusException14.addSuppressed((java.lang.Throwable) serializationException24);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        int int9 = httpStatusException3.getStatusCode();
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException13.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray21 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException20.getSuppressed();
        serializationException18.addSuppressed((java.lang.Throwable) serializationException20);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.String str15 = httpStatusException10.getUrl();
        int int16 = httpStatusException10.getStatusCode();
        int int17 = httpStatusException10.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int22 = httpStatusException21.getStatusCode();
        int int23 = httpStatusException21.getStatusCode();
        java.lang.String str24 = httpStatusException21.getUrl();
        int int25 = httpStatusException21.getStatusCode();
        httpStatusException10.addSuppressed((java.lang.Throwable) httpStatusException21);
        int int27 = httpStatusException21.getStatusCode();
        java.lang.Class<?> wildcardClass28 = httpStatusException21.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException15.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException24.addSuppressed((java.lang.Throwable) httpStatusException28);
        java.lang.Throwable[] throwableArray30 = httpStatusException28.getSuppressed();
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException28);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException28);
        java.lang.String str33 = httpStatusException3.getUrl();
        java.lang.String str34 = httpStatusException3.getUrl();
        java.lang.String str35 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str35, "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str21 = httpStatusException20.getUrl();
        int int22 = httpStatusException20.getStatusCode();
        int int23 = httpStatusException20.getStatusCode();
        int int24 = httpStatusException20.getStatusCode();
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.Throwable[] throwableArray26 = httpStatusException16.getSuppressed();
        java.lang.String str27 = httpStatusException16.getUrl();
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException16);
        int int29 = httpStatusException16.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 10, "org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]", (int) ' ', "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]", (int) (short) 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (int) (short) 10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException22);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str33 = httpStatusException32.getUrl();
        int int34 = httpStatusException32.getStatusCode();
        int int35 = httpStatusException32.getStatusCode();
        int int36 = httpStatusException32.getStatusCode();
        httpStatusException28.addSuppressed((java.lang.Throwable) httpStatusException32);
        java.lang.Throwable[] throwableArray38 = httpStatusException28.getSuppressed();
        java.lang.String str39 = httpStatusException28.getUrl();
        serializationException24.addSuppressed((java.lang.Throwable) httpStatusException28);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        java.lang.Class<?> wildcardClass43 = httpStatusException28.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) -1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]", (int) '4', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=100, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str19 = httpStatusException18.getUrl();
        int int20 = httpStatusException18.getStatusCode();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException18);
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException18);
        java.lang.String str23 = httpStatusException18.getUrl();
        int int24 = httpStatusException18.getStatusCode();
        int int25 = httpStatusException18.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException29 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int30 = httpStatusException29.getStatusCode();
        int int31 = httpStatusException29.getStatusCode();
        java.lang.String str32 = httpStatusException29.getUrl();
        int int33 = httpStatusException29.getStatusCode();
        httpStatusException18.addSuppressed((java.lang.Throwable) httpStatusException29);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException18);
        java.lang.Throwable[] throwableArray36 = httpStatusException18.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException18);
        java.lang.String str38 = httpStatusException18.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException17);
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int24 = httpStatusException23.getStatusCode();
        int int25 = httpStatusException23.getStatusCode();
        java.lang.String str26 = httpStatusException23.getUrl();
        java.lang.String str27 = httpStatusException23.getUrl();
        serializationException17.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.Throwable[] throwableArray29 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", (java.lang.Throwable) serializationException17);
        serializationException13.addSuppressed((java.lang.Throwable) serializationException30);
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=1, URL=[org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (int) 'a', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str6 = httpStatusException5.getUrl();
        int int7 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        java.lang.Class<?> wildcardClass21 = serializationException20.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.String str8 = httpStatusException3.getUrl();
        int int9 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str8, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        httpStatusException10.addSuppressed((java.lang.Throwable) serializationException17);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        java.lang.String str14 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException18);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        int int21 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass22 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException14);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int24 = httpStatusException23.getStatusCode();
        int int25 = httpStatusException23.getStatusCode();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException23);
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int33 = httpStatusException32.getStatusCode();
        java.lang.String str34 = httpStatusException32.getUrl();
        java.lang.Throwable[] throwableArray35 = httpStatusException32.getSuppressed();
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray40 = serializationException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = serializationException39.getSuppressed();
        java.lang.Throwable[] throwableArray42 = serializationException39.getSuppressed();
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException45);
        httpStatusException32.addSuppressed((java.lang.Throwable) serializationException46);
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException32);
        org.jsoup.SerializationException serializationException52 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray53 = serializationException52.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException57 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int58 = httpStatusException57.getStatusCode();
        serializationException52.addSuppressed((java.lang.Throwable) httpStatusException57);
        org.jsoup.SerializationException serializationException60 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException52);
        org.jsoup.SerializationException serializationException61 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException52);
        org.jsoup.SerializationException serializationException62 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException61);
        httpStatusException32.addSuppressed((java.lang.Throwable) serializationException62);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int9 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (byte) 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]]");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass9 = serializationException8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (int) (byte) 100, "");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str27 = httpStatusException26.getUrl();
        int int28 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException26);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException26);
        java.lang.String str31 = httpStatusException26.getUrl();
        int int32 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException26);
        serializationException14.addSuppressed((java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass11 = serializationException10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) serializationException30);
        org.jsoup.HttpStatusException httpStatusException35 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException30.addSuppressed((java.lang.Throwable) httpStatusException35);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]]");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]", throwable1);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str6, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = httpStatusException4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str16 = httpStatusException15.getUrl();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException15);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=1, URL=[org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", 35, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str14 = httpStatusException13.getUrl();
        int int15 = httpStatusException13.getStatusCode();
        int int16 = httpStatusException13.getStatusCode();
        int int17 = httpStatusException13.getStatusCode();
        httpStatusException9.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.Throwable[] throwableArray19 = httpStatusException9.getSuppressed();
        java.lang.String str20 = httpStatusException9.getUrl();
        int int21 = httpStatusException9.getStatusCode();
        java.lang.Throwable[] throwableArray22 = httpStatusException9.getSuppressed();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray25 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException24.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException24.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException33);
        serializationException24.addSuppressed((java.lang.Throwable) serializationException34);
        httpStatusException9.addSuppressed((java.lang.Throwable) serializationException24);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) 'a', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int24 = httpStatusException23.getStatusCode();
        java.lang.String str25 = httpStatusException23.getUrl();
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.String str27 = httpStatusException23.getUrl();
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        java.lang.String str29 = serializationException28.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str29, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Class<?> wildcardClass3 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]");
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        java.lang.String str15 = httpStatusException12.getUrl();
        java.lang.String str16 = httpStatusException12.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException12);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException24);
        httpStatusException12.addSuppressed((java.lang.Throwable) serializationException25);
        java.lang.String str27 = serializationException25.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str27, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        java.lang.String str8 = httpStatusException5.getUrl();
        int int9 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
        java.lang.String str11 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (java.lang.Throwable) httpStatusException5);
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) serializationException30);
        java.lang.Class<?> wildcardClass32 = serializationException31.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException33);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        java.lang.String str40 = httpStatusException39.getUrl();
        httpStatusException33.addSuppressed((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException33);
        org.jsoup.HttpStatusException httpStatusException46 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray47 = httpStatusException46.getSuppressed();
        java.lang.String str48 = httpStatusException46.getUrl();
        org.jsoup.SerializationException serializationException49 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException46);
        serializationException42.addSuppressed((java.lang.Throwable) serializationException49);
        org.jsoup.SerializationException serializationException53 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException54 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException53);
        java.lang.Throwable[] throwableArray55 = serializationException53.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException59 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int60 = httpStatusException59.getStatusCode();
        int int61 = httpStatusException59.getStatusCode();
        java.lang.String str62 = httpStatusException59.getUrl();
        java.lang.String str63 = httpStatusException59.getUrl();
        serializationException53.addSuppressed((java.lang.Throwable) httpStatusException59);
        java.lang.String str65 = httpStatusException59.getUrl();
        serializationException42.addSuppressed((java.lang.Throwable) httpStatusException59);
        org.jsoup.SerializationException serializationException67 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException59);
        java.lang.Class<?> wildcardClass68 = httpStatusException59.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        java.lang.String str9 = httpStatusException4.getUrl();
        int int10 = httpStatusException4.getStatusCode();
        java.lang.String str11 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray13 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException10);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException11);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException9);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]", (java.lang.Throwable) serializationException9);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        int int11 = httpStatusException8.getStatusCode();
        int int12 = httpStatusException8.getStatusCode();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray14 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException16.getSuppressed();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException29 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException29);
        java.lang.Throwable[] throwableArray31 = httpStatusException29.getSuppressed();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException29);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException29);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray41 = serializationException40.getSuppressed();
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException40);
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray46 = serializationException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = serializationException45.getSuppressed();
        java.lang.Throwable[] throwableArray48 = serializationException45.getSuppressed();
        org.jsoup.SerializationException serializationException49 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException45);
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException49);
        org.jsoup.SerializationException serializationException52 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray53 = serializationException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = serializationException52.getSuppressed();
        java.lang.Throwable[] throwableArray55 = serializationException52.getSuppressed();
        serializationException50.addSuppressed((java.lang.Throwable) serializationException52);
        serializationException42.addSuppressed((java.lang.Throwable) serializationException52);
        httpStatusException38.addSuppressed((java.lang.Throwable) serializationException52);
        int int59 = httpStatusException38.getStatusCode();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException38);
        int int61 = httpStatusException38.getStatusCode();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException30.getSuppressed();
        java.lang.Throwable[] throwableArray33 = serializationException30.getSuppressed();
        serializationException28.addSuppressed((java.lang.Throwable) serializationException30);
        serializationException20.addSuppressed((java.lang.Throwable) serializationException28);
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException28);
        java.lang.String str37 = httpStatusException11.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]" + "'", str37, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        java.lang.String str11 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException16);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int7 = httpStatusException6.getStatusCode();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException6);
        java.lang.String str9 = httpStatusException6.getUrl();
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException15.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException24);
        serializationException15.addSuppressed((java.lang.Throwable) serializationException25);
        httpStatusException13.addSuppressed((java.lang.Throwable) serializationException25);
        httpStatusException6.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException6);
        java.lang.String str30 = serializationException29.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str30, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray10 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str8 = httpStatusException4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        java.lang.String str14 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException18);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        java.lang.Throwable[] throwableArray21 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int11 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.String str15 = httpStatusException10.getUrl();
        int int16 = httpStatusException10.getStatusCode();
        int int17 = httpStatusException10.getStatusCode();
        int int18 = httpStatusException10.getStatusCode();
        int int19 = httpStatusException10.getStatusCode();
        int int20 = httpStatusException10.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Class<?> wildcardClass3 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException6);
        int int9 = httpStatusException6.getStatusCode();
        java.lang.String str10 = httpStatusException6.getUrl();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException16);
        httpStatusException6.addSuppressed((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]]", (java.lang.Throwable) serializationException19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException14.addSuppressed((java.lang.Throwable) httpStatusException18);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException26);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray30 = serializationException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = serializationException29.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException29.getSuppressed();
        serializationException27.addSuppressed((java.lang.Throwable) serializationException29);
        org.jsoup.HttpStatusException httpStatusException37 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int38 = httpStatusException37.getStatusCode();
        int int39 = httpStatusException37.getStatusCode();
        serializationException27.addSuppressed((java.lang.Throwable) httpStatusException37);
        int int41 = httpStatusException37.getStatusCode();
        java.lang.Throwable[] throwableArray42 = httpStatusException37.getSuppressed();
        java.lang.String str43 = httpStatusException37.getUrl();
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException37);
        serializationException14.addSuppressed((java.lang.Throwable) serializationException44);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException44);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.jsoup.SerializationException: " + "'", str43, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray13 = serializationException9.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray15 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException9.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = serializationException7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException9);
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException16.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException25 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException25);
        serializationException16.addSuppressed((java.lang.Throwable) serializationException26);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException26);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException28);
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str34 = httpStatusException33.getUrl();
        serializationException28.addSuppressed((java.lang.Throwable) httpStatusException33);
        serializationException11.addSuppressed((java.lang.Throwable) serializationException28);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str34, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        serializationException6.addSuppressed((java.lang.Throwable) serializationException8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str27 = httpStatusException26.getUrl();
        int int28 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException26);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException26);
        java.lang.String str31 = httpStatusException26.getUrl();
        int int32 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException26);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException33);
        java.lang.String str35 = serializationException4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.jsoup.SerializationException: " + "'", str35, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.Class<?> wildcardClass13 = httpStatusException11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 97, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException8.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray16 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException15.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException15.getSuppressed();
        serializationException13.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int24 = httpStatusException23.getStatusCode();
        int int25 = httpStatusException23.getStatusCode();
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException23);
        int int27 = httpStatusException23.getStatusCode();
        java.lang.Throwable[] throwableArray28 = httpStatusException23.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.Class<?> wildcardClass30 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (byte) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        int int18 = httpStatusException11.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int23 = httpStatusException22.getStatusCode();
        int int24 = httpStatusException22.getStatusCode();
        java.lang.String str25 = httpStatusException22.getUrl();
        int int26 = httpStatusException22.getStatusCode();
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException22);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int7 = httpStatusException6.getStatusCode();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException6);
        java.lang.String str9 = httpStatusException6.getUrl();
        java.lang.String str10 = httpStatusException6.getUrl();
        java.lang.Throwable[] throwableArray11 = httpStatusException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: " + "'", str10, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) '#', "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=35, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=35, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        java.lang.String str8 = httpStatusException5.getUrl();
        java.lang.String str9 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int17 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int28 = httpStatusException27.getStatusCode();
        int int29 = httpStatusException27.getStatusCode();
        java.lang.String str30 = httpStatusException27.getUrl();
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException16);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int40 = httpStatusException39.getStatusCode();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException44);
        org.jsoup.HttpStatusException httpStatusException50 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int51 = httpStatusException50.getStatusCode();
        int int52 = httpStatusException50.getStatusCode();
        java.lang.String str53 = httpStatusException50.getUrl();
        serializationException46.addSuppressed((java.lang.Throwable) httpStatusException50);
        org.jsoup.SerializationException serializationException55 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        httpStatusException39.addSuppressed((java.lang.Throwable) serializationException46);
        org.jsoup.SerializationException serializationException57 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException57);
        java.lang.Throwable[] throwableArray59 = serializationException57.getSuppressed();
        serializationException34.addSuppressed((java.lang.Throwable) serializationException57);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException57);
        org.jsoup.SerializationException serializationException62 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException57);
        org.jsoup.SerializationException serializationException63 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException62);
        org.jsoup.SerializationException serializationException64 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException63);
        org.jsoup.HttpStatusException httpStatusException68 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str69 = httpStatusException68.getUrl();
        int int70 = httpStatusException68.getStatusCode();
        int int71 = httpStatusException68.getStatusCode();
        int int72 = httpStatusException68.getStatusCode();
        java.lang.String str73 = httpStatusException68.getUrl();
        int int74 = httpStatusException68.getStatusCode();
        java.lang.String str75 = httpStatusException68.getUrl();
        serializationException64.addSuppressed((java.lang.Throwable) httpStatusException68);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        int int15 = httpStatusException10.getStatusCode();
        java.lang.Class<?> wildcardClass16 = httpStatusException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        java.lang.String str8 = httpStatusException5.getUrl();
        java.lang.String str9 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int17 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int28 = httpStatusException27.getStatusCode();
        int int29 = httpStatusException27.getStatusCode();
        java.lang.String str30 = httpStatusException27.getUrl();
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException16);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int40 = httpStatusException39.getStatusCode();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException44);
        org.jsoup.HttpStatusException httpStatusException50 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int51 = httpStatusException50.getStatusCode();
        int int52 = httpStatusException50.getStatusCode();
        java.lang.String str53 = httpStatusException50.getUrl();
        serializationException46.addSuppressed((java.lang.Throwable) httpStatusException50);
        org.jsoup.SerializationException serializationException55 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        httpStatusException39.addSuppressed((java.lang.Throwable) serializationException46);
        org.jsoup.SerializationException serializationException57 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException57);
        java.lang.Throwable[] throwableArray59 = serializationException57.getSuppressed();
        serializationException34.addSuppressed((java.lang.Throwable) serializationException57);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException57);
        org.jsoup.SerializationException serializationException62 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException57);
        org.jsoup.HttpStatusException httpStatusException66 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str67 = httpStatusException66.getUrl();
        int int68 = httpStatusException66.getStatusCode();
        org.jsoup.SerializationException serializationException69 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException66);
        int int70 = httpStatusException66.getStatusCode();
        org.jsoup.SerializationException serializationException71 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException66);
        serializationException62.addSuppressed((java.lang.Throwable) serializationException71);
        java.lang.Throwable[] throwableArray73 = serializationException71.getSuppressed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str27 = httpStatusException26.getUrl();
        int int28 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException26);
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException26);
        java.lang.String str31 = httpStatusException26.getUrl();
        int int32 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException26);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException33);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) '#', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        serializationException33.addSuppressed((java.lang.Throwable) httpStatusException38);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException17.getSuppressed();
        serializationException15.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException27);
        int int29 = httpStatusException27.getStatusCode();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException27);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException27);
        java.lang.String str32 = httpStatusException27.getUrl();
        int int33 = httpStatusException27.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        java.lang.String str15 = httpStatusException12.getUrl();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException25);
        org.jsoup.HttpStatusException httpStatusException30 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str31 = httpStatusException30.getUrl();
        int int32 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException30);
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException30);
        java.lang.String str35 = httpStatusException30.getUrl();
        int int36 = httpStatusException30.getStatusCode();
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException30);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException37);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray43 = serializationException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = serializationException42.getSuppressed();
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException42);
        org.jsoup.HttpStatusException httpStatusException49 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException45.addSuppressed((java.lang.Throwable) httpStatusException49);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException49);
        org.jsoup.SerializationException serializationException52 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException49);
        java.lang.String str53 = httpStatusException49.getUrl();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str53, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int11 = httpStatusException10.getStatusCode();
        int int12 = httpStatusException10.getStatusCode();
        java.lang.String str13 = httpStatusException10.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int21 = httpStatusException20.getStatusCode();
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        java.lang.String str24 = serializationException23.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]" + "'", str24, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]");
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException11);
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        int int13 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int24 = httpStatusException23.getStatusCode();
        java.lang.String str25 = httpStatusException23.getUrl();
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int32 = httpStatusException31.getStatusCode();
        serializationException27.addSuppressed((java.lang.Throwable) httpStatusException31);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str8 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException8.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException15);
        java.lang.Throwable[] throwableArray17 = httpStatusException15.getSuppressed();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException15);
        java.lang.Class<?> wildcardClass20 = httpStatusException15.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]", (int) '4', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 10, "");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException9);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException11);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) -1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]]");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray8 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        serializationException10.addSuppressed((java.lang.Throwable) serializationException15);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int28 = httpStatusException27.getStatusCode();
        int int29 = httpStatusException27.getStatusCode();
        java.lang.String str30 = httpStatusException27.getUrl();
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException27);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (java.lang.Throwable) serializationException33);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str39 = httpStatusException38.getUrl();
        int int40 = httpStatusException38.getStatusCode();
        java.lang.String str41 = httpStatusException38.getUrl();
        int int42 = httpStatusException38.getStatusCode();
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException38);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException38);
        org.jsoup.HttpStatusException httpStatusException48 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str49 = httpStatusException48.getUrl();
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException48);
        httpStatusException38.addSuppressed((java.lang.Throwable) serializationException50);
        org.jsoup.HttpStatusException httpStatusException55 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException59 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str60 = httpStatusException59.getUrl();
        int int61 = httpStatusException59.getStatusCode();
        int int62 = httpStatusException59.getStatusCode();
        int int63 = httpStatusException59.getStatusCode();
        httpStatusException55.addSuppressed((java.lang.Throwable) httpStatusException59);
        java.lang.Throwable[] throwableArray65 = httpStatusException55.getSuppressed();
        java.lang.String str66 = httpStatusException55.getUrl();
        int int67 = httpStatusException55.getStatusCode();
        java.lang.Throwable[] throwableArray68 = httpStatusException55.getSuppressed();
        org.jsoup.SerializationException serializationException70 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray71 = serializationException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = serializationException70.getSuppressed();
        java.lang.Throwable[] throwableArray73 = serializationException70.getSuppressed();
        java.lang.Throwable[] throwableArray74 = serializationException70.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException79 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException80 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException79);
        serializationException70.addSuppressed((java.lang.Throwable) serializationException80);
        httpStatusException55.addSuppressed((java.lang.Throwable) serializationException70);
        serializationException50.addSuppressed((java.lang.Throwable) httpStatusException55);
        serializationException34.addSuppressed((java.lang.Throwable) httpStatusException55);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException9.getSuppressed();
        serializationException7.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException17);
        java.lang.Throwable[] throwableArray21 = httpStatusException17.getSuppressed();
        java.lang.String str22 = httpStatusException17.getUrl();
        java.lang.String str23 = httpStatusException17.getUrl();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.jsoup.SerializationException: " + "'", str22, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: " + "'", str23, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        java.lang.String str14 = serializationException4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.SerializationException: " + "'", str14, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str17 = httpStatusException16.getUrl();
        int int18 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException5.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray27 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray28 = serializationException23.getSuppressed();
        httpStatusException16.addSuppressed((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException30);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException30);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 97, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable throwable7 = null;
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException(throwable7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException(throwable7);
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException14);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int21 = httpStatusException20.getStatusCode();
        int int22 = httpStatusException20.getStatusCode();
        java.lang.String str23 = httpStatusException20.getUrl();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str29 = httpStatusException28.getUrl();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException28);
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str29, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray13 = serializationException9.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray17 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = serializationException16.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException16.getSuppressed();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.HttpStatusException httpStatusException25 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str26 = httpStatusException25.getUrl();
        int int27 = httpStatusException25.getStatusCode();
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException25);
        serializationException20.addSuppressed((java.lang.Throwable) httpStatusException25);
        java.lang.String str30 = httpStatusException25.getUrl();
        int int31 = httpStatusException25.getStatusCode();
        int int32 = httpStatusException25.getStatusCode();
        int int33 = httpStatusException25.getStatusCode();
        int int34 = httpStatusException25.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException25);
        java.lang.Class<?> wildcardClass36 = httpStatusException25.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) 100, "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray6 = httpStatusException5.getSuppressed();
        java.lang.String str7 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException12.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException23);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException2);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        java.lang.String str13 = httpStatusException12.getUrl();
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException12);
        java.lang.String str15 = serializationException6.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]", 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }
}

