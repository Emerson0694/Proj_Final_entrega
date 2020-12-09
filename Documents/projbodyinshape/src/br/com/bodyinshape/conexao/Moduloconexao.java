package br.com.bodyinshape.conexao;

import java.sql.*; //Traz tudo oque existe

public class Moduloconexao {
    //Método responsável por estabelecer conexão com o banco

    public static Connection conector() { // ->Método de conexão

// Connection é o framework(conjunto de funcionalidades) que vem
// da importação/pacote java.sql.*;
        java.sql.Connection conexao = null; // variavél conexão ainda nulo
        String driver = "com.mysql.cj.jdbc.Driver"; //variavel driver com o endereço para ativar o Driver

        String url = "jdbc:mysql://localhost:3306/bdbody";// Variavél url descreve o caminho e o nome do banco
        String user = "root"; // String user descreve o usuário que pode acessar o banco
        String password = " "; // Variavél password descreve a senha de conexão com o banco, porem deixei vazia
        
   // O CÓDIGO ABAIXO ESTABELECE CONEXÃO COM O BANCO DE DADOS
        try {
            Class.forName(driver);// Se estiver e der tudo correto ele obtem conexão e armazena a conexão
            conexao =DriverManager.getConnection(url,user,password);
            return conexao;
            
        } catch (Exception e) {
          //System.out.println(e);//Exibe o motivo do erro de conexão
           return null; // Se estiver tudo correto ela retorna resultado nulo
        }
   
   
    }
}
