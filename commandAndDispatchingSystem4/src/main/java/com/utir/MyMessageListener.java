package com.utir;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.lovo.bean.EventResourceBean;
import com.lovo.bean.TheeventBean;
import com.lovo.service.ITheeventBeanService;

public class MyMessageListener implements MessageListener {

	@Autowired
    private ITheeventBeanService theeventBeanService;
	
	public void onMessage(Message msg) {
        if (msg instanceof TextMessage) {
            try {
                TextMessage txtMsg = (TextMessage) msg;
                String message = txtMsg.getText();
                
                System.out.println("点对点收到结果===" + message);
                Gson g =new Gson();
             
                EventResourceBean t=  g.fromJson(message, EventResourceBean.class);
                	  TheeventBean e =new TheeventBean();
                	e.setMessageId(t.getPk_id());
                	e.setEventName(t.getEveName());
                	e.setNumberpeople(t.getF_carNum());
                	e.setArnumber(t.getF_perNum());
                    e.setArea("未处理");
                    e.setTheEventNum(t.getEveNum());
                    e.setSite(t.getSite());
                	theeventBeanService.addTheevent(e);
                
               
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Message must be of type TextMessage");
        }
    }

}
