package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MemberDto {
    private final String id;
    private final String password;
    private final String email;
    private final String name;
    private final String phone;
    private final Date regDate;
}

