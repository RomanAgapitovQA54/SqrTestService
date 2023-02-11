package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalcWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenSquaresNotFound() {
        SQRService service = new SQRService();

        int actual = service.calculate(10, 20);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenOneSquareFound() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 101);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


}