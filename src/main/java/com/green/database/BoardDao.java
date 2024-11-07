package com.green.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Data Access Object (DB 작업하는 객체)
public class BoardDao {

    public int insBoard(Board board) {
        int result = 0;
        String sql = " INSERT INTO board " +
                " SET title = ? " +
                "  , contents = ? " +
                "  , writer = ?  ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            //?부분에 값 채우기
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());

            result = ps.executeUpdate(); //쿼리 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int delBoard(int boardId) {
        int result = 0;
        String sql = " DELETE from board WHERE board_id = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardId);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int updateBoard(int boardId, Board board) {
        int result = 0;
        String sql = "UPDATE board SET title = ?, contents = ?, writer = ? WHERE boardId = ?";

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {

            // 업데이트할 값들 설정
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            ps.setInt(4, boardId); // 조건에 사용할 boardId 바인딩

            result = ps.executeUpdate(); // 업데이트된 행 수 반환
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
