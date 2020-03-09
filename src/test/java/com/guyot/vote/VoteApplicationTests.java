package com.guyot.vote;

import com.guyot.vote.entity.VoteUser;
import com.guyot.vote.mapper.VoteUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VoteApplicationTests {

	@Autowired
	VoteUserMapper voteUserMapper;

	@Test
	void contextLoads() {
		VoteUser voteUser = voteUserMapper.selectByPrimaryKey(1);
		System.out.println(voteUser);
	}

}
