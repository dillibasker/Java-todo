package javalearn.helloword;

import javalearn.helloword.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceController {
    @Autowired
    private  repoController repoc;
    public Todo createTodo(Todo todo){

        return repoc.save(todo);
    }

    public Todo getbyid(long id){
        return repoc.findById(id).orElseThrow(() ->new RuntimeException("Todo not found "));
    }

    public List<Todo> gettodos(){
        return repoc.findAll();
    }

    public Todo updateTodo(Todo todo){
        return repoc.save(todo);
    }

    public void deleteTodo(long id){
        repoc.delete(getbyid(id));
    }
}
