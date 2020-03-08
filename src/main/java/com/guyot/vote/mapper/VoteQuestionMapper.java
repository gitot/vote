package com.guyot.vote.mapper;

import com.guyot.vote.entity.VoteQuestion;
import com.guyot.vote.entity.VoteQuestionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteQuestionMapper {
    long countByExample(VoteQuestionCriteria example);

    int deleteByExample(VoteQuestionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(VoteQuestion record);

    int insertSelective(VoteQuestion record);

    List<VoteQuestion> selectByExample(VoteQuestionCriteria example);

    VoteQuestion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VoteQuestion record, @Param("example") VoteQuestionCriteria example);

    int updateByExample(@Param("record") VoteQuestion record, @Param("example") VoteQuestionCriteria example);

    int updateByPrimaryKeySelective(VoteQuestion record);

    int updateByPrimaryKey(VoteQuestion record);
}