//Hua Chen 305942655

package lab5;

import java.util.ArrayList;

public class driver {
	private ArrayList<String> monsterAttackList;
	
	public void list() {
		ArrayList<String> monsterAttackList = new ArrayList<String>(100);
		monsterAttackList = monsterList(monsterAttackList);
	}

	public ArrayList<String> monsterList(ArrayList<String> monsterAttackList){		
		monsterAttackList.add("Attack# 125: Godzilla attacked Tokyo on 6/25/2009. Reported by Kyohei Yamane");
		monsterAttackList.add("Attack# 1: Megalodon attacked Pacific on 8/10/2018. Reported by Jon Turteltaub");
		monsterAttackList.add("Attack# 12: Yeti attacked Himalayas on 6/25/1832. Reported by Scooby Doo");
		return monsterAttackList;
	}

}
	