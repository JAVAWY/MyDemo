package hiai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hiai.model.StuType;

public class StuTypeDao {
	public int add (Connection con,StuType stuType) throws Exception {
		String sql="insert into student values(0,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,stuType.get姓名());
		pstmt.setString(2,stuType.get学号());
		pstmt.setString(3,stuType.get联系号码());
		pstmt.setString(4,stuType.get学院());
		pstmt.setString(5,stuType.get是否接触患者());
		pstmt.setString(6,stuType.get是否有疑似状况());
		pstmt.setString(7,stuType.get当前居住地());
		pstmt.setString(8,stuType.get其他备注());
		return pstmt.executeUpdate(); 
	}
}
