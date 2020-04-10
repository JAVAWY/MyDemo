package hiai.util;
/**
 * 处理字符串工具类
 * @author www.hiai.top 开发者：黄康权
 *
 */
public class StringUtil {
	/**
	 * 判断是否是空
	 */
	public static boolean isEmpty(String str){
		if(str==null||"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 判断不是为空
	 */
	public static boolean isNotEmpty(String str ){
		if((str!=null)&&!"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
}
