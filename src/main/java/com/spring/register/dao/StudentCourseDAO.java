package com.spring.register.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.register.model.StudentCourse;;

@Repository
public class StudentCourseDAO {

	@Autowired
	JdbcTemplate template;

	public int addStudentCourse(StudentCourse studentCourse) {

		String sql = "INSERT INTO Student_Course(studentId,courseId) VALUES(?, ?)";
		return template.update(sql, studentCourse.getStudentId(), studentCourse.getCourseId());
	}

	public int deleteStudentCourse(int studentId, int courseId) {
		String sql = "DELETE FROM Student_Course WHERE studentId= ? and courseId= ?";
		return template.update(sql, studentId, courseId);
	}

	public List<StudentCourse> getStudentCourses() {
		return template.query("select * from Student_Course", new RowMapper<StudentCourse>() {
			public StudentCourse mapRow(ResultSet rs, int row) throws SQLException {
				StudentCourse studentCourse = new StudentCourse();
				studentCourse.setStudentId(rs.getInt(1));
				studentCourse.setCourseId(rs.getInt(2));
				return studentCourse;
			}
		});
	}
}
