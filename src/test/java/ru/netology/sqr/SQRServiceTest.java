package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void calcCountSqrBetweenBorders(int expected, int lowerBorder, int higherBorder) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(lowerBorder, higherBorder);

        Assertions.assertEquals(expected, actual);
    }


}