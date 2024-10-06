import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Student grade calculator");
            System.out.println("Enter no. of subjects");
            int ns = sc.nextInt();
            int total=0;
            for (int i=0;i<ns;i++){
                System.out.println("Enter the marks obtained in "+(i+1)+": ");
                int marks=sc.nextInt();
                total+=marks;
            }
            double avg=(double)total/ns;
   char Grade;
   if(avg>=90){
            Grade='O';
   }
   else if(avg>=80){
            Grade='A';
   }
   else if(avg>=70){
            Grade='B';
   }
   else if(avg>=60){
            Grade='C';
   }
   else if(avg>=50){
            Grade='D';
   }
   else if(avg>=40){
            Grade='E';
   }
   else{
            Grade='F';
   }
   System.out.println("Total marks scored is "+total);
   System.out.println("Average percentage gained is "+avg+"%");
   System.out.println("Grade :"+Grade);
        }
}
}
