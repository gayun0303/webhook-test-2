package com.example.toy1.apply;

import com.example.wanted.jobposting.JobPostingEntity;
import com.example.wanted.user.UserEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "apply")
public class ApplyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "apply_id")
	private Long applyId;

	@ManyToOne
	@JoinColumn(name = "job_posting_id")
	private JobPostingEntity jobPostingEntity;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity userEntity;
}
