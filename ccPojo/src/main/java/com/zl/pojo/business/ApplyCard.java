package com.zl.pojo.business;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 *信用卡申请详情表实体类
 */
public class ApplyCard {
	private int id;								//主键id
	private String applyNum;					//申请编号			apply_num
	private int cardType;						//申请卡种id		apply_card_id
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date applyTime;						//申请时间			apply_time
	private String applyState;					//申请状态			apply_state
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date applyAcceptTime;				//受理时间			apply_accept_time
	private String applyIDcard;					//申请身份证号		apply_idcard
	private int creditPoint;					//用户信用分		apply_credit_points
	private String checkState;					//核实状态			apply_check_state
	private long applyCardNum;					//发放卡号			apply_cardnum
	private int client;						//用户id			apply_client_id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApplyNum() {
		return applyNum;
	}
	public void setApplyNum(String applyNum) {
		this.applyNum = applyNum;
	}
	
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getApplyState() {
		return applyState;
	}
	public void setApplyState(String applyState) {
		this.applyState = applyState;
	}
	public Date getApplyAcceptTime() {
		return applyAcceptTime;
	}
	public void setApplyAcceptTime(Date applyAcceptTime) {
		this.applyAcceptTime = applyAcceptTime;
	}
	public String getApplyIDcard() {
		return applyIDcard;
	}
	public void setApplyIDcard(String applyIDcard) {
		this.applyIDcard = applyIDcard;
	}
	public int getCreditPoint() {
		return creditPoint;
	}
	public void setCreditPoint(int creditPoint) {
		this.creditPoint = creditPoint;
	}
	public String getCheckState() {
		return checkState;
	}
	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}
	public long getApplyCardNum() {
		return applyCardNum;
	}
	public void setApplyCardNum(long applyCardNum) {
		this.applyCardNum = applyCardNum;
	}
	public int getCardType() {
		return cardType;
	}
	public void setCardType(int cardType) {
		this.cardType = cardType;
	}
	public int getClient() {
		return client;
	}
	public void setClient(int client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "ApplyCard [id=" + id + ", applyNum=" + applyNum + ", cardType=" + cardType + ", applyTime=" + applyTime
				+ ", applyState=" + applyState + ", applyAcceptTime=" + applyAcceptTime + ", applyIDcard=" + applyIDcard
				+ ", creditPoint=" + creditPoint + ", checkState=" + checkState + ", applyCardNum=" + applyCardNum
				+ ", client=" + client + "]";
	}
	
	
}
