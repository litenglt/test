package com.powersi.pcloud.utils;

import java.math.BigDecimal;

/**
 * 类型转换工具类
 * @author lingang
 * @time 2018年4月8日下午10:26:26
 *
 */
public class ConvertUtil {
	
	/**
	*将Object转换为String
	*/
	public static String objectToString(Object o){
        if(o == null){
            return "";
        }else if(o instanceof String){
            return (String)o;
        }else if(o instanceof Integer){
            return String.valueOf((Integer)o);
        }else if(o instanceof Long){
            return String.valueOf((Long)o);
        }else if(o instanceof Double){
            return String.valueOf((Double)o);
        }else if(o instanceof Float){
            return String.valueOf((Float)o);
        }else{
            return "";
        }
    }

	/**
	*将Object转换为Double
	*/
	public static Double objectToDouble(Object o){
        if(o instanceof BigDecimal){
            return ((BigDecimal) o).doubleValue();
        }else if(o instanceof String){
            return Double.valueOf((String)o);
        }else if(o instanceof Integer){
            return Double.valueOf((Integer)o);
        }else if(o instanceof Double){
            return (Double)o;
        }else if(o instanceof Long){
            return ((Long) o).doubleValue();
        }else{
            return 0.0;
        }
    }
}
