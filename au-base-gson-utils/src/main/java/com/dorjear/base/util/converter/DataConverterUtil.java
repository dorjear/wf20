package com.dorjear.base.util.converter;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.BooleanConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.lang.StringUtils;

public class DataConverterUtil {
	private static final String AU_DATE_FORMAT = "dd/MM/yyyy";
	private static DataConverterUtil instance = null;
//	private static DateConverter dateConverter;
	private static BooleanConverter booleanConverter;
	private static IntegerConverter integerConverter;
	private static DoubleConverter doubleConverter;
	private static BigDecimalConverter bigDecimalConverter;
	
	public static String WEB_ROOT_PATH = "";
	private DataConverterUtil(){
//		dateConverter = new DateConverter(null);
//		dateConverter.setPattern(AU_DATE_FORMAT);
		booleanConverter = new BooleanConverter(null);
		integerConverter = new IntegerConverter(null);
		doubleConverter = new DoubleConverter(null);
		bigDecimalConverter = new BigDecimalConverter(null);
	}
	static {
//		dateConverter = new DateConverter(null);
//		dateConverter.setPattern(AU_DATE_FORMAT);
		booleanConverter = new BooleanConverter(false);
		integerConverter = new IntegerConverter(null);
		doubleConverter = new DoubleConverter(null);
		bigDecimalConverter = new BigDecimalConverter(null);
	}
	public static synchronized DataConverterUtil getInstance() {
	if (instance==null)
		instance=new DataConverterUtil();
		return instance;
	}
	// Boolean
	public static boolean convertStringToBoolean(String booleanStr){
		return (Boolean) booleanConverter.convert(boolean.class, booleanStr);
	}
	
	public static String convertBooleanToYN(Boolean bool){
		if(bool==null) return null;
		if(bool==true) return "Y";
		if(bool==false) return "N";
		return null;
	}
	// Date
	public static Date convertStringToDate(String dateStr){
		try{
			return new SimpleDateFormat(AU_DATE_FORMAT).parse(dateStr);
		}catch(Exception e){
			return null;
		}
	}
	public static String convertDateToString(Date date){
		try{
			return new SimpleDateFormat(AU_DATE_FORMAT).format(date);
		}catch(Exception e){
			return null;
		}
	}
	// Array
	public static <T> String convertArrayToDelimString(T[] array, String delim){
		String result = null;
		if(array==null) return result;
		StringBuffer sb = new StringBuffer();
		for(T t: array){
			sb.append(delim);
			sb.append(t);
		}
		if(sb.length()>0){
			result = sb.substring(1);
		}
		return result;
	}

	public static String[] convertDelimStringToArray(String source, String delim){
		if(StringUtils.isEmpty(source)) return null;
		String[] result = source.split(delim);
		return result;
	}

	public static <T> List<T> convertArrayToList(T[] array){
		if(array==null) return null;
		return Arrays.asList(array);
	}

	public static <T> Object[] convertListToArray(List<T> tList){
		if(tList==null) return null;
		return tList.toArray();
	}

	public static <T> Set<T> convertArrayToSet(T[] array){
		if(array==null) return null;
		Set<T> result = new HashSet<T>();
		for(T t:array){
			result.add(t);
		}
		return result;
	}
	public static <T> Object[] convertSetToArray(Set<T> tSet){
		if(tSet==null) return null;
		Object[] result = tSet.toArray();
		return result;
	}

	//Number To String
	public static String convertNumberToString(Number i){
		if(i==null) return null;
		return i.toString();
	}
	public static Integer convertStringToInteger(String s){
		return (Integer) integerConverter.convert(Integer.class, s);
	}
	
	//Integer
	public static int convertStringToInt(String s){
		Integer i = (Integer) integerConverter.convert(Integer.class, s);
		if(i==null) return 0;
		else return i.intValue();
	}
	
	//Double
	public static Double convertStringToDouble(String s){
		return (Double) doubleConverter.convert(Double.class, s);
	}
	
	public static double convertStringToPrimiDouble(String s){
		Double d = (Double) doubleConverter.convert(Double.class, s);
		if(d==null) return 0;
		else return d.doubleValue();
	}
	//BigDecimal
	public static BigDecimal convertStringToBigDecimal(String s){
		return (BigDecimal) bigDecimalConverter.convert(BigDecimal.class, s);
	}
	public static double convertBigDecimalToDouble(BigDecimal b) {
		if(b == null) return 0;
		return b.doubleValue();
	}
	public static BigDecimal convertDoubleToBigDecimal(Double d) {
		if(d == null) return null;
		return new BigDecimal(d.doubleValue());
	}
}
