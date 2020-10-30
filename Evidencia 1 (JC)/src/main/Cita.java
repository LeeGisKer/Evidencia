package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cita {
    private Map<String, Pacientes> pacientes;
    private Map<String, Doctores> doctores;
    private static Cita instance = null;

    private Cita() {
        pacientes = new HashMap<String, Pacientes>();
        doctores = new HashMap<String, Doctores>();
    }

    public Cita getInstance() {
        if(instance == null) {
            instance = new Cita();
        }
        return  instance;
    }
    public void addPacientes(Pacientes x) throws Exception {
        Pacientes p = pacientes.get(x.getId());
        if (p == null) {
            pacientes.put(x.getId(), x);
        } else {
            throw new Exception("Este paciente ya existe");
        }
    }
    public void addDoctor(Doctores x) throws Exception {
        Doctores p = doctores.get(x.getId());
        if (p == null) {
            doctores.put(x.getId(), x);
        } else {
            throw new Exception("Este paciente ya existe");
        }
    }

    public List<Pacientes> getPacientes() {
        List<Pacientes> li = new ArrayList<>();
        for (Map.Entry<String, Pacientes> entry : pacientes.entrySet()) {
            li.add(entry.getValue());
            
        }
        return li;
    }
    
    public List<Doctores> getDoctores() {

        List<Doctores> li = new ArrayList<>();
        for (Map.Entry<String, Doctores> entry : doctores.entrySet()) {
            li.add(entry.getValue());
        }
        return li;
    }
    
    public List<Pacientes> getPacientesPorId(int Id) throws Exception{
        List<Pacientes> li = new ArrayList<>();
        Pacientes p = pacientes.get(Id);
        if(p != null) {
            li.add(p);
            return li;
        } else {
            throw new Exception("No existe este paciente");
        }
    }
}
