package com.spring.register.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.register.model.Teacher;

@Repository
public class TeacherDAO {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int addTeacher(Teacher teacher) {
		String sql = "INSERT INTO Teacher(name,email) VALUES(?, ?)";
		return template.update(sql, teacher.getName(), teacher.getEmail());
	}

	public int updateTeacher(Teacher teacher) {
		String sql = "UPDATE Teacher SET name=?, email= ? WHERE teacherId=?;";
		return template.update(sql, teacher.getName(), teacher.getEmail(), teacher.getTeacherId());
	}

	public int deleteTeacher(int id) {
		String sql = "DELETE FROM Teacher WHERE teacherId= ?";
		return template.update(sql, id);
	}

	public Teacher getTeacherById(int id) {
		String sql = "select * from Teacher where teacherId=?";
		Teacher teacher = template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Teacher>(Teacher.class));
		teacher.setTeacherId(id);
		return teacher;
	}

	public List<Teacher> getTeachers() {
		return template.query("select * from Teacher", new RowMapper<Teacher>() {
			public Teacher mapRow(ResultSet rs, int row) throws SQLException {
				Teacher teacher = new Teacher();
				teacher.setTeacherId(rs.getInt(1));
				teacher.setName(rs.getString(2));
				teacher.setEmail(rs.getString(3));
				return teacher;
			}
		});
	}
}
