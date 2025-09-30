package ggyun.ggyun.Team;

import java.util.Map;
import java.util.HashMap;

public class GradeBookMAnger {

    private Map<String, Integer> gradeBook;
    //맵의 키 : 학생이름 (String, 영문)
    // 점수 : Integer

    public GradeBookMAnger() {
        this.gradeBook = new HashMap<>();
        System.out.println(" 성적 관리 시스템이 초기화 되었습니다.");
    }
    /// ////////////////////
    public void addOrUpdateGrade(String studentName, int score) {
        Integer previousScores = gradeBook.put(studentName, score);

        if (previousScores == null) {
            System.out.println("[성적 추가] " + studentName + "학생의 성적 : " + score+" 점");
        } else {
            System.out.println
                    ("[업데이트] : " + studentName + " 학생의 성적을 " + previousScores + "점에서 " + score + "점으로 수정했습니다 .");
        }
    }

    /// ///////////////////////////////
    public int getGrade(String studentName) {
        if (gradeBook.containsKey(studentName)) {
            return gradeBook.get(studentName);
        } else {
            System.out.println("[조회 실패]]" + studentName + " 학생은 성적부에 없습니다.");
            return -1;
        }
    }
    /// ////////////////////////////////
    public boolean removeStudent(String studentName) {
        Integer removedScore = gradeBook.remove(studentName);

        if (removedScore != null) {
            System.out.println("[삭제 완료]" + studentName + " 학생의 성적기록(" + removedScore + "점)이 삭제되었습니다");
            return true;
        } else {
            System.out.println("[삭제 실패]" + studentName + " 학생은 존재하지 않습니다 ");
            return false;
        }
    }
    /// //////////////////////////////////

    public void printAllScores() {
        if (gradeBook.isEmpty()) {
            System.out.println("\n 성적부에 기록된 학생이 없습니다.");
            return;
        }

        System.out.println("\n===== 전체 성적부 (" + gradeBook.size() + "명) =====");

        for (Map.Entry<String, Integer> entry : gradeBook.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.printf("  - %s: %d점\n", name, score);
        }
        System.out.println("=================================");
    }
}

