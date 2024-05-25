import java.util.ArrayList;
import java.util.List;

public class DepartamentoPrincipal {
    private String nombre;
    private CEO ceo;
    private List<Empleado> empleados = new ArrayList<>();
    private List<DepartamentoSecundario> departamentosSecundarios = new ArrayList<>();

    private DepartamentoPrincipal(Constructor constructor) {
        this.nombre = constructor.nombre;
        this.ceo = constructor.ceo;
        this.empleados = constructor.empleados;
        this.departamentosSecundarios = constructor.departamentosSecundarios;
    }

    public String getNombre() {
        return nombre;
    }

    public CEO getCeo() {
        return ceo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<DepartamentoSecundario> getDepartamentosSecundarios() {
        return departamentosSecundarios;
    }

    public static class Constructor implements Constructor<DepartamentoPrincipal> {
        private String nombre;
        private CEO ceo;
        private List<Empleado> empleados = new ArrayList<>();
        private List<DepartamentoSecundario> departamentosSecundarios = new ArrayList<>();

        public Constructor setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Constructor setCeo(CEO ceo) {
            this.ceo = ceo;
            return this;
        }

        public Constructor agregarEmpleado(Empleado empleado) {
            this.empleados.add(empleado);
            return this;
        }

        public Constructor agregarDepartamentoSecundario(DepartamentoSecundario departamentoSecundario) {
            this.departamentosSecundarios.add(departamentoSecundario);
            return this;
        }

        @Override
        public DepartamentoPrincipal construir() {
            return new DepartamentoPrincipal(this);
        }
    }
}
