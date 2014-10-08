Code Editing Procedure
1. Button Layout in activity_main.xml file
//Adding a Button
	<Button
        android:id="@+id/potassium"
        android:layout_width="42dp"
        android:layout_height="33dp"
        android:layout_marginTop="99dp"
        android:layout_marginLeft="3dp"
        android:text="" />
- change line
  * android:id="@+id/ [name of element in lowercase]
- change location using marginTop & marginLeft
  * android:layout_marginTop="[desirednumber]dp"
  * android:layout_marginLeft="[desirednumber]dp"

2. Declare Button in JAVA in DeclarationClass.java
// Edit line
   public Button hydrogenButton, lithiumButton, sodiumButton, potassiumButton, rubidiumButton, caesiumButton, franciumButton,
		berylliumButton, magnesiumButton, calciumButton, strontiumButton, bariumButton, radiumButton, scandiumButton, yttriumButton,
		lanthanumButton;
- supply element name with "Button" as suffix

3. Instantiate Button in JAVA in MainActivity.java
// inside init() method
   potassiumButton = (Button) findViewById(R.id.potassium);
- edit instantiation with corresponding element name and button name
  * [buttonDeclaration] = (Button) findViewById(R.id.[buttonName]);

4. Add Element Name and Properties in ElementProperties.java
// add element properties
  * String [elementName - Uppercase first letter] = "[ElementName]"
  * String [elementDescription] = "Description"
  
5. Bind Button Event Listener in JAVA in MainActivity.java
// inside listener() button
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
 - change athenaButton to [ButtonDeclaration]
 - edit line
   * elementName.setText([ElementName in ElementProperties.java])
   * elementDesc.setText([ElementDescription in ElementProperties.java]);
   