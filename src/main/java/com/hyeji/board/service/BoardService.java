package com.hyeji.board.service;

import com.hyeji.board.dto.BoardDTO;
import com.hyeji.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }
}
