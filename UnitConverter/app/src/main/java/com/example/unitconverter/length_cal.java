package com.example.unitconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class length_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Meter";
    String toUnit = "Kilometer";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Meter",
            "Kilometer",
            "Centimeter",
            "Inch",
            "Feet",
            "Mile"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(meterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(meterToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(meterToInch(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(meterToFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(meterToMile(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kilometerToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilometerToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilometerToInch(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilometerToFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilometerToMile(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(centimeterToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(centimeterToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(centimeterToInch(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(centimeterToFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(centimeterToMile(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(inchToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(inchToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(inchToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(inchToFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(inchToMile(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(feetToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(feetToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(feetToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(feetToInch(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(feetToMile(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(mileToMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(mileToKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(mileToCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(mileToInch(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(mileToFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(length_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Meter",
                        "Kilometer",
                        "Centimeter",
                        "Inch",
                        "Feet", "Mile"
                };

                builder.setSingleChoiceItems(
                        flowers,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(length_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Meter",
                        "Kilometer",
                        "Centimeter",
                        "Inch",
                        "Feet", "Mile"
                };

                builder.setSingleChoiceItems(
                        flowers,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();


                dialog.show();

            }
        });

    }

    //meter v
    private String meterToCentimeter(double meter) {
        double centimeter = meter * 100;
        return String.valueOf(centimeter);
    }

    private String meterToInch(double meter) {
        double inch = meter * 39.37;
        return String.valueOf(inch);
    }

    private String meterToFeet(double meter) {
        double feet = meter * 3.281;
        return String.valueOf(feet);
    }

    private String meterToMile(double meter) {
        double mile = meter / 1609;
        return String.valueOf(mile);
    }

    private String meterToKilometer(double meter) {
        double kilometer = meter / 1000;
        return String.valueOf(kilometer);
    }

    //kilometer v
    private String kilometerToCentimeter(double kilometer) {
        double centimeter = kilometer * 100000;
        return String.valueOf(centimeter);
    }

    private String kilometerToInch(double kilometer) {
        double inch = kilometer * 39370;
        return String.valueOf(inch);
    }

    private String kilometerToFeet(double kilometer) {
        double feet = kilometer * 3281;
        return String.valueOf(feet);
    }

    private String kilometerToMile(double kilometer) {
        double mile = kilometer / 1.609;
        return String.valueOf(mile);
    }

    private String kilometerToMeter(double kilometer) {
        double meter = kilometer * 1000;
        return String.valueOf(meter);
    }

    //centimeter v
    private String centimeterToInch(double centimeter) {
        double inch = centimeter / 2.54;
        return String.valueOf(inch);
    }

    private String centimeterToFeet(double centimeter) {
        double feet = centimeter / 30.48;
        return String.valueOf(feet);
    }

    private String centimeterToMile(double centimeter) {
        double mile = centimeter / 160900;
        return String.valueOf(mile);
    }

    private String centimeterToMeter(double centimeter) {
        double meter = centimeter / 100;
        return String.valueOf(meter);
    }

    private String centimeterToKilometer(double centimeter) {
        double kilometer = centimeter / 100000;
        return String.valueOf(kilometer);
    }

    //inch v
    private String inchToFeet(double inch) {
        double feet = inch / 12;
        return String.valueOf(feet);
    }

    private String inchToMile(double inch) {
        double mile = inch / 63360;
        return String.valueOf(mile);
    }

    private String inchToMeter(double inch) {
        double meter = inch / 39.37;
        return String.valueOf(meter);
    }

    private String inchToKilometer(double inch) {
        double kilometer = inch / 39370;
        return String.valueOf(kilometer);
    }

    private String inchToCentimeter(double inch) {
        double centimeter = inch * 2.54;
        return String.valueOf(centimeter);
    }

    //feet v
    private String feetToMile(double feet) {
        double mile = feet / 5280;
        return String.valueOf(mile);
    }

    private String feetToMeter(double feet) {
        double meter = feet / 3.281;
        return String.valueOf(meter);
    }

    private String feetToKilometer(double feet) {
        double kilometer = feet / 3281;
        return String.valueOf(kilometer);
    }

    private String feetToCentimeter(double feet) {
        double centimeter = feet * 30.48;
        return String.valueOf(centimeter);
    }

    private String feetToInch(double feet) {
        double inch = feet * 12;
        return String.valueOf(inch);
    }

    //mile v
    private String mileToMeter(double mile) {
        double meter = mile * 1609;
        return String.valueOf(meter);
    }

    private String mileToKilometer(double mile) {
        double kilometer = mile * 1.609;
        return String.valueOf(kilometer);
    }

    private String mileToCentimeter(double mile) {
        double centimeter = mile * 160900;
        return String.valueOf(centimeter);
    }

    private String mileToInch(double mile) {
        double inch = mile * 63360;
        return String.valueOf(inch);
    }

    private String mileToFeet(double mile) {
        double feet = mile * 5280;
        return String.valueOf(feet);
    }

}