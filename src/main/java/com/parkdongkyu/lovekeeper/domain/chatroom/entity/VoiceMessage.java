package com.parkdongkyu.lovekeeper.domain.chatroom.entity;

import com.parkdongkyu.lovekeeper.auth.member.entity.Member;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("VOICE")
public class VoiceMessage extends ChatMessage {

	private String fileUrl;
	private Integer duration;  // 음성 길이 (초)

	@Builder
	public VoiceMessage(Member sender, ChatRoom chatRoom, String fileUrl, Integer duration) {
		super(sender, chatRoom);
		this.fileUrl = fileUrl;
		this.duration = duration;
	}
}