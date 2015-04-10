/**
 * 
 */
package org.virasoft.studentapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.virasoft.studentapp.model.Student;

/**
 * This repository provides CRUD operations for
 * {@link org.virasoft.studentapp.model.Student} objects.
 * 
 * @author Danushka Wirajith
 *
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
