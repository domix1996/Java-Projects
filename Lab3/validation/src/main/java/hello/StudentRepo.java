package hello;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> { }
