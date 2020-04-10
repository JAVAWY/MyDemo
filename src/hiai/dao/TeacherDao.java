package hiai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hiai.model.Teacher;

/*
 * 教师实体
 */
public class TeacherDao {
	public int add(Connection con, Teacher teacher)throws Exception{
		String sql="insert into teacher values(null,?,?,?,?,?,?,?,?,?)";
	PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1, teacher.get姓名());
		pstmt.setString(2,teacher.get工号());
		pstmt.setString(3, teacher.get联系方式());
		pstmt.setString(4, teacher.get所在学院());
		pstmt.setString(5, teacher.get是否接触患者());
		pstmt.setString(6, teacher.get是否有疑似状况());
		pstmt.setString(7, teacher.get目前居住地址());
		pstmt.setString(8, teacher.get今日填报时间());
		
		return pstmt.executeUpdate();
  }
}