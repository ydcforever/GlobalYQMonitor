package com;

import com.atpco.yqyr.mapper.QueryYQYRMapper;
import com.atpco.yqyr.model.AtpcoYQYRS1;
import com.atpco.yqyr.model.QueryCondition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ydc on 2019/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    @Autowired
    private QueryYQYRMapper queryYQYRMapper;

    @Test
    public void test1() {
        QueryCondition condition = new QueryCondition();
        condition.setMktCxr("MU");
        condition.setFeeType("F");
//        condition.setApply("S");
//        condition.setPaxType("CNN");
//        condition.cabin = "F";
        condition.setSequence("0005670");
        List<AtpcoYQYRS1> list = queryYQYRMapper.query(condition);
        System.out.println(list.size());
    }
}
