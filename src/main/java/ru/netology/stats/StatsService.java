
package ru.netology.stats;

public class StatsService {
    public long calcSum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return calcSum(sales) / 12;
    }


    public int calculateMaxMonth(long[] sales) {

        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 1; sales.length > i; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int calculateMinMonth(long[] sales) {

        int minMonth = 0;
        long maxSale = sales[0];
        for (int i = 1; sales.length > i; i++) {
            if (sales[i] <= maxSale) {
                maxSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateUnderAverage(long[] sales) {

        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {

            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calculateUpperAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {

            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}


