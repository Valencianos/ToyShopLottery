package ToyShopModules;


public class Launch {
    public static void main(String[] args) {
        new Lottery();

        Lottery.put("1 Ball 10 0.10");
        Lottery.put("2 Doll 15 0.15");
        Lottery.put("3 Car 7 0.07");
        Lottery.put("4 Mosaic 5 0.06");
        Lottery.put("5 Lego 3 0.04");
        Lottery.put("6 Gum 20 0.20");
        Lottery.put("7 Clock 8 0.08");
        Lottery.put("8 Coupon 30 0.30");

        int k = 0;
        for (int i = 0; i < 10; i++) {
            int wonToyId = Lottery.getToyId();
            Toys wonToy = Lottery.getToyById(wonToyId);
            if (wonToy != null) {
                if (Lottery.checkAvailable(wonToy)){
                    k += 1;
                    System.out.println("Round " + k + ": your prize is " + wonToy.getName());
                }
            }
        }
        Lottery.saveToFile("Result.txt");
    }
}
