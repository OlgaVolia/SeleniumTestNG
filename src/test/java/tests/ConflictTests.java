package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {


    @Test
    public void test1() {
        int a = 5;
        int b = 10;
        int sum = (a + b) * 2;
        System.out.println("Sum: " + sum);
    }

    @Test
    public void test2() {
        String message = "Welcome to USA  - the land";

        System.out.println(message);

        Assert.assertTrue(message.toLowerCase().contains("land"));

    }

}
