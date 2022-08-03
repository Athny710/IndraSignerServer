package org.saeta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping("files")
public class FileController {

    @ResponseBody
    @GetMapping(value = "test")
    public ResponseEntity prueba(){
        HashMap<String, Object> responseMap = new HashMap<>();

        responseMap.put("estado", "Works!");

        return new ResponseEntity(responseMap, HttpStatus.OK);
    }
}
