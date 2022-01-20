package Day_40_FinalKeyword;

import Day_39_Recap.ShapeTask.Circle;
import Day_39_Recap.ShapeTask.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
