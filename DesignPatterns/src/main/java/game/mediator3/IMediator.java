package game.mediator3;

/**
 * Created by nori on 2014. 6. 25..
 */
public interface IMediator {
    public void book();
    public void view();
    public void search();
    public void registerView(BtnView v);
    public void registerSearch(BtnSearch s);
    public void registerBook(BtnBook b);
    public void registerDisplay(LblDisplay d);
}
