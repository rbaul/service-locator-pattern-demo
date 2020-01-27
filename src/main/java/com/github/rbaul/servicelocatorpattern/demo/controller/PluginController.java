package com.github.rbaul.servicelocatorpattern.demo.controller;

import com.github.rbaul.servicelocatorpattern.demo.service.PluginService;
import com.github.rbaul.servicelocatorpattern.demo.plugins.PluginType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/plugins", produces = MediaType.APPLICATION_JSON_VALUE)
public class PluginController {

    private final PluginService pluginService;

    @GetMapping("/{pluginType}")
    public void executeByPluginType(@PathVariable PluginType pluginType) {
        pluginService.executeByPluginType(pluginType);
    }

    @GetMapping
    public void executeByPluginType(@RequestParam String pluginType) {
        pluginService.executeByPluginType(pluginType);
    }

    @GetMapping("names")
    public List<String> getPluginNames() {
        return pluginService.getPluginNames();
    }
}
