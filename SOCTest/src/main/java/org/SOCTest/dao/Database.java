package org.SOCTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.SOCTest.model.Exame;

public class Database {
	
	public static Connection getConnection() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/soctest?useTimezone=true&serverTimezone=UTC", "root", "password");	
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}
	
	public int SaveExame(String paciente, String doutor, String tipo, String data) throws Exception{
		int i = 0;
		
		if(paciente == null && doutor == null && tipo == null && data == null) {
			return i;
		}
		else {
			try {
				String sql = "INSERT INTO exame (paciente, doutor, tipo, dataExame) VALUES(?,?,?,?)";
				PreparedStatement ps = getConnection().prepareStatement(sql);
				ps.setString(1, paciente);
				ps.setString(2, doutor);
				ps.setString(3, tipo);
				ps.setString(4, data);
				i = ps.executeUpdate();
				return i;
			} catch(Exception ex) {
				ex.printStackTrace();
				return i;
			} finally {
				if(getConnection() != null) {
					getConnection().close();
				}
			}
		}
		
	}
	
	public ResultSet returnAllExames() throws SQLException, Exception{
		ResultSet result = null;
		try {
			String sql = "SELECT id, paciente, doutor, tipo, dataExame FROM exame";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			result = ps.executeQuery();
			return result;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		finally {
			if(getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	public ResultSet returnExameDetails(int id) throws SQLException, Exception {
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM exame WHERE id=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	public int updateExame(String paciente, String doutor, String tipo, int id, String data) throws SQLException, Exception {
		
		getConnection().setAutoCommit(false);
		int i = 0;
		
		try {
			String sql = "UPDATE exame SET paciente=?,doutor=?,tipo=?, dataExame=? WHERE id=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, paciente);
			ps.setString(2, doutor);
			ps.setString(3, tipo);
			ps.setString(4, data);
			ps.setInt(5, id);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	public int delete(int id) throws SQLException, Exception{
		getConnection().setAutoCommit(false);
		int i = 0;
		
		try {
			String sql = "DELETE FROM exame WHERE id=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			i = ps.executeUpdate();
			return i;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
		
	}
	
}
