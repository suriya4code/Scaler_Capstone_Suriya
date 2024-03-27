package com.scaler.capstone;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/hello")
public class SampleController {
    
        @GetMapping("/{name}/{number}")
        public String sayHello(@PathVariable("name") String name, @PathVariable("number") int number) {    
            
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<number; i++){
                sb.append("Hello " + name +" ");
            }
            
            return sb.toString();
        }
        
}