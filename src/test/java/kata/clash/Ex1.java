package kata.clash;


import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackElixirFactory;
import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;

public class Ex1 {
    @Test(expected = DwarfsAngryException.class)
    public void When_Gems_Supplied_Are_Not_Enough_Throw_DwarfsAngryException() throws Exception
    {
        BlackElixirFactory.ProduceElixir(1, 100);
    }

    @Test(expected = DwarfsAngryException.class)
    public void When_BlueElixir_Supplied_Is_Not_Enough_Throw_DwarfsAngryException() throws Exception
    {
        BlackElixirFactory.ProduceElixir(2,50);
    }

    @Test
    public void With_2_Gems_And_500_BlueElixir_Should_Produce_100_BlackElixir() throws Exception
    {
    	Assert.assertEquals(100,BlackElixirFactory.ProduceElixir(2,500));
    }

    @Test
    public void With_4_Gems_And_1000_BlueElixir_Should_Produce_200_BlackElixir() throws Exception
    {
        Assert.assertEquals(200,BlackElixirFactory.ProduceElixir(4,1000));
    }

    @Test
    public void With_5_Gems_And_200_BlueElixir_Should_Produce_100_BlackElixir() throws Exception
    {
        Assert.assertEquals(100,BlackElixirFactory.ProduceElixir(5,200));
    }

    @Test(expected = InvalidQuantityException.class)
    public void When_Gem_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception
    {
    	BlackElixirFactory.ProduceElixir(3,500);
    }

    @Test(expected = InvalidQuantityException.class)
    public void When_Blue_Elixir_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception
    {
        BlackElixirFactory.ProduceElixir(2,600);
    }
    @Test(expected = InvalidQuantityException.class)
    public void When_Blue_Elixir_Supplied_Is_Too_Much_And_Gem_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception
    {
        BlackElixirFactory.ProduceElixir(4,1500);
    }


}
