package com.foretruff.args;

public class ArgsRunner {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.getProperties().forEach((o, o2) -> System.out.println(o + " - " + o2));
    }
}
