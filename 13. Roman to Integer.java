import java.util.*;
class Solution {
    public int romanToInt(String s) {
        
        int[] arr1= new int[s.length()+1];
        int[] arr2= new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            int x=0;
            arr2[i]=0;
            Character str1=s.charAt(i);
            if(str1.equals('I')){
                x=1;
            }
            else if(str1.equals('V')){
                x=5;
            }
            else if(str1.equals('X')){
                x=10;
            }
            else if(str1.equals('L')){
                x=50;
            }
            else if(str1.equals('C')){
                x=100; 
            }
            else if(str1.equals('D')){
                x=500;
            }
            else if(str1.equals('M')){
                x=1000;

            }
                arr1[i]=x;
                System.out.println(x);
            
        }
        int value=0;
        Integer flag=0;
        for(int i=0;i<=s.length();i++){
            
            if(i+1<=s.length()){
            if(arr1[i]<arr1[i+1]){
                arr2[i]=arr1[i+1]-arr1[i];
                System.out.print(arr2[i]);
                flag=1;
                i+=1;
            }
            else{
                arr2[i]=arr1[i];
            }
            }
        }
        if(flag.equals(1)){
        for(int i=0;i<=s.length();i++){
            value+=arr2[i];
        }
        }
        else{
            for(int i=0;i<=s.length();i++){
                value+=arr1[i];
            }
        }
        return value;
        
    }
}
