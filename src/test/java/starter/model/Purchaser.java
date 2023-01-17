package starter.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Purchaser {

        public static final String USER_INFORMATION = "user information";
        private final String sex;
        private final String name;
        private final String email;
        private final String password;
        private final String dateOfBirth;
        private final String Address;
        private final String country;
        private final String city;
        private final String zipCode;
        private final String phone;
}
