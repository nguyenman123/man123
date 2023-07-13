package com.hoclaptrinhjavaweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


//@MappedSuperclass:Khi tao cac field tu cac class con thi cac field tu BaseEntity se duoc apply cho cac class con
@MappedSuperclass
public abstract class BaseEntity {

	/*@Id co 2 chuc nang: 1.Not null, 2.Primary key
	 * @GeneratedValue: ho tro tu tang ID len(= auto-increment)
	 * @Column: dung de tu dinh nghia ten trong table SQL khi tao 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "createdDate")
	private Date createddate;
	
	@Column(name = "modifiedDate")
	private Date modifieddate;
	
	@Column(name = "createdBy")
	private String createdby;
	
	@Column(name = "modifiedBy")
	private String modifiedby;
	
	public Long getId() {
		return id;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	
	
	
}
