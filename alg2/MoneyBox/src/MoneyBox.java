public class MoneyBox {
    private String owner;
    private int[] coins = new int[2];

    public String getOwner() {
        return owner;
    }

    public void setCoins(int numberOfOnes, int numberOfTwos)
    {
        coins[0] = numberOfOnes;
        coins[1] = numberOfTwos;
    }

    public int[] getCoins()
    {
        return coins;
    }

    public MoneyBox(String owner)
    {
        this.owner = owner;
    }

    public MoneyBox(String owner, int ones, int twos)
    {
        this.owner = owner;
        this.coins[0] = ones;
        this.coins[1] = twos;
    }

    public void changeOwnerName(String newOwner)
    {
        owner = newOwner;
    }

    public int getSum()
    {
        return coins[0] + coins[1] * 2;
    }

    public void insertOne()
    {
        coins[0] += 1;
    }

    public void insertTwo()
    {
        coins[1] += 1;
    }

    public void insertCoins(int numberOfOnes, int numberOfTwos)
    {
        coins[0] += numberOfOnes;
        coins[1] += numberOfTwos;
    }

    @Override
    public String toString()
    {
        return "%s má %dKč - %dx1Kč, %dx2Kč".formatted(owner, getSum(), coins[0], coins[1]);
    }

    public boolean checkBalance(int value)
    {
        return getSum() >= value;
    }

    public void convertAllMoney(MoneyBox oldOwner)
    {
        int[] coinsMemory = new int[2];
        coinsMemory = oldOwner.getCoins();
        insertCoins(coinsMemory[0], coinsMemory[1]);
        oldOwner.setCoins(0, 0);
    }
}
