package com.apple.designpattern;

public class BuilderPattern {
    public static void main(String[] args) {
        StringBuilder jojo = new StringBuilder().append("m");
        Girl myj = new Girl.Builder("myj", 18)
                .setCity("Jiuquan")
                .setSchool("nju")
                .build();
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
        System.out.println(myj);
    }
}
