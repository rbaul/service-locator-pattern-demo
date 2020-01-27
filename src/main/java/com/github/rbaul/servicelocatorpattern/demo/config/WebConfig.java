package com.github.rbaul.servicelocatorpattern.demo.config;

import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToPluginTypeConverter());
    }

    private class StringToPluginTypeConverter implements Converter<String, PluginType> {
        @Override
        public PluginType convert(String source) {
            return PluginType.getByPluginName(source).orElse(null);
        }
    }
}