package dockerserver.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : dockerserver.user
 * fileName       : UserRepository
 * author         : Hyuk Kim
 * date           : 2023-12-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-19        Hyuk Kim       최초 생성
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
