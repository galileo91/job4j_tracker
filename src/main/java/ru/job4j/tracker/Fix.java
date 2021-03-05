package ru.job4j.tracker;

public class Fix {
    private String desc;

    public Fix(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        Fix fix = new Fix("fix");
    }
}
