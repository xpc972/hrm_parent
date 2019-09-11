package com.xpc.hrm.client;

import com.xpc.hrm.domain.TenantType;
import com.xpc.hrm.query.TenantTypeQuery;
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
public class TenantTypeClientHystrixFallbackFactory implements FallbackFactory<TenantTypeClient> {

    @Override
    public TenantTypeClient create(Throwable throwable) {
        return new TenantTypeClient() {
            @Override
            public AjaxResult save(TenantType tenantType) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public TenantType get(Long id) {
                return null;
            }

            @Override
            public List<TenantType> list() {
                return null;
            }

            @Override
            public PageList<TenantType> json(TenantTypeQuery query) {
                return null;
            }
        };
    }
}
