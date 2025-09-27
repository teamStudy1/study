package sunwook.studentgradesystem;

/*
* 1. 학생 이름에 맞는 그 성적을 매치해서 출력해야 하니까 Map<> 사용하자.
* 2. 학생 이름과 점수를 HashMap에 추가하거나 업데이트 메서드 만들자. put()써서 넣자.
* 3. 특정 학생 점수를 반환하는 메서드 만들자. 존재하지 않으면 null이나 -1 출력
* 4. 특정 학생과 해당 점수를 삭제도 할 메서드를 만들자. 삭제 되면 true , 그대로면 false 반환하자.
* 5. 총 학생과 점수를 출력하는 메서드도 만들자 entrySet() 사용하자.
* 6. 이것도 투표 시스템이랑 마찬가지로 while로 무한 돌면서 사용자 선택으로 끝나게 만들자. if-else나 switch - case 쓰자.
*
* */

import java.util.HashMap;
import java.util.Map;

public class GradeBookManager {
    Map<String, Integer> students = new HashMap<>();

    public void addOrUpdateGrade(String studentName, int score) {
        students.put(studentName, score);
    }

    public int getGrade(String studentName) {

        if (students.containsKey(studentName)) {
            return students.get(studentName);
        } else {
            return -1; // 학생이 없으면 -1 반환
        }

    }

    public boolean removeStudent(String studentName) {

        if (students.containsKey(studentName)) {
            students.remove(studentName);
            System.out.println("'" + studentName + "'" + "학생의 기록이 삭제 되었습니다.");
            return true;
        } else  {
            System.out.println("'" + studentName + "'" + "학생의 기록이 없습니다.");
            return false;
        }

    }

    public void printAllScores() {
        System.out.println("[출력 결과]");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("학생 이름:" + entry.getKey() + ", 점수:" + entry.getValue() + "점");
        }

    }
}
