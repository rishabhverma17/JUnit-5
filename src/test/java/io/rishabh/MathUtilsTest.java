package io.rishabh;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup(){
        System.out.print("Cleaning...");
    }

    @Test
    void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual, "The add method should add two numbers");
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return right circle area");
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "Divide by zero should throw");
    }
}