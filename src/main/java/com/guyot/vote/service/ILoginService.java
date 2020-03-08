package com.guyot.vote.service;

import com.guyot.vote.entity.VoteUser;
import com.guyot.vote.service.bo.LoginResult;

public interface ILoginService {
    LoginResult login(VoteUser user);
}
