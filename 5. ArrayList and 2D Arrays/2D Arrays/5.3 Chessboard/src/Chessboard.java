public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];
      for(int i = 0; i < 8; i++){
         for(int j = 0; j < 8; j++){
            if ((i + j) % 2 == 0){
               chessboard[i][j] = '\u25A1';
            } else{
               chessboard[i][j] = '\u25A0';
            }
         }
      }
      for(int i = 0; i < 8; i++){
         for(int j = 0; j < 8; j++){
            System.out.print(chessboard[i][j]);
         }
         System.out.println();
      }
   }
}