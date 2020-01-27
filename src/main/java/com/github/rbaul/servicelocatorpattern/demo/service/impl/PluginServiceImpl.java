package com.github.rbaul.servicelocatorpattern.demo.service.impl;

import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;
import com.github.rbaul.servicelocatorpattern.demo.plugins.config.PluginFactory;
import com.github.rbaul.servicelocatorpattern.demo.service.PluginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PluginServiceImpl implements PluginService {

    private final PluginFactory pluginFactory;

    @Override
    public void executeByPluginType(PluginType pluginType) {
        // Will be throw org.springframework.beans.factory.NoSuchBeanDefinitionException if not exist
        pluginFactory
                .getPlugin(pluginType)
                .otherOutput();
    }

    @Override
    public void executeByPluginType(String contentType) {
        // Will be throw org.springframework.beans.factory.NoSuchBeanDefinitionException if not exist
        pluginFactory
                .getPlugin(contentType)
                .otherOutput();
    }
}
