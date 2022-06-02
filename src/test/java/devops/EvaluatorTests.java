package devops;
import java.io.ByteArrayInputStream;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class EvaluatorTests {

    // test for addition
    @Test
    public void testevaluateAddition() {
        String userInput = "23\n32\n+";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        String expected = "The final result:"+23.0+ " " + "+" + " " + 32.0+ " = " + 55.0;
        Evaluator ev = new Evaluator();
        String actual=ev.evaluate();
        Assert.assertEquals(expected,actual);
    }

    // test for multiplication
    @Test
    public void testevaluateMultiplication() {
        String userInput= "2\n1\n*";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        String expected = "The final result:"+2.0+ " " + "*" + " " + 1.0+ " = " + 2.0;
        Evaluator ev = new Evaluator();
        String actual=ev.evaluate();
        Assert.assertEquals(expected,actual);
    }

    // test for subtraction
    @Test
    public void testevaluateSubtraction() {
        String userInput = "2\n1\n-";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        String expected = "The final result:"+2.0+ " " + "-" + " " + 1.0+ " = " + 1.0;
        Evaluator ev = new Evaluator();
        String actual=ev.evaluate();
        Assert.assertEquals(expected,actual);
    }

    // test for division
    @Test
    public void testevaluateDivision() {
        String userInput = "2\n1\n/";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        String expected = "The final result:"+2.0+ " " + "/" + " " + 1.0+ " = " + 2.0;
        Evaluator ev = new Evaluator();
        String actual=ev.evaluate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testevaluateInvalidOperator() {
        String userInput = "2\n1\n&";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        String expected = "You have entered wrong input";
        Evaluator ev = new Evaluator();
        String actual=ev.evaluate();
        Assert.assertEquals(expected,actual);
    }

}
