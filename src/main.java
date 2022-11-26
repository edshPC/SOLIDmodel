import persons.*;
import places.*;
import things.*;
import enums.*;

public class main {
	
	public static void main(String[] args) {
		
		Mom mom = new Mom();
		Carlson carlson = new Carlson("Карлсон");
		Child malysh = new Child("Малыш");
		Somebody smb = new Somebody();
		Roof roof = new Roof();
		House house = new House(roof);
		City stgolm = new City("Стокгольм");
		Nowhere nowhere =  new Nowhere();
		JuneEvening jEv = new JuneEvening();
		World world = new World();
		Sky sky = new Sky();
		Twillight twill = new Twillight();
			
		System.out.println(
				InWords.TRUTH + " " + mom + " " + mom.isAllowing(false, Actions.FLY, carlson) + " " + roof.cuda() + InWords.BUT +
				"об этом " + malysh + " " + malysh.forgot(Adverbs.TOTALLY) + InWords.AND + malysh.surprised(Adverbs.REALLY) + " " +
				InWords.BI + InWords.IF + InWords.BI + " " + smb + " " + smb.remind("ему", "об этом") + "."
			);
		
		malysh.getHeart().notYoking();
		System.out.println(
				malysh.thirdName() + " " + malysh.usedTo(Actions.FLY) + " " + carlson.with() + InWords.AND +
				malysh.afraidOf(false, Adverbs.TOTALLY) + "," + InWords.AND + InWords.EVEN + " " + malysh.getHeart() +
				" у него " + malysh.getHeart().isYoking() + InWords.WHEN + malysh.thirdName() +
				malysh.obhvat(carlson, malysh.getArm(), carlson.getNeck()) + ",\n	" + malysh.flyUp(Adverbs.FAST) + ", " +
				InWords.STRAIGHT + " " + house.kChemu() + " " + house.whereIs() + "."
			);
		
		System.out.println(
				 InWords.AS + " " + jEv.chego() + ", как " + stgolm.gde() + ", не бывает " + nowhere.gde() + "."
			);
		
		System.out.println(
				nowhere.gde() + " " + world.gde() + " " + sky + " " + sky.glow(false, "этим особым светом") + ", " +
				nowhere.gde() + " " + twill + " " + twill.be(false, Adverbs.SO, Adjectives.BRIGTH, Adjectives.TRANSPARENT, Adjectives.BLUE) +
				"\n	что " + stgolm.unnamed() + InWords.AND + sky + ", " + sky.reflectWater(Adjectives.FADED) + " " +
				sky.seems(Adverbs.TOTALLY, Adjectives.FAIRY) + "."
			);
	}

}
