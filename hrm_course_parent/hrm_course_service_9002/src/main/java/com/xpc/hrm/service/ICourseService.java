package com.xpc.hrm.service;

import com.xpc.hrm.domain.Course;
import com.baomidou.mybatisplus.service.IService;
import com.xpc.hrm.query.CourseQuery;
import com.xpc.hrm.util.PageList;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xpc
 * @since 2019-09-03
 */
public interface ICourseService extends IService<Course> {

    /**
     * 分页+高级查询+关联查询
     * @param query
     * @return
     */
    PageList<Course> selectListPage(CourseQuery query);

    /**
     * 上线
     * @param ids
     */
    void onLine(Long[] ids);

    /**
     *下线
     * @param ids
     */
    void offLine(Long[] ids);
}
