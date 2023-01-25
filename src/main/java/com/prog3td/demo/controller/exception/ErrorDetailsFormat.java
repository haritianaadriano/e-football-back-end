package com.prog3td.demo.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class ErrorDetailsFormat{
    private Date timestamp;
    private String message;
    private String details;
}

