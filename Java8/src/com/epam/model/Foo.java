package com.epam.model;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    String name;
    public List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }
}