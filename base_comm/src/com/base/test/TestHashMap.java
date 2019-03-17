package com.base.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String args[]){
		List<Map<String,Integer>> list =new ArrayList<>();
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<9;i++){
			//Map<String,Integer> map=new HashMap<>();
			map.put("a", i);
			list.add(map);
		}
		for(Map<String,Integer> tem: list){
			//Set<String> set=tem.keySet();
			System.out.println(tem.get("a"));
		}
	}
}
