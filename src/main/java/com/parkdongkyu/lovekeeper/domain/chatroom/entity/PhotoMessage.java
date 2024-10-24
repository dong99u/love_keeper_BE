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
@DiscriminatorValue("PHOTO")
public class PhotoMessage extends ChatMessage {

	private String fileUrl;

	@Builder
	public PhotoMessage(Member sender, ChatRoom chatRoom, String fileUrl) {
		super(sender, chatRoom);
		this.fileUrl = fileUrl;
	}
}