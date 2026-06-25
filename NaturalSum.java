public class NaturalSum
{
    static int NaturalSumfn(int n)
    {
//stopping condition
        if (n==1 ) return 1;

//sum(n) = n + sum(n-1)
        return n + NaturalSumfn(n-1);
    }

    public static void main(String args[])
    {
        System.out.println(NaturalSumfn (10));
    }

}
