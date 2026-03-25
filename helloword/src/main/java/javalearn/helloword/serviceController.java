package javalearn.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceController {
    @Autowired
    private  repoController repoc;

    public void printtodo(){
        System.out.println(repoc.repo());
    }
}
