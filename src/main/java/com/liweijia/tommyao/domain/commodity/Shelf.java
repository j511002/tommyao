package com.liweijia.tommyao.domain.commodity;

public enum Shelf {
    ON("0"), OFF("1");

    private String name;

    private Shelf(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
