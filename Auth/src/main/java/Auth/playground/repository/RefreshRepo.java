package Auth.playground.repository;

import Auth.playground.entity.Refresh_Tokens;
import Auth.playground.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RefreshRepo extends JpaRepository<Refresh_Tokens, UUID> {

    // Find a refresh token by its token string
    Optional<Refresh_Tokens> findByToken(String token);

    // Find all refresh tokens of a specific user
    List<Refresh_Tokens>findByUser(Users user);

    // Delete all refresh tokens for a user (useful on logout or account deletion)
    void deleteByUser(Users user);
}
