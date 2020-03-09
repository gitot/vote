package com.guyot.vote.service.impl;

import com.guyot.vote.entity.VoteUser;
import com.guyot.vote.entity.VoteUserCriteria;
import com.guyot.vote.mapper.VoteUserMapper;
import com.guyot.vote.service.ILoginService;
import com.guyot.vote.service.bo.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private VoteUserMapper voteUserMapper;
    @Override
    public LoginResult login(VoteUser user) {
        LoginResult result = new LoginResult();
        VoteUserCriteria voteUserCriteria = new VoteUserCriteria();
        VoteUserCriteria.Criteria criteria = voteUserCriteria.createCriteria();
        criteria.andNameEqualTo(user.getName());
        List<VoteUser> voteUsers = voteUserMapper.selectByExample(voteUserCriteria);
        if (CollectionUtils.isEmpty(voteUsers)) {
            result.setSuccess(false);
            result.setMsg("用户不存在");
        }
        if (voteUsers.size()>1) {
            result.setSuccess(false);
            result.setMsg("用户状态异常：查询到多个用户");
        }
        result.setSuccess(true);
        return result;
    }
}
