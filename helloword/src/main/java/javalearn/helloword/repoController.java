package javalearn.helloword;

import javalearn.helloword.models.Todo;
import org.apache.logging.log4j.CloseableThreadContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface repoController extends JpaRepository<Todo,Long>{

}
