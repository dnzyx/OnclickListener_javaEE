package view;


public class activty implements view.onClickListener {
	private button b1;
	public button getB1() {
		return b1;
	}

	public void setB1(button b1) {
		this.b1 = b1;
	}

	public textView getTv1() {
		return tv1;
	}

	public void setTv1(textView tv1) {
		this.tv1 = tv1;
	}

	private textView tv1;
	
	public activty() {
		// TODO Auto-generated constructor stub
		b1=new button();
		tv1= new textView();
		b1.setOnClickListener(this);
		tv1.setOnClickListener(this);
	}

	@Override
	public void onclick(view v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case 1:System.out.println("activy : btn click");
			break;
		case 2: System.out.println("activy : textview click");
			break;
		}
	}
}
