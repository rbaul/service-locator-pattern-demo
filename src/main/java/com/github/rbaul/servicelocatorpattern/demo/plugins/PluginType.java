package com.github.rbaul.servicelocatorpattern.demo.plugins;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
public enum PluginType {

    TYPE_1(PluginTypeConstants.TYPE_1_PLUGIN),

    TYPE_2(PluginTypeConstants.TYPE_2_PLUGIN),

    TYPE_3(PluginTypeConstants.TYPE_3_PLUGIN);

    private final String pluginName;

    @Override
    public String toString() {
        return pluginName;
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
