package com.ksm.ecom.modal;

public class AppVO {
	private Long id;
	private String appText;
	private String appTextConst;
	private boolean deleted;
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
