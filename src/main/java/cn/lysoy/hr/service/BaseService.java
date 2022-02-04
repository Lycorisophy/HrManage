package cn.lysoy.hr.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author huchao
 * @TODO 通用service  对常用CURD操作进行封装，简化service代码量
 *  注：
 *      @DynamicInsert 动态插入，只保存非空属性
 *      @DynamicUpdate 动态更新，只更新和数据库比对被修改的属性
 *      (即原值不为空，更新对象属性为null，则此属性也会更新，因此新增updateNotNull方法实现只更新非空)
 * @create 2018/8/14 21:11
 * @Company
 * @email
 */
public interface BaseService<T, ID> {
    /**
     * 保存或更新
     *
     * @param t
     */
    void save(T t);

    /**
     * 批量保存或更新
     *
     * @param entities
     */
    void save(Iterable<T> entities);

    /**
     * 只更新非空属性
     * @param t
     * @throws Exception
     */
    void updateNotNull(T t) throws Exception;

    /**
     * 删除
     *
     * @param t
     */
    void delete(T t);

    /**
     * 根据主键删除
     *
     * @param id
     */
    void deleteById(ID id);

    /**
     * 根据id数组批删
     *
     * @param ids
     */
    void deleteByIds(ID[] ids);

    /**
     * 根据id集合批删
     *
     * @param ids
     */
    void deleteByIds(Iterable<ID> ids);

    /**
     * 批删
     *
     * @param entities
     */
    void deleteInBatch(Iterable<T> entities);

    /**
     * 查所有
     *
     * @return
     */
    List<T> findAll();

    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * 条件查询
     *
     * @param example
     * @return
     */
    List<T> findByExample(Example<T> example);

    /**
     * 条件分页查询
     *
     * @param example
     * @param pageable
     * @return
     */
    Page<T> findByPage(Example<T> example, Pageable pageable);

    /**
     * 分页查询
     *
     * @param pageable
     * @return
     */
    Page<T> findAllByPage(Pageable pageable);

    /**
     * 数据总条数
     *
     * @return
     */
    long count();

    /**
     * 符合条件数据条数
     *
     * @param example
     * @return
     */
    long countByExample(Example<T> example);
}
