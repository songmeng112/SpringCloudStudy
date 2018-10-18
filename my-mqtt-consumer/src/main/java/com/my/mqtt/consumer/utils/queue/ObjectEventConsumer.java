package com.my.mqtt.consumer.utils.queue;

import com.alibaba.fastjson.JSON;
import com.lmax.disruptor.EventHandler;

/**
 * 1.建Event类（数据对象）
 * 2.建立一个生产数据的工厂类，EventFactory，用于生产数据；
 * 3.监听事件类（处理Event数据）
 * 4.实例化Disruptor，配置参数，绑定事件；
 * 5.建存放数据的核心 RingBuffer，生产的数据放入 RungBuffer。
 */

public class ObjectEventConsumer implements EventHandler<ObjectEvent> {
    @Override
    public void onEvent(ObjectEvent objectEvent, long l, boolean b) throws Exception {
        System.out.println("===事件消费者:" + JSON.toJSONString(objectEvent.getEvent()));
    }
}
