package com.github.rbaul.servicelocatorpattern.demo.plugins.config;

import com.github.rbaul.servicelocatorpattern.demo.plugins.Plugin;
import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;

public interface PluginFactory {

    Plugin getPlugin(PluginType pluginType);

    Plugin getPlugin(String pluginType);
  }