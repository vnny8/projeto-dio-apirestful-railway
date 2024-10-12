package com.projetoDIO.ProjetoCLARO;

import com.projetoDIO.ProjetoCLARO.models.User;
import com.projetoDIO.ProjetoCLARO.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class controller {

    @Autowired
    private UserService userService;

    @GetMapping("/acessar")
    public ResponseEntity<User> acessar(@RequestParam("id") Long id){
        return ResponseEntity.status(200).body(userService.findById(id));
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criar(@RequestBody User user){
        userService.create(user);
        return ResponseEntity.status(201).body(null);
    }
}
