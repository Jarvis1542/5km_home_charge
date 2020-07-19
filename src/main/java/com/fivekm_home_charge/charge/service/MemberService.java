package com.fivekm_home_charge.charge.service;

import com.fivekm_home_charge.charge.mapper.MemberMapper;
import com.fivekm_home_charge.charge.web.dto.LoginCheckDto;
import com.fivekm_home_charge.charge.web.dto.LoginDTO;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class MemberService {
    @Autowired(required=false)
    MemberMapper memberMapper;

    public ArrayList<MemberDto> getMembers() throws Exception {

        return memberMapper.getMembers();
    }

    //회원가입
    public void insertMembers(MemberDto memberDto) throws Exception {
        memberMapper.insertMembers(memberDto);
    }

    //?
    public MemberDto getMember(String id, String password) throws Exception{
        return memberMapper.getMember(id,password);
    }

    //아이디 중복체크
    public int checkId(LoginCheckDto loginCheckDto) {
        return memberMapper.checkId(loginCheckDto);
    }

    //로그인
    public LoginDTO login(LoginDTO loginDTO) throws Exception{
        System.out.println("서비스 : 로그인" + memberMapper.login(loginDTO));
        return memberMapper.login(loginDTO);
    }
}
