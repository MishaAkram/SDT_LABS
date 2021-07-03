package lab03Q1;

public class GiftWrapGiftDecorator extends GiftDecorator{
	public GiftWrapGiftDecorator(Gift decoratedGift) {
		super(decoratedGift);
		}
		@Override
		public void decorate() {
		decoratedGift.decorate();
		purpleGiftWrap(decoratedGift);
		greenGiftWrap(decoratedGift);
		}
		private void purpleGiftWrap(Gift decoratedGift){
     		System.out.println("Gift wrap color: purple wrap");
		}
		private void greenGiftWrap(Gift decoratedGift){
			System.out.println("Gift wrap color: green wrap");
			}
		}
