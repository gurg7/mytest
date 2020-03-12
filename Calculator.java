

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Calculator {


    public static void main(String[] args) throws Exception {
      String [] roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
      String [] arab = {"1","2","3","4","5","6","7","8","9","10"};
         int a , b;
         char oper;

        System.out.println("Введите арифметическое выражение ");
        System.out.println("цифры должны быть от 1 до 10 (арабскиe или римскиe)");
        System.out.println("например: 10 + 10 или X * I");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[3];
        String str = reader.readLine();//ввод данных в строку
        String[] strs = str.trim().split("\\s+");//разделяю данные

        for (int i = 0; i < strs.length; i++) {
            list[i] = strs[i];}
//проверка условия задачи
        int check1=0;
        int check2=0;
        for (int x = 0; x < roman.length; x++){
            if(roman[x].equals(list[0])){check1=1;}
        }
        for (int x = 0; x < roman.length; x++){
            if(roman[x].equals(list[2])){check1=1;}
        }

        for (int s = 0; s < arab.length; s++){
            if(arab[s].equals(list[0])){check2=1;}
        }
        for (int s = 0; s < arab.length; s++){
            if(arab[s].equals(list[2])){check2=1;}
        }


        if(check2==1 && check1==0)//действия в случае ввода арабских цифр соответствующих условию
         {a = Integer.parseInt(list[0]);
         oper =  list[1].charAt(0);
         b = Integer.parseInt(list[2]);
         int result = calc(a, b, oper);
             System.out.println(result);}

        else if(check2==1 && check1==1)// исключения
        {System.out.println("Неверный ввод");
            System.exit(0);}
        else if(check1==0 && check2==0)
        {System.out.println("Неверный ввод");
            System.exit(0);}

        else if(check1==1&&check2==0){//действия в случае ввода римских цифр соответствующих условию
           a = romanToArab(list[0]);
           oper =  list[1].charAt(0);
           b = romanToArab(list[2]);
           int result = calc(a, b, oper);
            String result1 = arabToRoman(result);
            System.out.println(result1);
        }

    }

    // вычисления
  public static int calc(int a,int b, char oper) {
        int result=0;
      if (a<0||a>10){System.out.println("Неверный ввод");
          System.exit(0);}
      if (b<0||b>10){System.out.println("Неверный ввод");
          System.exit(0);}

            if (oper == '+') {
              result = a + b;
          } else if (oper == '-') {
              result = a - b;
          } else if (oper == '*') {
              result = a * b;
          } else if (oper == '/') {
              result = a / b;
          } else {
              System.out.println("Неверный ввод");
              System.exit(0);
          }
          return result;
  }


  public static int romanToArab(String num) {//конвертирование римских цифр в арабские
      switch (num) {
          case "I":
              return 1;
          case "II":
              return 2;
          case "III":
              return 3;
          case "IV":
              return 4;
          case "V":
              return 5;
          case "VI":
              return 6;
          case "VII":
              return 7;
          case "VIII":
              return 8;
          case "IX":
              return 9;
          case "X":
              return 10;
          default:
              return -1;
      }
  }

    public static String arabToRoman(int num) { //конвертирование арабских цифр в римские (туповато, но решил как смог :))
        switch (num) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            case 11: return "XI";
            case 12: return "XII";
            case 13: return "XIII";
            case 14: return "XIV";
            case 15: return "XV";
            case 16: return "XVI";
            case 17: return "XVII";
            case 18: return "XVIII";
            case 19: return "XIX";
            case 20: return "XX";
            case 21: return "XXI";
            case 22: return "XXII";
            case 23: return "XXIII";
            case 24: return "XXIV";
            case 25: return "XXV";
            case 26: return "XXVI";
            case 27: return "XXVII";
            case 28: return "XVIII";
            case 29: return "XXIX";
            case 30: return "XXX";
            case 31: return "XXXI";
            case 32: return "XXXII";
            case 33: return "XXXIII";
            case 34: return "XXXIV";
            case 35: return "XXXV";
            case 36: return "XXXVI";
            case 37: return "XXXVII";
            case 38: return "XXXVIII";
            case 39: return "XXXIX";
            case 40: return "XL";
            case 41: return "XLI";
            case 42: return "XLII";
            case 43: return "XLIII";
            case 44: return "XLIV";
            case 45: return "XLV";
            case 46: return "XLVI";
            case 47: return "XLVII";
            case 48: return "XLVIII";
            case 49: return "XLIX";
            case 50: return "L";
            case 51: return "LI";
            case 52: return "LII";
            case 53: return "LIII";
            case 54: return "LIV";
            case 55: return "LV";
            case 56: return "LVI";
            case 57: return "LVII";
            case 58: return "LVIII";
            case 59: return "LIX";
            case 60: return "LX";
            case 61: return "LXI";
            case 62: return "LXII";
            case 63: return "LXIII";
            case 64: return "LXIV";
            case 65: return "LXV";
            case 66: return "LXVI";
            case 67: return "LXVII";
            case 68: return "LXVIII";
            case 69: return "LXIX";
            case 70: return "LXX";
            case 71: return "LXXI";
            case 72: return "LXXII";
            case 73: return "LXXIII";
            case 74: return "LXXIV";
            case 75: return "LXXV";
            case 76: return "LXXVI";
            case 77: return "LXXVII";
            case 78: return "LXXVIII";
            case 79: return "LXXIX";
            case 80: return "LXXX";
            case 81: return "LXXXI";
            case 82: return "LXXXII";
            case 83: return "LXXXIII";
            case 84: return "LXXXIV";
            case 85: return "LXXXV";
            case 86: return "LXXXVI";
            case 87: return "LXXXVII";
            case 88: return "LXXXVIII";
            case 89: return "LXXXIX";
            case 90: return "XC";
            case 91: return "XCI";
            case 92: return "XCII";
            case 93: return "XCIII";
            case 94: return "XCIV";
            case 95: return "XCV";
            case 96: return "XCVI";
            case 97: return "XCVII";
            case 98: return "XCVIII";
            case 99: return "XCIX";
            case 100: return "C";

            default:
                return null;
        }
    }
}
