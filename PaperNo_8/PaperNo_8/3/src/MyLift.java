
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
public class MyLift implements ILift{

    @Override
    public int f1(List<Lift> t) {
        int max=-99999999;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getLoad()> max) {
                max=t.get(i).getLoad();
            }
        }
        return max;
    }

    @Override
    public void f2(List<Lift> t) {
         for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                if (t.get(i).getLabel().compareTo(t.get(j).getLabel())<0){
                    Lift temp = t.get(i);
                    t.set(i,t.get(j));
                    t.set(j, temp);
                }
            }
        }
    }

    @Override
    public void f3(List<Lift> t) {
        int a = t.size();
        int count = 0;
        int temp = 0;
        for (int i = 0; i < a; i++) {
            if (t.get(i).getLoad()%2==0) {
                count++;
                if (count==2) {
                    temp = i;
                    break;
                }
            }
        }
        t.remove(temp);
    }
  
    
}
