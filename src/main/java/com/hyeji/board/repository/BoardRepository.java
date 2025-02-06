package com.hyeji.board.repository;

import com.hyeji.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;

    public void save(BoardDTO boardDTO) {
        /* board: mapper의 namespace를 가르킴.
           save: sql 쿼리문을 담고있는 태그를 의미
           boardDTO: DB에 넘길 파라미터나 변수가 있다면 그 객체나 데이터 */
        sql.insert("Board.save", boardDTO);
    }
}
