/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import enums.AvaliationType;
import enums.ProblemType;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class EmployeeInspection extends Inspection{
    
    private Employee employee;
    private String doctorName;
    private int licenseNumber;
    private int offDays;
    private ProblemType problemType;

    public EmployeeInspection(LocalDate inspectionDate, AvaliationType avaliation, Employee employee, String doctorName, int licenseNumber) {
        super(inspectionDate, avaliation);
        this.employee = employee;
        this.doctorName = doctorName;
        this.licenseNumber = licenseNumber;
    }

    public EmployeeInspection(LocalDate inspectionDate, AvaliationType avaliation, Employee employee, String doctorName, int licenseNumber, int offDays, ProblemType problemType) {
        super(inspectionDate, avaliation);
        this.employee = employee;
        this.doctorName = doctorName;
        this.licenseNumber = licenseNumber;
        this.offDays = offDays;
        this.problemType = problemType;
    }
    
    public Employee getEmployee(){
        return employee;
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
    
    public String toString(){
        if(getAvaliation() == getAvaliation().APROVED){
                return "Data da inspecao: " + getInspectionDate()
                        + ", Avaliacao: " + getAvaliation()
                        + ", Funcionario: " + getEmployee()
                        + ", Nome do medico: " + getDoctorName()
                        + ", Numero de licenca: " + getLicenseNumber();
            } else if(getAvaliation() == getAvaliation().NOT_APROVED){
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
