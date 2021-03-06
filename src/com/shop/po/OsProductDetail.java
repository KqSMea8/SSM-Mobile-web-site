package com.shop.po;
// Generated 2018-9-26 17:58:28 by Hibernate Tools 5.3.0.Beta2

import java.util.Date;

/**
 * OsProductDetail generated by hbm2java
 */
public class OsProductDetail implements java.io.Serializable {

	private Long productDetailId;
	private Long productId;
	private String description;
	private Date createTime;
	private Date updateTime;

	public OsProductDetail() {
	}

	public OsProductDetail(Long productId, String description, Date createTime, Date updateTime) {
		this.productId = productId;
		this.description = description;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getProductDetailId() {
		return this.productDetailId;
	}

	public void setProductDetailId(Long productDetailId) {
		this.productDetailId = productDetailId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		 this.description = description == null ? null : description.trim();
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

}
