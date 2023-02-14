package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User__Data;

public interface user_manager_repo extends JpaRepository<User__Data, Integer> {
}
