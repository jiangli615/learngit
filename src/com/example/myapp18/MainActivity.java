package com.example.myapp18;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity
{

	private EditText tvUserName = null;
	private EditText tvPassword = null;
	private Button btnLogin = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvUserName = (EditText) super.findViewById(R.id.userName);
		tvPassword = (EditText) super.findViewById(R.id.passWord);
		btnLogin = (Button) super.findViewById(R.id.login);

		// 为按钮注册监听事件
		btnLogin.setOnClickListener(new LoginOnClickListener());
	}

	private class LoginOnClickListener implements OnClickListener
	{

		@Override
		public void onClick(View v)
		{
			// TODO Auto-generated method stub
//test test 
			String username = tvUserName.getText().toString();
			String password = tvPassword.getText().toString();
			String info = "用户名：" + username + "☆☆☆密码：" + password;
			Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT)
					.show();

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
