package com.prince.repo;

import com.prince.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeedbackRepo extends JpaRepository<Feedback, UUID> {
}
