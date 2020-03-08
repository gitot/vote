package com.guyot.vote.entity;

import lombok.Data;

@Data
public class VoteUser {
    private Integer id;

    private String name;

    private Byte sex;

    private Integer age;

    private String password;

    private String salt;
}