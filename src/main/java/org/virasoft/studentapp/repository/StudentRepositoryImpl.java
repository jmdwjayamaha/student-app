/**
 * 
 */
package org.virasoft.studentapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.virasoft.studentapp.model.Student;

import com.mongodb.WriteResult;

/**
 * Repository implementation for CRUD operations for
 * {@link org.virasoft.studentapp.model.Student} objects.
 * 
 * @author Danushka Wirajith
 *
 */
@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public int delete(String id) {

		Query query = new Query(Criteria.where("_id").is(id));
		WriteResult result = mongoTemplate.remove(query, Student.class,
				STUDENT_COLLECTION);
		return result.getN();
	}

	@Override
	public Student save(Student student) {

		mongoTemplate.insert(student, STUDENT_COLLECTION);
		return student;
	}

	@Override
	public Student update(Student student) {

		mongoTemplate.save(student, STUDENT_COLLECTION);
		return student;
	}

	@Override
	public List<Student> list() {

		return mongoTemplate.findAll(Student.class, STUDENT_COLLECTION);
	}

	@Override
	public Student getById(String id) {

		Query query = new Query(Criteria.where("_id").is(id));
		return mongoTemplate.findOne(query, Student.class, STUDENT_COLLECTION);
	}

	/**
	 * @return the mongoTemplate
	 */
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	/**
	 * @param mongoTemplate
	 *            the mongoTemplate to set
	 */
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
