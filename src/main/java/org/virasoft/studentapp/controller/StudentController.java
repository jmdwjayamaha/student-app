/**
 * 
 */
package org.virasoft.studentapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.virasoft.studentapp.model.Student;

/**
 * This controller provides the public API for managing students.
 * 
 * @author Danushka Wirajith
 *
 */
@RestController
public class StudentController {

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {

		student.setId("mongoID");
		return student;
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> listStudents(Model model) {
		Student ss = new Student();
		ss.setFirstName("Danushka");
		ss.setLastName("Virajith");

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(ss);
		return studentList;
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") String id) {
		Student ss = new Student();
		ss.setId(id);
		ss.setFirstName("Danushka");
		ss.setLastName("Virajith");

		System.out.println("Done");

		return ss;
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) {

		return student;
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public Student deleteStudent(@PathVariable("id") String id, @RequestBody Student student) {

		return student;
	}
}
