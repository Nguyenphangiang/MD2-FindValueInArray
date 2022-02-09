import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] student = {"Subzero","LiuKang","Raiden","Fuji","Kai","KungLao","QuanChi","JohnCage"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String inputName = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)){
                System.out.println(inputName + " is in position:  " + (i+1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println(inputName + " Not found!");
        }
    }
}
