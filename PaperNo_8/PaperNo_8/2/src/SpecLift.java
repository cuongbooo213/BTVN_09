/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
public class SpecLift extends Lift {

    private int load;

    public SpecLift() {
    }

    public SpecLift(int load) {
        this.load = load;
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return getLabel() + ", " + load + ", " + getType();
    }

    public void setData() {
        char[] c = getLabel().toCharArray();
        String newLabel = "";
        for (int i = 0; i < c.length; i++) {
            if (i%2==0) {
                newLabel = newLabel+c[i];
            }
        }
        setLabel(newLabel);
        
    }

    public int getValue() {
        if (getLabel().contains(Integer.toString(getType()))) {
            return load + getType();
        } else {
            return load;
        }
    }


}
