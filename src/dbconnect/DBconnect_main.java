package dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnect_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int id, year,ton;
		String name;
		ResultSet rs;
		//[MySQLクラスのインスタンス生成]
		MySQL mysql = new MySQL();
		//[テーブルから情報を持ってくる]
		rs = mysql.selectAll();
		
		try {
			while(rs.next()){
				id = rs.getInt("id");
				name = rs.getString("name");
				year = rs.getInt("year");
				ton = rs.getInt("ton");
				System.out.println("ID：" + id);
				System.out.println("name：" + name);
				System.out.println("year：" + year);
				System.out.println("ton：" + ton);
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
	
}
