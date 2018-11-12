package cn.xingyu.jboa.pojo;

import java.util.Date;

public class BizCheckResult {
    private Long id;

    private Long claimId;

    private Date checkTime;

    private String checkerSn;

    private String result;

    private String comm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckerSn() {
        return checkerSn;
    }

    public void setCheckerSn(String checkerSn) {
        this.checkerSn = checkerSn == null ? null : checkerSn.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm == null ? null : comm.trim();
    }
}