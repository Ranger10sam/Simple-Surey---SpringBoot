package com.example.SimpleSurvey.Repository;


import com.example.SimpleSurvey.Model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyDAO extends JpaRepository<Survey, Long> {
}
