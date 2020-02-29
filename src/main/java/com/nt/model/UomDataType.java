package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "UOMTAB")
public class UomDataType {
	@Id
	@Column(name = "UID1")
	@GeneratedValue
	private int uid;
	@Column(name = "UTYPE")
	private String uomType;
	@Column(name = "UMODEL")
	private String uomModel;
	@Column(name = "UDESC")
	private String uomDesc;
	
	public UomDataType() {
		
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomModel() {
		return uomModel;
	}
	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}
	public String getUomDesc() {
		return uomDesc;
	}
	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}
	@Override
	public String toString() {
		return "UomDataType [uid=" + uid + ", uomType=" + uomType + ", uomModel=" + uomModel + ", uomDesc=" + uomDesc
				+ "]";
	}
	

}
