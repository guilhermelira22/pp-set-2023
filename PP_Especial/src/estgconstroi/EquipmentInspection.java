/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import enums.AvaliationType;
import estgconstroi.enums.EquipmentStatus;
import java.time.LocalDate;

/**
 *
 * @author guilhermeLira
 */
public class EquipmentInspection extends Inspection{
    
    private Equipment equipment;
    private String details;

    public EquipmentInspection(LocalDate inspectionDate, AvaliationType avaliation, Equipment equipment) {
        super(inspectionDate, avaliation);
        this.equipment = equipment;
    }
    
    public EquipmentInspection(LocalDate inspectionDate, AvaliationType avaliation, Equipment equipment, String details) {
        super(inspectionDate, avaliation);
        this.equipment = equipment;
        this.details = details;
        if(avaliation == AvaliationType.NOT_APROVED){
            equipment.setStatus(EquipmentStatus.INOPERATIVE);
        }
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public String getDetails() {
        return details;
    }
    
    public String toString(){
        if(getAvaliation() == getAvaliation().APROVED){
            return "Data da inspecao: " + getInspectionDate()
                    + ", Avaliacao: " + getAvaliation()
                    + ", Equipamento: " + getEquipment();
        } else if(getAvaliation() == getAvaliation().NOT_APROVED){
            return "Data da inspecao: " + getInspectionDate()
                    + ", Avaliacao: " + getAvaliation()
                    + ", Equipamento: " + getEquipment()
                    + ", Descricao: " + getDetails();
        }
        return "Sem inspecoes feitas";
    }  
}
