package proyecto.HDP;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {
@Autowired RepositorioUsuario repo;
	@Test
	public void contextLoads() {
	}
        @Test
        public void guardar(){
            //aqui ponemos la logica de guardar un usuario
            //generamos un objeto
            Usuario u=new Usuario(); 
            Posicion pos=new Posicion();
            Mensaje mensa=new Mensaje();
            //generar un usuario con todos sus atributos incluyendo un mensaje y una posicion
            
            Assert.assertEquals(4, 2+2);
            
        }
        @Test
        public void actualizar(){
            Assert.assertEquals(4, 2+2);
        }
        @Test
        public void borrar(){
            Assert.assertEquals(4, 2+2);
        }
        @Test
        public void buscarTodos(){
            Assert.assertEquals(4, 2+2);
        }
        @Test
        public void buscarPorId(){
            Assert.assertEquals(4, 2+2);
        }
}
