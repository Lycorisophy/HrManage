package cn.lysoy.hr.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @author huchao
 * @TODO JavaBean相关处理工具类
 * @create 2018/8/15 21:25
 * @Company
 * @email
 */
public class BeanUtil {
    /**
     * 判断是否为JavaBean的主键字段
     *
     * @param field JavaBean的字段信息
     * @return 若为实体的主键字段，则返回true
     */
    private static boolean isPkField(Field field) {
        Annotation[] fieldAnnotations = field.getDeclaredAnnotations();
        boolean isPkField = false;
        if (fieldAnnotations != null) {
            for (Annotation fieldAnnotation : fieldAnnotations) {
                if (fieldAnnotation.annotationType().getName().equals("javax.persistence.Id")) {
                    isPkField = true;
                    break;
                }
            }
        }
        return isPkField;
    }

    /**
     * 获取主键字段名
     *
     * @param t   JavaBean对象
     * @param <T> JavaBean对应的类定义
     * @return 主键字段名
     */
    public static <T> String getPkFieldName(T t) {
        Class tClass = t.getClass();
        Field[] fields = tClass.getDeclaredFields();

        String pkFieldName = null;
        if (fields != null) {
            for (Field field : fields) {
                if (isPkField(field)) {
                    pkFieldName = field.getName();
                    break;
                }
            }
        }

        return pkFieldName;
    }

    /**
     * 获取对象中所有null值字段
     * @param source
     * @return
     */
    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null)
                emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    /**
     * 拷贝对象非空属性值
     * @param source 源对象
     * @param target 目标对象
     */
    public static void copyPropertiesIgnoreNull(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }
}
