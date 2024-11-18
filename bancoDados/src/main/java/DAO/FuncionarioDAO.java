package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
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

    public ArrayList<FuncionarioDTO> PesquisarFuncionario(){
        String sql = "select * from tabela";
        conn = new conecxao().conectaBd();
                
                
                
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
             FuncionarioDTO funcionarios = new FuncionarioDTO();
             funcionarios.setId(rs.getInt("id"));
             funcionarios.setNomeFuncionario(rs.getString("nome"));        
             funcionarios.setCidadeFuncionario(rs.getString("cidade"));
            
            
            lista.add(funcionarios);
            }
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + "erro pesquisar");
        }
        return lista;
        
    }



}
