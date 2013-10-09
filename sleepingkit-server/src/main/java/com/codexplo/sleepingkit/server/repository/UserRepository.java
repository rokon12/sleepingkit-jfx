package com.codexplo.sleepingkit.server.repository;

import com.codexplo.sleepingkit.common.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 6:41 PM
 */
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}
