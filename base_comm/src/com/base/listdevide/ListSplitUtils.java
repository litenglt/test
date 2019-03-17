package com.base.listdevide;

import java.util.ArrayList;
import java.util.List;

public class ListSplitUtils<T>{
	/**
	 * ·Ö¸î´óµÄlist
	 * @param list
	 * @param toIndex
	 * @return
	 */
	public List<List<T>> splitList(List<T> list,int toIndex) {
        List<List<T>> listGroup = new ArrayList<List<T>>();
        int listSize = list.size();
	    for (int i = 0; i < listSize; i += toIndex) {
	        if (i + toIndex > listSize) {
	            toIndex = listSize - i;
	        }
	        List<T> newList = new ArrayList<T>();
	        newList.addAll(list.subList(i, i + toIndex));
	        listGroup.add(newList);
	    }
    	return listGroup;
	}
	
	public static void main(String[] args){
		List<String> list =new ArrayList<>();
		list.add("sdsd");
		list.add("dddd");
		list.add("retry");
		ListSplitUtils<String> lists=new ListSplitUtils<String>();
		List<List<String>> listd=lists.splitList(list, 5);
		System.out.println(listd.size());
		
	}
}
