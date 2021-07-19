package com.s4b.core;

import java.util.Objects;

public class CoreConnection {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreConnection)) return false;
        CoreConnection that = (CoreConnection) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "CoreConnection{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoreConnection(String name) {
        this.name = name;
    }
}
