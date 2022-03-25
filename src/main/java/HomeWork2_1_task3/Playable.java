package HomeWork2_1_task3;

public interface Playable {

   void run(Track track);
   void jump(Wall wall);
   void swim(Pool pool);
   boolean checkWin(boolean win);
}
