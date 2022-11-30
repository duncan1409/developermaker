package com.developers.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperSkillType {
    BACK_END(description:"백엔드 개발자"),

    FRONT_END(description:"프론트엔드 개발자"),

    FULL_STACK(description:"풀스택 개발자");

    private final String description;
}
