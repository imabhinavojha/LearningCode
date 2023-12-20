public class worstYear {
    public static void main(String[] args) {
        worstYear obj = new worstYear();
        for (int num = 1993; num < 2070; num++) {
            int year = obj.worstYearFunc(num);
            if (year == 7) {
                System.out.println("Year is "+num+ " where sum of number is 7");
            }
        }
    }

    public int worstYearFunc(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;

    }

}
