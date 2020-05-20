package shopping_cart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    Cart underTest = new Cart();

    @Test
    public void shouldBeAbleToAdd1Item() {
        underTest.addItems("shoes", 25.5, 1);
        int check = underTest.getTotalItems();
        assertEquals(1, check);
    }

    @Test
    public void shouldBeAbleToAdd2Items() {
        underTest.addItems("shoes", 25.5, 1);
        underTest.addItems("jackets", 35.5, 1);
        int check = underTest.getTotalItems();
        assertEquals(2, check);
    }

    @Test
    public void shouldBeAbleToRemove1Item() {
        underTest.addItems("shoes", 25.5, 1);
        underTest.addItems("jackets", 35.5, 1);
        underTest.removeItems("shoes");
        int check = underTest.getTotalItems();
        assertEquals(1, check);
    }


}
