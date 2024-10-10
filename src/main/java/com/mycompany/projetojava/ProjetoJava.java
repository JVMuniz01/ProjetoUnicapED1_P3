

package com.mycompany.projetojava;

import entities.ClinicaMedica;
import entities.Consultas;
import entities.Medicos;
import entities.Pacientes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author j040v
 */
public class ProjetoJava {

    public static void main(String[] args) throws ParseException {
    ClinicaMedica clinica = new ClinicaMedica();
    Medicos medico = new Medicos();
    Pacientes paciente = new Pacientes();
    Scanner s = new Scanner (System.in);
    
    boolean running = true;
    
    while(running){
        System.out.println("\n*** MENU PRINCIPAL ***");
        System.out.println("1. Gerenciar Clínica Médica");
        System.out.println("2. Gerenciar Eventos");
        System.out.println("3. Gerenciar Restaurante");
        System.out.println("0. Sair");
        
        System.out.println("Escolha uma opção");
        
        int op = s.nextInt();
        switch(op){
            case 1: 
                clinicaMenu(clinica, medico, paciente);
            break;
            
            case 2:
                
        }
    }
    
    }
    public static void clinicaMenu(ClinicaMedica clinica, Medicos medico, Pacientes paciente) throws ParseException {
        Scanner s = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        boolean clinicRunning = true;
        
        while(clinicRunning){
            System.out.println("\n*** MENU DA CLÍNICA MÉDICA ***");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Adicionar Médico");
            System.out.println("3. Buscar Paciente");
            System.out.println("4. Buscar Médicos");
            System.out.println("5. Agendar consulta");
            System.out.println("6. Editar histórico do paciente");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");  
            
            
            int op = s.nextInt();
            s.nextLine();            
            switch(op){
                case 1:
                    System.out.println("Digite o nome do paciente: ");
                    String nomeP = s.nextLine();                  
                    
                    System.out.println("Digite o histórico do paciente: ");
                    String historico = s.nextLine();
                    
                    System.out.println("Digite a idade do paciente: ");
                    int idade = s.nextInt();
                    
                    System.out.println("Informe a última consulta do paciente: ");
                    System.out.println("Formato dd/MM/yyyy");
                    Date ultimaConsulta = sdf.parse(s.next());
                    
                    paciente = new Pacientes(nomeP, historico, idade, ultimaConsulta);                   
                    clinica.addPaciente(paciente);                                                          
                    break;
                case 2:
                    System.out.println("Digite o nome do médico: ");
                    String nomeM = s.nextLine();                 
                    System.out.println("Especialidade do médico: ");
                    String especialidade = s.nextLine();
                    
                    System.out.println("Disponibilidade do médico: ");
                    System.out.println("(true) - disponivel || (false) - indisponivel");
                    boolean disponibilidade = s.nextBoolean();
                    
                    medico = new Medicos(nomeM, especialidade, disponibilidade);
                    clinica.addMedico(medico);
                    break;
                case 3:
                    System.out.println("Digite o nome do paciente que deseja encontrar: ");
                    String nomePaciente = s.nextLine();
                    Pacientes pacienteEncontrado = clinica.buscaPaciente(nomePaciente);                  
                    
                    if(pacienteEncontrado != null){
                        System.out.println("Paciente Encontrado: ");
                        System.out.println(pacienteEncontrado);
                    }else{
                        System.out.println("Paciente não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do medico que deseja encontrar: ");
                    String nomeMedico = s.nextLine();
                    Medicos medicoEncontrado = clinica.buscaMedico(nomeMedico);                  
                    
                    if(medicoEncontrado != null){
                        System.out.println("Medico Encontrado: ");
                        System.out.println(medicoEncontrado);
                    }else{
                        System.out.println("Medico não encontrado");
                    }                   
                    break;
                case 5:
                    System.out.println("Digite seu nome: ");
                    String nomePacienteConsulta = s.nextLine();
                    
                    System.out.println("Digite o historico do paciente: ");
                    String historicoConsulta = s.nextLine();
                    
                    System.out.println("Digite sua idade: ");
                    int idadeConsulta = s.nextInt();                                      
                    
                    System.out.println("Informe a data da consulta que deseja: ");
                    System.out.println("Formato dd/MM/yyyy");   
                    Date dateConsulta = sdf.parse(s.next());
                    s.nextLine();
                    System.out.println("Digite o nome do médico");
                    String nomeMedicoConsulta = s.nextLine();
                    
                    Medicos procuraMedico = clinica.buscaMedico(nomeMedicoConsulta);
                    if(procuraMedico != null){
                        if(procuraMedico.isDisponibilidade() == true){
                            System.out.println("Marcada");
                            medico.setDisponibilidae(false);
                        }else{
                            System.out.println("Medico indisponivel");
                        }
                    }else{
                        System.out.println("Medico inexistente");
                    }
                    break;
                case 6: 
                    System.out.println("Digite o nome do paciente que deseja encontrar: ");
                    String alterarPaciente = s.nextLine();
                    Pacientes pacienteAlterado = clinica.buscaPaciente(alterarPaciente);
                    if(pacienteAlterado != null){
                        System.out.println("Atualize o historico do paciente: " + pacienteAlterado.getNome());
                        String novoHistorico = s.nextLine();
                        paciente.setHistorico(novoHistorico);
                    }
                    
                    
                case 0:
                    clinicRunning = false;
                    break;
            }
        
        }
    }
    
}
