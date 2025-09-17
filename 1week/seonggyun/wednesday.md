
3일차 스터디 

# git init 
이 폴더를 git으로 관리할 거야 

# git remote add origin 주소 
깃 허브와 내 폴더를 연결 할 거야

이 과정은 한번만 하면 된다

# git add .
프로젝트 충돌 날 수 있어서 

git add 새 파일명.txt 를 추천
그 후 코드를 수정하거나 새로운 파일이 추가 됐다면

3가지 명령어 순서대로 진행하면 된다 

# 파일올리기

git add 파일명.확장자
현재 폴더에서 이 이름을 가진 파일을 올려줘 

# 기록남기기 

git commit -m "fitst commit"
-m 은 메시지의 줄임말
"first commit"은 첫번째 기록 

# git push -u origin main 

push는 '내가 기록한 내용들을 깃 허브 저장소로 보내줘 '
-u origin main 은 origin 이라는 이름의 저장소에 있는 main이라는 브랜치로 보내줘라는 의미

# git pull
다른 팀원이 깃 허브에 새로운 코드를 올렸을 때, 내 컴퓨터에 있는 코드와 그 코드를 동기화 하는작업

방식은 크게 2가지로 

1. git fetch : 깃 허브에 있는 최신 코드의 변경사항을 내 컴퓨터로만 다운로드 
변경사항 확인

2. git merge : 다운로드한 변경사항을 현재 내 컴퓨터에 있는 코드에 합치는 명령어 

git pull은 git fetch 와 git merge 를 한번에 실행해주는 명령어 

# 언제 사용하나요 ?
주로 작업 시작전에 사용 해본다
ex) 친구가 어제 밤에 로그인 기능을 만들고 깃 허브에 올림
 
나는 오늘 아침에 회원가입 기능을 만드려고 하는 상태 

이때, 내가 어제 저장해둔 코드에는 친구가 만든 로그인 기능이 없다.
만약 그대로 회원가입 코드를 만들고 올리면

친구가 만든 로그인 기능이 사라질 수 도 있음 . 이런 사고를 막기 위해 

내 작업을 시작하기 전에 git pull 명령어를 사용해 이용한다 !! 

# 새로운 브랜치 만들기
develop 브랜치에서 갈라져 나와서 
파일을 만들어 새로운 브랜치를 만들어야 한다 

1. develop 브랜치로 이동하기 
git chechout develop

2. git checkout -b feat/seonggyun-1week-wed

checkout -b 는 새로운 브랜치를 만들고 , 그 브랜치로 바로 이동하라는 뜻 
이 때 모든 작업은 feat/seonggyun-1week-wed 브랜치에서 진행된다 

# 파일 생성 및 커밋하기 

wednesday.txt 파일을 만들고, 우리가 정한 커밋 규칙에 맞춰 기록 남기기 
1. wednesday.txt 파일 만들기
2. dir 또는 ls 명령어로 파일이 잘 만들어졌는지 확인하기

# 커밋할 준비하기
방금 만든 wednesday.txt 파일을 git이 관리하도록 추가해야 한다 
git add wednesday.txt

# 커밋 기록 남기기 
우리가 정한 커밋 컨벤션에 따라 메세지를 작성하기 

git commit -m "feat: wednesday.txt 파일 추가"

# develop 브랜치에 합치기(Merge)
develop 브랜치로 돌아가기 
git checkout develop 

# 브랜치 합치기 
git merge feature/add-wednesday-file
이 명령어을 입력하면 wednesday.txt 파일이 develop 브랜치에도 나타 날 것임 

# 깃허브에 올리기 (push)

git push origin develop 
origin develop 은 origin 이라는 원격 저장소의 develop 브랜치로 올려라 

깃 허브에 접속해서 develop 브랜치를 확인하면 파일이 잘 올라가 있는 것을 볼 수 있다 

# 정리

git inti (이 폴더를 git으로 관리)
git remote add origin 주소 (깃 허브와 내 폴더 연결)
git add . (올릴 파일들을 선택)
git commit -m "메시지" (변경 내역을 기록)
git push -u origin main (깃 허브로 전송)
git full (코드 동기화)

