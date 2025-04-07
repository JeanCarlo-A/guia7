package spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.app.model.Profesor;
public interface ProfesorRepository extends JpaRepository<Profesor, String>
{
}

