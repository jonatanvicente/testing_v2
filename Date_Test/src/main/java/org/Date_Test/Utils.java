package org.Date_Test;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

public class Utils{

	public static boolean isSameDay(Date date1, Date date2){
		return DateUtils.isSameDay(date1, date2);
	}
	
	public static boolean isAlphanumeric(String str){
		return StringUtils.isAlphanumeric(str);
	}

	public static boolean isBlank(String str){
		return StringUtils.isBlank(str);
	}

	public static boolean isEmpty(String str){
		return StringUtils.isEmpty(str);
	}

	public static boolean isAllUpperCase(String str){
		return StringUtils.isAllUpperCase(str);
	}
	
}