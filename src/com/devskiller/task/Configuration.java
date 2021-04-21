package com.devskiller.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Configuration { // TODO
    private final Map<String, Object> map;

    public Configuration(Map<String, Object> map) {
        this.map = new HashMap<>(map);
    }

    public Optional<Object> getProperty(String n) {
        return null;
    }

    public Optional<Integer> getIntegerProperty(String n) {
        return null;
    }
}