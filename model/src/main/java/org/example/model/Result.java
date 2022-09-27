package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.example.model.constants.Code;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Result<T> implements Serializable {

    private String code;

    private String message;

    private T data;

    public Result(String code) {
        this.code = code;
    }

    public Result(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static <T> Result<T> onlyCode(String code) {
        return new Result<>(code);
    }

    public static <T> Result<T> fullArgs(String code, String message, T data) {
        return new Result<>(code, message, data);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(Code.ok, data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(Code.ok, message, data);
    }

    public static <T> Result<T> fail(String code, String message) {
        return new Result<>(code, message);
    }

}
