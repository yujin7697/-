package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import Domain.Common.Dao.CommentDao;
import Domain.Common.Dao.MemberDao;
import Domain.Common.Dao.MemberDaoImpl;
import Domain.Common.Dto.BoardDto;
import Domain.Common.Dto.CommentDto;
import Domain.Common.Dto.MemberDto;

class DaoTests {

	@Test
	void Test1_MemberDaoTest() throws Exception{
		MemberDao dao = MemberDaoImpl.getInstance(); 
		assertNotNull(dao);
		
		dao.insert(new MemberDto("JWG","1234"));
	}
	@Test
	void Test1_CommentDaoTest() throws Exception {
		CommentDao dao = CommentDao.getInstance();
		assertNotNull(dao);
		
		// 댓글 정보 생성
	    CommentDto commentDto = new CommentDto();
	    commentDto.setNumber(1); // 보드 번호
	    commentDto.setComment("개빡치네");
	    commentDto.setId("JWG");
	    
	    // 보드 정보 생성
	    BoardDto boardDto = new BoardDto();
	    boardDto.setNumber(1); // 보드 번호

	    int result = dao.insert(boardDto, commentDto);
	    assertEquals(1, result); // 삽입된 레코드 수 확인
	}
	@Test
	void Test2_CommentDaoTest() throws Exception {
		CommentDao dao = CommentDao.getInstance();
	    assertNotNull(dao);
	    
	    // 보드 정보 생성
	    BoardDto boardDto = new BoardDto();
	    boardDto.setNumber(1); // 보드 번호
	    
		// 새로운 댓글 생성
	    CommentDto commentDto = new CommentDto();
	    commentDto.setNumber(boardDto.getNumber()); // 보드 번호

	    // 수정할 댓글 정보 설정
	    commentDto.setNo(commentDto.getNo()); // 생성된 댓글 번호
	    commentDto.setId("JWG");
	    commentDto.setComment("수정된 댓글 내용");

	    // 댓글 수정
	    int updateResult = dao.update(commentDto);
	    assertEquals(1, updateResult); // 댓글 수정 결과 확인
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}