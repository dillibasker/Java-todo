package javalearn.helloword;

import javalearn.helloword.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/todo")
public class HelloWorldController {
    @Autowired
    private serviceController service;

    @GetMapping("/hello")
    String sayHelloWorld() {
        return "hello world";
    }

    //path variable method
    @GetMapping("/{id}")
    ResponseEntity<Todo> getuserbyid(@PathVariable long id) {
        return new ResponseEntity<>(service.getbyid(id), HttpStatus.OK);
    }

    //request param method
    @GetMapping("/create")
    String gettodobyId(@RequestParam String user, @RequestParam String password) {
        return "username is " + user + "password is " + password;
    }

    //request body method
    @PostMapping("/create")
    ResponseEntity<Todo> createUser(@RequestBody Todo todo) {
        return new ResponseEntity<>(service.createTodo(todo), HttpStatus.CREATED);
    }

    @PutMapping("/create")
    String putid(@RequestBody String body) {
        return body;
    }
    @GetMapping("/all")
    ResponseEntity<List<Todo>> getall(){
        return new ResponseEntity<List<Todo>>(service.gettodos(),HttpStatus.OK);
    }

    @PutMapping
    ResponseEntity<Todo> updateTodo(@RequestBody Todo todo){
        return new ResponseEntity<Todo>(service.updateTodo(todo),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteTodobyid(@PathVariable long id){
        service.deleteTodo(id);
    }
}