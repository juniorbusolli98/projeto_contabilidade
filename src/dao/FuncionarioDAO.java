package dao;

import java.net.ConnectException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        


public class FuncionarioDAO{
    public static boolean inserir(Funcionario fun){
        String sql = "INSERT INTO funcionarios "
                + " ( nome, Bruto, Filhos, periculosidade, horas,Insalubridade ) "
                + " VALUES ("
                + " '" + fun.getNome()              + "' , "
                + " " + fun.getSalarioBruto()                 + " , "
                + " " + fun.getQuantidadeDeFilhos()      + " , "
                + " " + fun.getPericulosidade()          + " , "
                + " " + fun.getHorasExtras()              + ",  "
                + "  "+fun.getNivelDeInsalubridade()      +"   "
            + " );";
        return Conexao.executar(sql);
    }
    
    public static boolean editar(Funcionario fun){
        String sql = "UPDATE funcionario SET "
            + " nome            = '" + fun.getNome()  + "' , "
            + " salarioLiquido = " + fun.getSalarioLiquido()              + " , "
            + " salarioBruto =     " + fun.getSalarioBruto()              + " , "
            + " quantidadeDeFilhos = " + fun.getQuantidadeDeFilhos()          + " , "
            + " periculosidade =     '" + fun.getPericulosidade()+ "' , "
            + " horasExtras = " + fun.getHorasExtras(); 
        return Conexao.executar(sql);
    }
       public static List<Funcionario> getFuncionarios(){
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT  f.nome, f.Bruto,"
            + " f.Filhos , f.periculosidade, f.horas,  "
            +"f.insalubridade"    
            + " FROM funcionarios f  "
            + " ORDER BY f.nome";
        ResultSet rs = Conexao.consultar( sql );
        if( rs != null ){
            try{
                while ( rs.next() ) {  
                    Funcionario fun = new Funcionario();
                    
                    fun.setNome( rs.getString(2));
                    fun.setSalarioBruto(rs.getInt(3));
                    fun.setFilhos(rs.getInt(4));
                    fun.setPericulosidade(rs.getBoolean(5));
                    fun.setHorasExtras(rs.getDouble(6));
 
                    
                    lista.add(fun);
                } 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return lista;
       }
      


};
        


        
     

