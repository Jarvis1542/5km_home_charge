package com.fivekm_home_charge.charge.mapper;

import com.fivekm_home_charge.charge.web.dto.LoginDTO;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface MemberMapper {
    ArrayList<MemberDto> getMembers() throws Exception;
    void insertMembers(MemberDto memberDto) throws Exception;
    MemberDto getMember(@Param("id")String id, @Param("password")String password) throws Exception;
    void checkId(String id);
    LoginDTO login(LoginDTO loginDTO) throws Exception;
}
