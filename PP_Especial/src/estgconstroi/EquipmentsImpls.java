/*
* Nome: <Guilherme Fonseca Lira de Meireles>
* Número: <8210415>
* Turma: <LSIRCT1>
*
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estgconstroi;

import estgconstroi.enums.EquipmentStatus;
import estgconstroi.enums.EquipmentType;
import exceptions.ConstructionSiteExceptionImpl;

/**
 *
 * @author guilhermeLira
 */
public class EquipmentsImpls implements Equipments{
    
    private Equipment[] equip;
    private int count;

    public EquipmentsImpls(int maxEquipments) {
        equip = new Equipment[maxEquipments];
        count = 0;
    }

    @Override
    public void addEquipment(Equipment eqpmnt) throws ConstructionSiteExceptionImpl {
        try{
            for (int i=0; i<count; i++) {
                if (equip[i] != null && equip[i].getName().equals(eqpmnt.getName())) {
                    throw new ConstructionSiteExceptionImpl("O equipamento já está na obra.");
                }
            }
            for(int i=0; i<equip.length; i++){
                if (equip[i] == null) {
                    equip[i] = eqpmnt;
                    count++;
                    return;
                }
            }
        }catch (ConstructionSiteExceptionImpl e) {
            throw e;
        }
    }

    @Override
    public void removeEquipment(Equipment eqpmnt) throws ConstructionSiteExceptionImpl {
        try {
            boolean found = false; 

            for (int i=0; i<count; i++) {
                if (equip[i] != null && equip[i].equals(eqpmnt)) {
                    for (int j=i; j<count-1; j++) {
                        equip[j] = equip[j+1];
                    }
                    equip[count-1] = null;
                    count--;
                    found = true; 
                    break;
                }
            }

            if (!found) {
                throw new ConstructionSiteExceptionImpl("O equipamento não foi encontrado na obra.");
            }
        } catch (ConstructionSiteExceptionImpl e) {
            throw e;
        }
    }

    @Override
    public Equipment[] getEquipment(String string) {
        Equipment[] result = new Equipment[count];
        int index = 0;

        for (Equipment equipment : equip) {
            if (equipment != null && equipment.getName().equals(string)) {
                result[index] = equipment;
                index++;
            }
        }

        return result;
    }

    @Override
    public Equipment[] getEquipment(EquipmentStatus es) {
        Equipment[] result = new Equipment[count];
        int index = 0;

        for (Equipment equipment : equip) {
            if (equipment != null && equipment.getStatus() == es) {
                result[index] = equipment;
                index++;
            }
        }

        return result;
    }

    @Override
    public Equipment[] getEquipment(EquipmentType et) {
        Equipment[] result = new Equipment[count];
        int index = 0;

        for (Equipment equipment : equip) {
            if (equipment != null && equipment.getType() == et) {
                result[index] = equipment;
                index++;
            }
        }

        return result;
    }

    @Override
    public Equipment[] getEquipment() {
        Equipment[] result = new Equipment[count];
        int index = 0;

        for (Equipment equipment : equip) {
            if (equipment != null) {
                result[index] = equipment;
                index++;
            }
        }

        return result;
        }
    
    
    
}
