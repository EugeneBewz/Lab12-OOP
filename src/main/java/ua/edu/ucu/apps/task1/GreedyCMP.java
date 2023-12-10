package ua.edu.ucu.apps.task1;

import java.util.Arrays;
import java.util.Collections;

public class GreedyCMP {
    public static int solve(Integer[] coins, int target) {
        Arrays.sort(coins, Collections.reverseOrder());
        int noOfCoins = 0;
        int neededCoins;
        int sumLeft = target;
        for (int coin : coins) {
            neededCoins = sumLeft / coin;
            noOfCoins += neededCoins;
            sumLeft -= neededCoins * coin;
        }
        return noOfCoins;
    }

    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 25, 50};
        int target = 125;

        System.out.println(solve(coins, target));
    }
}
