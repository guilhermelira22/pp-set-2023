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

import enums.AvaliationType;
import java.time.LocalDate;

/**
 * Classe que faz uma inspeção a um certo equipamento ou trabalhador
 *
 * @author guilhermeLira
 */
public abstract class Inspection {
    
    private LocalDate inspectionDate;
    private AvaliationType avaliation;

    public Inspection(LocalDate inspectionDate, AvaliationType avaliation) {
        this.inspectionDate = inspectionDate;
        this.avaliation = avaliation;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public AvaliationType getAvaliation() {
        return avaliation;
    }
    
}
