package cn.chenlilin.blog.service.impl;

import cn.chenlilin.blog.entity.SysUser;
import cn.chenlilin.blog.mapper.SysUserMapper;
import cn.chenlilin.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: cll
 * @Date: 2019/4/22 11:28
 * @Description:
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

  @Autowired
  private SysUserMapper mapper;

  public int delete(Integer id) {
    return 0;
  }

  public int insert(SysUser record) {
    return 0;
  }

  public int insertSelective(SysUser record) {
    return 0;
  }

  public int update(SysUser record) {
    return 0;
  }

  public int updateSelective(SysUser record) {
    return 0;
  }

  public SysUser get(Integer id) {
    return mapper.get(id);
  }
}
