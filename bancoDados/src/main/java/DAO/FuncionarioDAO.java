/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
           
    
    public void cadastrarFuncionario(FuncionarioDTO funcionariodto){
        
        String sql = "insert into tabela(nome, cidade)values (?,?)";
        
        conn = new conecxao().conectaBd();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionariodto.getCidadeFuncionario());
            pstm.setString(2, funcionariodto.getCidadeFuncionario());
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "FuncionarioDAO");
        }
        
        
    }
}
