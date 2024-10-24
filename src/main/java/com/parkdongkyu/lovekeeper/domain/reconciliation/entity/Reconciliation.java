package com.parkdongkyu.lovekeeper.domain.reconciliation.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.parkdongkyu.lovekeeper.domain.letter.Letter;
import com.parkdongkyu.lovekeeper.global.common.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicUpdate
@DynamicInsert
public class Reconciliation extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reconciliation_id")
	private Long id;

	private LocalDateTime sentAt;

	private boolean isAccepted;

	@OneToMany(mappedBy = "reconciliation", orphanRemoval = true, cascade = CascadeType.ALL)
	@Builder.Default
	private List<MemberReconciliation> memberReconciliations = new ArrayList<>();

	@OneToMany(mappedBy = "reconciliation", orphanRemoval = true, cascade = CascadeType.ALL)
	@Builder.Default
	private List<Letter> letters = new ArrayList<>();

}
