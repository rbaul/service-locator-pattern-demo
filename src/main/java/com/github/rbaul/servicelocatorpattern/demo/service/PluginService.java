package com.github.rbaul.servicelocatorpattern.demo.service;

import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;

import java.util.List;

public interface PluginService {

    void executeByPluginType(PluginType pluginType);

    void executeByPluginType(String contentType);

    List<String> getPluginNames();
}
