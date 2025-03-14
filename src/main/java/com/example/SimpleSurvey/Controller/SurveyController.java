package com.example.SimpleSurvey.Controller;

import com.example.SimpleSurvey.Model.Survey;
import com.example.SimpleSurvey.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    SurveyService surveyService;

    @PostMapping("submitSurvey")
    public ResponseEntity<Survey> submitSurvey(@RequestBody Survey survey) {
        return surveyService.submitSurvey(survey);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Survey>> getAll() {
        return surveyService.getAll();
    }
}
