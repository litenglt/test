package com.powersi.pcloud.utils;

import java.util.List;

import com.powersi.comm.service.memory.MemoryDB;

/**
 * 借助redis，帮助实现多服务器下的求和，求平均，求最大最小值的计算
 * 要使用的工程请定义本service，注入MemoryDB对象
 * @author 李志钢
 *
 */
public class MathHelper {
	private MemoryDB memoryDB;
	
	/**
	 * 添加数据到队列，用于计算平均值
	 * @param listName	队列名称
	 * @param dValue	添加的值
	 * @param nSec		在redis保存多少秒，0标识永久保存
	 */
	public void addDecimalToList( String listName, double dValue, int nSec ){
		if( memoryDB.insertListAtEnd(listName, dValue) == 1 ){
			//设置有效时间
			if( nSec > 0 ){
				memoryDB.expire(listName, nSec);
			}
		}
	}
	
	
	/**
	 * 计算指定队列的平均值
	 * @param listName
	 * @return
	 */
	public double getAvage( String listName ){
		List list = memoryDB.getList(listName, 0, -1);
		if( list == null ){
			return 0;
		}
		double dSum = 0;
		for( int i = 0; i<list.size(); i++ ){
			double dValue = (Double) list.get(i);
			dSum += dValue;
		}
		return dSum / list.size();
	}
	
	
	/**
	 * 计算指定队列的平均值，并删除队列
	 * @param listName
	 * @return
	 */
	public double getAvageAndRemoveList( String listName ){
		try {
			return getAvage( listName );
		} finally{
			memoryDB.delete( listName );
		}
	}
	
	/**
	 * 设置指定名称的对象一个数值，redis只存储最大的那个
	 * @param valueName
	 * @param dValue
	 * @param nSec 有效秒
	 */
	public void addForMaxDecimal( String valueName, double dValue, int nSec ){
		if( !memoryDB.existKey(valueName) ){
			memoryDB.setDouble(valueName, nSec, dValue );
			return;
		}
		
		double dOldValue = memoryDB.getDouble(valueName);
		if( dValue > dOldValue ){
			memoryDB.setDouble(valueName, nSec, dValue );
		}
	}
	
	/**
	 * 获取给定名称对象存放的最大值，然后删除对象
	 * @param valueName
	 * @return
	 */
	public double getMaxDecimalAndRemove( String valueName ){
		try{
			return getMaxDecimal(valueName);
		}finally{
			memoryDB.delete( valueName );
		}
	}
	
	/**
	 * 获取给定名称对象存放的最大值
	 * @param valueName
	 * @return
	 */
	public double getMaxDecimal( String valueName ){
		if( !memoryDB.existKey(valueName) ){
			return 0;
		}
		return memoryDB.getDouble(valueName);
	}
	
	/**
	 * 设置指定名称的对象一个数值，redis只存储最小的那个
	 * @param valueName
	 * @param dValue
	 * @param nSec 有效秒
	 */
	public void addForMinDecimal( String valueName, double dValue, int nSec ){
		if( !memoryDB.existKey(valueName) ){
			memoryDB.setDouble(valueName, nSec, dValue );
			return;
		}
		
		double dOldValue = memoryDB.getDouble(valueName);
		if( dValue < dOldValue ){
			memoryDB.setDouble(valueName, nSec, dValue );
		}
	}
	
	
	/**
	 * 获取给定名称对象存放的最小值
	 * @param valueName
	 * @return
	 */
	public double getMinDecimal( String valueName ){
		if( !memoryDB.existKey(valueName) ){
			return 0;
		}
		return memoryDB.getDouble(valueName);
	}
	
	
	/**
	 * 获取给定名称对象存放的最小值，然后删除对象
	 * @param valueName
	 * @return
	 */
	public double getMinDecimalAndRemove( String valueName ){
		try{
			return getMinDecimal( valueName );
		}finally{
			memoryDB.delete( valueName );
		}
	}
	
	public MemoryDB getMemoryDB() {
		return memoryDB;
	}

	public void setMemoryDB(MemoryDB memoryDB) {
		this.memoryDB = memoryDB;
	}
	
}
