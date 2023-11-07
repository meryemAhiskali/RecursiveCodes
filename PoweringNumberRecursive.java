public class PoweringNumberRecursive {

    public static void main(String[] args) {
        int base=5;
        int power=5;
        int result=poweringNumberRecursive(base,power);
        System.out.println(result);
    }

    public static int poweringNumberRecursive(int base,int power)
    {

        if(power==0)
            return 1;
        else if(power%2==0)
        {
            int value=poweringNumberRecursive(base,power/2);
            return value*value;
        }
        else
        {
            int value=poweringNumberRecursive(base,power/2);
            return value*value*base;
        }

    }


}

