package com.example.SimpleSurvey.Service;

import com.example.SimpleSurvey.Model.Survey;
import com.example.SimpleSurvey.Repository.SurveyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SurveyService {

    @Autowired
    SurveyDAO surveyDao;

    public ResponseEntity<Survey> submitSurvey(Survey survey) {
        return new ResponseEntity<>(surveyDao.save(survey), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Survey>> getAll() {
        List<Survey> surveys = surveyDao.findAll();
        return new ResponseEntity<>(surveys, HttpStatus.OK);
    }
}
