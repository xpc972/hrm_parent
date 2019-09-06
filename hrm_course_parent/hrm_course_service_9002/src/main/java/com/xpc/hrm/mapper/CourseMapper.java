package com.xpc.hrm.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.xpc.hrm.domain.Course;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xpc.hrm.query.CourseQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xpc
 * @since 2019-09-03
 */
public interface CourseMapper extends BaseMapper<Course> {

    List<Course> loadListPage(Page<Course> page,@Param("query") CourseQuery query);

    /**
     *上线
     * @param idsMap
     */
    void batchOnline(List<Map<String, Object>> idsMap);

    /**
     * 下线
     * @param longs
     */
    void batchOffline(List<Long> longs);
}
