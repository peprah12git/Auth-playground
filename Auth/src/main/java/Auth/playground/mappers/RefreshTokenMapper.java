package Auth.playground.mappers;

import Auth.playground.dto.RefreshTokenDTO;
import Auth.playground.entity.Refresh_Tokens;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RefreshTokenMapper {
    @Mapping(source = "user.id", target = "userId")  // map nested User entity to userId
    RefreshTokenDTO toDTO(Refresh_Tokens token);

    @Mapping(source = "userId", target = "user.id")
    Refresh_Tokens toEntity(RefreshTokenDTO dto);
}
