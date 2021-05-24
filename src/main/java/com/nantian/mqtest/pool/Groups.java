package com.nantian.mqtest.pool;

import javax.validation.groups.Default;

/**
 * @Author zhangjian
 * @Date 2021/4/26 16:08
 * @Description 参数校验分组用的，别动
 */
public class Groups {

    public interface Insert extends Default {
    }

    public interface Update extends Default {
    }

    public interface UpdateStat extends Default {
    }

    ;
}
