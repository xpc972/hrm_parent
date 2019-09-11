package com.xpc.hrm.service;

import com.xpc.hrm.domain.CourseType;
import com.baomidou.mybatisplus.service.IService;
import com.xpc.hrm.query.CourseTypeQuery;
import com.xpc.hrm.util.PageList;

import java.util.List;

/**
 * <p>
 * 课程目录 服务类
 * </p>
 *
 * @author xpc
 * @since 2019-09-01
 */
public interface ICourseTypeService extends IService<CourseType> {

    /**
     * 高级查询+分页+关联查询
     */
    PageList<CourseType> selectListPage(CourseTypeQuery query);

    /**
     * 通过父亲id获取儿子,及其儿子的儿子等子子孙孙
     * @param pid
     * @return
     */
    List<CourseType> queryTypeTree(Long pid);
}
