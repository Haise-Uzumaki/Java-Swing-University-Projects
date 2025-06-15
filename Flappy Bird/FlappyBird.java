import java.awt.*;
import javax.swing.*;



public class FlappyBird extends JPanel{
    int boardWidth = 360;
    int boardHeight = 640;

    //IMAGES TO USE
    Image backgroundImg;
    Image birdImg;
    Image topPipImage;
    Image botttomPipeImg;

    //Bird Installation
    int birdX = boardWidth/8;
    int birdY = boardHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image image;

        public Bird(Image imgage) {
            this.image = image;
        }

        

    }

    Bird bird;


    FlappyBird() {

        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.blue);

        //Loading The Images
        backgroundImg = new ImageIcon(getClass().getResource("flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("flappybird.png")).getImage();
        topPipImage = new ImageIcon(getClass().getResource("toppipe.png")).getImage();
        botttomPipeImg = new ImageIcon(getClass().getResource("bottompipe.png")).getImage();

        bird =new Bird(birdImg);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        g.drawImage(backgroundImg, 0, 0 , boardWidth, boardHeight, null);

        g.drawImage(birdImg, birdX, birdY, birdWidth, birdHeight,null);
    }

        
}
