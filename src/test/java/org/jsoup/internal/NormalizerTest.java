package org.jsoup.internal;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.jsoup.internal.StringUtil.normaliseWhitespace;
import static org.jsoup.internal.StringUtil.resolve;
import static org.junit.jupiter.api.Assertions.*;

public class NormalizerTest {

    @Test
    public void normalizerTests() {
        assertEquals("", Normalizer.normalize(null));
        assertEquals("test", Normalizer.normalize("Test"));
        assertEquals("test", Normalizer.normalize(" Test"));
        assertEquals("test", Normalizer.normalize(" Test "));
        assertEquals("test", Normalizer.normalize(" TesT "));
        assertEquals("test", Normalizer.normalize("TEST"));
        assertEquals("test", Normalizer.normalize("TEST "));
        assertEquals("test", Normalizer.normalize(" TEST"));
        assertEquals("test", Normalizer.normalize(" TEST "));
        assertEquals("test", Normalizer.normalize(" test"));
        assertEquals("test", Normalizer.normalize("tesT"));
        assertEquals("test", Normalizer.normalize("tESt"));
        assertEquals("test", Normalizer.normalize("tEsT "));
        
        
    }
    
    
    

   
}
