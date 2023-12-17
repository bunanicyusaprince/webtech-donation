package com.prince.service;

import com.prince.model.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback addFeedback(Feedback feedback);
    List<Feedback> listFeedbacks();
    void deleteFeedback(Feedback feedback);
}
