package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ShopUserDAO {
	public int insert(ShopUserDTO user) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into shop_users values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = DbConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getUser_id());
			pstmt.setString(2, user.getUser_pw());
			pstmt.setString(3, user.getUser_name());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone_number());
			pstmt.setString(6, user.getAddress());
			pstmt.setString(7, user.getUser_permission());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnectionUtil.closeConnection(conn, pstmt, null);
		}
		
		return result;
	}
}
