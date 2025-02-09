package wa.empleados.servicio;

import wa.empleados.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();
    public Empleado buscarEmpleadoPorID(Integer id);
    public void guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
}
