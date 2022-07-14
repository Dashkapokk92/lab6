package ru.netology.statistic;


    public class StatsService {
        public int calculateSum(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            return sum;
        }

        public int calculateMean(int[] sales) {

            return calculateSum(sales) / sales.length;
        }

        public int findMaxSale(int[] sales) {
            int maxMonth = 0;
            int month = 0;
            for (int sale : sales) {
                if (sale >= sales[maxMonth]) {
                    maxMonth = month;
                }
                maxMonth = month;
            }
            month = month + 1;
            return maxMonth + 1;
        }

        public int findMinSale(int[] sales) {
            int minMonth = 0;
            int month = 0;
            for (int sale : sales) {
                if (sale <= sales[minMonth]) {
                    minMonth = month;
                }
                minMonth = month;
            }
            month = month + 1;
            return minMonth + 1;
        }

        public int findMaxMeanSale(int[] sales) {

            int avg = calculateMean(sales);
            int month = 0;
            for (long sale : sales) {
                if (sale >= avg) {
                    month++;
                }
            }
            return month;
        }

        public int findMinMeanSale(int[] sales) {

            int avg = calculateMean(sales);
            int month = 0;
            for (long sale : sales) {
                if (sale < avg) {
                    month++;
                }
            }
            return month;
        }


    }

