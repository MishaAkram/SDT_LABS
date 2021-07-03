package lab03Q1;

public class RibbonGiftDecorator extends GiftDecorator{

	public RibbonGiftDecorator(Gift decoratedGift) {
		super(decoratedGift);
		}
		@Override
		public void decorate() {
		decoratedGift.decorate();
		blueRibbon(decoratedGift);
		redRibbon(decoratedGift);
		}
		private void blueRibbon(Gift decoratedGift){
     		System.out.println("Ribbon color: BlueRibbon");
		}
		private void redRibbon(Gift decoratedGift){
			System.out.println("Ribbon color: RedRibbon");
			}
		}
