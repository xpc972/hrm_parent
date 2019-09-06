package com.xpc.hrm.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.xpc.hrm.domain.CourseType;
import com.xpc.hrm.mapper.CourseTypeMapper;
import com.xpc.hrm.query.CourseTypeQuery;
import com.xpc.hrm.service.ICourseTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xpc.hrm.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程目录 服务实现类
 * </p>
 *
 * @author xpc
 * @since 2019-09-01
 */
@Service
public class CourseTypeServiceImpl extends ServiceImpl<CourseTypeMapper, CourseType> implements ICourseTypeService {

    @Autowired
    private CourseTypeMapper courseTypeMapper;

    @Override
    public PageList<CourseType> selectListPage(CourseTypeQuery query) {
        Page page = new Page(query.getPage(),query.getRows());
        List<CourseType> courseTypes = courseTypeMapper.loadListPage(page,query);
        return new PageList<>(page.getTotal(),courseTypes);
    }
}
