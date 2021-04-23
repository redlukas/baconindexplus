import static org.junit.jupiter.api.Assertions.*;

class GetterTest {

    @org.junit.jupiter.api.Test
    void getPerson() {
        Getter getter = new Getter();
        assertEquals(71580, getter.getPerson("Benedict Cumberbatch").getID());
    }
}