
package utilitarios;



import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class ConectaBanco {
    public Statement stm;  //responssavel por preparar e realizar pesquisa no banco de dados
    public ResultSet rs;  // responsavel por armazenar o resultado de uma pesquisa passada para o Statement
    private String driver = "com.mysql.cj.jdbc.Driver";  //Friver do MySQL
    private String caminho = "jdbc:mysql://localhost:3306/cadastros";  // Caminho para o banco do MySQL e o banco que sera usado
    private String usuario = "root";  // Nome de usuario ultilizado no MySQL
    private String senha = "claiton81"; //Senha ultilizado para conectar o usuario root MySQL
    public Connection conn;  //Responsavel por realizar a conexão com o banco de dados
    
    //Metodo responsavel por realizar a conexão com o Banco de dados do MySQL
    public void conexao(){
            
        
        try {  //tentativa inicial, caso não consiga passa para o catch
            System.setProperty("jdbc.Drivers", driver);  //seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);  //realiza a conexão com o banco e após retorna para a variavel true ou false
            //JOptionPane.showMessageDialog(null, "Conexão com Banco de Dados realizada com sucesso!");  // exibe uma caixa de texto e imprime a mensagem se true
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o Banco de Dados! \n Erro: "+ex.getMessage());
        }
    }
    
    public void ExecutaSql(String sql){
        try {
            stm= conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);

            int rs= stm.executeUpdate(sql);

           // JOptionPane.showMessageDialog(null,"Excluido com sucesso");//imprime uma caixa de mensagem
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no método executaSQL!\n Erro"+ex.getMessage());
        }
        
    }
    
    public void executaSQLQuery(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
                    rs = stm.executeQuery(sql);  
        } catch (SQLException ex) {
        }
    }

    
        
    public void desconecta(){
     
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Conexão com Banco de Dados Encerrada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar Conexão com o Banco de Dados! \n Erro: "+ex.getMessage());
        }
     }   
    
    }
            
            
            
  




        

