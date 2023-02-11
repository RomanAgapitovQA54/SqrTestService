package ru.netology.sqr;

public class SQRService {

    public int calculate(int minRange, int maxRange) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= minRange) {
                if (iSquare <= maxRange) {
                    result++;
                }
            }
        }
        return result;

    }

}
