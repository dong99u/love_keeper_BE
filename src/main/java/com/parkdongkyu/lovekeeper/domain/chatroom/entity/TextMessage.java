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
@DiscriminatorValue("TEXT")
public class TextMessage extends ChatMessage {

	private String message;

	@Builder
	public TextMessage(Member sender, ChatRoom chatRoom, String message) {
		super(sender, chatRoom);
		this.message = message;
	}

}
