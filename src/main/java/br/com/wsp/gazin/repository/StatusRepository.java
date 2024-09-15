package br.com.wsp.gazin.repository;

import br.com.wsp.gazin.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
