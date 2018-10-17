package dao;

import model.ModeloTelaDeCadastroFuncionario;


public class FuncionarioDAO{ 
    public static boolean inserir(ModeloTelaDeCadastroFuncionario fun){
        String sql = " , "               + "INSERT INTO fun "
                + " ( salarioLiquido salarioBruto, quantidadeDeFilhos, periculosidade, horasExtras ) "
                + " VALUES ( "
                + " '" + fun.getsalarioLiquido()               + "' , "
                + " '" + fun.getsalarioBruto()                 + "' , "
                + " '" + fun.getquantidadeDeFilhos()      + "' , "
                + " '" + fun.getpericulosidade()          + "' , "
                + " '" + fun.gethorasExtras               + " , "
            + " );";
        return Conexao.executar(sql);
    }
    
    public static boolean editar(ModeloTelaDeCadastroFuncionario fun){
        String sql = "UPDATE fun SET "
            + " salarioLiquido = '" + fun.getsalarioLiquido()              + "' , "
            + " salarioBruto =     '" + fun.getsalarioBruto()              + "' , "
            + " quantidadeDeFilhos = '" + fun.getquantidadeDeFilhos()          + "' , "
            + " periculosidade =     '" + fun.getpericulosidade()+ "' , "
            + " horasExtras = " + fun.gethorasExtras();
        return Conexao.executar(sql);
    }

}