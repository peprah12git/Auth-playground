package Auth.playground.repository;



import Auth.playground.entity.Email_verification_token;
import Auth.playground.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmailVerificationTokenRepository extends JpaRepository<Email_verification_token, UUID> {

    // Find token by token string
    Optional<Email_verification_token> findByToken(String token);

    // Find all verification tokens for a user
    Optional<Email_verification_token> findFirstByUserAndUsedFalseOrderByCreatedAtDesc(Users user);
}
