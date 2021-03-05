package ru.job4j.tracker;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }
    public static int max(int first, int second, int third) {
        int max1 = max(first, second);
        return max1 > third ? max1 : third;
    }
    public static int max(int first, int second, int third, int fourth) {
        int max1 = max(first, second);
        int max2 = max(third, fourth);
        return max1 > max2 ? max1 : max2;
    }
}
