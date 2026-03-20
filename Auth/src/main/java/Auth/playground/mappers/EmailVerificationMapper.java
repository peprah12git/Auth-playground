package Auth.playground.mappers;

import Auth.playground.dto.EmailVerificationTokenDTO;
import Auth.playground.entity.Email_verification_token;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmailVerificationMapper {
    @Mapping(source = "user.id", target = "userId")  // map nested User entity to userId
    EmailVerificationTokenDTO toDTO(Email_verification_token token);

    @Mapping(source = "userId", target = "user.id")
    Email_verification_token toEntity(EmailVerificationTokenDTO dto);
}
