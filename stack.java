
class S
{
    int arr[] = new int[100];
    int top;
    S()
    {
        top=-1;
    }
    public void add(int x)
    {
        if(top>99)
        {
            System.out.println("Overflow!!");
        }
        arr[++top]=x;
    }
    public int remove()
    {
        if(top<0)
        {
            System.out.println("Underflow!!");
            return -1;
        }
            
        else
        {
            int x=arr[top--];
            return x;
        }  
    }
    public boolean isEmpty()
    {
        return top<0;
    }
    public boolean isFull()
    {
        return top>99;
    }
    public void print()
    {
        for(int i=top;i>-1;i--)
            System.out.print(arr[i] +" ");
        System.out.println();
    }
    
    public int top()
    {
        if(top<0)
            System.out.println("Underflow!!"); 
        return arr[top];
    }
}

