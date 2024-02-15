package com.foretruff;

public class ArgsRunner {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.getProperties().forEach((o, o2) -> System.out.println(o + " - " + o2));
    }
}
// groupId:artifactId:version
// com.foretruff
// first-maven
// major.minor.increment-qualifier
// 1.2.5-SNAPSHOT
