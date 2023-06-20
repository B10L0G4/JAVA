public class smarTv {
    boolean power = false;
    int channel = 1;
    int volume = 12;

    public void powerOn() { // metodo para ligar e desligar a tv
        power = !power;
    }
    public void channelUp() { // metodo para aumentar o canal
        channel++;
    }
    public void channelDown() { // metodo para diminuir o canal
        channel--;
    }
    public void setChannel(int newChannel) { // metodo para mudar o canal
        channel = newChannel;
    }

    public void volumeUp() { // metodo para aumentar o volume
        volume++;
    }
    public void volumeDown() { // metodo para diminuir o volume
        volume--;
    }

}
