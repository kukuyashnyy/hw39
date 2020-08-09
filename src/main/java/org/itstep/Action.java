package org.itstep;

public interface Action<T> {
    void doIt(T context);
}
