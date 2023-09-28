import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GhostRoomTest {
    @Test
    public void testGhostRooms() {
        int[][] inputMatrix = { { 0, 1, 1, 2 },
                { 0, 5, 0, 0 },
                { 2, 0, 3, 3 } };

        GhostRooms test = new GhostRooms();

        int actualValue = test.calculatValidRooms(inputMatrix);

        assertEquals(4, actualValue);

    }

}
