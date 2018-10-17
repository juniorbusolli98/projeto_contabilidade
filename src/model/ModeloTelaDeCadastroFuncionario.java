package model;


public class ModeloTelaDeCadastroFuncionario {
    private String salarioBruto;
    private String salarioLiquido;
    private String horasExtras, quantidadeDeFilhos, nivelDeInsalubridade, periculosidade;
    public String gethorasExtras;
    
    public ModeloTelaDeCadastroFuncionario(String salarioBruto, String salarioLiquido, String horasExtras, String quantidadeDeFilhos, String nivelDeInsalubridade,
            String periculosidade) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.quantidadeDeFilhos = quantidadeDeFilhos;
        this.nivelDeInsalubridade = nivelDeInsalubridade;
        this.horasExtras = horasExtras;
        this.periculosidade = periculosidade;
    }

    public ModeloTelaDeCadastroFuncionario() {
        throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    public void setsalarioBruto(String salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public String getsalarioBruto(){
        return salarioBruto;
    }
    public void setsalarioLiquido(String salarioLiquido){
        this.salarioLiquido = salarioLiquido;
    }
    public String getsalarioLiquido(){
        return salarioLiquido;
    }
    
    public void setquantidadeDeFilhos(String quantidadeDeFilhos){
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }
    public String getquantidadeDeFilhos() {
        return quantidadeDeFilhos ;
    }

    public void setnivelDeInsalubridade(String nivelDeInsalubridade){
        this.nivelDeInsalubridade = nivelDeInsalubridade;
    }
    
   public String getnivelDeInsalubridade() {
       return nivelDeInsalubridade ;
   }
   
   public void sethorasExtras(String horasExtras){
       this.horasExtras = horasExtras;
   }
   public String gethorasExtras(){
       return horasExtras;
   }
   
   public void setpericulosidade(String periculosidade){
       this.periculosidade = periculosidade;
   }
   public String getpericulosidade(){
       return periculosidade;
       
   }
}
