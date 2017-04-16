package testeBancoDeDados;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class BDTeste {
	public static void main(String args[]) throws IOException {

		try {
			fornecedor fornecedor = new fornecedor();
			fornecedor.setFornecedor("A", 1);
			produtos produto1 = new produtos();
			produtos produto2 = new produtos();
			produto1.setProduto(1, "Coca", 100, 1, "A");
			produto2.setProduto(2, "Guarana", 100, 1, "A");
			fornecedor.inserirProdutoFornecido(produto1);
			fornecedor.inserirProdutoFornecido(produto2);
			String select = "SELECT * FROM estoque";
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/estoque",
					"root", "");
			System.out.println("Conectado OK");

			java.sql.PreparedStatement stmt = con.prepareStatement("insert into fornecedor (código, nome) values (?,?)");
			stmt.setInt(1,fornecedor.códigoFornecedor);
			stmt.setString(2,fornecedor.nomeFornecedor);
			//execute
			stmt.execute();
			
			stmt = con.prepareStatement("insert into produto(codigo, descricao, valor, fornecedor, quantidade) values (?,?,?,?,?)");
					// preenche os valores
					stmt.setInt(1,produto1.código);
					stmt.setString(2, produto1.descrição);
					stmt.setFloat(3,produto1.valor);
					stmt.setString(4,produto1.fornecedor);
					stmt.setInt(5,produto1.quantidade);
					
					// executa
					stmt.execute();
			
					// preenche os valores
					stmt.setInt(1,produto2.código);
					stmt.setString(2, produto2.descrição);
					stmt.setFloat(3,produto2.valor);
					stmt.setString(4,produto2.fornecedor);
					stmt.setInt(5,produto2.quantidade);
					// executa
					stmt.execute();
					stmt.close();
					System.out.println("Gravado!");
					con.close();			

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	/*
	 * public fornecedor pesquisarFornecedor(int código) throws IOException {
	 * String select = "SELECT * FROM fornecedor"; fornecedor fornecedor = new
	 * fornecedor(); try { Connection con;
	 * Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection("jdbc:mysql://localhost/estoque", "root",
	 * ""); Statement st = con.createStatement(); ResultSet rs =
	 * st.executeQuery(select); while (rs.next()) { if (rs.getInt("código") ==
	 * código) { fornecedor.setFornecedor(rs.getString("nome"),
	 * rs.getInt("código")); } } st.close(); con.close(); } catch (Exception e)
	 * { e.printStackTrace(); } System.in.read(); return fornecedor; } }
	 */

}
