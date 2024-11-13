package tec.proyecto3;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allaj
 */
public class SistemaIniciarSesión {
    private Cuenta cuenta;
    private List<Cuenta> cuentas;

    public SistemaIniciarSesión(Cuenta cuenta) {
        this.cuenta = cuenta;
        this.cuentas = new ArrayList<>();
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
    
}
