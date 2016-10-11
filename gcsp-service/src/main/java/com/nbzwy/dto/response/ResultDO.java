package com.nbzwy.dto.response;

import java.io.Serializable;

/**
 * Created by Marty on 2015-9-29.
 */
public class ResultDO<T> implements Serializable {
	private static final long serialVersionUID = -8900841586477402222L;
	/**
     * 返回结果码 0：成功  1：失败
     */
    private int retCode;
    private String errMsg;
    /**
     * 实际返回结果
     */
    private T module;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getModule() {
        return module;
    }

    public void setModule(T module) {
        this.module = module;
    }
    
    /** 判断返回结果是否成功 */
	public boolean success() {
		return retCode == 0;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer("Result");
		if(module!=null){
			result.append("["+module.getClass().getSimpleName()+"]");
		}
		result.append(": {resultCode="+retCode);
		if(errMsg!=null){
			result.append(", resultMsg="+errMsg);
		}
		result.append(" }");
		return result.toString();
	}
}
