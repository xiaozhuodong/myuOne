package yoga.bilibili.myuone.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyServiceImpl implements  AsyService{

    @Async("getExecutor")
    @Override
    public void executAsy() {
        System.out.println(Thread.currentThread().getName()+"开始运行");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束运行");
    }
}
