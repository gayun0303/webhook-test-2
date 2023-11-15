package com.example.toy1.apply;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplyRepository extends JpaRepository<ApplyEntity, Long> {
	Boolean existsByUserEntity_IdAndJobPostingEntity_JobPostingId (Long userId, Long jobPostingId);
}
