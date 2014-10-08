package groupProject.periodictable;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends DeclarationClass implements ElementProperties{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
    	//POPUP (wag iedit)
    	inflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
    	popup = inflater.inflate(R.layout.popup, null);
    	window = new PopupWindow(popup,700,580);
    	window.setFocusable(false);
    	window.setAnimationStyle(R.style.PopupAnimation);
    	//TextViews (wag iedit)
    	elementName = (TextView) popup.findViewById(R.id.elementName);
    	elementDesc = (TextView) popup.findViewById(R.id.elementDescription);
    	//BUTTONS (pwedeng iedit)
    	hydrogenButton = (Button) findViewById(R.id.hydrogen);
    	lithiumButton = (Button) findViewById(R.id.lithium);
    	sodiumButton = (Button) findViewById(R.id.sodium);
    	potassiumButton = (Button) findViewById(R.id.potassium);
    	//////
    	athenaButton = (Button) findViewById(R.id.athena);
    	//(wag iedit)
    	closePopup = (Button) popup.findViewById(R.id.closepopup);
   
    	listener();
    }
    public void listener(){
    	athenaButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				elementName.setText("Athena");
				elementDesc.setText("HAHAHAHA");
				closePopup.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						window.dismiss();
					}
				});
				window.showAtLocation(athenaButton, Gravity.CENTER, 0, 0);
			}
    	});
    	hydrogenButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				elementName.setText(Hydrogen);
				elementDesc.setText(Hydrogen_Desc);
				closePopup.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						window.dismiss();
					}
				});
				window.showAtLocation(hydrogenButton, Gravity.CENTER, 0, 0);
			}
    	});
    	lithiumButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				elementName.setText(Lithium);
				elementDesc.setText(Lithium_Desc);
				closePopup.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						window.dismiss();
					}
				});
				window.showAtLocation(lithiumButton, Gravity.CENTER, 0, 0);
			}
    	});
    	sodiumButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				elementName.setText(Sodium);
				elementDesc.setText(Sodium_Desc);
				closePopup.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						window.dismiss();
					}
				});
				window.showAtLocation(sodiumButton, Gravity.CENTER, 0, 0);
			}
    	});
    	potassiumButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				elementName.setText(Potassium);
				elementDesc.setText(Potassium_Desc);
				closePopup.setOnClickListener(new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						window.dismiss();
					}
				});
				window.showAtLocation(potassiumButton, Gravity.CENTER, 0, 0);
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
