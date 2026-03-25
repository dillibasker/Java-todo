package javalearn.helloword;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class HelloWorldController {
    @GetMapping("/hello")
    String sayHelloWorld(){
        return "hello world";
    }

    //path variable method
    @GetMapping("/{id}")
    String gettodoid(@PathVariable long id){
        return "todo is is "+id;
    }

    //request param method
    @GetMapping("/create")
    String gettodobyId(@RequestParam String user,@RequestParam String password){
        return "username is " + user+ "password is "+ password;
    }

    //request body method
    @PostMapping("/create")
    String postid(@RequestBody String body){
        return body;
    }

    @PutMapping ("/create")
    String putid(@RequestBody String body){
        return body;
    }
}
