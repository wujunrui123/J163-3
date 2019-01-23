package com.lovo.service;



public interface IAmqSenderService {
	/**
	 *发送消息点对点
	 * @param message
	 */
	 public void sendMsgQueue(String message);
	 /**
		 *发送消息订阅发布
		 * @param message
		 */
	 public void sendMsgTopic(String message);
}
