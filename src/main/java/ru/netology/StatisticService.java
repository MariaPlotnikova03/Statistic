package ru.netology;

public class StatisticService {

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int averageSum(int[] purchases) {
        int sum = calculateSum(purchases);
        return sum / purchases.length;
    }

    public int maxSale(int[] purchases) {
        int max = purchases[0];
        int monthNumber = 0;
        int resultMonthNumber = 0;
        for (int purchase : purchases) {
            monthNumber ++;
            if (max <= purchase) {
                max = purchase;
                resultMonthNumber = monthNumber;
            }
        }
        return resultMonthNumber;
    }

    public int minSale(int[] purchases) {
        int min = purchases[0];
        int monthNumber = 0;
        int resultMonthNumber = 0;
        for (int purchase : purchases) {
            monthNumber ++;
            if (min >= purchase) {
                min = purchase;
                resultMonthNumber = monthNumber;
            }
        }
        return resultMonthNumber;
    }

    public int belowAverage(int[] purchases) {
        int resultMonths = 0;
        int average = averageSum(purchases);
        for (int purchase : purchases) {
            if (purchase < average) {
                resultMonths ++;
            }
        }
        return resultMonths;
    }

    public int aboveAverage(int[] purchases) {
        int resultMonths = 0;
        int average = averageSum(purchases);
        for (int purchase : purchases) {
            if (purchase > average) {
                resultMonths ++;
            }
        }
        return resultMonths;
    }
}