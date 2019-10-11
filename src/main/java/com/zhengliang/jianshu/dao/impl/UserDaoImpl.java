package com.zhengliang.jianshu.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.zhengliang.jianshu.dao.UserDao;

import java.sql.SQLException;
import java.util.List;


public class UserDaoImpl implements UserDao {
    @Override
    public List<Entity> findAll() throws SQLException {
        return Db.use().query("SELECT * FROM t_user ORDER BY id DESC ");
    }


}