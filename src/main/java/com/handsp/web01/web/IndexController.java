package com.handsp.web01.web;

import com.handsp.web01.dao.mapper.PersonMapper;
import com.handsp.web01.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


/**
 * Created by liangpeng on 17/9/28.
 */
@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Resource
    private PersonMapper personMapper;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home(Model model) {
        Person person = personMapper.getById(1L);
        logger.info("梁先生，您好！");
        model.addAttribute("name", person );

        return "home";
    }
}
