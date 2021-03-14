class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0, number, temp;
        int n = checkDigitsNumber(numberToCheck);
        temp = numberToCheck;
        while (numberToCheck > 0) {
            number = numberToCheck % 10;
            numberToCheck = numberToCheck / 10;
            sum += Math.pow(number, n);
        }
        return temp == sum;
    }

    private int checkDigitsNumber(int numberToCheck) {
        int count = 0;
        while (numberToCheck != 0) {
            numberToCheck = numberToCheck / 10;
            count++;
        }
        return count;
    }
}
