package com.guyot.vote.service.impl;

import com.guyot.vote.entity.VoteQuestion;
import com.guyot.vote.entity.VoteQuestionCriteria;
import com.guyot.vote.mapper.VoteQuestionMapper;
import com.guyot.vote.service.QuestionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class QuestionListServiceImpl implements QuestionListService {

    @Autowired
    private VoteQuestionMapper voteQuestionMapper;

    @Override
    public List<VoteQuestion> findRunningQuestion() {
        VoteQuestionCriteria voteQuestionCriteria = new VoteQuestionCriteria();
        VoteQuestionCriteria.Criteria criteria = voteQuestionCriteria.createCriteria();
        Date current = new Date();
        //TODO 投票选题的数据结构需要重新设计
        List<VoteQuestion> voteQuestions = voteQuestionMapper.selectByExample(voteQuestionCriteria);
        return voteQuestions;
    }
}
