package com.handsp.web01.provider.impl;

import com.handsp.web01.model.Person;
import com.handsp.web01.provider.inter.DubboDemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangpeng on 17/10/2.
 */
public class DubboDemoServiceImpl implements DubboDemoService{

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public List getUsers() {
        List list = new ArrayList();
        Person u1 = new Person();
        u1.setName("梁老板");
        u1.setPhone("18957048803");
        u1.setSex(1);

        Person u2 = new Person();
        u2.setName("鹏帅");
        u2.setPhone("13827895678");
        u2.setSex(2);


        list.add(u1);
        list.add(u2);

        return list;
    }
}
