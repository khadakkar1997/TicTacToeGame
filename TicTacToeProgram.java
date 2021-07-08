package TictacToeGame;



public class TicTacToeGame {
	
	
	
        public static  char[] CreateEmptyBoard ()
        {
            char[] board = new char[10];
            for(int i=1; i < 10 ; i++)
            {
                board[i] = ' ';
            }
             return board;
        }
        
        
        
               static void main(String[] args)
               {
                
                   
                   char[] board = CreateEmptyBoard();
            
               }

}
