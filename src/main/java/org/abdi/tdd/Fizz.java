package org.abdi.tdd;

public class Fizz {
    public static String compute(int i) {
        StringBuilder sb = new StringBuilder();

        if(i%3==0){
            sb.append("Fizz");
        }
        if(i%5==0){
            sb.append("Buzz");
        }
        if(sb.isEmpty()){
            sb.append(String.valueOf(i));
        }
        return sb.toString();

    }


}
