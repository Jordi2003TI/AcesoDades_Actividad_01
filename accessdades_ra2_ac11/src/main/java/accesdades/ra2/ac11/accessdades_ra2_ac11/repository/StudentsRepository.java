package accesdades.ra2.ac11.accessdades_ra2_ac11.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsRepository {
    // spring boot no detcteda las intancias basicamnete porque no comprende el new asi que usamos el @Autowired para que la instancia
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    

    public void finalAll(){
        //String sql = "SELECT * FROM students";
        //jdbcTemplate.query(sql, );
    }

    public void save(){
        String sql = "insert into students (nom, cognom, age, cicle, `any` ) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, "Jordi", "Masip", 21, "DAM2B", 2003);
    }
}
