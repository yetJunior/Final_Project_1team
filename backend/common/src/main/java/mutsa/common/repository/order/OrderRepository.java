package mutsa.common.repository.order;

import mutsa.common.domain.models.article.Article;
import mutsa.common.domain.models.order.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByApiId(String uuid);

    Page<Order> findByArticle(Article article, Pageable pageable);

}
