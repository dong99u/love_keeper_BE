package com.parkdongkyu.lovekeeper.global.common;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "createdAt", "data"})
public class CommonResponse<T> {

	@JsonProperty("isSuccess")
	private Boolean isSuccess;

	@JsonProperty("code")
	private String code;

	@JsonProperty("message")
	private String message;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@JsonProperty("createdAt")
	private LocalDateTime createdAt;

	@JsonProperty("data")
	private T data;

	public static <T> CommonResponse<T> onSuccess(T data) {
		return new CommonResponse<>(true, "200", "요청에 성공하였습니다.", LocalDateTime.now(), data);
	}

	public static <T> CommonResponse<T> onFailure(String code, String message, T data) {
		return new CommonResponse<>(false, code, message, LocalDateTime.now(), data);
	}
}