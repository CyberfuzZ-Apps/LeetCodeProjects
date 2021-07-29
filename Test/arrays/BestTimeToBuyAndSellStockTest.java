package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void example1() {
        //Input: prices = [7,1,5,3,6,4]
        //Output: 5
        var sellBuy = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        int rsl = sellBuy.maxProfit(prices);
        assertEquals(expected, rsl);
    }

    @Test
    public void example2() {
        //Input: prices = [7,6,4,3,1]
        //Output: 0
        var sellBuy = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int rsl = sellBuy.maxProfit(prices);
        assertEquals(expected, rsl);
    }

    @Test
    public void example3() {
        //Input:
        //[2,4,1]
        //Expected:
        //2
        var sellBuy = new BestTimeToBuyAndSellStock();
        int[] prices = {2, 4, 1};
        int expected = 2;
        int rsl = sellBuy.maxProfit(prices);
        assertEquals(expected, rsl);
    }

    @Test
    public void example4() {
        //Input:
        //[2,1,2,1,0,1,2]
        //Expected:
        //2
        var sellBuy = new BestTimeToBuyAndSellStock();
        int[] prices = {2, 1, 2, 1, 0, 1, 2};
        int expected = 2;
        int rsl = sellBuy.maxProfit(prices);
        assertEquals(expected, rsl);
    }
}