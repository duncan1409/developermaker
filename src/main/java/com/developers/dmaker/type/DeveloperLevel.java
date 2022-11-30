package com.developers.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum DeveloperLevel {
    NEW(description:"신입 개발자"),
    JUNIOR(description:"주니어 개발자"),
    JUNGNIOR(description:"중간 개발자"),
    SENIOR(description:"시니어 개발자");

    private final String description;
}
