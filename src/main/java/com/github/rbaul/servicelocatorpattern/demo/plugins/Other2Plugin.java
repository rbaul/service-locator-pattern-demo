package com.github.rbaul.servicelocatorpattern.demo.plugins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component(Other2Plugin.BEAN_NAME)
@Slf4j
public class Other2Plugin implements Plugin {

    public static final String BEAN_NAME = "other.2.plugin";

    @Override
    public void otherOutput() {
        log.info("Other output of {}", BEAN_NAME);
    }
}
