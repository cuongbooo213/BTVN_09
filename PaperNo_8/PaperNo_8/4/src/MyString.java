/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        String[] s = str.split("\\s");
        int count = 0;
        int temp = 0;
        int flag = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (Character.isDigit(s[i].charAt(j))) {
                    count++;
                }
            }
            if (count >= 3) {
                for (int k = 0; k < s[i].length() / 2; k++) {
                    if (s[i].charAt(k) == s[i].charAt(s[i].length() - k - 1)) {
                        flag++;
                        if (flag == s[i].length() / 2) {
                            temp++;
                            count =0;
                        }
                    }
                }
            }else{
                count =0;
            }
        }
        return temp;

    }

    @Override
    public String f2(String str) {
        char[] c = str.toCharArray();
        String newStr = "";
        int count = 0;
        int flag=0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i]) && (c[i]-'0')%2!=0) {
                  count++;  
                if (count>1) {
                    flag=i;
                }
            }
          
            for (int j = i; j < c.length; j++) {
                if (flag!=j) {
                    newStr = newStr+c[j];
                }
                break;
            }
        }
        System.out.println(flag);
//        for (int j = 0; j < c.length; j++) {
//                if (flag!=j) {
//                    newStr = newStr+c[j];
//                }
//            }
        return newStr;
    }

}
