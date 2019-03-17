package com.powersi.pcloud.moniter.pojo;

/**
 * 网络速度上传，下载（单位K字节）
 * @author 彭刚
 *
 */
public class MoniterData_Network extends MoniterData{
	private static final long serialVersionUID = 1L;
	private float upload_speed;//上行速度，单位K字节 /s
	private float download_speed;//下行速度，单位K字节 /s
	
	public MoniterData_Network() {
		super("NETWORK");
	}

	public float getUpload_speed() {
		return upload_speed;
	}

	public void setUpload_speed(float upload_speed) {
		this.upload_speed = upload_speed;
	}

	public float getDownload_speed() {
		return download_speed;
	}

	public void setDownload_speed(float download_speed) {
		this.download_speed = download_speed;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * 得到上行、下行速度中的最大值
	 * @return
	 */
	public float getMaxSpeed(){
		if (download_speed > upload_speed) {
			return download_speed;
		}
		return upload_speed;
	}
	
}
