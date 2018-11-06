/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.resol08;

/**
 *
 * @author andrey
 */

import java.util.ArrayList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FuncionarioController {
    
    private ArrayList<Funcionario> funcionarios;
    
    
    //Transforma a classe em Singleton
    private static FuncionarioController instance = null;
    public static FuncionarioController getInstance(){
       if(instance == null){
           instance = new FuncionarioController();
       }
       return instance;
    }
    
    
    /*
    @RequestMapping("/")
    public String index(){
        return "This is the test page";
    }
    */
}
