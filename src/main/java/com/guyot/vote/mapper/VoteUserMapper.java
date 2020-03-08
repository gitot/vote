package com.guyot.vote.mapper;

import com.guyot.vote.entity.VoteUser;
import com.guyot.vote.entity.VoteUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteUserMapper {
    long countByExample(VoteUserCriteria example);

    int deleteByExample(VoteUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoteUser record);

    int insertSelective(VoteUser record);

    List<VoteUser> selectByExample(VoteUserCriteria example);

    VoteUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoteUser record, @Param("example") VoteUserCriteria example);

    int updateByExample(@Param("record") VoteUser record, @Param("example") VoteUserCriteria example);

    int updateByPrimaryKeySelective(VoteUser record);

    int updateByPrimaryKey(VoteUser record);
}