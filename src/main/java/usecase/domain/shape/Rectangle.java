package usecase.domain.shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: rectangle");
    }
}