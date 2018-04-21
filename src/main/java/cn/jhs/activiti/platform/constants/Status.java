package cn.jhs.activiti.platform.constants;


/**
 * 系统基础参数定义
 */
public interface Status {
	//状态码
	String SUCCESS = "000";
	String FAIL = "001";
	String NO_LOGIN = "003";
	String NO_PRIVILEGE = "004";
	
	//资源状态
	int DELETE = 0;
	int ENABLE = 1;
	int DISABLE = 2;
}
