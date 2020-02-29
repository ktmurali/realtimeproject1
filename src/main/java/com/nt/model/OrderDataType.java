package com.nt.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ORDERTAB")
public class OrderDataType {
	
	@Id
	@GeneratedValue(generator = "gen1")
	@GenericGenerator(name = "gen1",strategy = "increment")
	@Column(name = "OID")
	private Integer oid;
	@Column(name = "OMODE")
	private String orderMode;
	@Column(name = "OCODE")
	private String orderCode;
	@Column(name = "OMETHOD")
	private String ordMethod;
	@ElementCollection(fetch = FetchType.EAGER)
	@OrderColumn(name = "pos")
	@CollectionTable(name = "OMCTAB",joinColumns =@JoinColumn(name = "oid"))
	@Column(name = "OACPT")
	private List<String> orderAccept;
	@Column(name = "ODESC")
	private String orderDesc;
	
	public OrderDataType() {
		
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOrderMode() {
		return orderMode;
	}
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public List<String> getOrderAccept() {
		return orderAccept;
	}
	public void setOrderAccept(List<String> orderAccept) {
		this.orderAccept = orderAccept;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	@Override
	public String toString() {
		return "OrderDataType [oid=" + oid + ", orderMode=" + orderMode + ", orderCode=" + orderCode + ", orderAccept="
				+ orderAccept + ", orderDesc=" + orderDesc + "]";
	}
	

}
