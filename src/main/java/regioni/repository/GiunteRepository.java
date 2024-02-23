package regioni.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import regioni.model.GiuntaLazio;

@Repository
public interface GiunteRepository extends JpaRepository <GiuntaLazio, Integer> {

}
