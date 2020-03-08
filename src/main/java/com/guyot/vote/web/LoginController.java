package com.guyot.vote.web;

import com.guyot.vote.entity.VoteUser;
import com.guyot.vote.service.ILoginService;
import com.guyot.vote.service.bo.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @RequestMapping("/login")
    public LoginResult login(@Valid LoginVo loginVo,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            LoginResult result = new LoginResult();
            result.setMsg(bindingResult.toString());
            result.setSuccess(false);
            return result;
        }
        VoteUser voteUser = new VoteUser();
        voteUser.setName(loginVo.getName());
        voteUser.setPassword(loginVo.getAuthcStr());
        LoginResult result = loginService.login(voteUser);
        return result;
    }

}
