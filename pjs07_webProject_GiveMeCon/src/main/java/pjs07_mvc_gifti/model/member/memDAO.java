package pjs07_mvc_gifti.model.member;

import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;
import pjs07_mvc_gifti.model.member.memDTO;
import javax.naming.*;

public class memDAO {
	private PreparedStatement pstmt = null;
	private Connection con = null;
	
	Context init = null;
	DataSource ds = null;
	
	ResultSet rs = null;
	
	public memDAO() {
		super();
		dbConnect();
	}
	
	public void dbConnect() {
		try {
			Context init = new InitialContext();			
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc_mariadb");
			con = ds.getConnection();
			
			System.out.println("DB연결 성공!");
		} catch(Exception e) {
			System.out.println("DB연결 실패!");
			e.printStackTrace();
		}
	}
	
	public void disConnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<memDTO> getMemList() {
		ArrayList<memDTO> list = new ArrayList<memDTO>();
		
		String SQL = "SELECT * FROM member";
		
		try {
			pstmt = con.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				memDTO mem = new memDTO();
				
				mem.setM_code(rs.getInt("m_code"));
				mem.setM_name(rs.getString("m_name"));
				mem.setM_id(rs.getString("m_id"));
				mem.setM_password(rs.getString("m_password"));
				mem.setM_RRN(rs.getString("m_RRN"));
				mem.setM_contact(rs.getString("m_contact"));
				mem.setM_email(rs.getString("m_email"));
				mem.setM_permission(rs.getInt("m_permission"));
				mem.setM_regDate(rs.getString("m_regDate"));
				
				list.add(mem);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}
	
	public ArrayList<memDTO> getLoginInfo() {
		ArrayList<memDTO> list = new ArrayList<memDTO>();
		
		String SQL = "SELECT mem_id, mem_password FROM member WHERE mem_id = `?`";
		
		try {
			pstmt = con.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				memDTO mem = new memDTO();
				
				mem.setM_id(rs.getString("m_name"));
				mem.setM_password(rs.getString("m_password"));
				
				list.add(mem);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}
	
	
	
}
