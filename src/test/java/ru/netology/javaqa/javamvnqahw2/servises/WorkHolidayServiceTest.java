package ru.netology.javaqa.javamvnqahw2.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkHolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldHolidayMonth(int expected, int income, int expenses, int threshold) {
        WorkHolidayService service = new WorkHolidayService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldHolidayMonth1() {
//        WorkHolidayService service = new WorkHolidayService();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}