package com.github.rbaul.servicelocatorpattern.demo.plugins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component(OtherPlugin.BEAN_NAME)
@Slf4j
public class OtherPlugin implements Plugin {

    public static final String BEAN_NAME = "otherPlugin";

    @Override
    public void otherOutput() {
        log.info("Other output of {}", BEAN_NAME);
    }
}
