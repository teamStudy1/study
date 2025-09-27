package sunwook.votesystemmachine;

import java.util.Scanner;

public class VoteSystem {

    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("투표자 이름을 입력하세요 (투표가 끝났다면 '종료' 입력): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println();
                System.out.println("총 투표자 수: " + voteManager.getTotalVotes());
                voteManager.printVoterList();
                break;
            }

            if (voteManager.hasVoted(name)) {
                System.out.println(name + "님은 이미 투표하셨습니다!");
                System.out.println("투표 성공 여부 :" + false);
                System.out.println("현재 투표 완료자 수: " + voteManager.getTotalVotes());
            } else {
                voteManager.vote(name);
                System.out.println(name + "님, 투표가 완료되었습니다.");
                System.out.println("투표 성공 여부 :" + voteManager.hasVoted(name));
                System.out.println("현재 투표 완료자 수: " + voteManager.getTotalVotes());
            }

        }
    }
}
