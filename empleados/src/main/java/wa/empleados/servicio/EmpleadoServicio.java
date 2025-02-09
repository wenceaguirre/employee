package wa.empleados.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wa.empleados.modelo.Empleado;
import wa.empleados.repositorio.EmpleadoRepositorio;

import java.util.List;
@Service
public class EmpleadoServicio implements IEmpleadoServicio{
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorID(Integer id) {
        return empleadoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepositorio.delete(empleado);
    }
}
