package com.developers.dmaker.code;

import lombok.Getter;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Getter

public enum DMakerErrorCode {
    NO_DEVELOPER(message:"해당하는 개발자가 없습니다."),
    DUPLICATED_MEMBER_ID(message:"memberId가 중복됩니다."),
    LEVEL_AND_EXPERIENCE_YEARS_NOT_MATCH(message:"개발자 레벨과 연차가 맞지 않습니다."),
    INTERNAL_SERVER_ERROR(message:"서버에 오류가 발생했습니다."),
    INVALID_REQUEST(message:"잚못된 요청입니다.");
    private final String message;
}
