package com.lee.demo.mybatis.generator.dao.mapper;

import com.lee.demo.mybatis.generator.MybatisGeneratorApplication;
import com.lee.demo.mybatis.generator.dao.entity.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisGeneratorApplication.class)
public class UserDOMapperTest {

    private static Logger logger
        = LoggerFactory.getLogger(UserDOMapperTest.class);

    @Autowired
    private UserDOMapper userDOMapper;

    @Test
    public void test() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1L);
        logger.info("user name = {}", userDO.getName());
    }

}
