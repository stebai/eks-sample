package it.sb.eks.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/v1")
//@Slf4j
public class Controller {

    @GetMapping("/test")
    public ResponseEntity<?> test(){
//        log.info("TEST =======================> OK");
        return new ResponseEntity<>("Test OK", HttpStatus.OK);
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ResponseEntity<?> getResource(){
        return new ResponseEntity<>("Test 2 OK", HttpStatus.OK);
    }
}
