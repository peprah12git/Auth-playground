package Auth.playground.mappers;

import Auth.playground.dto.UsersDTO;
import Auth.playground.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface userMapper {
    UsersDTO toDTO(Users user);
    Users toEntity(UsersDTO dto);
}
