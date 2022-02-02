package day19;

import java.util.logging.Logger;

// since ItemClickListener is inner interface, this class implement it using Adapter.ItemClickListener
public class CustomInterfacePractice implements Adapter.ItemClickListener {
    public static void main(String[] args) {

        Adapter adapter= new Adapter(new CustomInterfacePractice());// we have to pass object of interface(ItemClickListener) here
                         //so we create object of CustomInterfacePractice coz it ISA ItemClickListener

        adapter.OnButtonClicked();
    }


    @Override
    public void onItemClicked(int position) {
        Logger.getGlobal().info("On item Clicked "+ position);

    }
}
