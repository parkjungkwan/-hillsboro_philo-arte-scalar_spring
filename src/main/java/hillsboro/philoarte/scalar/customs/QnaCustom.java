package hillsboro.philoarte.scalar.customs;


import hillsboro.philoarte.scalar.entities.Qna;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QnaCustom {

    Qna search();

    Page<Object[]> searchPage(String type, String keyword, Pageable pageable);

}
