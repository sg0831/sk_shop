package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShopItemDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int insert(ShopItemDTO item) {
		int result = 0;

		String sql = "insert into shop_Items(item_code, item_name, price, color, item_size, item_count, category) values(?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = DbConnectionUtil.getConnection();
			if (conn != null) System.out.println("get Connection!");
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, item.getItem_code());
			pstmt.setString(2, item.getItem_name());
			pstmt.setInt(3, item.getPrice());
			pstmt.setString(4, item.getColor());
			pstmt.setString(5, item.getItem_size());
			pstmt.setInt(6, item.getItem_count());
			pstmt.setString(7, item.getCategory());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnectionUtil.closeConnection(conn, pstmt, null);
		}

		return result;
	}

	public ShopItemDTO selectOne(String item_code) {
		String sql = "select * from shop_items where item_code = ?";

		try {
			conn = DbConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, item_code);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				ShopItemDTO selectedItem = new ShopItemDTO();
				selectedItem.setItem_code( rs.getString("Item_code") );
				selectedItem.setItem_name( rs.getString("item_name") );
				selectedItem.setPrice( rs.getInt("price") );
				selectedItem.setColor( rs.getString("color") );
				selectedItem.setItem_size( rs.getString("item_size") );
				selectedItem.setItem_count( rs.getInt("item_count") );
				selectedItem.setCategory( rs.getString("category") );
				
				return selectedItem;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnectionUtil.closeConnection(conn, pstmt, rs);
		}
		
		return null;
	}

}
