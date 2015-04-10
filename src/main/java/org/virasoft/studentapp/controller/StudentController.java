/**
 * 
 */
package org.virasoft.studentapp.controller;

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

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") String id) {
		Student ss = new Student();
		ss.setId(id);
		ss.setFirstName("Danushka");
		ss.setLastName("Virajith");

		System.out.println("Done");

		return ss;
	}

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {

		System.out.println("welcome2");
		return student;
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("welcome");
		return "test";
	}
}
