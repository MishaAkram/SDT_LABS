package lab03Q1;

public class PurpleGiftWrapGiftDecorator extends GiftDecorator{
	public PurpleGiftWrapGiftDecorator(Gift decoratedGift) {
		super(decoratedGift);
		}
		@Override
		public void decorate() {
		decoratedGift.decorate();
		purpleGiftWrap(decoratedGift);
		}
		private void purpleGiftWrap(Gift decoratedGift){
     		System.out.println("Gift wrap color: purple wrap");
		}
		}
