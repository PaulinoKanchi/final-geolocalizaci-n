
package proyecto.HDP;

public class Posicion {
    private double lat;
    private double lon;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Posicion() {
    }

    public Posicion(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    
}
