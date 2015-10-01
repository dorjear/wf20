package com.dorjear.ralf.db.service.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CriteriaAddUtil {
	
	public static void addCriteria(List<Map<String,Object>> criterions, String propertyName, String condition, Object value, String op){
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put(DBConstants.PROPERTYNAME, propertyName);
		searchMap.put(DBConstants.VALUE, value);
		searchMap.put(DBConstants.CONDITION, condition);
		searchMap.put(DBConstants.OP, op);
		criterions.add(searchMap);
	}

	public static boolean addEqCriterionIfValueNotBlank(List<Criterion> criterionList, String propertyName, Object value){
		if(value==null) return true;
		if(value instanceof String){
			if("".equals(value)) return true;
		}
		criterionList.add(Restrictions.eq(propertyName, value));
		return true;
	}


}