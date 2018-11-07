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
    public String create(@RequestBody Funcionario body){
        Funcionario novoFunc = new Funcionario();
        novoFunc.setId(body.getId());
        novoFunc.setNome(body.getNome());
        novoFunc.setIdade(body.getIdade());
        novoFunc.setSalario(body.getSalario());
        funcionarios.add(novoFunc);
        return "localhost:8080/funcionarios";
    }
    
    @PutMapping("/funcionarios/update/{id}")
    public String updateById(@PathVariable String id, @RequestBody Funcionario body){
        for (Funcionario f : funcionarios){
            if(f.getId() == body.getId()){
                Funcionario temp = new Funcionario();
                temp.setId(Long.parseLong(id));
                temp.setNome(body.getNome());
                temp.setIdade(body.getIdade());
                temp.setSalario(body.getSalario());
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
        for (Funcionario f : funcionarios){
            if(f.getId() == tempVar){
                fID = tempVar;
            }
        }
        
        if(fID != -1){
            funcionarios.remove(fID);
        }
   
        return "localhost:8080/funcionarios";
    }
}
