/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import enums.AvaliationType;
import enums.ProblemType;
import estgconstroi.enums.EquipmentStatus;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class Inspection {
    
    private LocalDate inspectionDate;
    private AvaliationType avaliation;
    private Equipment equipment;
    private Employee employee;
    private String description;
    private String doctorName;
    private int licenseNumber;
    private int offDays;
    private ProblemType problemType;

    public Inspection(LocalDate inspectionDate, AvaliationType avaliation, Equipment equipment) {
        this.inspectionDate = inspectionDate;
        this.avaliation = avaliation;
        this.equipment = equipment;
    }

    public Inspection(LocalDate inspectionDate, AvaliationType avaliation, Equipment equipment, String description) {
        this.inspectionDate = inspectionDate;
        this.avaliation = avaliation;
        this.equipment = equipment;
        this.description = description;
        if(avaliation == AvaliationType.NOT_APROVED){
            equipment.setStatus(EquipmentStatus.INOPERATIVE);
        }
    }

    public Inspection(LocalDate inspectionDate, AvaliationType avaliation, Employee employee, String doctorName, int licenseNumber) {
        this.inspectionDate = inspectionDate;
        this.avaliation = avaliation;
        this.employee = employee;
        this.doctorName = doctorName;
        this.licenseNumber = licenseNumber;
    }

    public Inspection(LocalDate inspectionDate, AvaliationType avaliation, Employee employee, String doctorName, int licenseNumber, int offDays, ProblemType problemType) {
        this.inspectionDate = inspectionDate;
        this.avaliation = avaliation;
        this.employee = employee;
        this.doctorName = doctorName;
        this.licenseNumber = licenseNumber;
        this.offDays = offDays;
        this.problemType = problemType;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public AvaliationType getAvaliation() {
        return avaliation;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getDescription() {
        return description;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public int getOffDays() {
        return offDays;
    }

    public ProblemType getProblemType() {
        return problemType;
    }
    
    @Override
    public String toString(){
        if(getEmployee() == null && getAvaliation() == getAvaliation().APROVED){
            return "Data da inspecao: " + getInspectionDate()
                    + ", Avaliacao: " + getAvaliation()
                    + ", Equipamento: " + getEquipment();
        } else if(getEmployee() == null && getAvaliation() == getAvaliation().NOT_APROVED){
            return "Data da inspecao: " + getInspectionDate()
                    + ", Avaliacao: " + getAvaliation()
                    + ", Equipamento: " + getEquipment()
                    + ", Descricao: " + getDescription();
        } else if(getEquipment() == null && getAvaliation() == getAvaliation().APROVED){
            return "Data da inspecao: " + getInspectionDate()
                    + ", Avaliacao: " + getAvaliation()
                    + ", Funcionario: " + getEmployee()
                    + ", Nome do medico: " + getDoctorName()
                    + ", Numero de licenca: " + getLicenseNumber();
        } else if(getEquipment() == null && getAvaliation() == getAvaliation().NOT_APROVED){
            return "Data da inspecao: " + getInspectionDate()
                    + ", Avaliacao: " + getAvaliation()
                    + ", Funcionario: " + getEmployee()
                    + ", Nome do medico: " + getDoctorName()
                    + ", Numero de licenca: " + getLicenseNumber()
                    + ", Dias de repouso: " + getOffDays()
                    + ", Tipo de problema: " + getProblemType();
        }
        return "Sem inspecoes feitas";
    }
    
}
