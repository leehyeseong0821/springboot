package DI_IoC.mvc20220927hyeseong.repository;

import DI_IoC.mvc20220927hyeseong.config.TestSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("testRepository")
public class TestRepositoryImpl implements  TestRepository{
    @Autowired
    private TestSetting testSetting;

    @Override

    public void insert() {

        testSetting.setting();
        System.out.println("Test1 저장소에 저장하기");
    }

    @Override
    public void select() {
        System.out.println("Test1 저장소에 조회하기");
    }
}
