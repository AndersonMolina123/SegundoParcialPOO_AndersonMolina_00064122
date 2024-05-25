import java.util.ArrayList;
import java.util.List;

public class DepartamentoSecundario {
    private String nombre;
    private DepartamentoPrincipal departamentoPrincipal;
    private List<Empleado> empleados = new ArrayList<>();

    private DepartamentoSecundario(Constructor constructor) {
        this.nombre = constructor.nombre;
        this.departamentoPrincipal = constructor.departamentoPrincipal;
        this.empleados = constructor.empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public DepartamentoPrincipal getDepartamentoPrincipal() {
        return departamentoPrincipal;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public static class Constructor implements Constructor<DepartamentoSecundario> {
        private String nombre;
        private DepartamentoPrincipal departamentoPrincipal;
        private List<Empleado> empleados = new ArrayList<>();

        public Constructor setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Constructor setDepartamentoPrincipal(DepartamentoPrincipal departamentoPrincipal) {
            this.departamentoPrincipal = departamentoPrincipal;
            return this;
        }

        public Constructor agregarEmpleado(Empleado empleado) {
            this.empleados.add(empleado);
            return this;
        }

        @Override
        public DepartamentoSecundario construir() {
            return new DepartamentoSecundario(this);
        }
    }
}
