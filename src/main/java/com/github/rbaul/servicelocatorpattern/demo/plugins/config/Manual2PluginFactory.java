package com.github.rbaul.servicelocatorpattern.demo.plugins.config;

import com.github.rbaul.servicelocatorpattern.demo.plugins.Plugin;
import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Manual2PluginFactory {
    @Getter
    private static PluginFactory pluginFactory;

    public Manual2PluginFactory(PluginFactory pluginFactory) {
        Manual2PluginFactory.pluginFactory = pluginFactory;
    }

    public static Plugin getPluginByName(String pluginBeanName) {
        return Manual2PluginFactory.pluginFactory.getPlugin(pluginBeanName);
    }

    public static Plugin getPluginByName(PluginType pluginType) {
        return Manual2PluginFactory.pluginFactory.getPlugin(pluginType);
    }
}
