public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return readNumber(number);
    }

    private static String readNumber(int number) {
        String onesOutput = "";
        String dozenOutput = "";
        String hundredsOutput = "";
        int hundreds = number / 100;
        int dozen = (number % 100) / 10;
        int ones = (number % 100) % 10;

        if (number == 0) {
            onesOutput = "Zero";
        } else if (number == 10) {
            onesOutput = "Ten";
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 11:
                    onesOutput = "Eleven";
                    break;
                case 12:
                    onesOutput = "Twelve";
                    break;
                case 13:
                    onesOutput = "Thirteen";
                    break;
                case 14:
                    onesOutput = "Fourteen";
                    break;
                case 15:
                    onesOutput = "Fifteen";
                    break;
                case 16:
                    onesOutput = "Sixteen";
                    break;
                case 17:
                    onesOutput = "Seventeen";
                    break;
                case 18:
                    onesOutput = "Eighteen";
                    break;
                case 19:
                    onesOutput = "Nineteen";
                    break;
            }
        } else {
            switch (ones) {
                case 1:
                    onesOutput = "One";
                    break;
                case 2:
                    onesOutput = "Two";
                    break;
                case 3:
                    onesOutput = "Three";
                    break;
                case 4:
                    onesOutput = "Four";
                    break;
                case 5:
                    onesOutput = "Five";
                    break;
                case 6:
                    onesOutput = "Six";
                    break;
                case 7:
                    onesOutput = "Seven";
                    break;
                case 8:
                    onesOutput = "Eight";
                    break;
                case 9:
                    onesOutput = "Nine";
                    break;
            }

            switch (dozen) {
                case 1:
                    switch (ones) {
                        case 1:
                            onesOutput = "Eleven";
                            break;
                        case 2:
                            onesOutput = "Twelve";
                            break;
                        case 3:
                            onesOutput = "Thirteen";
                            break;
                        case 4:
                            onesOutput = "Fourteen";
                            break;
                        case 5:
                            onesOutput = "Fifteen";
                            break;
                        case 6:
                            onesOutput = "Sixteen";
                            break;
                        case 7:
                            onesOutput = "Seventeen";
                            break;
                        case 8:
                            onesOutput = "Eighteen";
                            break;
                        case 9:
                            onesOutput = "Nineteen";
                            break;
                    }
                    break;
                case 2:
                    dozenOutput = "Twenty ";
                    break;
                case 3:
                    dozenOutput = "Thirty ";
                    break;
                case 4:
                    dozenOutput = "Forty ";
                    break;
                case 5:
                    dozenOutput = "Fifty ";
                    break;
                case 6:
                    dozenOutput = "Sixty ";
                    break;
                case 7:
                    dozenOutput = "Seventy ";
                    break;
                case 8:
                    dozenOutput = "Eighty ";
                    break;
                case 9:
                    dozenOutput = "Ninety ";
                    break;
            }

            switch (hundreds) {
                case 1:
                    hundredsOutput = "One hundred and ";
                    break;
                case 2:
                    hundredsOutput = "Two hundreds and ";
                    break;
                case 3:
                    hundredsOutput = "Three hundreds and ";
                    break;
                case 4:
                    hundredsOutput = "Four hundreds and ";
                    break;
                case 5:
                    hundredsOutput = "Five hundreds and ";
                    break;
                case 6:
                    hundredsOutput = "Six hundreds and ";
                    break;
                case 7:
                    hundredsOutput = "Seven hundreds and ";
                    break;
                case 8:
                    hundredsOutput = "Eight hundreds and ";
                    break;
                case 9:
                    hundredsOutput = "Nine hundreds and ";
                    break;
            }
        }
        return hundredsOutput + dozenOutput + onesOutput;
    }
}
