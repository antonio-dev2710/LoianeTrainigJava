package interfaces.interfaceEHeranca;

public interface BancoDeDados extends SqlDCL,SqlDDL,SqlDLM {

    void abrirConexao();
    void fechar();
    
}
