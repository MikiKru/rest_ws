package net.atos.rest_evaluation.user;

import net.atos.rest_evaluation.user.dto.CreateUserDTO;
import net.atos.rest_evaluation.user.dto.UpdateUserDTO;
import net.atos.rest_evaluation.user.dto.UserDTO;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

	public UserDTO toDTO(User user) {
		return new UserDTO(user.getId(), user.getName());
	}

	public List<UserDTO> toDTOs(List<User> users) {
		return users.stream()
				.map(user -> toDTO(user))
				.collect(Collectors.toList());
	}

	public User fromDTO(CreateUserDTO userDTO) {
		User user = new User();
		user.setName(userDTO.getName());
		return user;
	}

	public User fromDTO(UpdateUserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		return user;
	}
}

