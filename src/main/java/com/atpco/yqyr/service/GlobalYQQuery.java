package com.atpco.yqyr.service;

import com.atpco.yqyr.exception.MonitorException;
import com.atpco.yqyr.model.QueryCondition;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by ydc on 2019/10/14.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)//用一个绑定的annotation用来说明网络协议和格式
public interface GlobalYQQuery {

    public QueryCondition query(QueryCondition condition) throws MonitorException;

}
