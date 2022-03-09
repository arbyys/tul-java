public class MoneyBoxApp {
    public static void main(String[] args) {
        final int hamburgerPrice = 39;

        MoneyBox aliceBox = new MoneyBox("Alice", 2, 6);
        MoneyBox bobBox = new MoneyBox("Bob");
        MoneyBox[] storage = {aliceBox, bobBox };

        bobBox.insertOne();
        bobBox.insertOne();
        bobBox.insertTwo();
        bobBox.insertTwo();
        bobBox.insertTwo();
        bobBox.insertCoins(5, 10);
        
        System.out.printf("Suma Alice: %d%n", aliceBox.getSum());
        System.out.printf("Suma Boba: %d%n", bobBox.getSum());
        System.out.println(aliceBox);
        System.out.println(bobBox);

        for (MoneyBox item : storage)
        {
            if(item.checkBalance(hamburgerPrice))
            {
                System.out.printf("%s si může koupit hamburger\n", item.getOwner());
            }
            else
            {
                System.out.printf("%s si nemůže koupit hamburger\n", item.getOwner());
            }
        }

        if(aliceBox.getSum() > bobBox.getSum())
        {
            System.out.println("\nAlice má víc peněz než Bob\n");
        }
        else if(aliceBox.getSum() < bobBox.getSum())
        {
            System.out.println("\nBob má víc peněz než Alice\n");
        }
        else
        {
            System.out.println("\nAlice a Bob mají stejně peněz\n");
        }

        aliceBox.convertAllMoney(bobBox);
    }
}
