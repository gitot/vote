package com.guyot.vote.mapper;

import com.guyot.vote.entity.VoteOption;
import com.guyot.vote.entity.VoteOptionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteOptionMapper {
    long countByExample(VoteOptionCriteria example);

    int deleteByExample(VoteOptionCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(VoteOption record);

    int insertSelective(VoteOption record);

    List<VoteOption> selectByExample(VoteOptionCriteria example);

    VoteOption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VoteOption record, @Param("example") VoteOptionCriteria example);

    int updateByExample(@Param("record") VoteOption record, @Param("example") VoteOptionCriteria example);

    int updateByPrimaryKeySelective(VoteOption record);

    int updateByPrimaryKey(VoteOption record);
}