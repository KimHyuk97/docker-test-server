package dockerserver.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName    : dockerserver.user
 * fileName       : UserController
 * author         : Hyuk Kim
 * date           : 2023-12-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-19        Hyuk Kim       최초 생성
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok().body("home");
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> findAll() {
        List<User> userList = userRepository.findAll();
        return ResponseEntity.ok().body(userList);
    }
}
