package com.disney.disneycharacters.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.disney.disneycharacters.model.common.Response.SUCCESS;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> Result<T> success( T data ) {
        return new Result<>( SUCCESS.getCode(), SUCCESS.getMessage(), data );
    }

    public static Result<?> failed( Integer code, String message ) {
        return new Result<>( code, message, null );
    }
}
