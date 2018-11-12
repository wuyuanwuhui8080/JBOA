package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.SysPosition;
import cn.xingyu.jboa.pojo.SysPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPositionMapper {
    int countByExample(SysPositionExample example);

    int deleteByExample(SysPositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPosition record);

    int insertSelective(SysPosition record);

    List<SysPosition> selectByExample(SysPositionExample example);

    SysPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPosition record, @Param("example") SysPositionExample example);

    int updateByExample(@Param("record") SysPosition record, @Param("example") SysPositionExample example);

    int updateByPrimaryKeySelective(SysPosition record);

    int updateByPrimaryKey(SysPosition record);
}