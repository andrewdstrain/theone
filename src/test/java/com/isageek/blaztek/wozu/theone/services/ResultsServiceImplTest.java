package com.isageek.blaztek.wozu.theone.services;

import com.isageek.blaztek.wozu.theone.models.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("The One")
class ResultsServiceImplTest {
    @Test
    void getCharacter() {
        ResultsService resultsService = new ResultsServiceImpl();

        Character character = resultsService.getCharacter("Frodo+Baggins");
        Assertions.assertNotNull(character);

        character = resultsService.getCharacter("Frodo");
        Assertions.assertNull(character);
    }
}