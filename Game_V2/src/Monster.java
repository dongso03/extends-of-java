

public class Monster {
	private int hp;
	private int offensepower;
	
	public Monster(int hp, int offensepower) {
		this.hp =hp;
		this.offensepower = offensepower;
	}
	public int getMonsterHp() {
		//System.out.println("게터 동작 확인 : " + hp);
		return hp;
		
	}
	public void setMonsterHp(int hp) {
		this.hp = hp;
		//System.out.println("세터 동작 확인 : " + hp);
	}
	
	public int getMonsterOffensepower() {
		return offensepower;
	}
	public void setMonsterOffensepower(int offensepower) {
		this.offensepower = offensepower;
	}
	public void MonsterState() { // 몬스터의 정보를 출력하는 메소드
		System.out.println("몬스터의 정보");
		System.out.println("몬스터의 체력 " + hp);
		System.out.println("몬스터의 공격력 " + offensepower);
	}
	
	public void monsterAttack(Hero hero) { //몬스터가 영웅을 공격하는 메소드
		int remainHp = hero.getHeroHp() - offensepower;
		if (remainHp <= 0) {
			System.out.println("영웅이 사망하였습니다.");
			hero.setHeroHp(remainHp);
		} else {
			System.out.println("몬스터가 영웅을 " + offensepower+ "만큼 공격했습니다.");
			System.out.printf("영웅의 체력이 %d남았습니다.\n",remainHp);
			hero.setHeroHp(remainHp);
		}
	}
}



