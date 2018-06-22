package fasada;

public class App {

        public static void main(String[] args) {
              //tworzymy obiekt game, bo to nasza fasada
            Game game = new Game();

            // Game loop
            while(true) {
                game.update();
            }
        }
    }





