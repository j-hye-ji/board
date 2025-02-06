package com.hyeji.board.repository;

import com.hyeji.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;

    public void save(BoardDTO boardDTO) {
        /* Board: mapper의 namespace를 가르킴.
           save: sql 쿼리문을 담고있는 태그를 의미
           boardDTO: DB에 넘길 파라미터나 변수가 있다면 그 객체나 데이터 */
        sql.insert("Board.save", boardDTO);
    }

    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll"); // selectList: 조회되는 것이 여러 개
    }

    public void updateHits(Long id) {
        sql.update("Board.updateHits", id);
    }

    public BoardDTO findById(Long id) {
        return sql.selectOne("Board.findById", id); // selectOne: 조회되는 것이 1개
    }
}
