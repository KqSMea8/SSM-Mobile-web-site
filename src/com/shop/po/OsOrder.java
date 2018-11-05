package com.shop.po;
// Generated 2018-9-26 17:58:28 by Hibernate Tools 5.3.0.Beta2

import java.math.BigDecimal;
import java.util.Date;

/**
 * OsOrder generated by hbm2java
 */
public class OsOrder implements java.io.Serializable {

	private Long orderId;
	private Long orderNumber;
	private Long userId;
	private Byte payType;
	private Byte shipmentTime;
	private Byte shipmentType;
	private Long shipmentAmount;
	private Byte invoiceType;
	private String invoiceTitle;
	private Byte orderStatus;
	private Date createTime;
	private Date updateTime;
	private BigDecimal orderAmount;
	private Integer orderScore;
	private BigDecimal payAmount;
	private Integer buyNumber;

	public OsOrder() {
	}

	public OsOrder(Long orderNumber, Long userId, Byte payType, Byte shipmentTime, Byte shipmentType,
			Long shipmentAmount, Byte invoiceType, String invoiceTitle, Byte orderStatus, Date createTime,
			Date updateTime, BigDecimal orderAmount, Integer orderScore, BigDecimal payAmount, Integer buyNumber) {
		this.orderNumber = orderNumber;
		this.userId = userId;
		this.payType = payType;
		this.shipmentTime = shipmentTime;
		this.shipmentType = shipmentType;
		this.shipmentAmount = shipmentAmount;
		this.invoiceType = invoiceType;
		this.invoiceTitle = invoiceTitle;
		this.orderStatus = orderStatus;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.orderAmount = orderAmount;
		this.orderScore = orderScore;
		this.payAmount = payAmount;
		this.buyNumber = buyNumber;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Byte getPayType() {
		return this.payType;
	}

	public void setPayType(Byte payType) {
		this.payType = payType;
	}

	public Byte getShipmentTime() {
		return this.shipmentTime;
	}

	public void setShipmentTime(Byte shipmentTime) {
		this.shipmentTime = shipmentTime;
	}

	public Byte getShipmentType() {
		return this.shipmentType;
	}

	public void setShipmentType(Byte shipmentType) {
		this.shipmentType = shipmentType;
	}

	public Long getShipmentAmount() {
		return this.shipmentAmount;
	}

	public void setShipmentAmount(Long shipmentAmount) {
		this.shipmentAmount = shipmentAmount;
	}

	public Byte getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(Byte invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public Byte getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Byte orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getOrderAmount() {
		return this.orderAmount;
	}

	public void  setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getOrderScore() {
		return this.orderScore;
	}

	public void setOrderScore(Integer orderScore) {
		this.orderScore = orderScore;
	}

	public BigDecimal getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public Integer getBuyNumber() {
		return this.buyNumber;
	}

	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}

}