package com.spring.register.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.register.model.Course;

@Repository
public class CourseDAO {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int addCourse(Course course) {
		String sql = "INSERT INTO Course(name,description,teacherId) VALUES(?, ?, ?)";
		return template.update(sql, course.getName(), course.getDescription(), course.getTeacherId());
	}

	public int updateCourse(Course course) {
		String sql = "UPDATE Course SET name=?, description= ?, teacherId=? WHERE courseId=?;";
		return template.update(sql, course.getName(), course.getDescription(), course.getTeacherId(),
				course.getCourseId());
	}

	public int deleteCourse(int id) {
		String sql = "DELETE FROM Course WHERE courseId= ?";
		return template.update(sql, id);
	}

	public Course getCourseById(int id) {
		String sql = "select * from Course where courseId=?";
		Course course = template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Course>(Course.class));
		course.setCourseId(id);
		return course;
	}

	public List<Course> getCourses() {
		return template.query("select * from Course", new RowMapper<Course>() {
			public Course mapRow(ResultSet rs, int row) throws SQLException {
				Course course = new Course();
				course.setCourseId(rs.getInt(1));
				course.setName(rs.getString(2));
				course.setDescription(rs.getString(3));
				course.setTeacherId(rs.getInt(4));
				return course;
			}
		});
	}

}
