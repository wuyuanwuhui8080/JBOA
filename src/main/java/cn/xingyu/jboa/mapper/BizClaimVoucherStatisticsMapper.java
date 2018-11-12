package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.BizClaimVoucherStatistics;
import cn.xingyu.jboa.pojo.BizClaimVoucherStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizClaimVoucherStatisticsMapper {
    int countByExample(BizClaimVoucherStatisticsExample example);

    int deleteByExample(BizClaimVoucherStatisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizClaimVoucherStatistics record);

    int insertSelective(BizClaimVoucherStatistics record);

    List<BizClaimVoucherStatistics> selectByExample(BizClaimVoucherStatisticsExample example);

    BizClaimVoucherStatistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizClaimVoucherStatistics record, @Param("example") BizClaimVoucherStatisticsExample example);

    int updateByExample(@Param("record") BizClaimVoucherStatistics record, @Param("example") BizClaimVoucherStatisticsExample example);

    int updateByPrimaryKeySelective(BizClaimVoucherStatistics record);

    int updateByPrimaryKey(BizClaimVoucherStatistics record);
}