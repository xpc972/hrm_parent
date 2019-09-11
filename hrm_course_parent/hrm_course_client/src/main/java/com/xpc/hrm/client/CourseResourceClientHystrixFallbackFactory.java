package com.xpc.hrm.client;

import com.xpc.hrm.domain.CourseResource;
import com.xpc.hrm.query.CourseResourceQuery;
import com.xpc.hrm.util.AjaxResult;
import com.xpc.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/10/8-16:18
 */
@Component
public class CourseResourceClientHystrixFallbackFactory implements FallbackFactory<CourseResourceClient> {

    @Override
    public CourseResourceClient create(Throwable throwable) {
        return new CourseResourceClient() {
            @Override
            public AjaxResult save(CourseResource courseResource) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public CourseResource get(Long id) {
                return null;
            }

            @Override
            public List<CourseResource> list() {
                return null;
            }

            @Override
            public PageList<CourseResource> json(CourseResourceQuery query) {
                return null;
            }
        };
    }
}
