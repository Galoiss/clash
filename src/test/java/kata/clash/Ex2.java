package kata.clash;

import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackTrainingCamp;
import kata.clash.buildings.BlueTrainingCamp;
import kata.clash.units.Bomber;
import kata.clash.units.Dragon;
import kata.clash.units.Giant;
import kata.clash.units.Miner;
import kata.clash.units.UnitType;

public class Ex2 {

	/* Q1 */

	@Test
	public void A_Dragon_Then_It_Should_Have_7500_getOffensiveHitpoints() {
		Dragon newlyCreatedDragon = BlackTrainingCamp.ProduceUnit(UnitType.DRAGON);

		Assert.assertEquals(7500, newlyCreatedDragon.getOffensiveHitpoints());
	}

	@Test
	public void A_Dragon_Then_It_Should_Have_5000_getDefensiveHitpoints() {
		Dragon newlyCreatedDragon = BlackTrainingCamp.ProduceUnit(UnitType.DRAGON);

		Assert.assertEquals(5000, newlyCreatedDragon.getDefensiveHitpoints());
	}

	@Test
	public void A_Bomber_Then_It_Should_Have_800_getOffensiveHitpoints() {
		Bomber newlyCreatedBomber = BlueTrainingCamp.ProduceBomber();

		Assert.assertEquals(800, newlyCreatedBomber.getOffensiveHitpoints());
	}

	@Test
	public void A_Bomber_Then_It_Should_Have_350_getDefensiveHitpoints() {
		Bomber newlyCreatedBomber = BlueTrainingCamp.ProduceBomber();

		Assert.assertEquals(350, newlyCreatedBomber.getDefensiveHitpoints());
	}

	@Test
	public void A_Giant_Then_It_Should_Have_3000_getOffensiveHitpoints() {
		Giant newlyCreatedGiant = BlueTrainingCamp.ProduceGiant();

		Assert.assertEquals(3000, newlyCreatedGiant.getOffensiveHitpoints());
	}

	@Test
	public void A_Giant_Then_It_Should_Have_4500_getDefensiveHitpoints() {
		Giant newlyCreatedGiant = BlueTrainingCamp.ProduceGiant();

		Assert.assertEquals(4500, newlyCreatedGiant.getDefensiveHitpoints());
	}

	@Test
	public void A_Miner_Then_It_Should_Have_1200_getOffensiveHitpoints() {
		Miner newlyCreatedMiner = BlueTrainingCamp.ProduceMiner();

		Assert.assertEquals(1200, newlyCreatedMiner.getOffensiveHitpoints());
	}

	@Test
	public void A_Miner_Then_It_Should_Have_800_getDefensiveHitpoints() {
		Miner newlyCreatedMiner = BlueTrainingCamp.ProduceMiner();

		Assert.assertEquals(800, newlyCreatedMiner.getDefensiveHitpoints());
	}

	@Test
	public void With_10000_OffensiveHitpoints_Then_A_Dragon_Dies_And_Shouts_His_Last_Message()
                {
                    Dragon dragonUnit = BlackTrainingCamp.ProduceUnit(UnitType.DRAGON);

                    String lastMessageBeforeDying = dragonUnit.ReceiveHit(2000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() > 0);
                    Assert.assertFalse(!lastMessageBeforeDying.isEmpty());

                    lastMessageBeforeDying = dragonUnit.ReceiveHit(8000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() <=0);
                    Assert.assertTrue(lastMessageBeforeDying.equals("I WILL RISE AGAIN FROM THE ASHES"));
                }

	@Test
	public void With_4501_OffensiveHitpoints_Then_A_Giant_Dies_And_Shouts_His_Last_Message()
                {
                    Giant giantUnit = BlueTrainingCamp.ProduceGiant();
                    String lastMessageBeforeDying = giantUnit.ReceiveHit(4501);

                    Assert.assertTrue(giantUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.equals("OUR IRON FISTS WILL BE REMEMBERED FOREVER"));
                }

	@Test
	public void With_1300_OffensiveHitpoints_Then_A_Miner_Dies_And_Shouts_His_Last_Message()
                {
                    Miner minerUnit = BlueTrainingCamp.ProduceMiner();
                    String lastMessageBeforeDying = minerUnit.ReceiveHit(1300);

                    Assert.assertTrue(minerUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.toLowerCase().equals("we return in the ground"));
                }

	@Test
	public void With_400_OffensiveHitpoints_Then_A_Bomber_Dies_And_Shouts_His_Last_Message()
                {
                    Bomber bomberUnit = BlueTrainingCamp.ProduceBomber();
                    String expectedMessage = "WHEN YOU play with Explosives is dangerous bussiness";
                    String lastMessageBeforeDying = bomberUnit.ReceiveHit(400);

                    Assert.assertTrue(bomberUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.toLowerCase().equals(expectedMessage.toLowerCase()));
                }
}
