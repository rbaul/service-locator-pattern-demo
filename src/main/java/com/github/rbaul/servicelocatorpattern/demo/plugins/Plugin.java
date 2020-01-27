package com.github.rbaul.servicelocatorpattern.demo.plugins;

public interface Plugin {
    void otherOutput();

    default void defaultOutput() {
        System.out.println("Default Output");
    }
}