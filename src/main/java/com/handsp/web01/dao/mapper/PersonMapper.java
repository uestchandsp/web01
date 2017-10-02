package com.handsp.web01.dao.mapper;

import com.handsp.web01.model.Person;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liangpeng on 17/9/29.
 */
public interface PersonMapper {
    void insert(Person person);

    Person getById(@Param("id") long id);
}
