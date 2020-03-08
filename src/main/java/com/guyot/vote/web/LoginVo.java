package com.guyot.vote.web;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginVo {
    @NotEmpty
    private String name;
    @NotEmpty
    private String authcStr;
}
