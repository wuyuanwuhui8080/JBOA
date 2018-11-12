package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.BizClaimVoucherDetail;
import cn.xingyu.jboa.pojo.BizClaimVoucherDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizClaimVoucherDetailMapper {
    int countByExample(BizClaimVoucherDetailExample example);

    int deleteByExample(BizClaimVoucherDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizClaimVoucherDetail record);

    int insertSelective(BizClaimVoucherDetail record);

    List<BizClaimVoucherDetail> selectByExample(BizClaimVoucherDetailExample example);

    BizClaimVoucherDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizClaimVoucherDetail record, @Param("example") BizClaimVoucherDetailExample example);

    int updateByExample(@Param("record") BizClaimVoucherDetail record, @Param("example") BizClaimVoucherDetailExample example);

    int updateByPrimaryKeySelective(BizClaimVoucherDetail record);

    int updateByPrimaryKey(BizClaimVoucherDetail record);
}