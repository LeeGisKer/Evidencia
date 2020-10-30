package App;

public class App {
    public static void main(String[] array) {
        Presentacion.View v1 = new Presentacion.View();
        Presentacion.Model m1 = new Presentacion.Model();
        Presentacion.Control c1 = new Presentacion.Control(v1, m1);
        v1.setVisible(true);
    }

}
