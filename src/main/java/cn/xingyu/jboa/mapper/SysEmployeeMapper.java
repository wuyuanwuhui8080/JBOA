package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.SysEmployee;
import cn.xingyu.jboa.pojo.SysEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEmployeeMapper {
    int countByExample(SysEmployeeExample example);

    int deleteByExample(SysEmployeeExample example);

    int deleteByPrimaryKey(String sn);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    List<SysEmployee> selectByExample(SysEmployeeExample example);

    SysEmployee selectByPrimaryKey(String sn);

    int updateByExampleSelective(@Param("record") SysEmployee record, @Param("example") SysEmployeeExample example);

    int updateByExample(@Param("record") SysEmployee record, @Param("example") SysEmployeeExample example);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);
}