package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.BizCheckResult;
import cn.xingyu.jboa.pojo.BizCheckResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizCheckResultMapper {
    int countByExample(BizCheckResultExample example);

    int deleteByExample(BizCheckResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizCheckResult record);

    int insertSelective(BizCheckResult record);

    List<BizCheckResult> selectByExample(BizCheckResultExample example);

    BizCheckResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizCheckResult record, @Param("example") BizCheckResultExample example);

    int updateByExample(@Param("record") BizCheckResult record, @Param("example") BizCheckResultExample example);

    int updateByPrimaryKeySelective(BizCheckResult record);

    int updateByPrimaryKey(BizCheckResult record);
}