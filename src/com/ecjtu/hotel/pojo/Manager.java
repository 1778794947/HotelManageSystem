package com.ecjtu.hotel.pojo;

public class Manager {
	private Integer mId;
	private String mName;
	private String mPsd;

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPsd() {
		return mPsd;
	}

	public void setmPsd(String mPsd) {
		this.mPsd = mPsd;
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(Integer mId, String mName, String mPsd) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mPsd = mPsd;
	}

	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", mName=" + mName + ", mPsd=" + mPsd + "]";
	}

}
