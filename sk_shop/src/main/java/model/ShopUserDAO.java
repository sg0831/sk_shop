package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShopUserDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int insert(ShopUserDTO user) {
		int result = 0;

		String sql = "insert into shop_users(user_id, user_pw, user_name, email, phone_number, address) values(?, ?, ?, ?, ?, ?)";

		try {
			conn = DbConnectionUtil.getConnection();
			if (conn != null) System.out.println("get Connection!");
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, user.getUser_id());
			pstmt.setString(2, user.getUser_pw());
			pstmt.setString(3, user.getUser_name());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone_number());
			pstmt.setString(6, user.getAddress());
			if (user.getUser_permission() != null) pstmt.setString(7, user.getUser_permission());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnectionUtil.closeConnection(conn, pstmt, null);
		}

		return result;
	}

	public ShopUserDTO selectOne(String user_id) {
		String sql = "select * from shop_users where user_id = ?";

		try {
			conn = DbConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				ShopUserDTO selectedUser = new ShopUserDTO();
				selectedUser.setUser_id( rs.getString("user_id") );
				selectedUser.setUser_pw( rs.getString("user_pw") );
				selectedUser.setUser_name( rs.getString("user_name") );
				selectedUser.setEmail( rs.getString("email") );
				selectedUser.setPhone_number( rs.getString("phone_number") );
				selectedUser.setAddress( rs.getString("address") );
				selectedUser.setUser_permission( rs.getString("user_permission") );
				
				return selectedUser;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnectionUtil.closeConnection(conn, pstmt, rs);
		}
		
		return null;
	}
}
