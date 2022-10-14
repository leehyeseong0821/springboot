package DI_IoC.mvc20220927hyeseong.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserReDto {

    private String username;
    private String password;
    private String name;
    private String email;

}
