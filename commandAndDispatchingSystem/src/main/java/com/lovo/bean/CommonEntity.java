
package com.lovo.bean;

/**
 * 公共类
 * @author Administrator
 *
 */
public class CommonEntity {
/**
 * 主键ID
 */
private int commonID;
/**
 * 类型（类型，等级）
 */
private String type;
/**
 * 键（代号）
 */
private int key;
/**
 * 值
 */
private String value;
public int getCommonID() {
	return commonID;
}
public void setCommonID(int commonID) {
	this.commonID = commonID;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getKey() {
	return key;
}
public void setKey(int key) {
	this.key = key;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public CommonEntity() {
	super();
	// TODO Auto-generated constructor stub
}



}
