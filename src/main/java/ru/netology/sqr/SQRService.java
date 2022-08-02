package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int lowerBorder, int higherBorder) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i > lowerBorder && i * i < higherBorder) {
                count++;
            }

        }
        return count;

    }
}
