package tec.utpl.actualizate.actualizateservice.service;


import java.util.List;

import tec.utpl.actualizate.actualizateservice.entitys.User;

public interface UserService {

    public List<User> listAlluserss();
    public User createUser(User product);
}
