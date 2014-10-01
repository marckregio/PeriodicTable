package groupProject.periodictable;
//This Application is for STI College Novaliches
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends DeclarationClass{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
    	inflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
    	popup = inflater.inflate(R.layout.popup, null);
    	window = new PopupWindow(popup,450,400);
    	window.setFocusable(false);
    	window.setAnimationStyle(R.style.PopupAnimation);
    	hydrogenButton = (Button) findViewById(R.id.hydrogen);
    	closePopup = (Button) popup.findViewById(R.id.closepopup);
   
    	listener();
    }
    public void listener(){
    	hydrogenButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				closePopup.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						window.dismiss();
					}
				});
				window.showAtLocation(hydrogenButton, Gravity.CENTER, 0, 0);
			}
    	});
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
