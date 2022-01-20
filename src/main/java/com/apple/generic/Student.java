package com.apple.generic;

public class Student<T> {
    public String name;
    public T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }
}
