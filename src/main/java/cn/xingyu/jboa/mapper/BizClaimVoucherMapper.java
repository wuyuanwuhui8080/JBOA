package cn.xingyu.jboa.mapper;

import cn.xingyu.jboa.pojo.BizClaimVoucher;
import cn.xingyu.jboa.pojo.BizClaimVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizClaimVoucherMapper {
    int countByExample(BizClaimVoucherExample example);

    int deleteByExample(BizClaimVoucherExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizClaimVoucher record);

    int insertSelective(BizClaimVoucher record);

    List<BizClaimVoucher> selectByExample(BizClaimVoucherExample example);

    BizClaimVoucher selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizClaimVoucher record, @Param("example") BizClaimVoucherExample example);

    int updateByExample(@Param("record") BizClaimVoucher record, @Param("example") BizClaimVoucherExample example);

    int updateByPrimaryKeySelective(BizClaimVoucher record);

    int updateByPrimaryKey(BizClaimVoucher record);
}