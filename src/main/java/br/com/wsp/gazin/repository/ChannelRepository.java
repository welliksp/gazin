package br.com.wsp.gazin.repository;

import br.com.wsp.gazin.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
