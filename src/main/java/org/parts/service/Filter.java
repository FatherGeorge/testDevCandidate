package org.parts.service;

public interface Filter<T> {
    boolean shouldRemove(T t);
}
