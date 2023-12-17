package com.prince.service.implementation;

import com.prince.model.Feedback;
import com.prince.repo.FeedbackRepo;
import com.prince.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    FeedbackRepo feedbackRepo;

    @Override
    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepo.save(feedback);
    }

    @Override
    public List<Feedback> listFeedbacks() {
        return feedbackRepo.findAll();
    }

    @Override
    public void deleteFeedback(Feedback feedback) {
        feedbackRepo.delete(feedback);
    }
}
