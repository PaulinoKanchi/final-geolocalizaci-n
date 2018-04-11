package proyecto.HDP;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ControladorUsuario {
    //aqui van las 5 operaciones basicas
    @Autowired RepositorioUsuario repo;
    //empezamos con el metodo para guardar
    @RequestMapping(value="/usuario",method=RequestMethod.POST,headers={"Accept=application/json"})    
    public Estatus guardar(@RequestBody String json)throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Usuario u=maper.readValue(json,Usuario.class);
        
        Estatus e=new Estatus();
        e.setSucces(true);
        return e;
        
    }
}
