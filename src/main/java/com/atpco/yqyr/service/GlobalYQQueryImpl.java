package com.atpco.yqyr.service;

import com.atpco.yqyr.exception.EnumRespMsg;
import com.atpco.yqyr.exception.MonitorException;
import com.atpco.yqyr.mapper.QueryYQYRMapper;
import com.atpco.yqyr.model.AtpcoYQYRS1;
import com.atpco.yqyr.model.QueryCondition;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by ydc on 2019/10/14.
 */
@WebService(endpointInterface = "com.atpco.yqyr.service.GlobalYQQuery", serviceName = "GlobalYQ")
public class GlobalYQQueryImpl implements GlobalYQQuery {

    @Autowired
    private QueryYQYRMapper mapper;

    @Override
    public QueryCondition query(QueryCondition condition) throws MonitorException{
        if (!condition.check()) {
            throw new MonitorException(EnumRespMsg.CHECK_REQUEST_PARAMETERS);
        }
        List<AtpcoYQYRS1> list;
        try {
            list = mapper.query(condition);
            condition.setList(list);
        }catch (MonitorException m) {
            throw new MonitorException(EnumRespMsg.COMPUTING_EXCEPTION);
        }
        return condition;
    }
}
