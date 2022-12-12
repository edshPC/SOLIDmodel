import persons.*;
import places.*;
import things.*;
import enums.*;
import organs.Heart;

public class Main {
  
  public static void main(String... args) {
	  
    Pie pie = new Pie();
    Need need = new Need();
    Mom mom = new Mom();
    Carlson carlson = new Carlson("Карлсон");
    Child malysh = new Child("Малыш");
    Somebody smb = new Somebody();
    Roof roof = new Roof();
    House house = new House(roof);
    City stgolm = new City("Стокгольм");
    Nowhere nowhere = new Nowhere();
    JuneEvening jEv = new JuneEvening();
    World world = new World();
    Sky sky = new Sky();
    Twillight twill = new Twillight();
    They they = new They(malysh, carlson);
    Porch porch = new Porch();
    Juice juice = new Juice();
    
    try {
      System.out.print(pie + " с насыщением " + pie.getSat());
    } catch (Food.FoodNotFoundExeption e) {
      System.out.print("Но " + e.getMessage());
    }
    System.out.println(
      ", а когда " + carlson.startVorch() + ", " + malysh.sayWhat("пустяки, дело житейское.")
    ); 
    
    
    Child.Bun malyshBun = malysh.new Bun();
    System.out.println(
      malysh.goThrough("в кухню") + InWords.AND + malyshBun.returnWith() + "."
    );
    

    System.out.println(
      mom + " " + mom.isAllowing(true, Actions.GIVEINCASE, carlson.toWhom()) + " " + malyshBun.oneAnother() + "."
    );
    

    System.out.println(
      InWords.ANDNOW + need.be("в этом") + "."
    );
    

    System.out.println(
      InWords.TRUTH + " " + mom + " " + mom.isAllowing(false, Actions.FLY, carlson.with()) + " " + roof.cuda() + InWords.BUT + 
      "об этом " + malysh + " " + malysh.forgot(Adverbs.TOTALLY) + InWords.AND + malysh.surprised(Adverbs.REALLY) + " " + 
      InWords.BI + InWords.IF + InWords.BI + " " + smb + " " + smb.remind("ему", "об этом") + "."
    );
    
    
    try {
    	malysh.getHeart().startYoking();
    } catch (Heart.CantYokingExeption e) {
		System.out.println(e.getMessage());
	}
    malysh.getHeart().notYoking();
    System.out.println(
      malysh.thirdName() + " " + malysh.usedTo(Actions.FLY) + " " + carlson.with() + InWords.AND + 
      malysh.afraidOf(false, Adverbs.TOTALLY) + "," + InWords.AND + InWords.EVEN + " " + malysh.getHeart() + 
      " у него " + malysh.getHeart().isYoking() + InWords.WHEN + malysh.thirdName() + 
      malysh.obhvat(carlson, malysh.getArm(), carlson.getNeck()) + ",\n\t" + malysh.flyUp(Adverbs.FAST) + ", " + 
      InWords.STRAIGHT + " " + house.kChemu() + " " + house.whereIs() + "."
    );
    

    System.out.println(
      InWords.AS + " " + jEv.chego() + ", как " + stgolm.gde() + ", не бывает " + nowhere.gde() + "."
    );
    
    System.out.println(
      nowhere.gde() + " " + world.gde() + " " + sky + " " + sky.glow(false, "этим особым светом") + ", " + 
      nowhere.gde() + " " + twill + " " + twill.be(false, Adverbs.SO, Adjectives.BRIGTH, Adjectives.TRANSPARENT, Adjectives.BLUE) + 
      "\n\tчто " + stgolm.unnamed() + InWords.AND + sky + ", " + sky.reflectWater(Adjectives.FADED) + " " + 
      sky.seems(Adverbs.TOTALLY, Adjectives.FAIRY) + "."
    );

    System.out.println(
      jEv.thisEves() + " " + Adverbs.JUSTSPECIAL + " " + jEv.createdFor("празднования дней рождения", carlson, house) + "."
    );
    

    System.out.println(
      malysh.enjoy("сменой красок", sky) + ", а " + carlson.dontAttend("это") + "."
    );
    

    System.out.println(
      "Но" + InWords.WHEN + they + " " + they.sit(porch) + ", " + they.eat(malyshBun) + InWords.AND + they.drink(juice) + ",\n\t" + 
      malysh.understand(jEv.notSame(jEv.thisEve(), jEv.otherEves())) + "."
    );
    
    System.out.println(
      "А " + carlson.understand(malyshBun.thisBunsNotSameThatAnother()) + "."
    );
  }
  
}