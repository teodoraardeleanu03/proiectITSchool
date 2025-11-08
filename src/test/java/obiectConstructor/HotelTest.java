package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class HotelTest {
    @Test
    public void hotelTest() {
        Hotel hotel1 = new Hotel(
                "Hotel Miraj",
                "Str. Principala nr. 10",
                "Brașov",
                "România",
                1,
                Arrays.asList("Wi-Fi gratuit", "parcare"));

        Hotel hotel2 = new Hotel(
                "Hotel Central",
                "Bd. Unirii nr. 25",
                "București",
                "România",
                3,
                Arrays.asList("Piscină", "sală fitness", "restaurant")
        );

        Hotel hotel3 = new Hotel(
                "Hotel Luxor",
                "Str. Libertății nr. 8",
                "Cluj-Napoca",
                "România",
                5,
                Arrays.asList("Spa", "room service", "bar", "piscină interioară")
        );

        hotel1.prezentareHotel();
        hotel1.calculeazaPretCamera();

        System.out.println();

        hotel2.prezentareHotel();
        hotel2.calculeazaPretCamera();

        System.out.println();

        hotel3.prezentareHotel();
        hotel3.calculeazaPretCamera();
    }
}
