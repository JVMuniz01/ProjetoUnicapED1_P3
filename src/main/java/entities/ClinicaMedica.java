    package entities;

import java.util.ArrayList;
import java.util.List;

public class ClinicaMedica {

    private List<Medicos> medico = new ArrayList<Medicos>();
    private List<Pacientes> paciente = new ArrayList<Pacientes>();
    private List<Consultas> consulta = new ArrayList<Consultas>();

    public ClinicaMedica() {
    }

    public void addMedico(Medicos medicos) {
        medico.add(medicos);
    }

    public void removeMedico(Medicos medicos) {
        medico.remove(medicos);
    }

    public void addPaciente(Pacientes pacientes) {
        paciente.add(pacientes);
    }

    public void removePaciente(Pacientes pacientes) {
        paciente.remove(pacientes);
    }

    public void addConsulta(Consultas consultas) {
        consulta.add(consultas);
    }

    public void removeConsulta(Consultas consultas) {
        consulta.remove(consultas);
    }
    
    public void imprimirCatalogo(){
        for(Medicos m : medico){
            System.out.println("------Médico------");
            System.out.println(m);
            
        }
        }
    
    
    public Pacientes buscaPaciente(String nome) {
        for (Pacientes p : paciente) {
            String nomePaciente = p.getNome().trim();
            if (nomePaciente.length() == nome.length()) {
                boolean igual = true;
                for (int i = 0; i < nomePaciente.length(); i++) {
                    if (Character.toLowerCase(nomePaciente.charAt(i)) != Character.toLowerCase(nome.charAt(i))) {
                        igual = false;
                        break;
                    }
                }
                if (igual) {
                    return p;
                }
            }
        }
        return null;
    }

    public Medicos medicoMaisConsultas(){
        if(medico.isEmpty()){
            return null;
        }
        Medicos medicoRequisitado = medico.get(0);
        
        for(Medicos med : medico){
            if(med.getConsultasMarcadas() > medicoRequisitado.getConsultasMarcadas()){
                medicoRequisitado = med;
            }
        }
        return medicoRequisitado;
    }
    
    public Medicos buscaMedico(String nome) {
        for (Medicos m : medico) {
            String nomeMedico = m.getNome().trim();
            if (nomeMedico.length() == nome.length()) {
                boolean igual = true;
                for (int i = 0; i < nomeMedico.length(); i++) {
                    if (Character.toLowerCase(nomeMedico.charAt(i)) != Character.toLowerCase(nome.charAt(i))) {
                        igual = false;
                        break;
                    }
                }
                if (igual) {
                    return m;
                }
            }
        }
        return null;
    }
    public Medicos buscarCRM(int CRM) {
        for (Medicos m : medico) {
            int codigo = m.getCRM();
            if (codigo == CRM) {
                return m;
            }
        }
        return null;
    }
   

}
