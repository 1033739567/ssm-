package cn.chenlilin.blog.controller;

import cn.chenlilin.blog.entity.SysUser;
import cn.chenlilin.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cll
 * @Date: 2019/4/23 10:17
 * @Description:
 */
@RestController("sysUserController")
@RequestMapping("/sys-user")
public class SysUserController {

  @Autowired
  private SysUserService sysUserService;

  @RequestMapping(value = "{id}",method = RequestMethod.GET)
  public SysUser get(@PathVariable("id") Integer id) throws Exception {
    SysUser sysUser = sysUserService.get(id);
    return sysUser;
  }


}
