package sunwook.votesystemmachine;

import java.util.HashSet;
import java.util.Set;

/*
* 1. 일단 입력된 투표자 이름을 중복 없이 담자 -> Scanner랑 Set<> 사용하자.
* 2. 중복이 아니라면 이름을 추가 할 vote(String voterId) 메서드 만들자. 추가 하는거 add(매개 변수)
* 3. 투표자가 중복이면 추가 X -> false 출력, 아니면 추가 O -> true 출력 하기 위해 boolean형으로
     hasVoted(String voterId) 만들어서 포함되어 있는지 확인 후 그 여부 반환해서 그 값 이용해서
     if로 출력되는 내용을 다르게 하자.
* 4. 완료되면 투표에 참여한 총 투표자 수 반환 하기 위해 getTotalVotes()메서드 만들어서 size()사용하자.
* 5. 그리고 이제 투표 종료되면 현재까지 투표한 모든 투표자 이름 출력 할 printVoterList() 메서드 만들자.
     다 출력하면 되니까 for-each 쓰자.
* 6. 그리고 투표자 이름 계속 받고 종료시 총 결과를 출력할꺼니까 while(true) 쓰자.
 *  * * */
public class VoteManager {
    Set<String> votePeoples = new HashSet<>();

    public void vote(String voterId) {
        votePeoples.add(voterId);
    }

    public int getTotalVotes() {
        return votePeoples.size();
    }

    public boolean hasVoted(String voterId) {
        return votePeoples.contains(voterId);
    }

    public void printVoterList(){
        System.out.println("[총 투표자 명단]");
        for(String votePeople : votePeoples){
            System.out.println(votePeople);
        }
    }

}
