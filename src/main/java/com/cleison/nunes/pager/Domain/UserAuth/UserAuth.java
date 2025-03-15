package com.cleison.nunes.pager.Domain.UserAuth;

import com.cleison.nunes.pager.Domain.User.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usersAuth")
@NoArgsConstructor
@Getter
@Setter
public class UserAuth {
    @Id
    private String id;
    private String login;
    private String password;
    private String role;
}
