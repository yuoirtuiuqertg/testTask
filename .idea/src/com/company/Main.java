package com.company;

public class Main {

    public static void main(String[] args) throws Exp {
        GetNumberAndOperator arrOperation = new GetNumberAndOperator();
        Romain numberRomain = new Romain();
        Arabian numberArabian = new Arabian();
        MathOperator romainOrArabian = new MathOperator();

        String[] temp = arrOperation.arrOperatorNums();
        if(romainOrArabian .ArabinOrRomane(temp)== true) {
            int te = numberRomain.otvet(temp);
            String str = String.valueOf(te);
            System.out.print(str);
        } else {
            int tem = numberArabian.CalculaterArabian(numberArabian.numReem(temp[0]),numberArabian.numReem(temp[2]) , temp[1]);
            System.out.println(numberArabian.transformNumberRomanNumeral(tem));
        }
    }
}
