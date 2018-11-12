package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.BizClaimVouyearStatistics;
import cn.xingyu.jboa.pojo.BizClaimVouyearStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizClaimVouyearStatisticsMapper {
    int countByExample(BizClaimVouyearStatisticsExample example);

    int deleteByExample(BizClaimVouyearStatisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizClaimVouyearStatistics record);

    int insertSelective(BizClaimVouyearStatistics record);

    List<BizClaimVouyearStatistics> selectByExample(BizClaimVouyearStatisticsExample example);

    BizClaimVouyearStatistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizClaimVouyearStatistics record, @Param("example") BizClaimVouyearStatisticsExample example);

    int updateByExample(@Param("record") BizClaimVouyearStatistics record, @Param("example") BizClaimVouyearStatisticsExample example);

    int updateByPrimaryKeySelective(BizClaimVouyearStatistics record);

    int updateByPrimaryKey(BizClaimVouyearStatistics record);
}