package com.xpc.hrm.client;

import com.xpc.hrm.domain.Permission;
import com.xpc.hrm.query.PermissionQuery;
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
public class PermissionClientHystrixFallbackFactory implements FallbackFactory<PermissionClient> {

    @Override
    public PermissionClient create(Throwable throwable) {
        return new PermissionClient() {
            @Override
            public AjaxResult save(Permission permission) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Permission get(Long id) {
                return null;
            }

            @Override
            public List<Permission> list() {
                return null;
            }

            @Override
            public PageList<Permission> json(PermissionQuery query) {
                return null;
            }
        };
    }
}
