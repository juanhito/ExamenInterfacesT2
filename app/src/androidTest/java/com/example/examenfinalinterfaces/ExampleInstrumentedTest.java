package com.example.examenfinalinterfaces;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;



public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    private Button mloginbutton;


    public ExampleInstrumentedTest() {
        super(LoginActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        LoginActivity actividad = getActivity();
        mloginbutton = actividad.findViewById(R.id.botonLogin);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }


    public void testLoginSignup() {

        TouchUtils.tapView(this, mloginbutton);

    }
}
