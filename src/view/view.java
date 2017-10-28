package view;

import java.util.ArrayList;

public class view {
	public interface onClickListener{
		public void  onclick(view v);
	}
	private ArrayList<onClickListener> listener;
	
	public view() {
		// TODO Auto-generated constructor stub
		listener = new ArrayList<view.onClickListener>();
	}
	public void setOnClickListener(onClickListener l){
		listener.add(l);
	}
	public void click()
	{
		for(int i=0;i<listener.size();i++)
		{
			listener.get(i).onclick(this);
		}
	}
	public int getId()
	{
		return 0;
	}
}
