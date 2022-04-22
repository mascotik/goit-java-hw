package com.goit.hw3;

public class CheapStocks {
    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();

        System.out.println(cheapStocks.getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}));

    }
    public String getCheapStocks(String[] stocks) {
        String result = "";
        for (int i = 0; i < stocks.length; i++) {
            int startPos = stocks[i].lastIndexOf(" ");
            int price = Integer.parseInt(stocks[i].substring(startPos).trim());
            if (price < 200)
                result += " " + stocks[i].substring(0,startPos);
        }
        return result.trim();
    }

}
