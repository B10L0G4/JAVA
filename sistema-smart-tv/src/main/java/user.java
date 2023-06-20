public class user {
    public static void main(String[] args) {

        smarTv Tv = new smarTv();

//        tv.power = true;
//        tv.channel = 10;
//        tv.volume = 20;


        System.out.println("Actual volume: " + Tv.volume);
        System.out.println("Actual channel: "+ Tv.channel);

        Tv.powerOn();
        System.out.println("power on: " + Tv.power);

        Tv.channelUp();
        System.out.println("Up channel : " + Tv.channel);

        Tv.setChannel(15);
        System.out.println("Set channel : " + Tv.channel);

        Tv.channelDown();
        System.out.println("Down channel : " + Tv.channel);

        Tv.volumeUp();
        System.out.println("Up volume: " + Tv.volume);



    }


}
