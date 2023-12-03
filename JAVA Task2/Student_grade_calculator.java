import java.util.Scanner;
public class Student_grade_calculator{
    void grade_calculator(int[] array,int numberOfSubjects){
        System.out.println("Total marks obtained is "+total_marks(array));
        System.out.println("Average percentage obtained is "+average_percentage(array,numberOfSubjects));
        grade_obtained(array);
    }
    int total_marks(int[] array){
        int total=0;
        for (int j=0;j<array.length;j++){
            total += array[j];
        }
        return total;
    }
    double average_percentage(int[] array,int subjects){
        double total=0.0;
        for (int j=0;j<array.length;j++){
            total += array[j];
        }
        return total/subjects;
    }
    void grade_obtained(int[] array){
        int total=0;
        for (int j=0;j<array.length;j++){
            total += array[j];
        }
        if(total>=90){
            System.out.println("Grade obtained is A+");
        }
        else if((total>=75)&&(total<90)){
            System.out.println("Grade obtained is A");
        }
        else if((total>=65)&&(total<75)){
            System.out.println("Grade obtained is B+");
        }
        else if((total>=55)&&(total<65)){
            System.out.println("Grade obtained is B");
        }
        else if((total>=35)&&(total<55)){
            System.out.println("Grade obtained is C+");
        }
        else{
            System.out.println("Grade obtained is C");
        }
    }
    public static void main(String args[]){
        int numberOfSubjects;
        System.out.print("Enter number of subjects : ");
        Scanner input = new Scanner(System.in);
        numberOfSubjects=input.nextInt();
        int[] array=new int[numberOfSubjects];
        for (int i=0;i<numberOfSubjects;i++){
            System.out.print("Enter subject "+(i+1)+" marks out of 100: ");
            array[i]=input.nextInt();
        }
        System.out.println();
        System.out.println("Results :");
        System.out.println();
        Student_grade_calculator obj1 = new Student_grade_calculator();
        obj1.grade_calculator(array,numberOfSubjects);
    }
}