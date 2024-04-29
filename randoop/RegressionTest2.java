import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.Throwable[] throwableArray22 = serializationException21.getSuppressed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException5);
        int int7 = httpStatusException5.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException5.getSuppressed();
        int int9 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str11 = httpStatusException5.getUrl();
        int int12 = httpStatusException5.getStatusCode();
        java.lang.String str13 = httpStatusException5.getUrl();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        org.jsoup.HttpStatusException httpStatusException44 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray47 = serializationException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = serializationException46.getSuppressed();
        java.lang.Throwable[] throwableArray49 = serializationException46.getSuppressed();
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        org.jsoup.SerializationException serializationException51 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException50);
        org.jsoup.HttpStatusException httpStatusException55 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str56 = httpStatusException55.getUrl();
        int int57 = httpStatusException55.getStatusCode();
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException55);
        serializationException50.addSuppressed((java.lang.Throwable) httpStatusException55);
        httpStatusException44.addSuppressed((java.lang.Throwable) httpStatusException55);
        int int61 = httpStatusException55.getStatusCode();
        org.jsoup.SerializationException serializationException63 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray64 = serializationException63.getSuppressed();
        java.lang.Throwable[] throwableArray65 = serializationException63.getSuppressed();
        java.lang.Throwable[] throwableArray66 = serializationException63.getSuppressed();
        org.jsoup.SerializationException serializationException67 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException63);
        org.jsoup.SerializationException serializationException68 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException67);
        httpStatusException55.addSuppressed((java.lang.Throwable) serializationException68);
        java.lang.Throwable[] throwableArray70 = httpStatusException55.getSuppressed();
        int int71 = httpStatusException55.getStatusCode();
        org.jsoup.SerializationException serializationException72 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", (java.lang.Throwable) httpStatusException55);
        serializationException38.addSuppressed((java.lang.Throwable) httpStatusException55);
        int int74 = httpStatusException55.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.jsoup.HttpStatusException httpStatusException25 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int26 = httpStatusException25.getStatusCode();
        int int27 = httpStatusException25.getStatusCode();
        java.lang.String str28 = httpStatusException25.getUrl();
        java.lang.String str29 = httpStatusException25.getUrl();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException25);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException25);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException10);
        java.lang.Throwable[] throwableArray12 = httpStatusException10.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", (java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", 1, "hi!");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        int int13 = httpStatusException3.getStatusCode();
        java.lang.String str14 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.String str6 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str6, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        int int33 = httpStatusException31.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("hi!");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str26 = httpStatusException22.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str23, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]" + "'", str26, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        java.lang.Class<?> wildcardClass29 = httpStatusException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.SerializationException: " + "'", str9, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        int int34 = httpStatusException27.getStatusCode();
        java.lang.String str35 = httpStatusException27.getUrl();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (java.lang.Throwable) httpStatusException4);
        int int11 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException14);
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int21 = httpStatusException20.getStatusCode();
        int int22 = httpStatusException20.getStatusCode();
        java.lang.String str23 = httpStatusException20.getUrl();
        serializationException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray30 = serializationException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = serializationException29.getSuppressed();
        java.lang.Throwable[] throwableArray32 = serializationException29.getSuppressed();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException29);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        org.jsoup.HttpStatusException httpStatusException38 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str39 = httpStatusException38.getUrl();
        int int40 = httpStatusException38.getStatusCode();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException38);
        serializationException33.addSuppressed((java.lang.Throwable) httpStatusException38);
        java.lang.String str43 = httpStatusException38.getUrl();
        int int44 = httpStatusException38.getStatusCode();
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException38);
        serializationException16.addSuppressed((java.lang.Throwable) serializationException45);
        httpStatusException11.addSuppressed((java.lang.Throwable) serializationException45);
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray51 = serializationException50.getSuppressed();
        java.lang.Throwable[] throwableArray52 = serializationException50.getSuppressed();
        org.jsoup.SerializationException serializationException53 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException50);
        org.jsoup.HttpStatusException httpStatusException57 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException53.addSuppressed((java.lang.Throwable) httpStatusException57);
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException57);
        int int60 = httpStatusException11.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]", 97, "");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
        java.lang.String str6 = httpStatusException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.HttpStatusException: . Status=35, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str6, "org.jsoup.HttpStatusException: . Status=35, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.lang.String str27 = httpStatusException10.getUrl();
        java.lang.String str28 = httpStatusException10.getUrl();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=35, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException");
        serializationException20.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.HttpStatusException httpStatusException29 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 10, "");
        httpStatusException24.addSuppressed((java.lang.Throwable) httpStatusException29);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (int) (byte) 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException14);
        httpStatusException7.addSuppressed((java.lang.Throwable) serializationException15);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException15);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.SerializationException: ");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException15);
        java.lang.String str18 = httpStatusException11.getUrl();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        int int20 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        java.lang.String str22 = httpStatusException11.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException27);
        org.jsoup.HttpStatusException httpStatusException33 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int34 = httpStatusException33.getStatusCode();
        int int35 = httpStatusException33.getStatusCode();
        java.lang.String str36 = httpStatusException33.getUrl();
        serializationException29.addSuppressed((java.lang.Throwable) httpStatusException33);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException29);
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException29);
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray42 = serializationException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = serializationException41.getSuppressed();
        java.lang.Throwable[] throwableArray44 = serializationException41.getSuppressed();
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException41);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException45);
        org.jsoup.HttpStatusException httpStatusException51 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int52 = httpStatusException51.getStatusCode();
        int int53 = httpStatusException51.getStatusCode();
        org.jsoup.SerializationException serializationException54 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException51);
        serializationException45.addSuppressed((java.lang.Throwable) httpStatusException51);
        serializationException39.addSuppressed((java.lang.Throwable) httpStatusException51);
        int int57 = httpStatusException51.getStatusCode();
        int int58 = httpStatusException51.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str6, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException19);
        org.jsoup.HttpStatusException httpStatusException25 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int26 = httpStatusException25.getStatusCode();
        int int27 = httpStatusException25.getStatusCode();
        java.lang.String str28 = httpStatusException25.getUrl();
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException25);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        serializationException16.addSuppressed((java.lang.Throwable) serializationException30);
        org.jsoup.HttpStatusException httpStatusException35 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int36 = httpStatusException35.getStatusCode();
        serializationException30.addSuppressed((java.lang.Throwable) httpStatusException35);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException35);
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray46 = serializationException45.getSuppressed();
        httpStatusException43.addSuppressed((java.lang.Throwable) serializationException45);
        org.jsoup.SerializationException serializationException48 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException43);
        org.jsoup.SerializationException serializationException49 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException43);
        serializationException38.addSuppressed((java.lang.Throwable) httpStatusException43);
        httpStatusException13.addSuppressed((java.lang.Throwable) serializationException38);
        org.jsoup.SerializationException serializationException56 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray57 = serializationException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = serializationException56.getSuppressed();
        org.jsoup.SerializationException serializationException59 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException56);
        org.jsoup.SerializationException serializationException61 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException62 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException61);
        serializationException56.addSuppressed((java.lang.Throwable) serializationException61);
        org.jsoup.SerializationException serializationException64 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException61);
        org.jsoup.SerializationException serializationException65 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException61);
        org.jsoup.SerializationException serializationException66 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException65);
        org.jsoup.SerializationException serializationException69 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray70 = serializationException69.getSuppressed();
        java.lang.Throwable[] throwableArray71 = serializationException69.getSuppressed();
        java.lang.Throwable[] throwableArray72 = serializationException69.getSuppressed();
        org.jsoup.SerializationException serializationException73 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException69);
        org.jsoup.SerializationException serializationException74 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException73);
        org.jsoup.HttpStatusException httpStatusException78 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str79 = httpStatusException78.getUrl();
        int int80 = httpStatusException78.getStatusCode();
        org.jsoup.SerializationException serializationException81 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException78);
        serializationException73.addSuppressed((java.lang.Throwable) httpStatusException78);
        java.lang.String str83 = httpStatusException78.getUrl();
        int int84 = httpStatusException78.getStatusCode();
        org.jsoup.SerializationException serializationException85 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException78);
        serializationException66.addSuppressed((java.lang.Throwable) serializationException85);
        serializationException38.addSuppressed((java.lang.Throwable) serializationException85);
        java.lang.Throwable[] throwableArray88 = serializationException38.getSuppressed();
        java.lang.Class<?> wildcardClass89 = throwableArray88.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 97 + "'", int80 == 97);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.lang.Throwable[] throwableArray20 = httpStatusException16.getSuppressed();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) '4', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int25 = httpStatusException24.getStatusCode();
        int int26 = httpStatusException24.getStatusCode();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException24);
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) serializationException19);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str4, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        java.lang.String str14 = httpStatusException10.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str14, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (int) (byte) -1, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.lang.String str29 = httpStatusException16.getUrl();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.HttpStatusException httpStatusException29 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        serializationException22.addSuppressed((java.lang.Throwable) httpStatusException29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        java.lang.String str6 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        java.lang.String str7 = httpStatusException4.getUrl();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray12 = httpStatusException11.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str14 = httpStatusException4.getUrl();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str14, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str14 = httpStatusException13.getUrl();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException13);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException15);
        int int17 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray21 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = serializationException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = serializationException20.getSuppressed();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException20);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException24);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray28 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = serializationException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = serializationException27.getSuppressed();
        serializationException25.addSuppressed((java.lang.Throwable) serializationException27);
        org.jsoup.HttpStatusException httpStatusException35 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int36 = httpStatusException35.getStatusCode();
        int int37 = httpStatusException35.getStatusCode();
        serializationException25.addSuppressed((java.lang.Throwable) httpStatusException35);
        int int39 = httpStatusException35.getStatusCode();
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException35);
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException40);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException3);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
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
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray35 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray37 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray39 = serializationException34.getSuppressed();
        httpStatusException27.addSuppressed((java.lang.Throwable) serializationException34);
        org.jsoup.HttpStatusException httpStatusException44 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        httpStatusException27.addSuppressed((java.lang.Throwable) httpStatusException44);
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException27);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        java.lang.Throwable[] throwableArray48 = serializationException47.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=35, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.lang.Class<?> wildcardClass19 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]", (int) (byte) 100, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.lang.String str63 = serializationException62.toString();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str63, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.Throwable[] throwableArray22 = httpStatusException4.getSuppressed();
        int int23 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException9);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException10);
        java.lang.Throwable[] throwableArray12 = serializationException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.Throwable[] throwableArray15 = httpStatusException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str5, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        int int6 = httpStatusException4.getStatusCode();
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException4.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", 35, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.Throwable[] throwableArray18 = httpStatusException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray6 = httpStatusException5.getSuppressed();
        java.lang.String str7 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) httpStatusException5);
        int int12 = httpStatusException5.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (int) (byte) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.lang.Throwable[] throwableArray51 = serializationException34.getSuppressed();
        java.lang.Class<?> wildcardClass52 = serializationException34.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", 10, "org.jsoup.SerializationException: org.jsoup.SerializationException");
        java.lang.Class<?> wildcardClass4 = httpStatusException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.String str29 = httpStatusException11.getUrl();
        java.lang.String str30 = httpStatusException11.getUrl();
        java.lang.String str31 = httpStatusException11.getUrl();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str8 = httpStatusException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str8, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 32, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        int int28 = httpStatusException22.getStatusCode();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray34 = serializationException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = serializationException33.getSuppressed();
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]", (java.lang.Throwable) serializationException37);
        httpStatusException22.addSuppressed((java.lang.Throwable) serializationException37);
        java.lang.String str40 = httpStatusException22.getUrl();
        int int41 = httpStatusException22.getStatusCode();
        int int42 = httpStatusException22.getStatusCode();
        org.jsoup.SerializationException serializationException43 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException22);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.lang.Class<?> wildcardClass35 = throwableArray34.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str44 = httpStatusException43.getUrl();
        java.lang.String str45 = httpStatusException43.getUrl();
        java.lang.String str46 = httpStatusException43.getUrl();
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException43);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException47);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.String str53 = httpStatusException3.toString();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str53, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.String str8 = httpStatusException3.getUrl();
        int int9 = httpStatusException3.getStatusCode();
        java.lang.String str10 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray11 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.lang.String str28 = httpStatusException11.getUrl();
        org.jsoup.SerializationException serializationException29 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]", (java.lang.Throwable) httpStatusException11);
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
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray5 = httpStatusException3.getSuppressed();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.String str7 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str7, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str14 = httpStatusException13.getUrl();
        int int15 = httpStatusException13.getStatusCode();
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException13);
        serializationException8.addSuppressed((java.lang.Throwable) httpStatusException13);
        java.lang.String str18 = httpStatusException13.getUrl();
        int int19 = httpStatusException13.getStatusCode();
        int int20 = httpStatusException13.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int25 = httpStatusException24.getStatusCode();
        int int26 = httpStatusException24.getStatusCode();
        java.lang.String str27 = httpStatusException24.getUrl();
        int int28 = httpStatusException24.getStatusCode();
        httpStatusException13.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException13);
        java.lang.String str31 = httpStatusException13.getUrl();
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException32);
        java.lang.Class<?> wildcardClass34 = serializationException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (byte) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException11);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException12);
        java.lang.Throwable[] throwableArray15 = serializationException14.getSuppressed();
        java.lang.Class<?> wildcardClass16 = serializationException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException5);
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int14 = httpStatusException13.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str33 = httpStatusException32.getUrl();
        int int34 = httpStatusException32.getStatusCode();
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException32);
        serializationException27.addSuppressed((java.lang.Throwable) httpStatusException32);
        java.lang.String str37 = httpStatusException32.getUrl();
        int int38 = httpStatusException32.getStatusCode();
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException32);
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException32);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException32);
        org.jsoup.HttpStatusException httpStatusException45 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str46 = httpStatusException45.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException45);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str46, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.lang.Class<?> wildcardClass20 = serializationException19.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException10.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException10.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException19);
        serializationException10.addSuppressed((java.lang.Throwable) serializationException20);
        httpStatusException8.addSuppressed((java.lang.Throwable) serializationException20);
        serializationException4.addSuppressed((java.lang.Throwable) serializationException20);
        java.lang.Throwable[] throwableArray24 = serializationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = serializationException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException4);
        java.lang.Throwable[] throwableArray9 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]", (java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException10);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int6 = httpStatusException5.getStatusCode();
        int int7 = httpStatusException5.getStatusCode();
        java.lang.String str8 = httpStatusException5.getUrl();
        int int9 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException5);
        java.lang.String str11 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        java.lang.String str42 = serializationException11.toString();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str42, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray10 = serializationException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException9.getSuppressed();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException16);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException12);
        java.lang.Throwable[] throwableArray19 = serializationException12.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str24 = httpStatusException23.getUrl();
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        int int26 = httpStatusException23.getStatusCode();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        serializationException12.addSuppressed((java.lang.Throwable) httpStatusException23);
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str24, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = serializationException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) -1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        int int5 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray6 = httpStatusException4.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException13);
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int20 = httpStatusException19.getStatusCode();
        int int21 = httpStatusException19.getStatusCode();
        java.lang.String str22 = httpStatusException19.getUrl();
        java.lang.String str23 = httpStatusException19.getUrl();
        serializationException13.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.jsoup.SerializationException serializationException25 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException19);
        httpStatusException10.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException31);
        httpStatusException19.addSuppressed((java.lang.Throwable) serializationException32);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException32);
        java.lang.String str35 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.Throwable[] throwableArray19 = httpStatusException4.getSuppressed();
        java.lang.Class<?> wildcardClass20 = httpStatusException4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (int) (byte) 100, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int9 = httpStatusException8.getStatusCode();
        serializationException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException3);
        java.lang.String str13 = serializationException12.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str13, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]", (java.lang.Throwable) serializationException3);
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) serializationException4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str11 = httpStatusException10.getUrl();
        int int12 = httpStatusException10.getStatusCode();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        org.jsoup.HttpStatusException httpStatusException18 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        int int19 = httpStatusException18.getStatusCode();
        serializationException14.addSuppressed((java.lang.Throwable) httpStatusException18);
        int int21 = httpStatusException18.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException18);
        int int23 = httpStatusException18.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (short) 0, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException31);
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.Class<?> wildcardClass64 = serializationException63.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (int) (short) 1, "org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str35 = httpStatusException4.getUrl();
        java.lang.String str36 = httpStatusException4.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]" + "'", str36, "org.jsoup.HttpStatusException: . Status=100, URL=[hi!]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException10);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.lang.Class<?> wildcardClass32 = serializationException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int8 = httpStatusException7.getStatusCode();
        serializationException2.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.Throwable[] throwableArray10 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=35, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        int int10 = httpStatusException3.getStatusCode();
        java.lang.String str11 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) '4', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", 1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.lang.Class<?> wildcardClass19 = httpStatusException16.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str17, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException5);
        int int8 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 32, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        int int14 = httpStatusException13.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.jsoup.SerializationException serializationException23 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray24 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException23.getSuppressed();
        java.lang.Throwable[] throwableArray26 = serializationException23.getSuppressed();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException23);
        org.jsoup.SerializationException serializationException28 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException27);
        org.jsoup.HttpStatusException httpStatusException32 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str33 = httpStatusException32.getUrl();
        int int34 = httpStatusException32.getStatusCode();
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException32);
        serializationException27.addSuppressed((java.lang.Throwable) httpStatusException32);
        java.lang.String str37 = httpStatusException32.getUrl();
        int int38 = httpStatusException32.getStatusCode();
        org.jsoup.SerializationException serializationException39 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException32);
        org.jsoup.SerializationException serializationException40 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException32);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException32);
        java.lang.Class<?> wildcardClass42 = httpStatusException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.lang.String str19 = httpStatusException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str19, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray35 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray37 = serializationException34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = serializationException34.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException43);
        serializationException34.addSuppressed((java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException46);
        org.jsoup.HttpStatusException httpStatusException51 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str52 = httpStatusException51.getUrl();
        serializationException46.addSuppressed((java.lang.Throwable) httpStatusException51);
        java.lang.String str54 = httpStatusException51.getUrl();
        httpStatusException17.addSuppressed((java.lang.Throwable) httpStatusException51);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str52, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str54, "org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=32, URL=[org.jsoup.SerializationException: ]", 10, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = serializationException7.getSuppressed();
        java.lang.Throwable[] throwableArray11 = serializationException7.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException16);
        serializationException7.addSuppressed((java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException17);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException19);
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str25 = httpStatusException24.getUrl();
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException24);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.jsoup.HttpStatusException httpStatusException31 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str32 = httpStatusException31.getUrl();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException31);
        java.lang.String str34 = httpStatusException31.getUrl();
        java.lang.Throwable[] throwableArray35 = httpStatusException31.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException31);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str25, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str32, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str34, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (-1), "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str5 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        int int7 = httpStatusException4.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException13 = new org.jsoup.HttpStatusException("hi!", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException19);
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException19);
        org.jsoup.HttpStatusException httpStatusException25 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int26 = httpStatusException25.getStatusCode();
        int int27 = httpStatusException25.getStatusCode();
        java.lang.String str28 = httpStatusException25.getUrl();
        serializationException21.addSuppressed((java.lang.Throwable) httpStatusException25);
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException21);
        serializationException16.addSuppressed((java.lang.Throwable) serializationException30);
        org.jsoup.HttpStatusException httpStatusException35 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int36 = httpStatusException35.getStatusCode();
        serializationException30.addSuppressed((java.lang.Throwable) httpStatusException35);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException35);
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException45 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray46 = serializationException45.getSuppressed();
        httpStatusException43.addSuppressed((java.lang.Throwable) serializationException45);
        org.jsoup.SerializationException serializationException48 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException43);
        org.jsoup.SerializationException serializationException49 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException43);
        serializationException38.addSuppressed((java.lang.Throwable) httpStatusException43);
        httpStatusException13.addSuppressed((java.lang.Throwable) serializationException38);
        java.lang.String str52 = httpStatusException13.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.jsoup.HttpStatusException: hi!. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]" + "'", str52, "org.jsoup.HttpStatusException: hi!. Status=1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int4 = httpStatusException3.getStatusCode();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
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
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        java.lang.Throwable[] throwableArray5 = httpStatusException4.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.lang.Class<?> wildcardClass33 = serializationException27.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.Throwable[] throwableArray21 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (int) 'a', "org.jsoup.HttpStatusException: . Status=35, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        java.lang.String str8 = httpStatusException3.getUrl();
        java.lang.String str9 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: " + "'", str7, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("", (int) (short) 1, "hi!");
        httpStatusException13.addSuppressed((java.lang.Throwable) httpStatusException22);
        java.lang.Class<?> wildcardClass24 = httpStatusException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.SerializationException: " + "'", str16, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException", (int) (byte) 1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        java.lang.Throwable[] throwableArray6 = httpStatusException3.getSuppressed();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass8 = httpStatusException3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.String str31 = httpStatusException17.getUrl();
        org.jsoup.SerializationException serializationException33 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray34 = serializationException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = serializationException33.getSuppressed();
        java.lang.Throwable[] throwableArray36 = serializationException33.getSuppressed();
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException33);
        org.jsoup.SerializationException serializationException38 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException37);
        org.jsoup.HttpStatusException httpStatusException43 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int44 = httpStatusException43.getStatusCode();
        int int45 = httpStatusException43.getStatusCode();
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException43);
        serializationException37.addSuppressed((java.lang.Throwable) httpStatusException43);
        java.lang.String str48 = httpStatusException43.getUrl();
        int int49 = httpStatusException43.getStatusCode();
        httpStatusException17.addSuppressed((java.lang.Throwable) httpStatusException43);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        serializationException3.addSuppressed((java.lang.Throwable) serializationException8);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException11);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", throwable1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        int int13 = httpStatusException12.getStatusCode();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException12);
        java.lang.String str15 = httpStatusException12.getUrl();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException12);
        java.lang.Throwable[] throwableArray17 = httpStatusException12.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException22 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int23 = httpStatusException22.getStatusCode();
        int int24 = httpStatusException22.getStatusCode();
        java.lang.String str25 = httpStatusException22.getUrl();
        java.lang.String str26 = httpStatusException22.getUrl();
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException22);
        httpStatusException12.addSuppressed((java.lang.Throwable) httpStatusException22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        java.lang.Throwable[] throwableArray11 = httpStatusException9.getSuppressed();
        java.lang.String str12 = httpStatusException9.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str12, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray7 = httpStatusException4.getSuppressed();
        java.lang.String str8 = httpStatusException4.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.SerializationException: " + "'", str8, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray15 = serializationException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = serializationException14.getSuppressed();
        java.lang.Throwable[] throwableArray17 = serializationException14.getSuppressed();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException14);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException18);
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str24 = httpStatusException23.getUrl();
        int int25 = httpStatusException23.getStatusCode();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException23);
        serializationException18.addSuppressed((java.lang.Throwable) httpStatusException23);
        httpStatusException12.addSuppressed((java.lang.Throwable) httpStatusException23);
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 0, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=97, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]]", (java.lang.Throwable) serializationException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        java.lang.String str11 = httpStatusException4.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) 1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str13 = httpStatusException12.getUrl();
        int int14 = httpStatusException12.getStatusCode();
        int int15 = httpStatusException12.getStatusCode();
        java.lang.Throwable[] throwableArray16 = httpStatusException12.getSuppressed();
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        int int18 = httpStatusException8.getStatusCode();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.String str20 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException16);
        serializationException11.addSuppressed((java.lang.Throwable) serializationException16);
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException16);
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
        int int37 = httpStatusException30.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException41 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int42 = httpStatusException41.getStatusCode();
        int int43 = httpStatusException41.getStatusCode();
        java.lang.String str44 = httpStatusException41.getUrl();
        int int45 = httpStatusException41.getStatusCode();
        httpStatusException30.addSuppressed((java.lang.Throwable) httpStatusException41);
        serializationException19.addSuppressed((java.lang.Throwable) httpStatusException41);
        org.jsoup.SerializationException serializationException48 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException19);
        serializationException6.addSuppressed((java.lang.Throwable) serializationException48);
        java.lang.Throwable[] throwableArray50 = serializationException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int5 = httpStatusException4.getStatusCode();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("", (java.lang.Throwable) httpStatusException4);
        java.lang.String str10 = httpStatusException4.getUrl();
        java.lang.String str11 = httpStatusException4.getUrl();
        java.lang.Throwable[] throwableArray12 = httpStatusException4.getSuppressed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) (short) 10, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (short) -1, "");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) (byte) -1, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray4 = serializationException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = serializationException3.getSuppressed();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        java.lang.String str15 = serializationException7.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str15, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str6 = httpStatusException5.getUrl();
        java.lang.Throwable[] throwableArray7 = httpStatusException5.getSuppressed();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]", (java.lang.Throwable) httpStatusException5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException5);
        java.lang.String str7 = serializationException6.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]" + "'", str7, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Class<?> wildcardClass5 = serializationException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=10, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", 0, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]. Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.lang.String str20 = httpStatusException18.getUrl();
        java.lang.String str21 = httpStatusException18.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        java.lang.Class<?> wildcardClass35 = serializationException33.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) '#', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        int int7 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("hi!");
        java.lang.Throwable[] throwableArray11 = serializationException10.getSuppressed();
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        int int16 = httpStatusException15.getStatusCode();
        serializationException10.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException10);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException10);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) serializationException10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        int int19 = httpStatusException12.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException23 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int24 = httpStatusException23.getStatusCode();
        int int25 = httpStatusException23.getStatusCode();
        java.lang.String str26 = httpStatusException23.getUrl();
        int int27 = httpStatusException23.getStatusCode();
        httpStatusException12.addSuppressed((java.lang.Throwable) httpStatusException23);
        java.lang.String str29 = httpStatusException23.getUrl();
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException23);
        org.jsoup.SerializationException serializationException31 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) serializationException30);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (int) (short) 1, "");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        java.lang.String str31 = httpStatusException11.getUrl();
        java.lang.Throwable throwable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException11.addSuppressed(throwable32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException14);
        httpStatusException10.addSuppressed((java.lang.Throwable) httpStatusException14);
        serializationException6.addSuppressed((java.lang.Throwable) httpStatusException14);
        java.lang.String str18 = httpStatusException14.getUrl();
        java.lang.Throwable[] throwableArray19 = httpStatusException14.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.String str39 = httpStatusException33.getUrl();
        int int40 = httpStatusException33.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str39, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str13 = httpStatusException12.getUrl();
        int int14 = httpStatusException12.getStatusCode();
        int int15 = httpStatusException12.getStatusCode();
        int int16 = httpStatusException12.getStatusCode();
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException12);
        java.lang.String str18 = httpStatusException8.getUrl();
        java.lang.Throwable[] throwableArray19 = httpStatusException8.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray21 = httpStatusException8.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        java.lang.String str5 = serializationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: " + "'", str5, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]]", 10, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.String str53 = httpStatusException3.getUrl();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str53, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.lang.String str30 = serializationException29.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!" + "'", str30, "org.jsoup.SerializationException: org.jsoup.SerializationException: hi!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.Throwable[] throwableArray24 = serializationException21.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=35, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", 100, "");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        org.jsoup.SerializationException serializationException62 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray63 = serializationException62.getSuppressed();
        java.lang.Throwable[] throwableArray64 = serializationException62.getSuppressed();
        org.jsoup.SerializationException serializationException65 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException62);
        org.jsoup.SerializationException serializationException67 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException68 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException67);
        serializationException62.addSuppressed((java.lang.Throwable) serializationException67);
        org.jsoup.SerializationException serializationException72 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException73 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException72);
        org.jsoup.SerializationException serializationException74 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException72);
        serializationException62.addSuppressed((java.lang.Throwable) serializationException72);
        org.jsoup.SerializationException serializationException77 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray78 = serializationException77.getSuppressed();
        java.lang.Throwable[] throwableArray79 = serializationException77.getSuppressed();
        serializationException62.addSuppressed((java.lang.Throwable) serializationException77);
        serializationException56.addSuppressed((java.lang.Throwable) serializationException62);
        java.lang.Class<?> wildcardClass82 = serializationException56.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.Throwable throwable0 = null;
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException(throwable0);
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException(throwable0);
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = serializationException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]", (int) (short) 1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) (short) 1, "hi!");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.lang.String str35 = serializationException34.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]" + "'", str35, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", 1, "");
        int int5 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        java.lang.Throwable[] throwableArray50 = serializationException46.getSuppressed();
        java.lang.Class<?> wildcardClass51 = throwableArray50.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.SerializationException: hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str4, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str21 = httpStatusException20.getUrl();
        serializationException15.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.String str23 = httpStatusException20.getUrl();
        java.lang.Class<?> wildcardClass24 = httpStatusException20.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str21, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str23, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable[] throwableArray11 = httpStatusException8.getSuppressed();
        java.lang.Throwable[] throwableArray12 = httpStatusException8.getSuppressed();
        java.lang.Throwable[] throwableArray13 = httpStatusException8.getSuppressed();
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        java.lang.Throwable throwable16 = null;
        org.jsoup.SerializationException serializationException17 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", throwable16);
        serializationException14.addSuppressed((java.lang.Throwable) serializationException17);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) (byte) 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.String str21 = httpStatusException4.getUrl();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str21, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]", (int) '4', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]");
        java.lang.String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]. Status=52, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]. Status=1, URL=[]. Status=52, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]]");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str5 = httpStatusException4.getUrl();
        int int6 = httpStatusException4.getStatusCode();
        java.lang.String str7 = httpStatusException4.getUrl();
        int int8 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass11 = httpStatusException4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        serializationException2.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException7);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        java.lang.Throwable[] throwableArray16 = httpStatusException15.getSuppressed();
        int int17 = httpStatusException15.getStatusCode();
        serializationException11.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int4 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.String str39 = httpStatusException33.getUrl();
        org.jsoup.HttpStatusException httpStatusException44 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str45 = httpStatusException44.getUrl();
        int int46 = httpStatusException44.getStatusCode();
        int int47 = httpStatusException44.getStatusCode();
        java.lang.Throwable[] throwableArray48 = httpStatusException44.getSuppressed();
        java.lang.String str49 = httpStatusException44.getUrl();
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException44);
        java.lang.Throwable[] throwableArray51 = serializationException50.getSuppressed();
        org.jsoup.SerializationException serializationException52 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]", (java.lang.Throwable) serializationException50);
        httpStatusException33.addSuppressed((java.lang.Throwable) serializationException50);
        java.lang.String str54 = httpStatusException33.getUrl();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str39, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str54, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.jsoup.SerializationException serializationException30 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]");
        org.jsoup.HttpStatusException httpStatusException34 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int35 = httpStatusException34.getStatusCode();
        int int36 = httpStatusException34.getStatusCode();
        java.lang.String str37 = httpStatusException34.getUrl();
        java.lang.String str38 = httpStatusException34.getUrl();
        org.jsoup.HttpStatusException httpStatusException42 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "org.jsoup.SerializationException: ");
        httpStatusException34.addSuppressed((java.lang.Throwable) httpStatusException42);
        org.jsoup.HttpStatusException httpStatusException48 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int49 = httpStatusException48.getStatusCode();
        int int50 = httpStatusException48.getStatusCode();
        org.jsoup.SerializationException serializationException51 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException48);
        org.jsoup.SerializationException serializationException54 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray55 = serializationException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = serializationException54.getSuppressed();
        java.lang.Throwable[] throwableArray57 = serializationException54.getSuppressed();
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException54);
        org.jsoup.SerializationException serializationException59 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException58);
        org.jsoup.SerializationException serializationException61 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray62 = serializationException61.getSuppressed();
        java.lang.Throwable[] throwableArray63 = serializationException61.getSuppressed();
        java.lang.Throwable[] throwableArray64 = serializationException61.getSuppressed();
        serializationException59.addSuppressed((java.lang.Throwable) serializationException61);
        serializationException51.addSuppressed((java.lang.Throwable) serializationException59);
        httpStatusException42.addSuppressed((java.lang.Throwable) serializationException59);
        java.lang.String str68 = httpStatusException42.getUrl();
        serializationException30.addSuppressed((java.lang.Throwable) httpStatusException42);
        serializationException18.addSuppressed((java.lang.Throwable) serializationException30);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "org.jsoup.SerializationException: " + "'", str68, "org.jsoup.SerializationException: ");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        java.lang.String str10 = httpStatusException8.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        int int12 = httpStatusException8.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException16 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException20 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException20);
        httpStatusException16.addSuppressed((java.lang.Throwable) httpStatusException20);
        java.lang.String str23 = httpStatusException16.getUrl();
        org.jsoup.SerializationException serializationException24 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        int int25 = httpStatusException16.getStatusCode();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException16);
        java.lang.String str27 = httpStatusException16.getUrl();
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException16);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException16);
        java.lang.String str30 = httpStatusException16.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: hi!" + "'", str4, "org.jsoup.SerializationException: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (int) 'a', "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]" + "'", str5, "org.jsoup.HttpStatusException: . Status=1, URL=[hi!]");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (java.lang.Throwable) serializationException28);
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        org.jsoup.SerializationException serializationException34 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException33);
        java.lang.Class<?> wildcardClass35 = serializationException33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.lang.Throwable[] throwableArray19 = httpStatusException13.getSuppressed();
        int int20 = httpStatusException13.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.SerializationException: " + "'", str16, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.SerializationException: " + "'", str18, "org.jsoup.SerializationException: ");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        org.jsoup.HttpStatusException httpStatusException44 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException46 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray47 = serializationException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = serializationException46.getSuppressed();
        java.lang.Throwable[] throwableArray49 = serializationException46.getSuppressed();
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException46);
        org.jsoup.SerializationException serializationException51 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException50);
        org.jsoup.HttpStatusException httpStatusException55 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str56 = httpStatusException55.getUrl();
        int int57 = httpStatusException55.getStatusCode();
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException55);
        serializationException50.addSuppressed((java.lang.Throwable) httpStatusException55);
        httpStatusException44.addSuppressed((java.lang.Throwable) httpStatusException55);
        int int61 = httpStatusException55.getStatusCode();
        org.jsoup.SerializationException serializationException63 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray64 = serializationException63.getSuppressed();
        java.lang.Throwable[] throwableArray65 = serializationException63.getSuppressed();
        java.lang.Throwable[] throwableArray66 = serializationException63.getSuppressed();
        org.jsoup.SerializationException serializationException67 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException63);
        org.jsoup.SerializationException serializationException68 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException67);
        httpStatusException55.addSuppressed((java.lang.Throwable) serializationException68);
        java.lang.Throwable[] throwableArray70 = httpStatusException55.getSuppressed();
        int int71 = httpStatusException55.getStatusCode();
        org.jsoup.SerializationException serializationException72 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=-1, URL=[hi!]", (java.lang.Throwable) httpStatusException55);
        serializationException38.addSuppressed((java.lang.Throwable) httpStatusException55);
        java.lang.Throwable[] throwableArray74 = httpStatusException55.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray33 = serializationException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = serializationException32.getSuppressed();
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException32);
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException32);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]", (java.lang.Throwable) serializationException36);
        httpStatusException21.addSuppressed((java.lang.Throwable) serializationException36);
        java.lang.String str39 = httpStatusException21.getUrl();
        int int40 = httpStatusException21.getStatusCode();
        int int41 = httpStatusException21.getStatusCode();
        java.lang.String str42 = httpStatusException21.toString();
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
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]" + "'", str42, "org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        org.jsoup.SerializationException serializationException22 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray23 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = serializationException22.getSuppressed();
        java.lang.Throwable[] throwableArray25 = serializationException22.getSuppressed();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException22);
        org.jsoup.SerializationException serializationException27 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException26);
        httpStatusException14.addSuppressed((java.lang.Throwable) serializationException27);
        java.lang.Throwable[] throwableArray29 = httpStatusException14.getSuppressed();
        java.lang.String str30 = httpStatusException14.getUrl();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        java.lang.String str8 = httpStatusException3.getUrl();
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (-1), "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException4);
        java.lang.Class<?> wildcardClass6 = httpStatusException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException8);
        java.lang.String str14 = httpStatusException8.getUrl();
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
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException25);
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException25);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray38 = serializationException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = serializationException37.getSuppressed();
        java.lang.Throwable[] throwableArray40 = serializationException37.getSuppressed();
        org.jsoup.SerializationException serializationException41 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException37);
        org.jsoup.SerializationException serializationException42 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException41);
        org.jsoup.SerializationException serializationException44 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray45 = serializationException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = serializationException44.getSuppressed();
        org.jsoup.SerializationException serializationException47 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException49 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException50 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException49);
        serializationException44.addSuppressed((java.lang.Throwable) serializationException49);
        serializationException42.addSuppressed((java.lang.Throwable) serializationException44);
        org.jsoup.SerializationException serializationException53 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException44);
        java.lang.Throwable[] throwableArray54 = serializationException53.getSuppressed();
        org.jsoup.SerializationException serializationException55 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException53);
        org.jsoup.SerializationException serializationException56 = new org.jsoup.SerializationException("", (java.lang.Throwable) serializationException55);
        httpStatusException4.addSuppressed((java.lang.Throwable) serializationException56);
        org.jsoup.SerializationException serializationException58 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException7);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        java.lang.String str10 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str12 = httpStatusException3.getUrl();
        java.lang.String str13 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]" + "'", str13, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=10, URL=[]");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.lang.String str19 = serializationException18.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]" + "'", str19, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException5);
        int int8 = httpStatusException5.getStatusCode();
        java.lang.String str9 = httpStatusException5.getUrl();
        int int10 = httpStatusException5.getStatusCode();
        java.lang.Class<?> wildcardClass11 = httpStatusException5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.String str21 = httpStatusException14.getUrl();
        int int22 = httpStatusException14.getStatusCode();
        int int23 = httpStatusException14.getStatusCode();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        java.lang.String str6 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.HttpStatusException httpStatusException12 = new org.jsoup.HttpStatusException("", (int) (short) 0, "org.jsoup.SerializationException: hi!");
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) httpStatusException12);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException13);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (java.lang.Throwable) serializationException13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException8);
        java.lang.String str15 = serializationException14.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str15, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", 1, "org.jsoup.SerializationException: hi!");
        int int4 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray8 = serializationException7.getSuppressed();
        httpStatusException5.addSuppressed((java.lang.Throwable) serializationException7);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        java.lang.Throwable[] throwableArray13 = serializationException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = serializationException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) (byte) 0, "");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str6 = serializationException5.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]" + "'", str6, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) (byte) 10, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.Throwable[] throwableArray23 = httpStatusException17.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException4);
        org.jsoup.HttpStatusException httpStatusException10 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException10);
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException10);
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException10);
        java.lang.String str14 = serializationException13.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str14, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.jsoup.HttpStatusException httpStatusException52 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException52);
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
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", (int) (byte) -1, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=-1, URL=[hi!]");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) ' ', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=10, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", 100, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]" + "'", str5, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", (int) 'a', "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", (int) '#', "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: hi!. Status=100, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=1, URL=[hi!]", (int) ' ', "org.jsoup.SerializationException: org.jsoup.SerializationException");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        int int6 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException" + "'", str5, "org.jsoup.SerializationException: org.jsoup.SerializationException");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (-1), "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]. Status=1, URL=[hi!]");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        java.lang.Throwable[] throwableArray15 = serializationException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = httpStatusException3.getSuppressed();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException6);
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[]", (int) (short) 0, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]");
        serializationException7.addSuppressed((java.lang.Throwable) httpStatusException11);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        org.jsoup.SerializationException serializationException32 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray33 = serializationException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = serializationException32.getSuppressed();
        org.jsoup.SerializationException serializationException35 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException32);
        org.jsoup.SerializationException serializationException36 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) serializationException32);
        org.jsoup.SerializationException serializationException37 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]", (java.lang.Throwable) serializationException36);
        httpStatusException21.addSuppressed((java.lang.Throwable) serializationException36);
        java.lang.String str39 = httpStatusException21.getUrl();
        int int40 = httpStatusException21.getStatusCode();
        java.lang.Throwable[] throwableArray41 = httpStatusException21.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        java.lang.String str6 = httpStatusException3.getUrl();
        java.lang.String str7 = httpStatusException3.getUrl();
        int int8 = httpStatusException3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=-1, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]]", (int) (byte) 10, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (int) (byte) 1, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]]", (java.lang.Throwable) httpStatusException5);
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]", (java.lang.Throwable) httpStatusException5);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=1, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=10, URL=[]", (-1), "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException4);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.HttpStatusException httpStatusException6 = new org.jsoup.HttpStatusException("", (int) (short) 100, "hi!");
        org.jsoup.SerializationException serializationException7 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException6);
        java.lang.Throwable[] throwableArray9 = httpStatusException6.getSuppressed();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]", (java.lang.Throwable) httpStatusException6);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException10);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]", 97, "org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]. Status=-1, URL=[org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]]");
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) (short) 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
        int int4 = httpStatusException3.getStatusCode();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]" + "'", str5, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: hi!. Status=-1, URL=[]");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        org.jsoup.SerializationException serializationException3 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) serializationException2);
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException3);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException4);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=32, URL=[org.jsoup.SerializationException: ]", (-1), "hi!");
        org.jsoup.HttpStatusException httpStatusException7 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException7);
        int int9 = httpStatusException7.getStatusCode();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        int int36 = httpStatusException3.getStatusCode();
        java.lang.Throwable throwable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            httpStatusException3.addSuppressed(throwable37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.Throwable throwable1 = null;
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: hi!", throwable1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=97, URL=[hi!]");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException4 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]", (java.lang.Throwable) serializationException2);
        java.lang.Throwable[] throwableArray5 = serializationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: . Status=100, URL=[hi!]", 1, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str4, "org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jsoup.HttpStatusException httpStatusException5 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (-1), "");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("hi!", (java.lang.Throwable) httpStatusException5);
        int int7 = httpStatusException5.getStatusCode();
        java.lang.Throwable[] throwableArray8 = httpStatusException5.getSuppressed();
        int int9 = httpStatusException5.getStatusCode();
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]", (java.lang.Throwable) httpStatusException5);
        java.lang.String str11 = httpStatusException5.getUrl();
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException8);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException8);
        org.jsoup.HttpStatusException httpStatusException14 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException19 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: org.jsoup.SerializationException: ", (int) (short) 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException19);
        httpStatusException14.addSuppressed((java.lang.Throwable) httpStatusException19);
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException19);
        org.jsoup.HttpStatusException httpStatusException26 = new org.jsoup.HttpStatusException("org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]. Status=100, URL=[org.jsoup.HttpStatusException: . Status=97, URL=[org.jsoup.SerializationException: ]]. Status=32, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: . Status=1, URL=[]]", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: hi!. Status=100, URL=[hi!]");
        httpStatusException8.addSuppressed((java.lang.Throwable) httpStatusException26);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 10, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray7 = serializationException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException6.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException6);
        java.lang.Throwable[] throwableArray10 = serializationException6.getSuppressed();
        httpStatusException3.addSuppressed((java.lang.Throwable) serializationException6);
        org.jsoup.SerializationException serializationException12 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        java.lang.String str13 = httpStatusException3.getUrl();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]" + "'", str13, "org.jsoup.SerializationException: org.jsoup.HttpStatusException: . Status=0, URL=[org.jsoup.SerializationException: org.jsoup.SerializationException: ]");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str4 = httpStatusException3.getUrl();
        java.lang.String str5 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException6 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.HttpStatusException httpStatusException11 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 10, "");
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: ", (int) ' ', "org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException15);
        httpStatusException11.addSuppressed((java.lang.Throwable) httpStatusException15);
        java.lang.String str18 = httpStatusException11.getUrl();
        org.jsoup.SerializationException serializationException19 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        int int20 = httpStatusException11.getStatusCode();
        org.jsoup.SerializationException serializationException21 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException11);
        java.lang.String str22 = httpStatusException11.getUrl();
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException11);
        java.lang.String str24 = httpStatusException11.getUrl();
        java.lang.String str25 = httpStatusException11.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        int int6 = httpStatusException3.getStatusCode();
        int int7 = httpStatusException3.getStatusCode();
        org.jsoup.SerializationException serializationException8 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.SerializationException: org.jsoup.SerializationException: " + "'", str4, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        org.jsoup.HttpStatusException httpStatusException24 = new org.jsoup.HttpStatusException("", (int) (byte) 1, "hi!");
        java.lang.String str25 = httpStatusException24.getUrl();
        org.jsoup.SerializationException serializationException26 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException24);
        httpStatusException3.addSuppressed((java.lang.Throwable) httpStatusException24);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.SerializationException serializationException1 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException1);
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray6 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = serializationException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = serializationException5.getSuppressed();
        org.jsoup.SerializationException serializationException9 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException5);
        org.jsoup.SerializationException serializationException10 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException9);
        org.jsoup.HttpStatusException httpStatusException15 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        int int16 = httpStatusException15.getStatusCode();
        int int17 = httpStatusException15.getStatusCode();
        org.jsoup.SerializationException serializationException18 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) httpStatusException15);
        serializationException9.addSuppressed((java.lang.Throwable) httpStatusException15);
        org.jsoup.SerializationException serializationException20 = new org.jsoup.SerializationException("org.jsoup.SerializationException: org.jsoup.SerializationException: hi!", (java.lang.Throwable) httpStatusException15);
        serializationException1.addSuppressed((java.lang.Throwable) serializationException20);
        java.lang.Throwable[] throwableArray22 = serializationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.String str20 = httpStatusException18.getUrl();
        java.lang.Class<?> wildcardClass21 = httpStatusException18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.HttpStatusException httpStatusException4 = new org.jsoup.HttpStatusException("", (int) 'a', "org.jsoup.SerializationException: ");
        org.jsoup.HttpStatusException httpStatusException8 = new org.jsoup.HttpStatusException("", (int) 'a', "hi!");
        java.lang.String str9 = httpStatusException8.getUrl();
        int int10 = httpStatusException8.getStatusCode();
        int int11 = httpStatusException8.getStatusCode();
        java.lang.Throwable[] throwableArray12 = httpStatusException8.getSuppressed();
        httpStatusException4.addSuppressed((java.lang.Throwable) httpStatusException8);
        int int14 = httpStatusException4.getStatusCode();
        org.jsoup.SerializationException serializationException15 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException4);
        org.jsoup.SerializationException serializationException16 = new org.jsoup.SerializationException("org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=0, URL=[org.jsoup.HttpStatusException: org.jsoup.SerializationException: org.jsoup.SerializationException: . Status=-1, URL=[]]", (java.lang.Throwable) serializationException15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.SerializationException serializationException2 = new org.jsoup.SerializationException("");
        java.lang.Throwable[] throwableArray3 = serializationException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = serializationException2.getSuppressed();
        org.jsoup.SerializationException serializationException5 = new org.jsoup.SerializationException("org.jsoup.SerializationException: ", (java.lang.Throwable) serializationException2);
        org.jsoup.HttpStatusException httpStatusException9 = new org.jsoup.HttpStatusException("org.jsoup.SerializationException: hi!", 0, "org.jsoup.SerializationException: org.jsoup.SerializationException: ");
        serializationException5.addSuppressed((java.lang.Throwable) httpStatusException9);
        org.jsoup.SerializationException serializationException11 = new org.jsoup.SerializationException((java.lang.Throwable) httpStatusException9);
        java.lang.Throwable[] throwableArray12 = serializationException11.getSuppressed();
        org.jsoup.SerializationException serializationException13 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException11);
        org.jsoup.SerializationException serializationException14 = new org.jsoup.SerializationException((java.lang.Throwable) serializationException13);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray12);
    }
}

