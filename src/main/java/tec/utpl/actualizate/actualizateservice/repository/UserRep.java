package tec.utpl.actualizate.actualizateservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tec.utpl.actualizate.actualizateservice.entitys.User;

@Repository
public interface UserRep extends JpaRepository<User, Integer> {
}
