package zhujieAspect;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void add(){
        System.out.println("调用方法类DemoMethodService方法add:");
    }
}
