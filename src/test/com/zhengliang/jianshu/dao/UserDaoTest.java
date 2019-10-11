package com.zhengliang.jianshu.dao;

import cn.hutool.db.Entity;
import com.zhengliang.jianshu.dao.impl.UserDaoImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    private UserDao userDao = new UserDaoImpl();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        List<Entity> entityList = null;
        try {
             entityList = userDao.findAll();
        } catch (SQLException e) {
            System.err.println("查询用户数据出现异常");
        }
        if (entityList != null) {
            entityList.forEach(entity -> System.out.println(entity));

        }else {
            System.out.println("没有数据");
        }
    }
}