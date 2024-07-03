/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class House {
    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }
    
    public String getType() {
        int a = type.length();
        if (a>3) {
            return type.substring(a-1)+""+type.substring(a-2,a-1)+""+type.substring(a-3,a-2);
        }else{
            return type;
        }
        
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = 3*area;
    }
    
    
}
