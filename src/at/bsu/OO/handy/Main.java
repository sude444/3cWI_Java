package at.bsu.OO.handy;

public class Main {
    SimCard simCard = new SimCard(1, "+43 660 4444444");
    Camera camera = new Camera(Camera.RESOLUTION.High);
    MemoryCard memoryCard = new MemoryCard(44);
    Handy handy = new Handy(simCard, camera, memoryCard);



}
