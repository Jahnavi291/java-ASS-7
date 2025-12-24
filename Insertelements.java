
public class Insertelements
{
    public static void main(String args[])
    {
        int arr[]=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        int size=4;
        int pos=2;
        int element=25;
        for(int i=size;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=element;
        size++;
        for(int i=0;i<size;i++)

        {
            System.out.print(arr[i]+" ");

        }
    }

}