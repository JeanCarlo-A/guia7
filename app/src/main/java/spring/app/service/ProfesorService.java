package spring.app.service;
import org.springframework.stereotype.Service;
import spring.app.model.Profesor;
import spring.app.repository.ProfesorRepository;
import java.util.List;
@Service
public class ProfesorService {
    
private final ProfesorRepository profesorRepository;
public ProfesorService(ProfesorRepository profesorRepository) {
this.profesorRepository = profesorRepository;
}
public Profesor add(Profesor profesor){
return profesorRepository.save(profesor);
}
public List<Profesor> listar(){
return profesorRepository.findAll();
}
public Profesor consultar(String id){
return profesorRepository.findById(id).orElse(null);
}
public void eliminar(String id){
profesorRepository.deleteById(id);
}
public Profesor actualizar(Profesor profesor){
return profesorRepository.save(profesor);
}



    /*private List<Profesor> profesores;
    public ProfesorService() {
       this.profesores=new ArrayList<>();
       this.profesores.add(new Profesor("703443454","Olivier","Guápiles","76756766"));
       this.profesores.add(new Profesor("303443454","Mauricio","Guápiles","8588886"));
       this.profesores.add(new Profesor("103445654","Pipe","Siquirres","6666766"));
    }
    public boolean add(Profesor profesor){
       return this.profesores.add(profesor);
    }
    public List<Profesor> listar(){
        return this.profesores;
    }
    public Profesor consultar(String id){
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    public boolean eliminar(String id){
        for(int i=0;i<profesores.size();i++)
            if (profesores.get(i).getId().equals(id)){
                profesores.remove(i);
                return true;
            }
        return false;
    }
    public void actualizar(Profesor profesor){
        for(int i=0;i<profesores.size();i++)
            if (profesores.get(i).getId().equals(profesor.getId())){
                profesores.set(i, profesor);
            }
    }*/
    
}
