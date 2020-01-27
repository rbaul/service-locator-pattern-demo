package com.github.rbaul.servicelocatorpattern.demo.plugins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component(PluginType.PluginTypeConstants.TYPE_2_PLUGIN)
@Slf4j
public class Type2Plugin implements Plugin {

    @Override
    public void otherOutput() {
        log.info("Other output of {}", PluginType.PluginTypeConstants.TYPE_2_PLUGIN);
    }

    @Override
    public void defaultOutput() {
        log.info("Default output of {}", PluginType.PluginTypeConstants.TYPE_2_PLUGIN);
    }
}
