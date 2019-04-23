package cn.chenlilin.blog.entity;

import lombok.Data;

/**
 * @Auther: cll
 * @Date: 2019/4/22 11:24
 * @Description:
 */
@Data
public class SysUser {

  private Integer id; //int(10) unsigned NOT NULL AUTO_INCREMENT,
  private String account; //varchar(10) NOT NULL COMMENT '登录账号',
  private String password; //varchar(16) NOT NULL COMMENT '密码',
  private String name; //varchar(10) NOT NULL COMMENT '姓名',
  private Integer age; //int(5) DEFAULT NULL COMMENT '年龄',
  private String phone; //varchar(11) DEFAULT NULL COMMENT '电话',
  private String introduce; //longtext COMMENT '简介',
  private Byte status; //tinyint(1) NOT NULL COMMENT '状态(0表示无效，1表示有效)',
  private String createTime; //varchar(11) DEFAULT NULL COMMENT '创建时间',

  @Override
  public String toString() {
    return "SysUser{" +
        "id=" + id +
        ", account='" + account + '\'' +
        ", password='" + password + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", introduce='" + introduce + '\'' +
        ", status=" + status +
        ", createTime='" + createTime + '\'' +
        '}';
  }
}
