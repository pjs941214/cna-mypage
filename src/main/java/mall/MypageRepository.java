package mall;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MypageRepository extends CrudRepository<Mypage, Long> {

    List<Mypage> findByOrderId(Long orderId);

}