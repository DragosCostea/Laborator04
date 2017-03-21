package ro.pub.cs.systems.eim.lab03.samples.gridlayoutsamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import ro.pub.cs.systems.eim.lab03.samples.gridlayoutsamples.R;

public class GridLayoutSamplesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_layout_samples);
		TextView monday_09to11_textView = (TextView)findViewById(R.id.monday_09to11_textView);
		monday_09to11_textView.setText(monday_09to11_textView.getText().toString()+"\n"+
				getResources().getString(R.string.series_C1)+"\n"+
				getResources().getString(R.string.dragos_niculescu)+"\n"+
				getResources().getString(R.string.ec105));
		TextView monday_12to14_textView = (TextView)findViewById(R.id.monday_12to14_textView);
		monday_12to14_textView.setText(monday_12to14_textView.getText().toString()+"\n"+
				getResources().getString(R.string.group_343C1b)+"\n"+
				getResources().getString(R.string.radu_stoenescu)+"\n"+
				getResources().getString(R.string.eg106));
		TextView monday_14to16_textView = (TextView)findViewById(R.id.monday_14to16_textView);
		monday_14to16_textView.setText(monday_14to16_textView.getText().toString()+"\n"+
				getResources().getString(R.string.group_343C1a)+"\n"+
				getResources().getString(R.string.radu_stoenescu)+"\n"+
				getResources().getString(R.string.eg106));
		TextView tuesday_08to10_textView = (TextView)findViewById(R.id.tuesday_08to10_textView);
		tuesday_08to10_textView.setText(tuesday_08to10_textView.getText().toString()+"\n"+
				getResources().getString(R.string.group_342C1a)+"\n"+
				getResources().getString(R.string.dragos_niculescu)+"\n"+
				getResources().getString(R.string.eg106));
		TextView tuesday_10to12_textView = (TextView)findViewById(R.id.tuesday_10to12_textView);
		tuesday_10to12_textView.setText(tuesday_10to12_textView.getText().toString()+"\n"+
				getResources().getString(R.string.group_342C1b)+"\n"+
				getResources().getString(R.string.dragos_niculescu)+"\n"+
				getResources().getString(R.string.eg106));
		TextView tuesday_12to14_textView = (TextView)findViewById(R.id.tuesday_12to14_textView);
		tuesday_12to14_textView.setText(tuesday_12to14_textView.getText().toString()+"\n"+
				getResources().getString(R.string.elective2)+"\n"+
				getResources().getString(R.string.dragos_niculescu)+"\n"+
				getResources().getString(R.string.eg106));
		TextView friday_10to12_textView = (TextView)findViewById(R.id.friday_10to12_textView);
		friday_10to12_textView.setText(friday_10to12_textView.getText().toString()+"\n"+
				getResources().getString(R.string.group_341C1a)+"\n"+
				getResources().getString(R.string.andrei_rosu_cojocaru)+"\n"+
				getResources().getString(R.string.eg106));
		TextView friday_12to14_textView = (TextView)findViewById(R.id.friday_12to14_textView);
		friday_12to14_textView.setText(friday_12to14_textView.getText().toString()+"\n"+
				getResources().getString(R.string.elective1)+"\n"+
				getResources().getString(R.string.andrei_rosu_cojocaru)+"\n"+
				getResources().getString(R.string.eg106));
		TextView friday_14to16_textView = (TextView)findViewById(R.id.friday_14to16_textView);
		friday_14to16_textView.setText(friday_14to16_textView.getText().toString()+"\n"+
				getResources().getString(R.string.group_341C1b)+"\n"+
				getResources().getString(R.string.andrei_rosu_cojocaru)+"\n"+
				getResources().getString(R.string.eg106));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.grid_layout_samples, menu);
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
