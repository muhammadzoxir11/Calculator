package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Calculator");

        int num1 = scanner.nextInt();
        scanner = new Scanner(in);
        String str = scanner.nextLine();
        int num2 = scanner.nextInt();
        int res = 0;

        switch (str){
            case "+"->{//str = + case 1
                res = num1+num2;
                System.out.println(num1+" + "+num2+" = "+res);

            }
            case "-"->{//str = - case 2
                res = num1-num2;
                System.out.println(num1+" - "+num2+" = "+res);

            }
            case "*"->{//str = * case 3
                res = num1*num2;
                System.out.println(num1+" * "+num2+" = "+res);

            }
            case "/"->{//str = / case 4
                res = num1/num2;
                System.out.println(num1+" / "+num2+" = "+res);

            }

        }





    }
}
