package lab03Q1;

public class GreenGiftWrapGiftDecorator extends GiftDecorator {
	public GreenGiftWrapGiftDecorator(Gift decoratedGift) {
		super(decoratedGift);
		}
		@Override
		public void decorate() {
		decoratedGift.decorate();
		greenGiftWrap(decoratedGift);
		}	
		private void greenGiftWrap(Gift decoratedGift){
			System.out.println("Gift wrap color: green wrap");
			}
		}

