package com.githubuserbranchesapi.controller.error;

import org.springframework.http.HttpStatus;

public record ErrorUsernameResponseDto(HttpStatus httpStatus, String message) {
}
