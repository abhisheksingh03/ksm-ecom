package com.ksm.ecom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_test")
public class App {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="APP_TEXT")
	private String appText;
	@Column(name="APP_TEXT_CONST")
	private String appTextConst;
	@Column(name="IS_DELETED")
	private boolean deleted;
	@Column(name="STATUS")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppText() {
		return appText;
	}

	public void setAppText(String appText) {
		this.appText = appText;
	}

	public String getAppTextConst() {
		return appTextConst;
	}

	public void setAppTextConst(String appTextConst) {
		this.appTextConst = appTextConst;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "App [id=" + id + ", appText=" + appText + ", appTextConst=" + appTextConst + ", deleted=" + deleted
				+ ", status=" + status + "]";
	}

}
