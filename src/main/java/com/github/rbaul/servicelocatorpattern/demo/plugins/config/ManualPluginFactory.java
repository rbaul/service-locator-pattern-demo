package com.github.rbaul.servicelocatorpattern.demo.plugins.config;

import com.github.rbaul.servicelocatorpattern.demo.plugins.Plugin;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ManualPluginFactory {
    @Getter
    private static Map<String, Plugin> pluginContext;

    public ManualPluginFactory(Map<String, Plugin> pluginContext) {
        ManualPluginFactory.pluginContext = pluginContext;
    }

    public static Plugin getPluginByName(String pluginBeanName) {
        return ManualPluginFactory.pluginContext.get(pluginBeanName);
    }
}
