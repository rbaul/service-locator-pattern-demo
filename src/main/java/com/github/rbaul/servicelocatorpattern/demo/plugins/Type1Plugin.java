package com.github.rbaul.servicelocatorpattern.demo.plugins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component(PluginType.PluginTypeConstants.TYPE_1_PLUGIN)
@Slf4j
public class Type1Plugin implements Plugin {

    @Override
    public void otherOutput() {
        log.info("Other output of {}", PluginType.PluginTypeConstants.TYPE_1_PLUGIN);
    }
}
