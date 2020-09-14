package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {


    @Test
    void calculateSum() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
        System.out.println("Сумма всех продаж = " + service.calculateSum(purchases));
    }

    @Test
    void averageSum() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSum(purchases);

        assertEquals(expected, actual);
        System.out.println("Средння сумма продаж в месяц = " + service.averageSum(purchases));
    }


    @Test
    void maxSale() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSale(purchases);
        assertEquals(expected, actual);
        System.out.println("Номер месяца, в котором был пик продаж = " + service.maxSale(purchases));
    }

    @Test
    void minSale() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSale(purchases);

        assertEquals(expected, actual);
        System.out.println("Номер месяца, в котором был минимум продаж = " + service.minSale(purchases));
    }

    @Test
    void belowAverage() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverage(purchases);

        assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего = " + service.belowAverage(purchases));
    }

    @Test
    void aboveAverage() {
        StatisticService service = new StatisticService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveAverage(purchases);

        assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были выше среднего = " + service.aboveAverage(purchases));
    }
}

