package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Evento;

//import model.Tarefa;

public class EventoDAO {
	
	public Evento consultarPorId(Integer id) {
	    Evento evento = new Evento();
	    
	    String SQL = "SELECT * FROM evento WHERE id = ?";
	    
	    Connection cnx = Dao.getConexao();
	    
	    PreparedStatement ps;

	    try {
	        ps = cnx.prepareStatement(SQL);
	        
	        ps.setInt(1, id);
	        
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            evento.setId(rs.getInt("id"));
	            evento.setTitulo(rs.getString("titulo"));
	            evento.setDescricao(rs.getString("descricao"));
	            evento.setImg_src(rs.getString("img_src"));
	            evento.setTipo(rs.getInt("tipo"));
	            evento.setMin_lotacao(rs.getInt("min_lotacao"));
	            evento.setMax_lotacao(rs.getInt("max_lotacao"));
	            evento.setStatus(rs.getBoolean("status"));
	            evento.setMin_idade(rs.getInt("min_idade"));
	            evento.setData_evento(rs.getString("data_evento"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Dao.setFecharConexao();
	        return evento;
	    }
	}

	public boolean incluir(Evento evento) {
		boolean resultado = true;
		
		Connection cnx = Dao.getConexao();
		
		String SQL = "INSERT INTO evento(titulo, descricao, img_src, tipo, min_lotacao, max_lotacao, status, min_idade, data_evento) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			
			ps.setString(1, evento.getTitulo());
			ps.setString(2, evento.getDescricao());
			ps.setString(3, evento.getImg_src());
			ps.setInt(4, evento.getTipo());
			ps.setInt(5, evento.getMin_lotacao());
			ps.setInt(6, evento.getMax_lotacao());
			ps.setBoolean(7, evento.getStatus());
			ps.setInt(8, evento.getMin_idade());
			ps.setString(9, evento.getData_evento());
			
			int i = ps.executeUpdate();
			
			resultado = i > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
	
	public boolean editar(Evento evento) {
	    boolean resultado = false;

	    Connection cnx = Dao.getConexao();

	    String SQL = "UPDATE evento SET titulo = ?, descricao = ?, img_src = ?, tipo = ?, min_lotacao = ?, max_lotacao = ?, status = ?, min_idade = ?, data_evento = ? WHERE id = ?";

	    PreparedStatement ps;

	    try {
	        ps = cnx.prepareStatement(SQL);

	        ps.setString(1, evento.getTitulo());
			ps.setString(2, evento.getDescricao());
			ps.setString(3, evento.getImg_src());
			ps.setInt(4, evento.getTipo());
			ps.setInt(5, evento.getMin_lotacao());
			ps.setInt(6, evento.getMax_lotacao());
			ps.setBoolean(7, evento.getStatus());
			ps.setInt(8, evento.getMin_idade());
			ps.setString(9, evento.getData_evento());
			ps.setInt(10, evento.getId());

	        int i = ps.executeUpdate();

	        resultado = i > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado;
	}
	
	public boolean excluir(Integer id) {
	    boolean resultado = false;

	    Connection cnx = Dao.getConexao();

	    String SQL = "DELETE FROM evento WHERE id = ?";

	    PreparedStatement ps;

	    try {
	        ps = cnx.prepareStatement(SQL);

	        ps.setInt(1, id);

	        int i = ps.executeUpdate();

	        resultado = i > 0 ? true : false; //IF Terciario
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado;
	}
	
	public List<Evento> listar() {
		List<Evento> listarEventos = new ArrayList<Evento>();
		Evento evento;
				
		String SQL = "SELECT * FROM evento";
		
		Connection cnx = Dao.getConexao();
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				evento = new Evento();
				evento.setId(rs.getInt("id"));
		        evento.setTitulo(rs.getString("titulo"));
		        evento.setDescricao(rs.getString("descricao"));
		        evento.setImg_src(rs.getString("img_src"));
		        evento.setTipo(rs.getInt("tipo"));
		        evento.setMin_lotacao(rs.getInt("min_lotacao"));
		        evento.setMax_lotacao(rs.getInt("max_lotacao"));
		        evento.setStatus(rs.getBoolean("status"));
		        evento.setMin_idade(rs.getInt("min_idade"));
		        evento.setData_evento(rs.getString("data_evento"));
				
				listarEventos.add(evento);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.setFecharConexao();
			return listarEventos;
		}
	}
}