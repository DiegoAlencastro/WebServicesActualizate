package tec.utpl.actualizate.actualizateservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tec.utpl.actualizate.actualizateservice.entitys.User;
import tec.utpl.actualizate.actualizateservice.repository.UserRep;

@Service
public class UserServiceImplemetation implements UserService{

    @Autowired
    private UserRep usuarioRepositorio;


	@Override
	public List<User> listAlluserss() {
		return usuarioRepositorio.findAll();
	}

	@Override
	public User createUser(User user) {
		 return usuarioRepositorio.save(user);
	}
	
}
