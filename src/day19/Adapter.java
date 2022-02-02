package day19;

import java.util.logging.Logger;

public class Adapter {
public ItemClickListener itemClickListener;

    public Adapter(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
    public void OnButtonClicked(){
        Logger.getGlobal().info("On button Clicked");
        this.itemClickListener.onItemClicked(5);
    }

    interface ItemClickListener{
        void onItemClicked(int position);
    }
}
