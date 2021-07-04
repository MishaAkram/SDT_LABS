package lab03Q1;

public class BlueRibbonGiftDecorator extends GiftDecorator{

	public BlueRibbonGiftDecorator(Gift decoratedGift) {
		super(decoratedGift);
		}
		@Override
		public void decorate() {
		decoratedGift.decorate();
		blueRibbon(decoratedGift);
		}
		private void blueRibbon(Gift decoratedGift){
     		System.out.println("Ribbon color: BlueRibbon");
		}
	
		}
