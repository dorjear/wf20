package com.dorjear.ralf.db.service.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Generics Utils
 */
@SuppressWarnings("unchecked")
public class GenericsUtils {
    /**
     * get super class
     */
    public static Class getSuperClassGenricType(Class clazz) {
        return getSuperClassGenricType(clazz, 0);
    }
    
    /**
     * get super class
     *
     * @param super class index
     */
    public static Class getSuperClassGenricType(Class clazz, int index) {
        boolean flag = true;
        Type genType = clazz.getGenericSuperclass();
        Type[] params = null;
        
        if (!(genType instanceof ParameterizedType))
            flag = false;
        else {
            params = ((ParameterizedType) genType).getActualTypeArguments();
            if (index >= params.length || index < 0)
                flag = false;
            if (!(params[index] instanceof Class))
                flag = false;
        }
        if (!flag) {
            clazz = clazz.getSuperclass();
            if (clazz == Object.class)
                return Object.class;
            else
                return getSuperClassGenricType(clazz, index);
        }
        
        return (Class) params[index];
    }
}
