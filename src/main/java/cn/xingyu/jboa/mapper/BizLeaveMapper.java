package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.BizLeave;
import cn.xingyu.jboa.pojo.BizLeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizLeaveMapper {
    int countByExample(BizLeaveExample example);

    int deleteByExample(BizLeaveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizLeave record);

    int insertSelective(BizLeave record);

    List<BizLeave> selectByExample(BizLeaveExample example);

    BizLeave selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizLeave record, @Param("example") BizLeaveExample example);

    int updateByExample(@Param("record") BizLeave record, @Param("example") BizLeaveExample example);

    int updateByPrimaryKeySelective(BizLeave record);

    int updateByPrimaryKey(BizLeave record);
}