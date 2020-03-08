package com.guyot.vote.service.impl;

import com.guyot.vote.mapper.VoteUserMapper;
import com.guyot.vote.entity.VoteUser;
import com.guyot.vote.service.ILoginService;
import com.guyot.vote.service.bo.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private VoteUserMapper voteUserMapper;
    @Override
    public LoginResult login(VoteUser user) {
        LoginResult result = new LoginResult();
        result.setSuccess(true);
        return result;
    }
}
