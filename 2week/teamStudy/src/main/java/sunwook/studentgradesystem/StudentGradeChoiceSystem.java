package sunwook.studentgradesystem;

import java.util.Scanner;

public class StudentGradeChoiceSystem {

    public static void main(String[] args) {
        GradeBookManager gradeBookManager = new GradeBookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------메 뉴---------");
            System.out.println("사용할 메뉴를 선택 하세요:");
            System.out.println("1. 학생 추가 or 수정하기");
            System.out.println("2. 학생 성적 조회하기");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 전체 다 출력하기");
            System.out.println("5. 종료");
            System.out.print("입력 창: ");


            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.print("등록하실 학생의 이름을 입력하세요: ");
                    String studentName = scanner.next();
                    System.out.print("등록하실 학생의 성적을 입력하세요: ");
                    int studentGrade = scanner.nextInt();
                    scanner.nextLine();
                    gradeBookManager.addOrUpdateGrade(studentName, studentGrade);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.print("성적을 조회하실 학생의 이름을 입력하세요: ");
                    String searchStudentName = scanner.nextLine();
                    int  searchStudentGrade = gradeBookManager.getGrade(searchStudentName);

                    if (searchStudentGrade != -1) {
                        System.out.println("'" + searchStudentName + "'" + "학생의 점수는 " + searchStudentGrade + "점입니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("삭제하실 학생의 이름을 입력하세요: ");
                    String removeStudentName = scanner.nextLine();
                    gradeBookManager.removeStudent(removeStudentName);
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    gradeBookManager.printAllScores();
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("학생 성적 조회 프로그램 종료");
                    return;

                default:
                    System.out.println();
                    System.out.println("잘못된 입력입니다. 메뉴 확인 후 다시 선택해주세요.");
                    System.out.println();
            }

        }
    }
}
