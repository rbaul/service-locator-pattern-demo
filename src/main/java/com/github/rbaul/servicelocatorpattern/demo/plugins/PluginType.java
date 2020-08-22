package com.github.rbaul.servicelocatorpattern.demo.plugins;

import com.github.rbaul.servicelocatorpattern.demo.plugins.config.Manual2PluginFactory;
import com.github.rbaul.servicelocatorpattern.demo.plugins.config.ManualPluginFactory;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
public enum PluginType implements Plugin {

    TYPE_1(PluginTypeConstants.TYPE_1_PLUGIN),

    TYPE_2(PluginTypeConstants.TYPE_2_PLUGIN),

    TYPE_3(PluginTypeConstants.TYPE_3_PLUGIN);

    private final String pluginName;

    @Override
    public String toString() {
        return pluginName;
    }

    @Override
    public void otherOutput() {
        ManualPluginFactory.getPluginByName(pluginName).otherOutput();
        Manual2PluginFactory.getPluginByName(pluginName).otherOutput();
        Manual2PluginFactory.getPluginByName(this).otherOutput();
    }

    @Override
    public void defaultOutput() {
        ManualPluginFactory.getPluginByName(pluginName).defaultOutput();
        Manual2PluginFactory.getPluginByName(pluginName).defaultOutput();
        Manual2PluginFactory.getPluginByName(this).defaultOutput();
    }

    public Plugin getPlugin() {
        return ManualPluginFactory.getPluginByName(pluginName);
//        return Manual2PluginFactory.getPluginByName(pluginName);
//        return Manual2PluginFactory.getPluginByName(this);
    }

    public static Optional<PluginType> getByPluginName(String value) {
        return Arrays.stream(PluginType.values())
                .filter(pluginType -> pluginType.pluginName.equals(value)).findFirst();
    }

    public interface PluginTypeConstants {
        String TYPE_1_PLUGIN = "pluginType1";
        String TYPE_2_PLUGIN = "pluginType2";
        String TYPE_3_PLUGIN = "pluginType3";
    }
}
