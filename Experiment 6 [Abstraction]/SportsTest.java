interface Sports {
    void play();
}

class Football implements Sports {
    public void play() {
        System.out.println("Playing Football...");
    }
}

class Cricket implements Sports {
    public void play() {
        System.out.println("Playing Cricket...");
    }
}

public class SportsTest {
    public static void main(String[] args) {
        Sports football = new Football();
        Sports cricket = new Cricket();

        football.play();
        cricket.play();
    }
}
