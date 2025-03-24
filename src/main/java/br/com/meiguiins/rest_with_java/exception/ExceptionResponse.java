package br.com.meiguiins.rest_with_java.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String messager, String details) {

}
