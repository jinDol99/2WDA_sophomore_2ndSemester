package pjs07_mvc_gifti.model.prd;

import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;
import pjs07_mvc_gifti.model.prd.prdDTO;
import javax.naming.*;

public class prdDAO {
	
	private PreparedStatement pstmt = null;
	private Connection con = null;
	
	Context init = null;
	DataSource ds = null;
	
	ResultSet rs = null;
	
	public prdDAO() {
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
	
	// DB에서 product의 모든 데이터를 가져와 DTO 형식으로 값 출력
	public ArrayList<prdDTO> getprdList() {
		ArrayList<prdDTO> list = new ArrayList<prdDTO>();
		
		String SQL = "SELECT * FROM product";
		
		try {
			pstmt = con.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				prdDTO prd = new prdDTO();
				
				prd.setP_code(rs.getInt("p_id"));
				prd.setP_name(rs.getString("p_name"));
				prd.setP_category(rs.getString("p_category"));
				prd.setP_img(rs.getString("p_img"));
				prd.setP_barcode(rs.getString("p_barcode"));
				prd.setP_limDate(rs.getString("p_limDate"));
				prd.setP_orgnPrice(rs.getInt("p_orgnPrice"));
				prd.setP_salePrice(rs.getInt("p_salePrice"));
				prd.setP_discription(rs.getString("p_discription"));
				
				list.add(prd);				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}
	
	public ArrayList<prdDTO> getprdListForPage(prdPageInfoVO bpiVO) {
		ArrayList<prdDTO> list = new ArrayList<prdDTO>();
		
		String SQL = "SELECT * FROM prd ORDER BY b_id limit ?, ?";
		String SQL2 = "SELECT count(*) FROM prd";
		
		ResultSet rs;
		
		try {
			pstmt = con.prepareStatement(SQL2);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				bpiVO.setRecordCnt(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		bpiVO.adjPageInfo();
		
		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1, bpiVO.getStartRecord());
			pstmt.setInt(2, bpiVO.getLimitCnt());
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				prdDTO prd = new prdDTO();
				prd.setP_code(rs.getInt("p_code"));
				prd.setP_name(rs.getString("p_name"));
				prd.setP_category(rs.getString("p_category"));
				prd.setP_img(rs.getString("p_img"));
				prd.setP_barcode(rs.getString("p_barcode"));
				prd.setP_limDate(rs.getString("p_limDate"));
				prd.setP_orgnPrice(rs.getInt("p_originPrice"));
				prd.setP_salePrice(rs.getInt("p_salePrice"));
				prd.setP_discription(rs.getString("p_discription"));
				list.add(prd);				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}
	
	// 필터된 리스트 출력용 ArrayList 생성
	public ArrayList<prdDTO> getprdListFiltered(prdFilterInfoVO bfiVO) {
		ArrayList<prdDTO> list = new ArrayList<prdDTO>();
		
		String SQL = bfiVO.getFilteredSQL();
		System.out.println("[prdDAO.java] - getprdListFiltered() SQL: " + SQL);
		
		try {
			pstmt = con.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				prdDTO prd = new prdDTO();
				
				prd.setP_code(rs.getInt("p_code"));
				prd.setP_name(rs.getString("p_name"));
				prd.setP_category(rs.getString("p_category"));
				prd.setP_img(rs.getString("p_img"));
				prd.setP_barcode(rs.getString("p_barcode"));
				prd.setP_limDate(rs.getString("p_limDate"));
				prd.setP_orgnPrice(rs.getInt("p_originPrice"));
				prd.setP_salePrice(rs.getInt("p_salePrice"));
				prd.setP_discription(rs.getString("p_discription"));
				list.add(prd);				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}

	
	public prdDTO getprd(int b_id) {
		String SQL = "SELECT * FROM prd WHERE prd_code = ?";
		prdDTO prd = new prdDTO();
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setInt(1, b_id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			prd.setP_code(rs.getInt("p_code"));
			prd.setP_name(rs.getString("p_name"));
			prd.setP_category(rs.getString("p_category"));
			prd.setP_img(rs.getString("p_img"));
			prd.setP_barcode(rs.getString("p_barcode"));
			prd.setP_limDate(rs.getString("p_limDate"));
			prd.setP_orgnPrice(rs.getInt("p_originPrice"));
			prd.setP_salePrice(rs.getInt("p_salePrice"));
			prd.setP_discription(rs.getString("p_discription"));
			
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return prd;
	}
	
	public boolean insertPrd(prdDTO prd) {
		boolean success = false;
		String sql = "INSERT INTO prd(p_code, p_name, p_category, p_img, p_barcode, ";
				sql += "p_limDate, p_orgnPrice, p_salePrice, p_discription)";
				sql += "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, prd.getP_code());
			pstmt.setString(2, prd.getP_name());
			pstmt.setString(3, prd.getP_category());
			pstmt.setString(4, prd.getP_img());
			pstmt.setString(5, prd.getP_barcode());
			pstmt.setString(6, prd.getP_limDate());
			pstmt.setInt(7, prd.getP_orgnPrice());
			pstmt.setInt(8, prd.getP_salePrice());
			pstmt.setString(9, prd.getP_discription());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disConnect();
		}
		return success;
	}
	
	public boolean updateprd(prdDTO prd) {
		boolean success = false;
		String sql = "update prd set b_code=?, b_category=?, b_name=?, b_country=?, ";
				sql += "b_price=?, b_alcohol=?, b_content=?, b_like=?, b_dislike=?, ";
				sql += "b_image=? where b_id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prd.getB_code());
			pstmt.setString(2, prd.getB_category());
			pstmt.setString(3, prd.getB_name());
			pstmt.setString(4, prd.getB_country());
			pstmt.setInt(5, prd.getB_price());
			pstmt.setString(6, prd.getB_alcohol());
			pstmt.setString(7, prd.getB_content());
			pstmt.setInt(8, prd.getB_like());
			pstmt.setInt(9, prd.getB_dislike());
			pstmt.setString(10, prd.getB_image());
			pstmt.setInt(11, prd.getB_id());
			
			int rowUdt = pstmt.executeUpdate();
			System.out.println("[prdDAO - updateprd()] rowUdt: " + rowUdt);
			if (rowUdt == 1) success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disConnect();
		}
		return success;
	}
	
	public boolean deleteprd(int b_id) {
		boolean success = false;
		String sql = "delete from prd where b_id=?";
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,  b_id);
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		} finally {
			disConnect();
		}
		return success;
	}
}