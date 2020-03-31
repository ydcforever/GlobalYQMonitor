package com.atpco.yqyr.mapper;

import com.atpco.yqyr.exception.MonitorException;
import com.atpco.yqyr.model.AtpcoYQYRS1;
import com.atpco.yqyr.model.QueryCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ydc on 2019/10/13.
 */
public interface QueryYQYRMapper {

    List<AtpcoYQYRS1> query(@Param("condition") QueryCondition condition) throws MonitorException;

}
