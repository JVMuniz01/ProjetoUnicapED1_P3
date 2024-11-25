/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author j040v
 */
public class ParticipanteEvento {
    private String name;
    private Integer registration;
    private String registeredEvent;
    private Integer VIP;
    private Integer numeroEvento = 0;

    public ParticipanteEvento() {
    }

    public ParticipanteEvento(String name, Integer registration, String registeredEvent, Integer VIP) {
        this.name = name;
        this.registration = registration;
        this.registeredEvent = registeredEvent;     
        this.VIP = VIP;
        
    }

    public Integer getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Integer numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getRegisteredEvent() {
        return registeredEvent;
    }

    public Integer getVIP() {
        return VIP;
    }  

    public void setRegisteredEvent(String registeredEvent) {
        this.registeredEvent = registeredEvent;
    }
    public void incrementar(){
        numeroEvento++;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do Participante: ").append(name).append("\n");
        sb.append("Código de Inscrição: ").append(registration).append("\n");
        sb.append("Evento Registrado: ").append(registeredEvent).append("\n");
        return sb.toString();
        
    }
    
}
