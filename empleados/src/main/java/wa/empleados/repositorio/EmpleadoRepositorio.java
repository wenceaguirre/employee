package wa.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import wa.empleados.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
