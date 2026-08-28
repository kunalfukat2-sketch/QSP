class BinaryToNumber
{
    public static void main(String[] args)
    {
        int num = 100;

        String bin = "";

        while (num != 0)
        {
            int rem = num % 2;
            bin = rem + bin;
            num = num / 2;
        }

        System.out.println(bin);
		
		// System.out.println(Integer.parseInt(bin,2));

        int num2 = 0;

        for (int i = bin.length() - 1, j = 0; i >= 0; i--, j++)
        {
            int dgt = bin.charAt(i) - '0';
            int power = powerNum(2, j);
            int prd = dgt * power;
            num2 += prd;
        }

        System.out.println(num2);
    }

    public static int powerNum(int num, int pow)
    {
        if (pow == 0)
            return 1;

        int op = 1;

        for (int i = 1; i <= pow; i++)
        {
            op *= num;
        }

        return op;
    }
}