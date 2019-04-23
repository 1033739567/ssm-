package cn.chenlilin.blog.test;

import cn.chenlilin.blog.entity.SysUser;
import cn.chenlilin.blog.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: cll
 * @Date: 2019/4/22 11:40
 * @Description:
 */
@ContextConfiguration(locations = {"classpath:spring-core/spring-application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SysUserTest {

  @Autowired
  private SysUserService sysUserService;

  @Test
  public void get(){
    Integer id = 1;
    SysUser sysUser = sysUserService.get(id);
    System.out.println(sysUser.toString());
  }
}
