package com.parkdongkyu.lovekeeper.global.exception.common;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorReason {

	private HttpStatus httpStatus;

	private final boolean isSuccess;
	private final String code;
	private final String message;
}