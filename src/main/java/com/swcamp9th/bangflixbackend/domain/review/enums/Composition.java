package com.swcamp9th.bangflixbackend.domain.review.enums;

public enum Composition {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5");

    private final String value;

    Composition(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

