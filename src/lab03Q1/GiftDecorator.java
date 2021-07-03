package lab03Q1;

public abstract class GiftDecorator implements Gift {
	protected Gift decoratedGift;
	public GiftDecorator(Gift decoratedGift){
	this.decoratedGift = decoratedGift;
	}
	public void decorate(){
	decoratedGift.decorate();

}
}