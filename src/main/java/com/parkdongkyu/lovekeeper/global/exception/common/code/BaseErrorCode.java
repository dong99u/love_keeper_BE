package com.parkdongkyu.lovekeeper.global.exception.common.code;

import com.parkdongkyu.lovekeeper.global.exception.common.ErrorReason;

public interface BaseErrorCode {

	public ErrorReason getReason();

	public ErrorReason getReasonHttpStatus();
}