public class Person implements Weatherlistener{

    @Override
    public void update(String weather) {
        System.out.println("Eu gosto do tempo " + weather);
    }
}
