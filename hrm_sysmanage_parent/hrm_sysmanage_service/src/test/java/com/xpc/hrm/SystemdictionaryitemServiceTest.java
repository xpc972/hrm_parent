package com.xpc.hrm;

import com.xpc.hrm.domain.Systemdictionary;
import com.xpc.hrm.service.ISystemdictionaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SysManage9001Application.class)
public class SystemdictionaryitemServiceTest {

    @Autowired
    private ISystemdictionaryService systemdictionaryService;

    @Test
    public void  test01(){
        for (Systemdictionary systemdictionary : systemdictionaryService.selectList(null)) {
            System.out.println(systemdictionary);
        }
    }
}
