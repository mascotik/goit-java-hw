package com.goit.hw3;

import java.util.Arrays;

public class UberShop {

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));

    }

    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]+" jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] < 1000f ? prices[i]*2.0f : prices[i]*1.5f;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {

        if (prices.length == 0) return new int[]{};

        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) minPrice = prices[i];
            if (maxPrice < prices[i]) maxPrice = prices[i];
        }

        if (minPrice == maxPrice) return new int[]{minPrice};

        return new int[]{minPrice,maxPrice};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int countMinPrices = 0;

        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
                countMinPrices = 1;
            } else if (minPrice == prices[i]) {
                countMinPrices++;
            }
        }
        return countMinPrices;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int countToRemove = 0;
        int[] result = {};

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result = Arrays.copyOf(result,result.length+1);
                result[result.length-1] = prices[i];
            }
        }
        return result;
    }

    public int[] leavePrice9(int[] prices) {

        int[] result = {};

        for (int i = 0; i < prices.length; i++) {
            String priceStr = String.valueOf(prices[i]);
            char lastNumber = priceStr.charAt(priceStr.length()-1);
            if (lastNumber == '9') {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = prices[i];
            }
        }
        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];
        int idx = 0;
        for (int i = 0; i < showcaseStocks.length; i++) {
            result[idx++] = showcaseStocks[i];
        }
        for (int i = 0; i < warehouseStocks.length; i++) {
            result[idx++] = warehouseStocks[i];
        }
        return result;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] <= maxPrice && prices[i] >= minPrice) {
                result += prices[i];
            }
        }

    return result;
    }
}