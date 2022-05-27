package ru.appline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.CompassModel;

import java.util.Collections;
import java.util.Map;

@RestController
public class Controller {
    private static final CompassModel compassModel = CompassModel.getInstance();

    @GetMapping(value = "/checkSide", produces = "application/json", consumes = "application/json")
    public Map checkSide(@RequestBody Map<String, Integer> degree) {
        return Collections.singletonMap("Side", compassModel.getResult(degree.get("Degree")));
    }
}
