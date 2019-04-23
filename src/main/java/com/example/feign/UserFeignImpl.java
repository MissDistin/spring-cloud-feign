package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * @Author tinko
 * @Description //TODO
 * @Date 2019/4/23 16:16
 **/
@Component
public class UserFeignImpl implements UserFeign{

    @Override
    public String user(String name) {
        return "Sorry,Server Error:" + name;
    }
}
