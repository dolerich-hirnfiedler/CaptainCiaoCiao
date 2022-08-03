package captainciaociao.kapitel_02.schleifen.aufgabe_2_5_11;

public class ChessboardMain {
    public static void main(String[] args) {
        Chessboard board = new Chessboard(ChessboardInput.getInt(), ChessboardInput.getInt());
        board.printToConsole();
    }
}
