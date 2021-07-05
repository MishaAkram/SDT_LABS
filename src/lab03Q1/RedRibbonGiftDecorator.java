package lab03Q1;

public class RedRibbonGiftDecorator extends GiftDecorator{
		public RedRibbonGiftDecorator(Gift decoratedGift) {
			super(decoratedGift);
			}
			@Override
			public void decorate() {
			decoratedGift.decorate();
			redRibbon(decoratedGift);
			}
			private void redRibbon(Gift decoratedGift){
				System.out.println("Ribbon color: RedRibbon");
				}
			}
