package com.cloud.dao.user.mapper;

import com.cloud.dao.user.entity.SaasUser;
import com.cloud.dao.user.entity.SaasUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaasUserMapper {
    int countByExample(SaasUserExample example);

    int deleteByExample(SaasUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SaasUser record);

    int insertSelective(SaasUser record);

    List<SaasUser> selectByExampleWithBLOBs(SaasUserExample example);

    List<SaasUser> selectByExample(SaasUserExample example);

    SaasUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SaasUser record, @Param("example") SaasUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SaasUser record, @Param("example") SaasUserExample example);

    int updateByExample(@Param("record") SaasUser record, @Param("example") SaasUserExample example);

    int updateByPrimaryKeySelective(SaasUser record);

    int updateByPrimaryKeyWithBLOBs(SaasUser record);

    int updateByPrimaryKey(SaasUser record);
}