package com.guyot.vote.mapper;

import com.guyot.vote.entity.VoteQuestionOption;
import com.guyot.vote.entity.VoteQuestionOptionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteQuestionOptionMapper {
    long countByExample(VoteQuestionOptionCriteria example);

    int deleteByExample(VoteQuestionOptionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(VoteQuestionOption record);

    int insertSelective(VoteQuestionOption record);

    List<VoteQuestionOption> selectByExample(VoteQuestionOptionCriteria example);

    VoteQuestionOption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VoteQuestionOption record, @Param("example") VoteQuestionOptionCriteria example);

    int updateByExample(@Param("record") VoteQuestionOption record, @Param("example") VoteQuestionOptionCriteria example);

    int updateByPrimaryKeySelective(VoteQuestionOption record);

    int updateByPrimaryKey(VoteQuestionOption record);
}