package com.isageek.blaztek.wozu.theone.services;

import com.isageek.blaztek.wozu.theone.models.Character;
import com.isageek.blaztek.wozu.theone.models.Results;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResultsServiceImpl implements ResultsService {
    @Override
    public Character getCharacter(String name) {
        String url = "https://the-one-api.dev/v2/character?name=" + name;
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", "Bearer " + System.getenv("APIKEY"));

        ResponseEntity<Results> responseEntity = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", httpHeaders), Results.class);

        Results results = responseEntity.getBody();

        if (results.getTotal() > 0) {
            return results.getDocs()[0];
        } else {
            return null;
        }
    }
}
