package snake_and_ladder;

public class SnakeAndLadderGame {

	public static void main(String[] args) {
		boolean win = false;
		int playerPos = 0;
		int RollCount = 0;
		int snake1 = 12, snake2 = 30, snake3 = 74;
		int ladder1 = 6, ladder2 = 21, ladder3 = 55;
		while (win != true) {
			int player1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			if (playerPos != 100 && playerPos >= 0) {
				RollCount += 1;
				if ((playerPos + player1) <= 100) {
					if (playerPos != snake1 && playerPos != snake2 && playerPos != snake3 && playerPos != ladder1
							&& playerPos != ladder1 && playerPos != ladder2 && playerPos != ladder3) {
						playerPos += player1;
						if (playerPos == snake1 || playerPos == snake2 || playerPos == snake3) {
							playerPos -= player1;
						} else if (playerPos == ladder1 || playerPos == ladder2 || playerPos == ladder3) {
							playerPos += 8;
						}
					}
				}
			} else if (playerPos == 100) {
				win = true;
				break;
			} else {
				playerPos = 0;
			}
			System.out.println(+player1 + " " + playerPos);

		}
		System.out.println("the player won after " + RollCount + " rolls");
	}
}