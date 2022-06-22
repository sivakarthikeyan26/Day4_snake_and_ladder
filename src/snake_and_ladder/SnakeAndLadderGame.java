package snake_and_ladder;

public class SnakeAndLadderGame {

	public static void main(String[] args) {
		boolean win = false;
		boolean win1 = false;
		int playerPos = 0;
		int playerPos1 = 0;
		int RollCount = 0;
		int RollCount1 = 0;
		boolean chance = true;
		boolean temp=true;
		int snake1 = 12, snake2 = 30, snake3 = 74;
		int ladder1 = 6, ladder2 = 21, ladder3 = 55;
		System.out.print("player1 roll");
		System.out.print("\tplayer1 position");
		System.out.print("\tplayer2 roll");
		System.out.print("\tplayer2 position");
		System.out.println("\n");
		while (win != true && win1 != true) {
			int player1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			if (playerPos != 100 && playerPos >= 0 && playerPos1 != 100 && playerPos1 >= 0) {
				if (chance == true) {
					RollCount += 1;
					temp=true;
					chance = false;
					if ((playerPos + player1) <= 100) {
						playerPos += player1;
						if (playerPos == snake1 || playerPos == snake2 || playerPos == snake3) {
							playerPos -= player1;
						} else if (playerPos == ladder1 || playerPos == ladder2 || playerPos == ladder3) {
							chance = true;
						}
					}
				} else {
					temp=false;
					RollCount1 += 1;
					chance = true;
					if ((playerPos1 + player1) <= 100) {
						playerPos1 += player1;
						if (playerPos1 == snake1 || playerPos1 == snake2 || playerPos1 == snake3) {
							playerPos1 -= player1;
						} else if (playerPos1 == ladder1 || playerPos1 == ladder2 || playerPos1 == ladder3) {
							chance = false;
						}

					}
				}

			} else if (playerPos == 100) {
				win = true;
				break;
			} else if (playerPos1 == 100) {
				win1 = true;
				break;
			}
			if (temp==true) {
				System.out.print(+player1 + "\t\t\t" + playerPos);
				System.out.print("\t\t\t");
				System.out.print("0" + "\t\t" + playerPos1);
				System.out.println("\n");
			}
			else {
				System.out.print("0" + "\t\t\t" + playerPos);
				System.out.print("\t\t\t");
				System.out.print(+player1 + "\t\t" + playerPos1);
				System.out.println("\n");
			}

		}
		if (win == true) {
			System.out.println("the player1 won after " + RollCount + " rolls");
		} else {
			System.out.println("the player2 won after " + RollCount1 + " rolls");
		}

	}
}