package starter.model;

public class PurchaserFactory {
    private PurchaserFactory() {
    }

    public static Purchaser createByName(String name){
        return Purchaser.builder()
                .sex("Mr")
                .name(name)
                .email("admin@gmail.com")
                .password("123456")
                .dateOfBirth("12/12/1992")
                .Address("Calle 123")
                .country("India")
                .city("Mumbai")
                .zipCode("12345")
                .phone("123456789")
                .build();
    }
}
