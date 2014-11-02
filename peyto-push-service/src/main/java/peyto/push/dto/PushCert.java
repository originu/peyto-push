package peyto.push.dto;

import peyto.push.common.types.PushType;


public interface PushCert {

	public String getAppId();
	public String getAppDesc();
	public PushType getPushType();
	
}
