public class LCM {

    public static int lcm(int num1, int num2) {
        System.out.println("Function input int parameter num2 = " + num2);
        System.out.println("Function input int parameter num1 = " + num1);
        if (num1 == 0 || num2 == 0) {
            System.out.println("Evaluating if condition: (num1 == 0 || num2 == 0) is evaluated as: " + (num1 == 0 || num2 == 0));
            System.out.println("return_value = -1 , current value of return_value : " + (-1));
            return -1;
        } else {
            System.out.println("Evaluating if condition: !(num1 == 0 || num2 == 0) is evaluated as: " + !(num1 == 0 || num2 == 0));
        }
        if (num1 < 0) {
            System.out.println("Evaluating if condition: (num1 < 0) is evaluated as: " + (num1 < 0));
            num1 = -num1;
            System.out.println("num1 = -num1, current value of num1: " + (num1));
        } else {
            System.out.println("Evaluating if condition: !(num1 < 0) is evaluated as: " + !(num1 < 0));
        }
        if (num2 < 0) {
            System.out.println("Evaluating if condition: (num2 < 0) is evaluated as: " + (num2 < 0));
            num2 = -num2;
            System.out.println("num2 = -num2, current value of num2: " + (num2));
        } else {
            System.out.println("Evaluating if condition: !(num2 < 0) is evaluated as: " + !(num2 < 0));
        }
        int result = 0;
        System.out.println("result = 0, current value of result: " + (0));
        if (num1 > num2) {
            System.out.println("Evaluating if condition: (num1 > num2) is evaluated as: " + (num1 > num2));
            result = num1;
            System.out.println("result = num1, current value of result: " + (result));
        } else {
            System.out.println("Evaluating if condition: !(num1 > num2) is evaluated as: " + !(num1 > num2));
            result = num2;
            System.out.println("result = num2, current value of result: " + (result));
        }
        //            int result = (num1 > num2) ? num1 : num2;
        while (result < Integer.MAX_VALUE) {
            System.out.println("Entering loop with condition: (result < Integer.MAX_VALUE) is evaluated as: " + (result < Integer.MAX_VALUE));
            if (result % num1 == 0 && result % num2 == 0) {
                System.out.println("Evaluating if condition: (result % num1 == 0 && result % num2 == 0) is evaluated as: " + (result % num1 == 0 && result % num2 == 0));
                break;
            } else {
                System.out.println("Evaluating if condition: !(result % num1 == 0 && result % num2 == 0) is evaluated as: " + !(result % num1 == 0 && result % num2 == 0));
            }
            result++;
        }
        System.out.println("Exiting loop, condition no longer holds: (result < Integer.MAX_VALUE) is evaluated as: " + (result < Integer.MAX_VALUE));
        if (result % num1 == 0 && result % num2 == 0) {
            System.out.println("Evaluating if condition: (result % num1 == 0 && result % num2 == 0) is evaluated as: " + (result % num1 == 0 && result % num2 == 0));
            System.out.println("return_value = result , current value of return_value : " + (result));
            return result;
        } else {
            System.out.println("Evaluating if condition: !(result % num1 == 0 && result % num2 == 0) is evaluated as: " + !(result % num1 == 0 && result % num2 == 0));
        }
        System.out.println("return_value = -1 , current value of return_value : " + (-1));
        return -1;
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 79;
        int result = LCM.lcm(num1, num2);
    }
}
