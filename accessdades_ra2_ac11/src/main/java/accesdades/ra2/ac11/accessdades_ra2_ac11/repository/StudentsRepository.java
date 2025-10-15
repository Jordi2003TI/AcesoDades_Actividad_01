package accesdades.ra2.ac11.accessdades_ra2_ac11.repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import accesdades.ra2.ac11.accessdades_ra2_ac11.model.students;

@Repository
public class StudentsRepository {
    // spring boot no detcteda las intancias basicamnete porque no comprende el new asi que usamos el @Autowired para que la instancia
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final class StudentsRowMapper implements RowMapper<students>{
        @Override
        public students mapRow(ResultSet rs, int rowNum) throws SQLException{
            students student = new students();
            student.setId(rs.getLong("id"));
            student.setNom(rs.getString("nom"));
            student.setCognom(rs.getString("cognom"));
            student.setAge(rs.getInt("age"));
            student.setCicle(rs.getString("cicle"));
            student.setAny(rs.getInt("any"));
            return student;
        }
    }
    
    public List<students> findAll(){
        String sql = "select * from students;";
        return jdbcTemplate.query(sql, new StudentsRowMapper());
    }

    public void save(){
        String sql = "insert into students (nom, cognom, age, cicle, `any`) VALUES (?,?,?,?,?);";
        jdbcTemplate.update(sql, "Jordi", "Masip", 21, "DAM2B", 2003);
    }
}
