package com.nbzwy.lib.common.constant;

public class EnumConstants {
	interface Enumable {
		int getCode();
		String getName();
	}
	//申请类型
	//1:开票申请,2:取消开票申请,3:发票作废申请,4:抄税申请
	public enum ApplicationType implements Enumable {
		KP(1, "开票申请"),
		QXKP(2,"取消开票申请"),
		FPZF(3,"发票作废申请"),
		CS(4,"抄税申请");
		private int code;
		private String name;
		ApplicationType(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }
		
		public static ApplicationType valueOf(int code) {
	        for (ApplicationType e : ApplicationType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//申请状态
	public enum ApplicationStatus implements Enumable {
		TJZ(0,"添加中"),
		WSH(1, "未审核"),
		SHBTG(2,"审核不通过"),
		SHTG(3,"审核通过"),
		QXZ(10,"取消中"),
		QXCG(11,"取消成功"),
		QXSB(12,"取消失败"),
		BFQXCG(13,"部分取消成功");
		private int code;
		private String name;
		ApplicationStatus(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static ApplicationStatus valueOf(int code) {
	        for (ApplicationStatus e : ApplicationStatus.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//发票来源类型
	public enum InvoiceSourceType implements Enumable {
		DS(1, "电商"),
		LS(2,"零售"),
		B2BCG(3,"B2B采购");
		private int code;
		private String name;
		InvoiceSourceType(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static InvoiceSourceType valueOf(int code) {
	        for (InvoiceSourceType e : InvoiceSourceType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//发票种类
	public enum InvoiceKind implements Enumable {
		ZZPP(1, "纸质普票"),
		ZZZP(2, "纸质专票"),
		DZPP(3,"电子普票"),
		DZZP(4,"电子专票"),
		ZZGZ(5,"纸质冠名");
		private int code;
		private String name;
		InvoiceKind(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static InvoiceKind valueOf(int code) {
	        for (InvoiceKind e : InvoiceKind.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//发票类型
	public enum InvoiceType implements Enumable {
		ZP(0, "正票"),
		HP(1,"红票");
		private int code;
		private String name;
		InvoiceType(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static InvoiceType valueOf(int code) {
	        for (InvoiceType e : InvoiceType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//发票状态
	public enum InvoiceStatus implements Enumable {
		WSH(1, "未审核"),
		SHTG(2,"审核通过"),
		SHBTG(3,"审核不通过"),
		YQX(4,"已取消"),
		FSSB(5, "发送失败"),
		FSCG(6,"发送成功"),
		KPYC(7,"开票异常"),
		KPSB(8,"开票失败"),
		KPCG(9, "开票成功"),
		YZF(10,"已作废"),
		YCS(11,"已抄税"),
		YHC(12,"已红冲");
		private int code;
		private String name;
		InvoiceStatus(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static InvoiceStatus valueOf(int code) {
	        for (InvoiceStatus e : InvoiceStatus.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//操作锁定
	public enum OperateLock implements Enumable {
		WSD(0, "未锁定"),
		ZDSD(1,"自动锁定"),
		SDSD(2,"手动锁定");
		private int code;
		private String name;
		OperateLock(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static MessageStatus valueOf(int code) {
	        for (MessageStatus e : MessageStatus.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//推送信息状态
	public enum MessageStatus implements Enumable {
		WFS(1, "未发送"),
		FSCG(2,"发送成功"),
		FSSB(3,"发送失败");
		private int code;
		private String name;
		MessageStatus(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static MessageStatus valueOf(int code) {
	        for (MessageStatus e : MessageStatus.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	
	//发票行性质
	public enum RowType implements Enumable {
		ZCH(0, "正常行"),
		ZKH(1,"折扣行"),
		BZKH(2,"被折扣行");
		private int code;
		private String name;
		RowType(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static RowType valueOf(int code) {
	        for (RowType e : RowType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	
	//推送方式
	public enum MessageSendType implements Enumable {
		BTS(0, "不推送"),
		DXTS(1,"短信"),
		WXTS(2,"微信"),
		YXTS(3,"邮箱");
		private int code;
		private String name;
		MessageSendType(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static MessageSendType valueOf(int code) {
	        for (MessageSendType e : MessageSendType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	
	//推送方式
	public enum BuyerCompantyType implements Enumable {
		QY(0, "企业"),
		JGSYDW(1,"机关事业单位"),
		GR(2,"个人"),
		QT(3,"其它");
		private int code;
		private String name;
		BuyerCompantyType(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static BuyerCompantyType valueOf(int code) {
	        for (BuyerCompantyType e : BuyerCompantyType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//下载状态
	public enum DownloadStatus implements Enumable {
		WXZ(0, "未下载"),
		XZCG(1,"下载成功"),
		XZSB(2,"下载失败");
		private int code;
		private String name;
		DownloadStatus(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static BuyerCompantyType valueOf(int code) {
	        for (BuyerCompantyType e : BuyerCompantyType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
	//是否已生成推送信息
	public enum CreateMessage implements Enumable {
		WSC(0, "未生成"),
		YSC(1,"已生成");
		private int code;
		private String name;
		CreateMessage(int code, String name) {
			this.code = code;
			this.name = name;
		}
		public int getCode() { return code; }
		public String getName() { return name; }

		public static InvoiceType valueOf(int code) {
	        for (InvoiceType e : InvoiceType.values()) {
	            if (e.getCode() == code) {
	                return e;
	            }
	        }
	        return null;
	    }
	}
}
