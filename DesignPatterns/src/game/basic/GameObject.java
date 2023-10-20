package game.basic;

import org.newdawn.slick.Graphics;

public interface GameObject {
    //void Init();
    void Update(float delta);
    void Render(Graphics graphics);
}
