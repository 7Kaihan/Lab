package Abstraction;

import java.nio.charset.IllegalCharsetNameException;

public abstract class Base {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().isAssignableFrom(this.getClass())) {
            if (obj.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }
}