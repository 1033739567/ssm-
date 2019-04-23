package cn.chenlilin.blog.common;

/**
 * @Auther: cll
 * @Date: 2019/4/23 09:19
 * @Description:
 */
public interface BasicService<T> {

  int delete(Integer id);

  int insert(T record);

  int insertSelective(T record);

  int update(T record);

  int updateSelective(T record);

  T get(Integer id);

}
