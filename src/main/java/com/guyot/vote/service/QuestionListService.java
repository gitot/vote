package com.guyot.vote.service;

import com.guyot.vote.entity.VoteQuestion;

import java.util.List;

public interface QuestionListService {
    /**
     * 获取当前正在进行中的选题
     * @return
     */
    List<VoteQuestion> findRunningQuestion();
}
