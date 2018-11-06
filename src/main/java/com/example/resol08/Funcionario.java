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

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Funcionario {
    
    private @Id @GeneratedValue Long id;
    private String nome;
    private int idade;
    private float salario;
    
    Funcionario(String nome, int idade, float salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
}
