package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num = Integer.parseInt(scanner.nextLine());
        String str ="";
        String str1 = "";
        String str2 ="";
        int tens = num / 10;
        int ones = num % 10;

        if (num <= 10) {
            switch (num) {
                case 0:
                    str = "zero";
                    break;
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "three";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;
                case 10:
                    str = "ten";
                    break;
                default:
                    str = "";
            }
            System.out.println(str);
        } else if (num < 20) {
            switch (num) {
                case 11:
                    str = "eleven";
                    break;
                case 12:
                    str = "twelve";
                    break;
                case 13:
                    str = "thirteen";
                    break;
                case 14:
                    str = "fourteen";
                    break;
                case 15:
                    str = "fifteen";
                    break;
                case 16:
                    str = "sixteen";
                    break;
                case 17:
                    str = "seventeen";
                    break;
                case 18:
                    str = "eighteen";
                    break;
                case 19:
                    str = "nineteen";
                    break;

                default:
                    str = "";
            }
            System.out.println(str);
        } else if (num < 100) {

            switch (tens) {
                case 2:
                    str1 = "twenty";
                    break;
                case 3:
                    str1 = "thirty";
                    break;
                case 4:
                    str1 = "fourty";
                    break;
                case 5:
                    str1 = "fifty";
                    break;
                case 6:
                    str1 = "sixty";
                    break;
                case 7:
                    str1 = "seventy";
                    break;
                case 8:
                    str1 = "eighty";
                    break;
                case 9:
                    str1 = "ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    str2 = "one";
                    break;
                case 2:
                    str2 = "two";
                    break;
                case 3:
                    str2 = "three";
                    break;
                case 4:
                    str2 = "four";
                    break;
                case 5:
                    str2 = "five";
                    break;
                case 6:
                    str2 = "six";
                    break;
                case 7:
                    str2 = "seven";
                    break;
                case 8:
                    str2 = "eight";
                    break;
                case 9:
                    str2 = "nine";
                    break;

                default:
                    str2 = "";
            }
            if (ones == 0) {
                System.out.println(str1);
            } else System.out.println(str1 + " " + str2);
        } else if (num < 1000) {
            int tens1 = num % 100/10;
            int ones1 = num % 100%10;
            int huns = num / 100;
            switch (huns) {
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "three";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;

                default:
                    str = "";
            }
            switch (tens1) {
                case 2:
                    str1 = "twenty";
                    break;
                case 3:
                    str1 = "thirty";
                    break;
                case 4:
                    str1 = "fourty";
                    break;
                case 5:
                    str1 = "fifty";
                    break;
                case 6:
                    str1 = "sixty";
                    break;
                case 7:
                    str1 = "seventy";
                    break;
                case 8:
                    str1 = "eighty";
                    break;
                case 9:
                    str1 = "ninety";
                    break;
            }
            switch (ones1) {
                case 1:
                    str2 = "one";
                    break;
                case 2:
                    str2 = "two";
                    break;
                case 3:
                    str2 = "three";
                    break;
                case 4:
                    str2 = "four";
                    break;
                case 5:
                    str2 = "five";
                    break;
                case 6:
                    str2 = "six";
                    break;
                case 7:
                    str2 = "seven";
                    break;
                case 8:
                    str2 = "eight";
                    break;
                case 9:
                    str2 = "nine";
                    break;

                default:
                    str2 = "";
            }

            if (ones1 == 0 && tens1 == 0) {
                System.out.println(str + " hundred");
            } else if (tens1==1 ) {
                int tens2 = num %100;
                switch (tens2) {
                    case 10:
                        str2 = "ten";
                        break;
                    case 11:
                        str2 = "eleven";
                        break;
                    case 12:
                        str2 = "twelve";
                        break;
                    case 13:
                        str2 = "thirteen";
                        break;
                    case 14:
                        str2 = "fourteen";
                        break;
                    case 15:
                        str2 = "fifteen";
                        break;
                    case 16:
                        str2 = "sixteen";
                        break;
                    case 17:
                        str2 = "seventeen";
                        break;
                    case 18:
                        str2 = "eighteen";
                        break;
                    case 19:
                        str2 = "nineteen";
                        break;

                    default:
                        str = "";
                }
                System.out.println(str + " hundred and " + str2);
            }else
                System.out.println(str + " hundred and " + str1 +" "+ str2);
            }


        }

    }

