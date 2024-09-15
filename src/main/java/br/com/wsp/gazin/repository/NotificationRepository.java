package br.com.wsp.gazin.repository;

import br.com.wsp.gazin.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
