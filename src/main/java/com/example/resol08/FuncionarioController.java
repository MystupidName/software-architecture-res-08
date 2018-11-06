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
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FuncionarioController {
    
    private ArrayList<Funcionario> funcionarios;
    
    
    @GetMapping("/funcionarios")
    public ArrayList<Funcionario> readAll(){
        return funcionarios;
    }
        
    @PostMapping("/funcionarios")
    public String create(@RequestBody Map<String, String> body){
        Funcionario novoFunc = new Funcionario();
        novoFunc.setNome(body.get("nome"));
        novoFunc.setIdade(Integer.parseInt(body.get("idade")));
        novoFunc.setSalario(Float.parseFloat(body.get("salario")));
        funcionarios.add(novoFunc);
        return "localhost:8080/funcionarios";
    }
    
    @PutMapping("/funcionarios/update/{id}")
    public String updateById(@PathVariable String id, @RequestBody Map<String, String> body){
        for (Funcionario f : funcionarios){
            if(f.getId() == Integer.parseInt(body.get("id"))){
                Funcionario temp = new Funcionario();
                temp.setId(Long.parseLong(id));
                temp.setNome(body.get("nome"));
                temp.setIdade(Integer.parseInt(body.get("idade")));
                temp.setSalario(Float.parseFloat(body.get("salario")));
                funcionarios.set(Integer.parseInt(id), temp);
                break;
            }
        }
        return "localhost:8080/funcionarios";
    }
    
    @DeleteMapping("funcionarios/{id}")
    public String delete(@PathVariable String id){
        long tempVar = Long.parseLong(id);
        long fID = -1;
        Funcionario tempObj = new Funcionario();
        for (Funcionario f : funcionarios){
            if(f.getId() == tempVar){
                fID = tempVar;
                tempObj = f;
            }
        }
        
        if(fID != -1){
            funcionarios.remove(tempObj);
        }
   
        return "localhost:8080/funcionarios";
    }
}
