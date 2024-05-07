package Plan_detude;

import java.util.ArrayList;

/**
 *
 * @author boubs
 */
public record Groupe1(String nom, ArrayList<Integer> etudients, Emploi emp, int id) {
    public Groupe1(String nom, ArrayList<Integer> etudients,int id) {
        this(nom, etudients, new Emploi(), id);
    }

    public Emploi emp() {
        return emp != null ? emp : new Emploi();
    }
}
