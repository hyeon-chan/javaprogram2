package week15;

import java.util.*;

class Member {
    private int id;
    private String name;
    private String major;
    private int grade;

    public Member(int id, String name, String major, int grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getGrade() { return grade; }

    @Override
    public String toString() {
        return "Member{id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                '}';
    }
}

class Club<T> {
    private String name;
    private List<T> members;

    public Club(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMember(T member) {
        members.add(member);
    }

    public List<T> getMembers() {
        return members;
    }
}

public class ClubApp {

    private static Scanner sc = new Scanner(System.in);
    private static Map<String, Club<Member>> clubs = new LinkedHashMap<>();
    private static int nextMemberId = 1;

    public static void main(String[] args) {

        while (true) {
            printMenu();
            System.out.print(">> 메뉴 번호를 입력하세요: ");
            String input = sc.nextLine();

            int menu;
            try {
                menu = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("번호를 입력하세요.\n");
                continue;
            }

            switch (menu) {
                case 1: createClub(); break;
                case 2: joinMember(); break;
                case 3: printClubsAndMembers(); break;
                case 4: searchByName(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("없는 메뉴입니다.\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("====== CLUB MANAGEMENT SYSTEM ======");
        System.out.println(" (1) 동아리 생성");
        System.out.println(" (2) 동아리 회원 가입");
        System.out.println(" (3) 동아리 및 회원 목록 조회");
        System.out.println(" (4) 이름으로 회원 검색");
        System.out.println(" (0) 종료");
        System.out.println("-------------------------------------");
    }

    private static void createClub() {
        System.out.print("생성할 동아리 이름을 입력하세요: ");
        String clubName = sc.nextLine().trim();

        if (clubs.containsKey(clubName)) {
            System.out.println("이미 존재하는 동아리입니다.\n");
            return;
        }

        clubs.put(clubName, new Club<>(clubName));
        System.out.println("동아리 생성 완료!\n");
    }

    private static void joinMember() {
        if (clubs.isEmpty()) {
            System.out.println("생성된 동아리가 없습니다.\n");
            return;
        }

        System.out.print("가입할 동아리 이름: ");
        String clubName = sc.nextLine().trim();

        Club<Member> club = clubs.get(clubName);
        if (club == null) {
            System.out.println("존재하지 않는 동아리입니다.\n");
            return;
        }

        System.out.print("회원 이름: ");
        String name = sc.nextLine().trim();

        System.out.print("전공: ");
        String major = sc.nextLine().trim();

        System.out.print("학년(숫자): ");
        int grade;
        try {
            grade = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("학년은 숫자로 입력해야 합니다.\n");
            return;
        }

        Member m = new Member(nextMemberId++, name, major, grade);
        club.addMember(m);

        System.out.println("\n회원 가입 완료!");
        printLine();
        System.out.printf(" %-5s %-12s %-18s %-5s\n", "ID", "이름", "전공", "학년");
        printLine();
        System.out.printf(" %-5d %-12s %-18s %-5d\n",
                m.getId(), m.getName(), m.getMajor(), m.getGrade());
        printLine();
        System.out.println();
    }

    private static void printLine() {
        System.out.println("------------------------------------------------------------");
    }

    private static void printHeader() {
        printLine();
        System.out.printf(" %-5s %-12s %-18s %-5s\n",
                "ID", "이름", "전공", "학년");
        printLine();
    }

    private static void printRow(Member m) {
        System.out.printf(" %-5d %-12s %-18s %-5d\n",
                m.getId(), m.getName(), m.getMajor(), m.getGrade());
    }

    private static void printClubsAndMembers() {
        if (clubs.isEmpty()) {
            System.out.println("등록된 동아리가 없습니다.\n");
            return;
        }

        System.out.println("===== 동아리 및 회원 목록 =====");

        for (Club<Member> club : clubs.values()) {
            System.out.println("\n[동아리] " + club.getName());
            printHeader();

            for (Member m : club.getMembers()) {
                printRow(m);
            }

            printLine();
        }
        System.out.println();
    }

    private static void searchByName() {
        if (clubs.isEmpty()) {
            System.out.println("등록된 동아리가 없습니다.\n");
            return;
        }

        System.out.print("검색할 회원 이름(또는 일부): ");
        String keyword = sc.nextLine().trim();

        boolean found = false;

        System.out.println("===== 검색 결과 =====");
        printLine();
        System.out.printf(" %-10s %-5s %-12s %-18s %-5s\n",
                "동아리", "ID", "이름", "전공", "학년");
        printLine();

        for (Club<Member> club : clubs.values()) {
            for (Member m : club.getMembers()) {
                if (m.getName().contains(keyword)) {
                    System.out.printf(" %-10s %-5d %-12s %-18s %-5d\n",
                            club.getName(),
                            m.getId(),
                            m.getName(),
                            m.getMajor(),
                            m.getGrade());
                    found = true;
                }
            }
        }

        printLine();

        if (!found)
            System.out.println("검색 결과가 없습니다.\n");
    }
}
