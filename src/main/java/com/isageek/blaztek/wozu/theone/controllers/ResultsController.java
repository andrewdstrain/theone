package com.isageek.blaztek.wozu.theone.controllers;

import com.isageek.blaztek.wozu.theone.services.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isageek.blaztek.wozu.theone.models.Character;

@RestController
@RequestMapping("/api")
public class ResultsController {
    final ResultsService resultsService;

    @Autowired
    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @GetMapping("/character/{name}")
    Character getCharacter(@PathVariable String name) {
        return resultsService.getCharacter(name);
    }
}
