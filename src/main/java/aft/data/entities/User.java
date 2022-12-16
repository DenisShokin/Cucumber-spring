package aft.data.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Data data;
    private Support support;

    class Data {
        private int id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;
    }

    class Support {
        private String url;
        private String text;
    }
}

