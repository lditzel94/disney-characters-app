package com.disney.disneycharacters.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Response {
    SUCCESS( 0, "ok" ),
    VALIDATE_FAILED( -1, "validate failed" ),
    ;

    private Integer code;
    private String message;
}
