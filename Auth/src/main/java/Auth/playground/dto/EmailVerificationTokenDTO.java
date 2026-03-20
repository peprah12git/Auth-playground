package Auth.playground.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailVerificationTokenDTO {
    private UUID id;
//    private UUID userId;  // flattened from user.id
    private String token;
    private LocalDateTime expiresAt;
    private boolean used;
}
