class Array
{
    public static void main(String[] args)
    {
        int[] array = {13, 7, 27, 2, 18, 33, 9, 11, 22, 8};
        int [ ] p = new int [10];
        int [ ] q = new int [10];

        for (int k = 0; k < 10; k ++)
        p[k] = array [k];
        q = p;
        p[4] = 20;
        System.out.println(array [4] + " : " + q[4]);
    }
}
