package com.spring.register.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.register.model.Student;

@Repository
public class StudentDAO {

	@Autowired
	JdbcTemplate template;

	public int addStudent(Student student) {

		String sql = "INSERT INTO Student(name,email) VALUES(?, ?)";
		return template.update(sql, student.getName(), student.getEmail());

	}

	public int updateStudent(Student student) {
//		System.out.println(student.toString());
		String sql = "UPDATE Student SET name=?, email= ? WHERE studentId=?;";
		return template.update(sql, student.getName(), student.getEmail(), student.getStudentId());
	}

	public int deleteStudent(int id) {
		String sql = "DELETE FROM Student WHERE studentId= ?";
		return template.update(sql, id);
	}

	public Student getStudentById(int id) {
		String sql = "select * from Student where studentId=?";
		Student student = template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Student>(Student.class));
//		System.out.println("dao");
		student.setStudentId(id);
//		System.out.println(student);
		return student;
//		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Student.class));

	}

	public List<Student> getStudents() {
		return template.query("select * from Student", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				Student student = new Student();
				student.setStudentId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				return student;
			}
		});
	}
}
