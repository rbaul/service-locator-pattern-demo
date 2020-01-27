package com.github.rbaul.servicelocatorpattern.demo.service.impl;

import com.github.rbaul.servicelocatorpattern.demo.plugins.Plugin;
import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class ExpressionBean implements ApplicationRunner {

    @Value("#{" + PluginType.PluginTypeConstants.TYPE_3_PLUGIN + "}")
    private Plugin plugin;

    // with @Primary
    private final Plugin defaultPlugin;

    private final List<Plugin> allPlugins;

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");
        String message = exp.getValue(String.class);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Expression Plugin");
        plugin.defaultOutput();
        log.info("Default Plugin with @Primary");
        defaultPlugin.defaultOutput();
        log.info("All Plugins");
        allPlugins.forEach(Plugin::defaultOutput);
    }
}
