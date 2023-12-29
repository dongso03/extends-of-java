import java.util.Scanner;
import java.util.Random;

public class Play {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 고정값
		Random ran = new Random(); // 랜덤 값

		int count = 0; // 죽인 몬스터의 수
		int heal = ran.nextInt(500); // 영웅의 회복량
		int heal2 = ran.nextInt(600);
		int skillcool = 0;
		Hero hero = new Hero(10000, 1000, heal, "전사(탱커)"); // 영웅의 체력,공격력,회복량
		Hero hero2 = new Hero(4000, 2000, heal2, "마법사(딜러)");

		int monsterHp = ran.nextInt(500) + 2000;// 몬스터의 체력
		int fullHp = monsterHp; // 죽은후 다시 체력리셋
		int monsterOp = ran.nextInt(1000) + 500; // 몬스터의 공격력
		Monster monster = new Monster(monsterHp, monsterOp); // 몬스터의 체력,공격력

		hero.HeroState(); // 영웅의 능력치를 보기위한 출력문 메소드
		monster.MonsterState(); // 몬스터의 능력치를 보기위한 출력문 메소드
		while (true) { // 영웅 1 (전사)플레이 반복

			System.out.println("1. 영웅의 몬스터 공격");
			System.out.println("2. 영웅의 채력 회복");
			System.out.println("3. 스킬 사용");
			int select = sc.nextInt(); // 영웅의 행동 선택

			if (monster.getMonsterHp() <= 0) { // 몬스터의 사망시
				monster.setMonsterHp(fullHp); // 몬스터의 채력 다시 리필
				count++; // 몬스터 처치수 1증가
			}

			switch (select) { // 영웅의 행동 번호선택
			case 1:
				hero.Attack(monster);// 히어로가 몬스터를 공격한다
				monster.monsterAttack(hero); // 몬스터가 영웅를 공격한다
				skillcool++;
				System.out.println("현재 행동력 " + skillcool);
				break;
			case 2:
				hero.HeroHeal(heal); // 영웅이 체력을 회복한다
				monster.monsterAttack(hero); // 몬스터가 영웅을 공격한다
				skillcool++;
				System.out.println("현재 행동력 " + skillcool);
				break;
			case 3:
				if (skillcool >= 3) {
					hero.Skill(monster);
					skillcool = skillcool - 3;
					System.out.println("현재 행동력 " + skillcool);
				} else {
					System.out.println("행동력이 부족하여 스킬의 사용이 불가능합니다.");
					System.out.println("현재 행동력 " + skillcool);
				}
				break;
			default:
				System.out.println("1,2,3번 만 선택 가능합니다."); // 다른선호 선택시 출력 메세지
				break;
			}

			if (hero.getHeroHp() <= 0) { // 영웅 사망
				break;
			}

		}
		hero2.HeroState();
		skillcool = 0;
		while (true) { // 영웅2 (마법사)플레이 반복

			System.out.println("1. 영웅의 몬스터 공격");
			System.out.println("2. 영웅의 채력 회복");
			System.out.println("3. 스킬 사용");
			int select = sc.nextInt(); // 영웅의 행동 선택

			if (monster.getMonsterHp() <= 0) { // 몬스터의 사망시
				monster.setMonsterHp(fullHp); // 몬스터의 채력 다시 리필
				count++; // 몬스터 처치수 1증가
			}

			switch (select) { // 영웅의 행동 번호선택
			case 1:
				hero2.Attack(monster);// 히어로가 몬스터를 공격한다
				monster.monsterAttack(hero2); // 몬스터가 영웅를 공격한다
				skillcool++;
				System.out.println("현재 행동력 " + skillcool);
				break;
			case 2:
				hero2.HeroHeal(heal); // 영웅이 체력을 회복한다
				monster.monsterAttack(hero2); // 몬스터가 영웅을 공격한다
				skillcool++;
				System.out.println("현재 행동력 " + skillcool);
				break;
			case 3:
				if (skillcool >= 3) {
					hero2.Skill(monster);
					skillcool = skillcool - 3;
					System.out.println("현재 행동력 " + skillcool);
				} else {
					System.out.println("행동력이 부족하여 스킬의 사용이 불가능합니다.");
					System.out.println("현재 행동력 " + skillcool);
				}
				break;
			default:
				System.out.println("1,2,3번 만 선택 가능합니다."); // 다른선호 선택시 출력 메세지
				break;
			}

			if (hero2.getHeroHp() <= 0) { // 영웅 사망
				break;
			}

		}
		System.out.println("총 잡은 몬스터의 수는 " + count); // 몬스터 총 처치수 출력문
	}
}
