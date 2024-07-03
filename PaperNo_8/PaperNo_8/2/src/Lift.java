/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
public class Lift {
    private String label;
    private int type;

    public Lift() {
    }

    public Lift(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public int getType() {
        return type;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return label+", "+type;
    }
    
    
}
