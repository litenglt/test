package com.powersi.pcloud.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.powersi.comm.exception.ApusException;
import com.powersi.comm.utils.TimeUtils;

public class PcloudDateUtil {
	
	/**
	 * 获取当前季度第一天
	 * @return
	 * String
	 */
    public static String getCurSeasonDateStr(){  
    	Calendar c = Calendar.getInstance();  
        int month = c.get(Calendar.MONTH) + 1;  
        String quarter=c.get(Calendar.YEAR)+"-";    
        if(month>=1&&month<=3){     
            quarter += "01-01";     
        }     
        if(month>=4&&month<=6){     
        	 quarter += "04-01";     
        }     
        if(month>=7&&month<=9){     
        	 quarter += "07-01";          
        }     
        if(month>=10&&month<=12){     
        	 quarter += "10-01";       
        }
        return quarter;
    }
    
    /**
     * 获取当前季度第一天
     * @return
     * Date
     */
    public static Date getCurSeasonDate(){
    	return TimeUtils.parseDate(getCurSeasonDateStr(), "yyyy-MM-dd");
    }
    
    /**
	 * 得到两日期之间的月数
	 * @param s
	 * @param e
	 * @return
	 */
	public static int getMonth(Date s, Date e) {
		if (s.after(e)) {
			Date t = s;
			s = e;
			e = t;
		}
		Calendar start = Calendar.getInstance();
		start.setTime(s);
		Calendar end = Calendar.getInstance();
		end.setTime(e);
		Calendar temp = Calendar.getInstance();
		temp.setTime(e);
		temp.add(Calendar.DATE, 1);

		int y = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int m = end.get(Calendar.MONTH) - start.get(Calendar.MONTH);

		if ((start.get(Calendar.DATE) == 1) && (temp.get(Calendar.DATE) == 1)) {// 前后都不破月
			return y * 12 + m + 1;
		} else if ((start.get(Calendar.DATE) != 1)
				&& (temp.get(Calendar.DATE) == 1)) {// 前破月后不破朄1 7
			return y * 12 + m;
		} else if ((start.get(Calendar.DATE) == 1)
				&& (temp.get(Calendar.DATE) != 1)) {// 前不破月后破朄1 7
			return y * 12 + m;
		} else {// 前破月后破月
			return (y * 12 + m - 1) < 0 ? 0 : (y * 12 + m);
		}
	}
	
	/**
	 * 人性化显示日期
	 * @param days 处理天数，自定义常量
	 * @param d 需要处理的日期
	 * @return
	 * String 返回显示到界面的数据(今天，昨天，前天，第3天前...)
	 * @throws ParseException 
	 */
	public static String getManWatchDate(int days,Date d) throws ParseException {
		String humanizeDate = "";
		Calendar c = Calendar.getInstance(); 
		
		//获取当前日期的毫秒
		long currentMS = c.getTimeInMillis();
		
		//获取传入日期的毫秒,转化成yyyy-MM-dd,不去判断时分秒。
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String param = format.format(d);
		Date paramDate = format.parse(param);
		c.setTime(paramDate);
		long paramMS = c.getTimeInMillis();
		
		//相差天数
		int between_days = (int) ((currentMS-paramMS)/(1000*3600*24));  
		//进行比较，如果相差的天数大于处理天数，则不进行处理，直接显示日期
		if(between_days >= 0 && between_days <= days) {
			//处理天数是否大于三天
			switch (between_days) {
				case 0:
					humanizeDate = "今天";
					break;
				case 1:
					humanizeDate = "昨天";
					break;
				case 2:
					humanizeDate = "前天";
					break;
				default:
					humanizeDate = between_days+"天前";
					break;
			}
			return humanizeDate;
		}else {
			return param;
		}
	}
	
	/**
	 * 将时间字符串按照相应格式转换成字符串类型
	 * @param timeStr 时间字符串
	 * @param format 时间格式 如 yyyMMdd
	 * @return
	 */
	public static String timeStrTostr(String timeStr,String format){
		return timeDateToStr(timeStrToDate(timeStr, format), format);
	}
	/**
	 * 将时间字符串按照相应格式转换成Date类型
	 * @param timeStr 时间字符串
	 * @param format 时间格式 如 yyyMMdd
	 * @return
	 */
	public static Date timeStrToDate(String timeStr,String format){
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(timeStr);
		} catch (ParseException e) {
			throw new ApusException("时间格式转换异常",e);
		}
		return date;
	}
	
	/**
	 * 将时间按照相应格式转换成Date类型
	 * @param timeDate 时间字符串
	 * @param format 时间格式 如"yyyy-MM-dd"
	 * @return
	 */
	public static String timeDateToStr(Date timeDate,String format){
		String dateStr = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			dateStr = sdf.format(timeDate);
		} catch (Exception e) {
			throw new ApusException("时间格式转换异常",e);
		}
		return dateStr;
	}
	
	/**
	 * 计算两个时间相差天数
	 * @param startTime 开始时间yyyy-MM-dd
	 * @param endTime 结束时间yyyy-MM-dd
	 * @return
	 * long
	 */
	public static long betweenDays(String startTime,String endTime) {
		Date start = timeStrToDate(startTime, "yyyy-MM-dd");
		Date end = timeStrToDate(endTime, "yyyy-MM-dd");
		return getDaysBetween(start, end);
	}
	
	/**
	 * 计算两个日期之间相差的天数 
	 * @param beginDate
	 * @param endDate
	 * @return
	 * int
	 */
	public static int getDaysBetween(Date beginDate,Date endDate) {     
        long between_days=(getMilliseBetween(beginDate, endDate))/(1000*3600*24);     
    	return Integer.parseInt(String.valueOf(between_days));            
    }   
	
	/**
	 * 计算两个日期之间相差的分钟 endDate距离beginDate
	 * @param beginDate
	 * @param enddate
	 * @return 
	 * int
	 */
	public static int getMinuteBetween(Date beginDate,Date endDate) {     
		long between_Minute=(getMilliseBetween(beginDate, endDate))/(1000*3600);     
		return Integer.parseInt(String.valueOf(between_Minute));            
	}  

	/**
	 * 计算两个日期之间相差的秒数
	 * @param beginDate
	 * @param endDate
	 * @return
	 * int
	 */
	public static long getSecondBetween(Date beginDate,Date endDate) {
		return getMilliseBetween(beginDate, endDate)/(1000);
	}
	
	/**
	 * 计算两个日期之间相差的毫秒数
	 * @param beginDate
	 * @param endDate
	 * @return
	 * long
	 */
	private static long getMilliseBetween(Date beginDate,Date endDate) {
		Calendar cal = Calendar.getInstance();     
		cal.setTime(beginDate);     
		long time1 = cal.getTimeInMillis();                  
		cal.setTime(endDate);     
		long time2 = cal.getTimeInMillis();   
		return (time2-time1);
	}
	
	/**
	 * 提取两个时间之间的小时数据
	 * @param startTime yyyy-MM-dd HH:mm:ss
	 * @param endTime yyyy-MM-dd HH:mm:ss
	 * @return
	 * ArrayList<String>
	 */
	public static ArrayList<String> getIncludeHourArray(String startTime,String endTime) {
		Date start = timeStrToDate(startTime, "yyyy-MM-dd HH:mm:ss");
		Date end = timeStrToDate(endTime, "yyyy-MM-dd HH:mm:ss");
		return getIncludeHourArray(start, end);
	}
	
	/**
	 * 提取两个时间之间的小时数据
	 * @param beginDate
	 * @param endDate
	 * @return
	 * ArrayList<String>
	 */
	public static ArrayList<String> getIncludeHourArray(Date beginDate,Date endDate) {
		ArrayList<String> retArr = new ArrayList<String>();
		
		Calendar e = Calendar.getInstance(); 
		e.setTime(endDate);
		e.set(Calendar.MINUTE, 0);
		e.set(Calendar.SECOND, 0);
		
		Calendar b = Calendar.getInstance(); 
		b.setTime(beginDate);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.SECOND, 0);
		
		//判断是否是同一天
		boolean equalDayFlag = (e.get(Calendar.YEAR) == b.get(Calendar.YEAR) && e.get(Calendar.DAY_OF_MONTH) == b.get(Calendar.DAY_OF_MONTH) );
		//判断开始时间是否以及大于结束时间
		while( e.compareTo(b) >= 0) {
			String hour_str = b.get(Calendar.HOUR_OF_DAY) < 10 ? "0" + b.get(Calendar.HOUR_OF_DAY) : b.get(Calendar.HOUR_OF_DAY) + "" ;
			if(equalDayFlag) {
				retArr.add( hour_str);
			}else {
				String month_str = (b.get(Calendar.MONTH) + 1) < 10 ?  "0"+ (b.get(Calendar.MONTH) + 1) : (b.get(Calendar.MONTH) + 1) + "" ;
				String day_str = b.get(Calendar.DAY_OF_MONTH) < 10 ?  "0"+ b.get(Calendar.DAY_OF_MONTH) : b.get(Calendar.DAY_OF_MONTH) + "" ;
				retArr.add( month_str + "-" + day_str + " " + hour_str);
			}
			//每次循环加一个小时
			b.add(Calendar.HOUR_OF_DAY, 1);
		}
		return retArr;
	}
	
	/**
	 * 提取两个时间之间的天数据
	 * @param startTime yyyy-MM-dd HH:mm:ss
	 * @param endTime yyyy-MM-dd HH:mm:ss
	 * @return
	 * ArrayList<String>
	 */
	public static ArrayList<String> getIncludeDayArray(String startTime,String endTime) {
		Date start = timeStrToDate(startTime, "yyyy-MM-dd");
		Date end = timeStrToDate(endTime, "yyyy-MM-dd");
		return getIncludeDayArray(start, end);
	}
	
	/**
	 * 提取两个时间之间的天数据
	 * @param startTime
	 * @param endTime
	 * @return
	 * ArrayList<String>
	 * 如：[04-08, 04-09, 04-10, 04-11, 04-12]
	 */
	public static ArrayList<String> getIncludeDayArray(Date beginDate,Date endDate) {
		ArrayList<String> retArr = new ArrayList<String>();
		
		Calendar e = Calendar.getInstance(); 
		e.setTime(endDate);
		e.set(Calendar.MINUTE, 0);
		e.set(Calendar.SECOND, 0);
		e.set(Calendar.HOUR, 0);
		
		Calendar b = Calendar.getInstance(); 
		b.setTime(beginDate);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.HOUR, 0);
		
		//判断开始时间是否以及大于结束时间
		while( e.compareTo(b) >= 0) {
			String month_str = (b.get(Calendar.MONTH) + 1) < 10 ?  "0"+ (b.get(Calendar.MONTH) + 1) : (b.get(Calendar.MONTH) + 1) + "" ;
			String day_str = b.get(Calendar.DAY_OF_MONTH) < 10 ?  "0"+ b.get(Calendar.DAY_OF_MONTH) : b.get(Calendar.DAY_OF_MONTH) + "" ;
			retArr.add( month_str + "-" + day_str );
			//每次循环加一天
			b.add(Calendar.DAY_OF_MONTH, 1);
		}
		return retArr;
	}
	
	/**
	 * 提取两个时间之间的天数据
	 * @param startTime yyyy-MM-dd
	 * @param endTime yyyy-MM-dd
 	 * @param table_prefix 表的前缀，可为空
	 * @return
	 * ArrayList<String>
	 * 如：[table_prefix+yyyyMMdd, table_prefix+yyyyMMdd, table_prefix+yyyyMMdd, table_prefix+yyyyMMdd]
	 */
	public static ArrayList<String> getIncludeDayArray_table(String startTime,String endTime,String table_prefix) {
		Date start = timeStrToDate(startTime, "yyyy-MM-dd");
		Date end = timeStrToDate(endTime, "yyyy-MM-dd");
		return getIncludeDayArray_table(start, end, table_prefix);
	}
	
	/**
	 * 提取两个时间之间的天数据
	 * @param startTime
	 * @param endTime
 	 * @param table_prefix 表的前缀，可为空
	 * @return
	 * ArrayList<String>
	 * 如：[table_prefix+yyyyMMdd, table_prefix+yyyyMMdd, table_prefix+yyyyMMdd, table_prefix+yyyyMMdd]
	 */
	public static ArrayList<String> getIncludeDayArray_table(Date beginDate,Date endDate,String table_prefix) {
		ArrayList<String> retArr = new ArrayList<String>();
		
		Calendar e = Calendar.getInstance(); 
		e.setTime(endDate);
		e.set(Calendar.MINUTE, 0);
		e.set(Calendar.SECOND, 0);
		e.set(Calendar.HOUR, 0);
		
		Calendar b = Calendar.getInstance(); 
		b.setTime(beginDate);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.HOUR, 0);
		
		//判断开始时间是否以及大于结束时间
		while( e.compareTo(b) >= 0) {
			String month_str = (b.get(Calendar.MONTH) + 1) < 10 ?  "0"+ (b.get(Calendar.MONTH) + 1) : (b.get(Calendar.MONTH) + 1) + "" ;
			String day_str = b.get(Calendar.DAY_OF_MONTH) < 10 ?  "0"+ b.get(Calendar.DAY_OF_MONTH) : b.get(Calendar.DAY_OF_MONTH) + "" ;
			retArr.add(StringUtils.isBlank(table_prefix) ? "" :table_prefix + b.get(Calendar.YEAR) + month_str + day_str );
			//每次循环加一天
			b.add(Calendar.DAY_OF_MONTH, 1);
		}
		return retArr;
	}
	
	/**
	 * 提取两个时间之间的天数据
	 * @param startTime yyyy-MM
	 * @param endTime yyyy-MM	 
	 * @param table_prefix 表的前缀，可为空
	 * @return
	 * ArrayList<String>
	 * 如：[table_prefix+yyyyMM, table_prefix+yyyyMM, table_prefix+yyyyMM]
	 */
	public static ArrayList<String> getIncludeMonthArray_table(String startTime,String endTime,String table_prefix) {
		Date start = timeStrToDate(startTime, "yyyy-MM");
		Date end = timeStrToDate(endTime, "yyyy-MM");
		return getIncludeMonthArray_table(start, end, table_prefix);
	}
	
	/**
	 * 提取两个时间之间的月数据
	 * @param startTime
	 * @param endTime
	 * @param table_prefix 表的前缀，可为空
	 * @return
	 * ArrayList<String>
	 * 如：[table_prefix+yyyyMM, table_prefix+yyyyMM, table_prefix+yyyyMM]
	 */
	public static ArrayList<String> getIncludeMonthArray_table(Date beginDate,Date endDate,String table_prefix) {
		ArrayList<String> retArr = new ArrayList<String>();
		
		Calendar e = Calendar.getInstance(); 
		e.setTime(endDate);
		e.set(Calendar.MINUTE, 0);
		e.set(Calendar.SECOND, 0);
		e.set(Calendar.HOUR, 0);
		
		Calendar b = Calendar.getInstance(); 
		b.setTime(beginDate);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.MINUTE, 0);
		b.set(Calendar.HOUR, 0);
		
		//判断开始时间是否以及大于结束时间
		while( e.compareTo(b) >= 0) {
			String month_str = (b.get(Calendar.MONTH) + 1) < 10 ?  "0"+ (b.get(Calendar.MONTH) + 1) : (b.get(Calendar.MONTH) + 1) + "" ;
			retArr.add(StringUtils.isBlank(table_prefix) ? "" :table_prefix + b.get(Calendar.YEAR) + month_str );
			//每次循环加一月
			b.add(Calendar.MONTH, 1);
		}
		return retArr;
	}
	
	/**
	 * 获取之前的时间
	 * @param date 处理时间
 	 * @param how_long 获取距离处理时间多久之前的时间 ，天
	 * @param format 返回格式
	 * @return
	 * String
	 */
	public static String getbeforeDate(Date date,int how_long,String format ) {
		Calendar b = Calendar.getInstance(); 
		//每次循环加一天
		b.add(Calendar.DAY_OF_MONTH, -how_long);
		return timeDateToStr(b.getTime(), format);
	}
	
}
