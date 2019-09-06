package com.xpc.hrm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.xpc.hrm.domain.CourseType;
import com.xpc.hrm.query.CourseTypeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 课程目录 Mapper 接口
 * </p>
 *
 * @author xpc
 * @since 2019-09-01
 */
public interface CourseTypeMapper extends BaseMapper<CourseType> {

    List<CourseType> loadListPage(Pagination page, @Param("query")CourseTypeQuery query);
}
