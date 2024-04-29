import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.SerializationException serializationException0 = new org.jsoup.SerializationException();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.String str4 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException1.getSuppressed();
        java.lang.String str7 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.String str6 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.String str8 = serializationException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str8, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        java.lang.Class<?> wildcardClass4 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        java.lang.String str5 = serializationException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.String str2 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str2, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int7 = httpStatusException6.getStatusCode();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException6);
        java.lang.String str9 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str9, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        java.lang.Class<?> wildcardClass14 = serializationException4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = serializationException7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int7 = httpStatusException6.getStatusCode();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException6);
        java.lang.Class<?> wildcardClass9 = httpStatusException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray6 = serializationException2.getSuppressed();
        java.lang.String str7 = serializationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.Class<?> wildcardClass13 = httpStatusException11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", 32, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str2 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str2, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str20 = httpStatusException14.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str20, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        java.lang.String str20 = serializationException10.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.jsoup.SerializationException: " + "'", str20, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        serializationException11.addSuppressed((java.lang.Throwable) serializationException16);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        java.lang.Throwable[] throwableArray21 = serializationException20.getSuppressed();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException20);
        java.lang.Class<?> wildcardClass23 = serializationException20.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = serializationException9.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: " + "'", str10, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException6);
        java.lang.String str9 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = serializationException6.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        java.lang.Class<?> wildcardClass14 = serializationException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        java.lang.Throwable[] throwableArray11 = serializationException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass8 = serializationException7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        java.lang.String str17 = serializationException1.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException7);
        java.lang.String str11 = httpStatusException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str11, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        java.lang.Class<?> wildcardClass20 = serializationException19.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (short) 10, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Class<?> wildcardClass10 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.String str3 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.SerializationException: " + "'", str3, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializationException1.addSuppressed(throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException7);
        java.lang.Class<?> wildcardClass11 = serializationException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        int int20 = httpStatusException14.getStatusCode();
        java.lang.Class<?> wildcardClass21 = httpStatusException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException5);
        java.lang.Class<?> wildcardClass8 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException21.getSuppressed();
        httpStatusException14.addSuppressed((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException14.addSuppressed((java.lang.Throwable) httpStatusException31);
        java.lang.String str33 = httpStatusException14.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str33, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (byte) 100, "hi!");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        serializationException11.addSuppressed((java.lang.Throwable) serializationException16);
        serializationException9.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.lang.String str15 = serializationException14.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.Throwable[] throwableArray21 = serializationException19.getSuppressed();
        java.lang.Class<?> wildcardClass22 = serializationException19.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        java.lang.String str20 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str20, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        java.lang.Class<?> wildcardClass16 = serializationException5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        java.lang.String str11 = serializationException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str27 = httpStatusException26.getUrl();
        int int28 = httpStatusException26.getStatusCode();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException26);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray33 = serializationException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = serializationException32.getSuppressed();
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException32);
        java.lang.Throwable[] throwableArray36 = serializationException32.getSuppressed();
        httpStatusException26.addSuppressed((java.lang.Throwable) serializationException32);
        serializationException22.addSuppressed((java.lang.Throwable) serializationException32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.String str11 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str11, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int14 = httpStatusException13.getStatusCode();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str16 = httpStatusException13.getUrl();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.Class<?> wildcardClass18 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.SerializationException: " + "'", str16, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int14 = httpStatusException13.getStatusCode();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str16 = httpStatusException13.getUrl();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str18 = httpStatusException13.getUrl();
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException13.addSuppressed(throwable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.SerializationException: " + "'", str16, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException5);
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        serializationException3.addSuppressed((java.lang.Throwable) serializationException6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException27);
        java.lang.Class<?> wildcardClass35 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException12);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException12);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str13, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!");
        java.lang.String str2 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str2, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException13);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException13);
        java.lang.Class<?> wildcardClass17 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException21.getSuppressed();
        httpStatusException14.addSuppressed((java.lang.Throwable) serializationException21);
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException14.addSuppressed((java.lang.Throwable) httpStatusException31);
        java.lang.Class<?> wildcardClass33 = httpStatusException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        java.lang.Class<?> wildcardClass33 = httpStatusException28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException6.addSuppressed((java.lang.Throwable) serializationException10);
        java.lang.String str12 = serializationException10.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str12, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        serializationException12.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException10.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException12);
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) serializationException21);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        java.lang.Class<?> wildcardClass19 = serializationException18.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        java.lang.Class<?> wildcardClass21 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException3.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException8);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException8);
        java.lang.String str11 = serializationException2.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str9 = serializationException8.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str9, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.String str6 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        int int20 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray9 = serializationException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.String str15 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str15, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.String str8 = serializationException7.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str8, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        java.lang.String str11 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str11, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) 10, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.String str8 = httpStatusException4.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException8);
        java.lang.Class<?> wildcardClass13 = serializationException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) '4', "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str7, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (byte) 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.lang.Class<?> wildcardClass15 = serializationException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.lang.Class<?> wildcardClass19 = httpStatusException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass19 = serializationException4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException7);
        java.lang.Class<?> wildcardClass11 = httpStatusException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int14 = httpStatusException13.getStatusCode();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str16 = httpStatusException13.getUrl();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.SerializationException: " + "'", str16, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.String str27 = httpStatusException10.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str27, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.Throwable[] throwableArray15 = serializationException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.String str3 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str3, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializationException1.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        java.lang.Class<?> wildcardClass11 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException10);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        java.lang.Class<?> wildcardClass16 = serializationException9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = serializationException5.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        java.lang.Throwable[] throwableArray14 = serializationException10.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.Class<?> wildcardClass27 = httpStatusException10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.Class<?> wildcardClass35 = serializationException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException3.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str20 = httpStatusException14.getUrl();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException9);
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Class<?> wildcardClass13 = serializationException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        java.lang.String str12 = httpStatusException8.getUrl();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray14 = serializationException2.getSuppressed();
        java.lang.Class<?> wildcardClass15 = throwableArray14.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray9 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass10 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException10);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException11);
        java.lang.Class<?> wildcardClass13 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        serializationException5.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException18.getSuppressed();
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException18);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str28 = httpStatusException27.getUrl();
        int int29 = httpStatusException27.getStatusCode();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException27);
        serializationException22.addSuppressed((java.lang.Throwable) httpStatusException27);
        java.lang.String str32 = httpStatusException27.getUrl();
        int int33 = httpStatusException27.getStatusCode();
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException27);
        serializationException15.addSuppressed((java.lang.Throwable) serializationException34);
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException34);
        java.lang.String str37 = serializationException34.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str37, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) 0, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        java.lang.Class<?> wildcardClass8 = serializationException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int18 = httpStatusException17.getStatusCode();
        int int19 = httpStatusException17.getStatusCode();
        java.lang.String str20 = httpStatusException17.getUrl();
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException22);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException22);
        int int26 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        java.lang.Class<?> wildcardClass7 = httpStatusException4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = serializationException5.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        int int40 = httpStatusException3.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = serializationException5.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray13 = httpStatusException3.getSuppressed();
        java.lang.String str14 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass15 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Throwable[] throwableArray34 = httpStatusException27.getSuppressed();
        int int35 = httpStatusException27.getStatusCode();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException13.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray21 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException20.getSuppressed();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException25);
        serializationException20.addSuppressed((java.lang.Throwable) serializationException25);
        serializationException18.addSuppressed((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException20);
        java.lang.Throwable[] throwableArray30 = serializationException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = serializationException29.getSuppressed();
        serializationException9.addSuppressed((java.lang.Throwable) serializationException29);
        java.lang.String str33 = serializationException9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str33, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) 100, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.String str17 = serializationException15.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        java.lang.String str9 = serializationException6.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        java.lang.Class<?> wildcardClass19 = serializationException16.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        java.lang.Class<?> wildcardClass7 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (byte) 1, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.Throwable[] throwableArray33 = serializationException15.getSuppressed();
        java.lang.Class<?> wildcardClass34 = serializationException15.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int10 = httpStatusException9.getStatusCode();
        int int11 = httpStatusException9.getStatusCode();
        java.lang.String str12 = httpStatusException9.getUrl();
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        java.lang.Throwable[] throwableArray15 = serializationException14.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray18 = serializationException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        serializationException17.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException27);
        serializationException17.addSuppressed((java.lang.Throwable) serializationException27);
        serializationException14.addSuppressed((java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException27);
        java.lang.Throwable throwable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializationException27.addSuppressed(throwable33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.String str23 = httpStatusException4.getUrl();
        java.lang.Class<?> wildcardClass24 = httpStatusException4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: " + "'", str23, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        int int20 = httpStatusException14.getStatusCode();
        int int21 = httpStatusException14.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.String str5 = serializationException3.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        int int24 = httpStatusException3.getStatusCode();
        int int25 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str13, "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int14 = httpStatusException13.getStatusCode();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str16 = httpStatusException13.getUrl();
        serializationException1.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str18 = httpStatusException13.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.SerializationException: " + "'", str16, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str18, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass18 = serializationException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.String str15 = serializationException11.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int22 = httpStatusException21.getStatusCode();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException21);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        int int7 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 35, "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.lang.String str23 = httpStatusException11.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str23, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        java.lang.String str5 = serializationException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException1.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException10);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException11);
        java.lang.String str13 = serializationException11.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str13, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int13 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException7);
        int int11 = httpStatusException7.getStatusCode();
        java.lang.String str12 = httpStatusException7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str12, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass9 = serializationException8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray7 = serializationException2.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException5);
        int int7 = httpStatusException5.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException5.getSuppressed();
        int int9 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException4.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException18.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException27);
        serializationException18.addSuppressed((java.lang.Throwable) serializationException28);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        java.lang.Throwable[] throwableArray31 = serializationException18.getSuppressed();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException9);
        java.lang.Class<?> wildcardClass11 = httpStatusException9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Throwable throwable0 = null;
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException(throwable0);
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException(throwable0);
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        java.lang.String str5 = serializationException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException" + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        int int11 = httpStatusException7.getStatusCode();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException7.getUrl();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException37);
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int44 = httpStatusException43.getStatusCode();
        int int45 = httpStatusException43.getStatusCode();
        java.lang.String str46 = httpStatusException43.getUrl();
        serializationException39.addSuppressed((java.lang.Throwable) httpStatusException43);
        org.jsoup.SerializationException serializationException48 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException39);
        serializationException34.addSuppressed((java.lang.Throwable) serializationException48);
        httpStatusException27.addSuppressed((java.lang.Throwable) serializationException34);
        java.lang.Class<?> wildcardClass51 = httpStatusException27.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException5);
        java.lang.String str8 = httpStatusException5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException12);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException15);
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", 10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Class<?> wildcardClass4 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException11);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException12);
        java.lang.Class<?> wildcardClass15 = serializationException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass5 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str4, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = serializationException5.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) 100, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass6 = httpStatusException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str8 = httpStatusException4.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException13);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException13);
        java.lang.String str17 = serializationException13.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.lang.String str34 = serializationException33.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str34, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.String str3 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.SerializationException: " + "'", str3, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.lang.Class<?> wildcardClass24 = serializationException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.String str32 = serializationException31.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str32, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException9);
        int int11 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.String str23 = serializationException15.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str23, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 10, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException4);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException4);
        java.lang.String str7 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException6);
        int int9 = httpStatusException6.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        java.lang.String str13 = serializationException12.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]" + "'", str13, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str9 = httpStatusException3.getUrl();
        java.lang.String str10 = httpStatusException3.getUrl();
        java.lang.String str11 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException27);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray39 = httpStatusException38.getSuppressed();
        java.lang.String str40 = httpStatusException38.getUrl();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException38);
        serializationException27.addSuppressed((java.lang.Throwable) serializationException41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (short) 100, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Class<?> wildcardClass2 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) 100, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        java.lang.Throwable[] throwableArray11 = httpStatusException7.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        int int13 = httpStatusException3.getStatusCode();
        int int14 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str9 = httpStatusException3.getUrl();
        java.lang.String str10 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str7 = serializationException6.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]" + "'", str7, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) '4', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException11);
        java.lang.Class<?> wildcardClass13 = serializationException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int15 = httpStatusException14.getStatusCode();
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException9);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
        java.lang.String str2 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str2, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        java.lang.String str6 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = serializationException9.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        int int18 = httpStatusException3.getStatusCode();
        java.lang.String str19 = httpStatusException3.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str19, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str12 = httpStatusException11.getUrl();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException11);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.Class<?> wildcardClass15 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str12, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException8);
        java.lang.String str13 = serializationException8.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.SerializationException: " + "'", str13, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str4, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str5, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str6, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass6 = serializationException5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str9 = httpStatusException3.getUrl();
        java.lang.String str10 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException14);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int21 = httpStatusException20.getStatusCode();
        int int22 = httpStatusException20.getStatusCode();
        java.lang.String str23 = httpStatusException20.getUrl();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        serializationException11.addSuppressed((java.lang.Throwable) serializationException25);
        java.lang.Throwable[] throwableArray27 = serializationException11.getSuppressed();
        serializationException9.addSuppressed((java.lang.Throwable) serializationException11);
        java.lang.Class<?> wildcardClass29 = serializationException9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException4.getSuppressed();
        int int8 = httpStatusException4.getStatusCode();
        java.lang.String str9 = httpStatusException4.getUrl();
        java.lang.String str10 = httpStatusException4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray9 = httpStatusException3.getSuppressed();
        java.lang.String str10 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int13 = httpStatusException11.getStatusCode();
        int int14 = httpStatusException11.getStatusCode();
        java.lang.Throwable[] throwableArray15 = httpStatusException11.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        java.lang.Class<?> wildcardClass5 = serializationException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (short) 100, "org.jsoup.SerializationException: ");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.String str47 = httpStatusException3.getUrl();
        java.lang.String str48 = httpStatusException3.toString();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str47, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str48, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.String str28 = httpStatusException21.getUrl();
        int int29 = httpStatusException21.getStatusCode();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.String str32 = serializationException31.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str32, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        serializationException5.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) serializationException14);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.String str22 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (-1), "hi!");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Class<?> wildcardClass9 = serializationException7.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str6 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        int int8 = httpStatusException5.getStatusCode();
        java.lang.Throwable[] throwableArray9 = httpStatusException5.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException37);
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int44 = httpStatusException43.getStatusCode();
        int int45 = httpStatusException43.getStatusCode();
        java.lang.String str46 = httpStatusException43.getUrl();
        serializationException39.addSuppressed((java.lang.Throwable) httpStatusException43);
        org.jsoup.SerializationException serializationException48 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException39);
        serializationException34.addSuppressed((java.lang.Throwable) serializationException48);
        httpStatusException27.addSuppressed((java.lang.Throwable) serializationException34);
        java.lang.String str51 = httpStatusException27.getUrl();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.lang.String str16 = httpStatusException11.getUrl();
        int int17 = httpStatusException11.getStatusCode();
        java.lang.Class<?> wildcardClass18 = httpStatusException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.getUrl();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException8);
        java.lang.Throwable[] throwableArray13 = serializationException8.getSuppressed();
        java.lang.Class<?> wildcardClass14 = serializationException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.lang.Class<?> wildcardClass25 = serializationException17.getClass();
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray2 = serializationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = serializationException1.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.String str5 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass8 = httpStatusException4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        java.lang.Throwable[] throwableArray11 = httpStatusException7.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        int int13 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass14 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.Class<?> wildcardClass18 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        int int11 = httpStatusException3.getStatusCode();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException3.addSuppressed(throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException15);
        java.lang.Throwable[] throwableArray30 = httpStatusException15.getSuppressed();
        java.lang.Class<?> wildcardClass31 = httpStatusException15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        java.lang.String str6 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        java.lang.String str8 = serializationException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str8, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.Class<?> wildcardClass24 = httpStatusException5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) -1, "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) serializationException8);
        java.lang.Class<?> wildcardClass10 = serializationException9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray5 = serializationException2.getSuppressed();
        java.lang.String str6 = serializationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str33 = httpStatusException18.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str33, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.String str28 = serializationException18.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str28, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.String str25 = serializationException17.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.jsoup.SerializationException: " + "'", str25, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.String str30 = httpStatusException11.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str30, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (byte) 0, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) 'a', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = serializationException18.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException18.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException27 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException27);
        serializationException18.addSuppressed((java.lang.Throwable) serializationException28);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException18);
        java.lang.Class<?> wildcardClass31 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException21.getSuppressed();
        httpStatusException14.addSuppressed((java.lang.Throwable) serializationException21);
        java.lang.Class<?> wildcardClass28 = httpStatusException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str6 = httpStatusException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.lang.Class<?> wildcardClass30 = httpStatusException11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str6 = serializationException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str24 = httpStatusException5.getUrl();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.SerializationException: " + "'", str24, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) -1, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str15 = httpStatusException4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (byte) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]" + "'", str4, "org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.String str17 = httpStatusException10.getUrl();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException7);
        java.lang.Throwable[] throwableArray12 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException22);
        java.lang.Class<?> wildcardClass24 = httpStatusException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.String str19 = serializationException18.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str19, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str24 = httpStatusException5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str24, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        java.lang.String str10 = httpStatusException7.getUrl();
        int int11 = httpStatusException7.getStatusCode();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str18 = httpStatusException17.getUrl();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        httpStatusException7.addSuppressed((java.lang.Throwable) serializationException19);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException19);
        java.lang.String str22 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]" + "'", str22, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException7);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException7);
        java.lang.String str10 = serializationException3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str10, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass7 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray11 = httpStatusException8.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException15);
        java.lang.String str17 = httpStatusException8.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str17, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) serializationException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.String str23 = serializationException15.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str23, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        int int10 = httpStatusException4.getStatusCode();
        java.lang.Class<?> wildcardClass11 = httpStatusException4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.String str15 = serializationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int29 = httpStatusException28.getStatusCode();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException33);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int40 = httpStatusException39.getStatusCode();
        int int41 = httpStatusException39.getStatusCode();
        java.lang.String str42 = httpStatusException39.getUrl();
        serializationException35.addSuppressed((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException35);
        httpStatusException28.addSuppressed((java.lang.Throwable) serializationException35);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        java.lang.Throwable[] throwableArray48 = serializationException46.getSuppressed();
        serializationException23.addSuppressed((java.lang.Throwable) serializationException46);
        java.lang.String str50 = serializationException23.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str50, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        java.lang.String str12 = httpStatusException8.getUrl();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.String str14 = serializationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.SerializationException: " + "'", str14, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass10 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.Throwable[] throwableArray42 = httpStatusException28.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 10, "");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", 35, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        int int18 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        int int9 = httpStatusException3.getStatusCode();
        int int10 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.Throwable[] throwableArray12 = httpStatusException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", (java.lang.Throwable) httpStatusException10);
        java.lang.Throwable[] throwableArray14 = httpStatusException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.lang.String str21 = serializationException18.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str21, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", (int) (short) -1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException3.getUrl();
        int int14 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        int int33 = httpStatusException27.getStatusCode();
        java.lang.String str34 = httpStatusException27.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str34, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        java.lang.Throwable[] throwableArray14 = serializationException10.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException19);
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
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException28);
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException28);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        java.lang.String str11 = serializationException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        java.lang.Class<?> wildcardClass12 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
        java.lang.Class<?> wildcardClass2 = serializationException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int10 = httpStatusException9.getStatusCode();
        serializationException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.Class<?> wildcardClass34 = httpStatusException3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str9 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException15);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str21 = httpStatusException20.getUrl();
        int int22 = httpStatusException20.getStatusCode();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException20);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.Class<?> wildcardClass26 = httpStatusException20.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) ' ', "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException7.getUrl();
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
        httpStatusException7.addSuppressed((java.lang.Throwable) httpStatusException24);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException24);
        java.lang.String str31 = httpStatusException24.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str31, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (int) (short) 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException8);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException8);
        java.lang.String str11 = serializationException8.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str11, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 100, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        int int8 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray9 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass10 = throwableArray9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (short) 0, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.lang.Class<?> wildcardClass13 = serializationException12.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.Class<?> wildcardClass33 = httpStatusException18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException22);
        java.lang.Class<?> wildcardClass29 = httpStatusException22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException9);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException21 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException21);
        httpStatusException17.addSuppressed((java.lang.Throwable) httpStatusException21);
        java.lang.String str24 = httpStatusException17.getUrl();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        int int26 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        java.lang.String str28 = httpStatusException17.getUrl();
        httpStatusException9.addSuppressed((java.lang.Throwable) httpStatusException17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int13 = httpStatusException12.getStatusCode();
        int int14 = httpStatusException12.getStatusCode();
        java.lang.String str15 = httpStatusException12.getUrl();
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException19);
        java.lang.String str21 = serializationException19.toString();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.jsoup.SerializationException: " + "'", str21, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 10, "");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializationException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.Class<?> wildcardClass33 = httpStatusException3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.String str23 = serializationException7.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str23, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException4);
        java.lang.Class<?> wildcardClass10 = serializationException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) 1, "");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Throwable[] throwableArray19 = httpStatusException16.getSuppressed();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        java.lang.Class<?> wildcardClass21 = serializationException20.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        java.lang.Throwable[] throwableArray16 = serializationException9.getSuppressed();
        java.lang.Class<?> wildcardClass17 = throwableArray16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.Throwable[] throwableArray15 = httpStatusException13.getSuppressed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str19 = httpStatusException14.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str19, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.Class<?> wildcardClass25 = throwableArray24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 10, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.Throwable[] throwableArray27 = serializationException19.getSuppressed();
        java.lang.Class<?> wildcardClass28 = throwableArray27.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.Throwable[] throwableArray31 = httpStatusException22.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException9);
        java.lang.Throwable[] throwableArray11 = httpStatusException9.getSuppressed();
        java.lang.String str12 = httpStatusException9.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str12, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (short) 10, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) ' ', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.Throwable[] throwableArray19 = serializationException18.getSuppressed();
        java.lang.Class<?> wildcardClass20 = throwableArray19.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int7 = httpStatusException6.getStatusCode();
        int int8 = httpStatusException6.getStatusCode();
        java.lang.String str9 = httpStatusException6.getUrl();
        java.lang.String str10 = httpStatusException6.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException6);
        org.jsoup.HttpStatusException httpStatusException17 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int18 = httpStatusException17.getStatusCode();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException17);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int29 = httpStatusException28.getStatusCode();
        int int30 = httpStatusException28.getStatusCode();
        java.lang.String str31 = httpStatusException28.getUrl();
        serializationException24.addSuppressed((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException24);
        httpStatusException17.addSuppressed((java.lang.Throwable) serializationException24);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException17);
        org.jsoup.HttpStatusException httpStatusException40 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int41 = httpStatusException40.getStatusCode();
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException40);
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException45);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException45);
        org.jsoup.HttpStatusException httpStatusException51 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int52 = httpStatusException51.getStatusCode();
        int int53 = httpStatusException51.getStatusCode();
        java.lang.String str54 = httpStatusException51.getUrl();
        serializationException47.addSuppressed((java.lang.Throwable) httpStatusException51);
        org.jsoup.SerializationException serializationException56 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException47);
        httpStatusException40.addSuppressed((java.lang.Throwable) serializationException47);
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException40);
        org.jsoup.SerializationException serializationException59 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException58);
        java.lang.Throwable[] throwableArray60 = serializationException58.getSuppressed();
        serializationException35.addSuppressed((java.lang.Throwable) serializationException58);
        httpStatusException6.addSuppressed((java.lang.Throwable) serializationException58);
        org.jsoup.SerializationException serializationException63 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException58);
        org.jsoup.SerializationException serializationException64 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException", (java.lang.Throwable) serializationException58);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
        java.lang.String str2 = serializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str2, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", (int) (short) 0, "hi!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray9 = httpStatusException3.getSuppressed();
        java.lang.String str10 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.Throwable[] throwableArray19 = httpStatusException16.getSuppressed();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        java.lang.Class<?> wildcardClass22 = serializationException20.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException14);
        int int16 = httpStatusException14.getStatusCode();
        java.lang.Throwable[] throwableArray17 = httpStatusException14.getSuppressed();
        int int18 = httpStatusException14.getStatusCode();
        java.lang.String str19 = httpStatusException14.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.Class<?> wildcardClass21 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException8);
        java.lang.Throwable[] throwableArray13 = serializationException8.getSuppressed();
        java.lang.Class<?> wildcardClass14 = throwableArray13.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException17);
        java.lang.String str25 = httpStatusException17.getUrl();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.jsoup.SerializationException: " + "'", str25, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (short) 0, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 10, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str6 = httpStatusException4.getUrl();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException13.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray21 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException20.getSuppressed();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException25);
        serializationException20.addSuppressed((java.lang.Throwable) serializationException25);
        serializationException18.addSuppressed((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException20);
        java.lang.Throwable[] throwableArray30 = serializationException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = serializationException29.getSuppressed();
        serializationException9.addSuppressed((java.lang.Throwable) serializationException29);
        java.lang.String str33 = serializationException29.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.jsoup.SerializationException: " + "'", str33, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (byte) 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.Class<?> wildcardClass25 = serializationException22.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", 10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray9 = serializationException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException8.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        serializationException8.addSuppressed((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException13);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException13);
        int int19 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException4);
        int int21 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray22 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass5 = serializationException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        int int47 = httpStatusException43.getStatusCode();
        int int48 = httpStatusException43.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.Throwable[] throwableArray18 = serializationException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Class<?> wildcardClass11 = httpStatusException8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        int int8 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        int int12 = httpStatusException5.getStatusCode();
        java.lang.Class<?> wildcardClass13 = httpStatusException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException2);
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializationException4.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        int int10 = httpStatusException7.getStatusCode();
        int int11 = httpStatusException7.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException3.getUrl();
        java.lang.String str14 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray19 = httpStatusException18.getSuppressed();
        java.lang.String str20 = httpStatusException18.getUrl();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException18);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException18);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException18);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str7, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException16);
        java.lang.Class<?> wildcardClass19 = httpStatusException16.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 10, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str6 = httpStatusException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray31 = serializationException30.getSuppressed();
        httpStatusException28.addSuppressed((java.lang.Throwable) serializationException30);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        serializationException23.addSuppressed((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException37);
        java.lang.Throwable[] throwableArray39 = serializationException37.getSuppressed();
        serializationException23.addSuppressed((java.lang.Throwable) serializationException37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.lang.Class<?> wildcardClass23 = serializationException22.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", 1, "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        int int30 = httpStatusException15.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        int int33 = httpStatusException28.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        int int15 = httpStatusException12.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (byte) 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int12 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str14 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]" + "'", str14, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException18);
        serializationException13.addSuppressed((java.lang.Throwable) serializationException19);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.Class<?> wildcardClass29 = serializationException28.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException17);
        serializationException12.addSuppressed((java.lang.Throwable) serializationException17);
        serializationException10.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException12);
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException21);
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException23);
        java.lang.Class<?> wildcardClass25 = serializationException23.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("hi!", (int) (byte) 1, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str6, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = httpStatusException4.getUrl();
        int int11 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray12 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        java.lang.String str39 = httpStatusException11.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str39, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) '#', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.SerializationException: hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = httpStatusException3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str4, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int16 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException20);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int27 = httpStatusException26.getStatusCode();
        int int28 = httpStatusException26.getStatusCode();
        java.lang.String str29 = httpStatusException26.getUrl();
        serializationException22.addSuppressed((java.lang.Throwable) httpStatusException26);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        httpStatusException15.addSuppressed((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException15);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int39 = httpStatusException38.getStatusCode();
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException38);
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException43);
        org.jsoup.HttpStatusException httpStatusException49 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int50 = httpStatusException49.getStatusCode();
        int int51 = httpStatusException49.getStatusCode();
        java.lang.String str52 = httpStatusException49.getUrl();
        serializationException45.addSuppressed((java.lang.Throwable) httpStatusException49);
        org.jsoup.SerializationException serializationException54 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException45);
        httpStatusException38.addSuppressed((java.lang.Throwable) serializationException45);
        org.jsoup.SerializationException serializationException56 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException38);
        org.jsoup.SerializationException serializationException57 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException56);
        java.lang.Throwable[] throwableArray58 = serializationException56.getSuppressed();
        serializationException33.addSuppressed((java.lang.Throwable) serializationException56);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException56);
        org.jsoup.HttpStatusException httpStatusException66 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException67 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException66);
        org.jsoup.SerializationException serializationException68 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException67);
        serializationException56.addSuppressed((java.lang.Throwable) serializationException68);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        int int44 = httpStatusException43.getStatusCode();
        serializationException37.addSuppressed((java.lang.Throwable) httpStatusException43);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int9 = httpStatusException8.getStatusCode();
        int int10 = httpStatusException8.getStatusCode();
        java.lang.String str11 = httpStatusException8.getUrl();
        java.lang.String str12 = httpStatusException8.getUrl();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.String str14 = httpStatusException8.getUrl();
        java.lang.Throwable[] throwableArray15 = httpStatusException8.getSuppressed();
        java.lang.String str16 = httpStatusException8.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str16, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.lang.Class<?> wildcardClass18 = httpStatusException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException9);
        java.lang.Class<?> wildcardClass13 = serializationException12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        java.lang.String str6 = serializationException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Throwable throwable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException21.addSuppressed(throwable28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.Class<?> wildcardClass5 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) 1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException3);
        java.lang.Throwable[] throwableArray8 = serializationException3.getSuppressed();
        java.lang.String str9 = serializationException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) serializationException8);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.Class<?> wildcardClass20 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 1, "org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str8 = httpStatusException7.getUrl();
        int int9 = httpStatusException7.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        java.lang.String str13 = httpStatusException7.getUrl();
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
        httpStatusException7.addSuppressed((java.lang.Throwable) httpStatusException24);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray37 = serializationException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = serializationException36.getSuppressed();
        java.lang.Throwable[] throwableArray39 = serializationException36.getSuppressed();
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException36);
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException40);
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray44 = serializationException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = serializationException43.getSuppressed();
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException48 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException49 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException48);
        serializationException43.addSuppressed((java.lang.Throwable) serializationException48);
        serializationException41.addSuppressed((java.lang.Throwable) serializationException43);
        org.jsoup.SerializationException serializationException52 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException43);
        java.lang.Throwable[] throwableArray53 = serializationException52.getSuppressed();
        org.jsoup.SerializationException serializationException54 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException52);
        org.jsoup.SerializationException serializationException55 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException54);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException55);
        java.lang.String str57 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str57, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        java.lang.String str21 = serializationException10.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.jsoup.SerializationException: " + "'", str21, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 97, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.HttpStatusException httpStatusException28 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int29 = httpStatusException28.getStatusCode();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException33);
        org.jsoup.HttpStatusException httpStatusException39 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int40 = httpStatusException39.getStatusCode();
        int int41 = httpStatusException39.getStatusCode();
        java.lang.String str42 = httpStatusException39.getUrl();
        serializationException35.addSuppressed((java.lang.Throwable) httpStatusException39);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException35);
        httpStatusException28.addSuppressed((java.lang.Throwable) serializationException35);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException28);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        java.lang.Throwable[] throwableArray48 = serializationException46.getSuppressed();
        serializationException23.addSuppressed((java.lang.Throwable) serializationException46);
        java.lang.String str50 = serializationException46.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str50, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) 1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.Throwable[] throwableArray19 = httpStatusException16.getSuppressed();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        java.lang.Throwable[] throwableArray21 = httpStatusException16.getSuppressed();
        java.lang.Class<?> wildcardClass22 = httpStatusException16.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str6 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        java.lang.String str8 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException5);
        java.lang.Class<?> wildcardClass11 = httpStatusException5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str8, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        java.lang.String str8 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 10, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 10, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException38);
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
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 97, "");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        java.lang.Throwable[] throwableArray14 = serializationException10.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int6 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        java.lang.Throwable[] throwableArray8 = httpStatusException5.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str10 = httpStatusException5.getUrl();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.SerializationException: " + "'", str10, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 100, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException10);
        java.lang.Throwable[] throwableArray14 = serializationException10.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException19);
        java.lang.String str22 = httpStatusException19.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str19 = httpStatusException18.getUrl();
        int int20 = httpStatusException18.getStatusCode();
        int int21 = httpStatusException18.getStatusCode();
        int int22 = httpStatusException18.getStatusCode();
        httpStatusException14.addSuppressed((java.lang.Throwable) httpStatusException18);
        java.lang.Throwable[] throwableArray24 = httpStatusException14.getSuppressed();
        java.lang.String str25 = httpStatusException14.getUrl();
        int int26 = httpStatusException14.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException14);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException7);
        int int11 = httpStatusException7.getStatusCode();
        java.lang.Class<?> wildcardClass12 = httpStatusException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) -1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str5 = serializationException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray14 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException13.getSuppressed();
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException17);
        java.lang.Throwable[] throwableArray19 = serializationException17.getSuppressed();
        serializationException10.addSuppressed((java.lang.Throwable) serializationException17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (int) ' ', "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]" + "'", str7, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException15);
        java.lang.Throwable[] throwableArray30 = httpStatusException15.getSuppressed();
        int int31 = httpStatusException15.getStatusCode();
        int int32 = httpStatusException15.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.String str18 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray19 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass20 = throwableArray19.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=32, URL=[org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) serializationException2);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException8);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray15 = serializationException12.getSuppressed();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException16);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=32, URL=[org.jsoup.SerializationException: ]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=32, URL=[org.jsoup.SerializationException: ]");
    }
}

