package com.apple.designpattern;

public class Girl {
    private final String name;
    private final int age;
    private final String city;
    private final String school;

    private Girl(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
        this.school = builder.school;
    }

    public static class Builder {
        private String name;
        private int age;
        private String city;
        private String school;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Girl build() {
            return new Girl(this);
        }
    }
}
