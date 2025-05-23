package spring.app.dao;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import spring.app.model.Profesor;


@Repository
public class ProfesorDAOImpl implements ProfesorDAO {

 private final JdbcTemplate jdbcTemplate;
 public ProfesorDAOImpl(JdbcTemplate jdbcTemplate) {
 this.jdbcTemplate = jdbcTemplate;
 }
 @Override
 public void save(Profesor profesor) {

    String sql = "INSERT INTO profesores (id, name, address, phone) VALUES (?, ?, ?, ?)";
 jdbcTemplate.update(sql, profesor.getId(), profesor.getName(),profesor.getAddress(), profesor.getPhone());
 }
 @Override
 public Profesor findById(String id) {
 String sql = "SELECT * FROM profesores WHERE id = ?";
 return jdbcTemplate.queryForObject(sql, new ProfesorRowMapper(),
id);
 }
 @Override
 public List<Profesor> findAll() {
 String sql = "SELECT * FROM profesores";
 return jdbcTemplate.query(sql, new ProfesorRowMapper());
 }
 @Override
 public void update(Profesor profesor) {
 String sql = "UPDATE profesores SET name = ?, address = ?, phone = ? WHERE id = ?";
 jdbcTemplate.update(sql, profesor.getName(), profesor.getAddress(),
profesor.getPhone(), profesor.getId());
 }
 @Override
 public void delete(String id) {
 String sql = "DELETE FROM profesores WHERE id = ?";
 jdbcTemplate.update(sql, id);
 }
 private static class ProfesorRowMapper implements RowMapper<Profesor> {
 @Override
 public Profesor mapRow(@SuppressWarnings("null")  ResultSet rs, int rowNum) throws
SQLException {
 return new Profesor(
 rs.getString("id"),
 rs.getString("name"),
 rs.getString("address"),
 rs.getString("phone")
 );
 }
 }
}