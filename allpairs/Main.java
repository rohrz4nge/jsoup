package org.jsoup;

import java.util.Arrays;
import io.github.pavelicii.allpairs4j.AllPairs;
import io.github.pavelicii.allpairs4j.Parameter;

public class Main {
    public static void main(String[] args) {
        AllPairs allPairs = new AllPairs.AllPairsBuilder()
        .withParameters(Arrays.asList(
                new Parameter("interface-based", "-2147483648", "0", "2147483647"),
                new Parameter("functionality-based", "true", "false"),
                new Parameter("q1", "a>0", "a=0", "a<0"),
                new Parameter("q2", "b>0", "b=0", "b<0"),
                new Parameter("q3", "a<b", "a=b", "a>b")))
        .withConstraint(c -> c.get("q1").equals("a>0") && c.get("q2").equals("b<0") && !c.get("q3").equals("a>b"))
        .withConstraint(c -> c.get("q1").equals("a<0") && c.get("q2").equals("b>0") && !c.get("q3").equals("a<b"))
        .withConstraint(c -> c.get("q1").equals("a=0") && c.get("q2").equals("b<0") && !c.get("q3").equals("a>b"))
        .withConstraint(c -> c.get("q1").equals("a>0") && c.get("q2").equals("b=0") && !c.get("q3").equals("a>b"))
        .withConstraint(c -> c.get("q1").equals("a=0") && c.get("q2").equals("b>0") && !c.get("q3").equals("a<b"))
        .withConstraint(c -> c.get("q1").equals("a=0") && c.get("q2").equals("b=0") && !c.get("q3").equals("a=b"))
        .withConstraint(c -> c.get("q1").equals("a<0") && c.get("q2").equals("b<0") && c.get("q3").equals("a=b"))
        .withConstraint(c -> c.get("q1").equals("a>0") && c.get("q2").equals("b>0") && c.get("q3").equals("a=b"))
        .withTestCombinationSize(5)
        .build();
        
        //List<Case> generatedCases = allPairs.getGeneratedCases();      // work with resulting List of Cases
        // for (Case c : allPairs) { ... }                                // or use Iterator

    System.out.println(allPairs);
    }
}