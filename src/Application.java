
import java.util.*;
public class Application {
    static String a, b, Function;
    static double a1, b1, c;
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("Введите первое число: ");
            a = scn.nextLine();
            if(a.equals("quit") == false) {
                try{
                    a1 = Double.parseDouble(a);
                }
                catch(Exception e) {
                    System.out.println("Некорректное число");
                    continue;
                }
                System.out.println("Введите второе число: ");
                b = scn.nextLine();
                if(b.equals("quit") == false) {
                    try {
                        b1 = Double.parseDouble(b);
                    } catch (Exception e) {
                        System.out.println("Некорректное число");
                        continue;
                    }
                    System.out.println("Введите символ математической функции(+, -, *, /, %)");
                    Function = scn.nextLine();
                    if(Function.equals("quit") == true) {
                        break;
                    }
                    else if (Function.equals("+") == true) {
                        c = a1 + b1;
                        System.out.println(c);
                    }
                    else if (Function.equals("-") == true) {
                        c = a1 - b1;
                        System.out.println(c);
                    }
                    else if (Function.equals("*") == true) {
                        c = a1 * b1;
                        System.out.println(c);
                    }
                    else if (Function.equals("/") == true) {
                        if(b1 == 0) {
                            System.out.println("На ноль делить нельзя");
                            continue;
                        }
                        c = a1 / b1;
                        System.out.println(c);
                    }
                    else if (Function.equals("%") == true) {
                        c = a1 % b1;
                        System.out.println(c);
                    }
                    else {
                        System.out.println("Некорректно введена функция");
                        continue;
                    }
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }while(a != "quit" && b != "quit" && Function != "quit");
    }
}
