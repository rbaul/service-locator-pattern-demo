package com.github.rbaul.servicelocatorpattern.demo;

import com.github.rbaul.servicelocatorpattern.demo.plugins.*;
import com.github.rbaul.servicelocatorpattern.demo.plugins.config.PluginConfig;
import com.github.rbaul.servicelocatorpattern.demo.plugins.config.PluginFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

@ContextConfiguration(classes = {
        PluginConfig.class,
        Type1Plugin.class,
        Type2Plugin.class,
        Type3Plugin.class,
        OtherPlugin.class,
        Other2Plugin.class
})
@ExtendWith(SpringExtension.class)
class ServiceLocatorPatternDemoApplicationTests {

    @Autowired
    private PluginFactory pluginFactory;

    @Autowired
    private Plugin defaultPlugin;

    @Value("#{" + PluginType.PluginTypeConstants.TYPE_3_PLUGIN + "}")
    private Plugin pluginByExpression;

    @Autowired
    private ApplicationContext appContext;

    @Test
    void getPluginByEnum__Success() {
        pluginFactory.getPlugin(PluginType.TYPE_1);
        pluginFactory.getPlugin(PluginType.TYPE_2);
        pluginFactory.getPlugin(PluginType.TYPE_3);
    }

    @Test
    void getPluginByString__Success() {
        pluginFactory.getPlugin(PluginType.PluginTypeConstants.TYPE_1_PLUGIN);
        pluginFactory.getPlugin(PluginType.PluginTypeConstants.TYPE_2_PLUGIN);
        pluginFactory.getPlugin(PluginType.PluginTypeConstants.TYPE_3_PLUGIN);
        pluginFactory.getPlugin(OtherPlugin.BEAN_NAME);
        pluginFactory.getPlugin(Other2Plugin.BEAN_NAME);
    }

    @Test()
    void getPluginByString__Exception() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> pluginFactory.getPlugin("notExistName"));
    }

    @Test
    void getPluginDefault__Success() {
        Assertions.assertTrue(defaultPlugin instanceof Type2Plugin);
    }

    @Test
    void getPluginByExpression__Success() {
        Assertions.assertTrue(pluginByExpression instanceof Type3Plugin);
    }

    @Test
    void getPluginNames__Success() {
        String[] pluginNames = appContext.getBeanNamesForType(Plugin.class);
        Arrays.stream(pluginNames).forEach(pluginName -> {
            pluginFactory.getPlugin(pluginName);
        });
    }

}
