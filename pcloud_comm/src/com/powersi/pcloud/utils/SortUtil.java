package com.powersi.pcloud.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 排序工具类
 * @author lingang
 * @time 2018年4月8日下午10:26:01
 *
 */
public class SortUtil {
	
	class MapKeyComparator implements Comparator<String>{

	    @Override
	    public int compare(String str1, String str2) {

	        return str1.compareTo(str2);
	    }
	}
	
	class MapValueComparator implements Comparator<Map.Entry<String, String>> {

	    @Override
	    public int compare(Entry<String, String> me1, Entry<String, String> me2) {

	        return me1.getValue().compareTo(me2.getValue());
	    }
	}
	/**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<String, String> sortMap = new TreeMap<String, String>(new SortUtil().new MapKeyComparator());

        sortMap.putAll(map);

        return sortMap;
    }
    
    /**
     * 使用 Map按value进行排序
     * @param map
     * @return
     */
    public static Map<String, String> sortMapByValue(Map<String, String> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        List<Map.Entry<String, String>> entryList = new ArrayList<Map.Entry<String, String>>(
                oriMap.entrySet());
        Collections.sort(entryList, new SortUtil().new MapValueComparator());

        Iterator<Map.Entry<String, String>> iter = entryList.iterator();
        Map.Entry<String, String> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }
    
    public static List<Map<String, Object>> sortListMapByValue(List<Map<String, Object>> list,final String sortKey
    		, final String order) {
    	Collections.sort(list, new Comparator<Map<String, Object>>() {
		    public int compare(Map<String, Object> o1, Map<String, Object> o2) {
	    		String map1value = ConvertUtil.objectToString(o1.get(sortKey));
                String map2value = ConvertUtil.objectToString(o2.get(sortKey));
                
                if ("DESC".equals(order)) {
			        return map1value.compareTo(map2value);
			    } else {
			        return map2value.compareTo(map1value);
			    }
            }
	    });
		return list;
    }
}
