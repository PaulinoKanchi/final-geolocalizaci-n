package proyecto.HDP;

import java.util.ArrayList;

public class Usuario {
    private String id;
    private String nickname;
    private String email;
    private String password;
    private ArrayList<Mensaje> mensajes;
    private Posicion posicion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Usuario() {
    }

    public Usuario(String id, String nickname, String email, String password, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }
    
}
