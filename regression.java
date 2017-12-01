import java.io.*;
class regression
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("WELCOME! This program predicts Glucose level during an age");
        System.out.println("Enter Number of data-points");
        int n,i;
        double x=0,y=0,x2=0,y2=0,xy=0,a,b;
        n=Integer.parseInt(br.readLine());
        Double ar[][]=new Double[n][2];
        System.out.println("Please enter Age and Glucose level of "+n+" people");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Age for "+(i+1)+" person");
            ar[i][0]=Double.parseDouble(br.readLine());
            System.out.println("Enter Glucose level for "+(i+1)+" person");
            ar[i][1]=Double.parseDouble(br.readLine());
            x += ar[i][0];
            y += ar[i][1];
            x2 += ar[i][0]*ar[i][0];
            y2 += ar[i][1]*ar[i][1];
            xy += ar[i][0]*ar[i][1];
        }
        a=((y*x2)-(x*xy))/((n*x2)-x*x);
        b=((n*xy)-x*y)/((n*x2)-x*x);
        System.out.println("We are Ready to predict!");
        System.out.println("Enter age");
        double z=Integer.parseInt(br.readLine());
        while(z!=-1)
        {
        double f=a+(b*z);
        System.out.println("Approx glucose level will be "+f);
        System.out.println("Enter age or");
        System.out.println("Enter -1 To exit");
        z=Integer.parseInt(br.readLine());
        }
}
}
        