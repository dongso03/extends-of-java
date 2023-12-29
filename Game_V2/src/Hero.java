
public class Hero {
	private int hp; // 영웅 HP
	private int offensepower; // 영웅 공격력
	private int heal; // 영웅의 회복량
	private String job; // 영웅의 직업

	public Hero(int hp, int offensepower, int heal, String job) { // 체력, 공격력, 회복량 초기화
		this.hp = hp;
		this.offensepower = offensepower;
		this.heal = heal;
		this.job = job;
	}

	public int getHeroHp() {
		return hp;
	}

	public void setHeroHp(int hp) {
		this.hp = hp;
	}

	public int getHeroOffensepower() {
		return offensepower;
	}

	public void setHeroOffensepower(int offensepower) {
		this.offensepower = offensepower;
	}

	public int getHeroHeal() {
		return heal;
	}

	public void setHeroHeal(int heal) {
		this.heal = heal;
	}

	public void HeroState() { // 영웅의 정보
		System.out.println("영웅의 정보");
		System.out.println("영웅의 체력 " + hp);
		System.out.println("영웅의 공격력 " + offensepower);
		System.out.println("영웅의 회복량 " + heal);
		System.out.println("스킬을 사용하기 위해선 행동력이 3이상 필요합니다.");
		System.out.println("행동력은 스킬사용을 제외한 공격,회복시 행동력이 1 상승합니다.");
		if (job.equals("전사(탱커)")) {
			System.out.println("전사(탱커)는 스킬 사용시 1000의 데미지를 무효화 합니다.");
		} else if (job.equals("마법사(딜러)")) {
			System.out.printf("마법사(딜러)는 스킬 사용시 %d + 200의 데미지를 줍니다.\n",offensepower);
		}
	}

	// 영웅이 몬스터를 공격하는 메소드
	public void Attack(Monster monster) { // 받아오고자하는 몬스터클래스 변수이름 지정
		int remainHp = monster.getMonsterHp() - offensepower;
		if (remainHp <= 0) {
			System.out.println("몬스터 사망");
			monster.setMonsterHp(remainHp);
		} else {
			System.out.printf("영웅이  %d의 데미지로 몬스터를 공격합니다.\n", offensepower);
			System.out.printf("몬스터의 체력이 %d만큼 남았습니다.\n", remainHp);
			monster.setMonsterHp(remainHp);
		}
	}

	public void Skill(Monster monster) { // 영웅이 몬스터에게 스킬을 사용하는 메소드
		if (job.equals("전사(탱커)")) { // 전사 스킬 사용
			System.out.println("방어 스킬 사용");
			int defense = 1000;
			if (monster.getMonsterOffensepower() <= defense) {
				System.out.println("방어력이 더 높아 데미지가 들어가지 않았습니다.");
			} else {
				hp = hp - (monster.getMonsterOffensepower() - defense);
				System.out.printf("몬스터의 데미지가 %d만큼 들어왔습니다.\n", monster.getMonsterOffensepower() - defense);
			}
		} else if (job.equals("마법사(딜러)")) { // 마법사 스킬 사용
			System.out.println("공격 스킬 사용");
			int remainHp = monster.getMonsterHp() - (offensepower + 200);
			if (remainHp <= 0) {
				System.out.println("몬스터 사망");
				monster.setMonsterHp(remainHp);
			} else {
				System.out.printf("영웅이 스킬을 사용하여  %d의 데미지로 몬스터를 공격합니다.\n", (offensepower + 200));
				System.out.printf("몬스터의 체력이 %d만큼 남았습니다.\n", remainHp);
				monster.setMonsterHp(remainHp);
			}
		}
	}

	public void HeroHeal(int heal) {
		int afterHp = getHeroHp() + heal;
		System.out.printf("%d에서 %d만큼 회복하였습니다.\n", getHeroHp(), heal);
		setHeroHp(afterHp);
	}
}
