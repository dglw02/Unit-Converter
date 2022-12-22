package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class volume_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "CubicMeter";
    String toUnit = "CubicMillimeter";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Liter",
            "CubicMeter",
            "Milliliter",
            "CubicMillimeter",
            "CubicFoot", "CubicInch"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_cal);

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
                            et_toUnit.setText(cubicMeterToCubicMillimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(cubicMeterToMilliliter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(cubicMeterToLiter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(cubicMeterToCubicFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(cubicMeterToCubicInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(cubicMillimeterToCubicMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(cubicMillimeterToMilliliter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(cubicMillimeterToLiter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(cubicMillimeterToCubicFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(cubicMillimeterToCubicInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(milliliterToCubicMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(milliliterToCubicMillimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(milliliterToLiter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(milliliterToCubicFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(milliliterToCubicInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(literToCubicMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(literToCubicMillimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(literToMilliliter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(literToCubicFoot(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(literToCubicInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(cubicFootToCubicMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(cubicFootToCubicMillimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(cubicFootToMilliliter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(cubicFootToLiter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(cubicFootToCubicInch(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(cubicInchToCubicMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(cubicInchToCubicMillimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(cubicInchToMilliliter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(cubicInchToLiter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(cubicInchToFoot(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(volume_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Liter",
                        "CubicMeter",
                        "Milliliter",
                        "CubicMillimeter",
                        "CubicFoot", "CubicInch"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(volume_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Liter",
                        "CubicMeter",
                        "Milliliter",
                        "CubicMillimeter",
                        "CubicFoot", "CubicInch"
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

    //cubicMeter v
    private String cubicMeterToMilliliter(double cubicMeter) {
        double milliliter = cubicMeter * 1e+6;
        return String.valueOf(milliliter);
    }

    private String cubicMeterToLiter(double cubicMeter) {
        double liter = cubicMeter * 1000;
        return String.valueOf(liter);
    }

    private String cubicMeterToCubicFoot(double cubicMeter) {
        double cubicFoot = cubicMeter * 35.315;
        return String.valueOf(cubicFoot);
    }

    private String cubicMeterToCubicInch(double cubicMeter) {
        double cubicInch = cubicMeter * 61020;
        return String.valueOf(cubicInch);
    }

    private String cubicMeterToCubicMillimeter(double cubicMeter) {
        double cubicMillimeter = cubicMeter * 1e+9;
        return String.valueOf(cubicMillimeter);
    }

    //cubicMillimeter v
    private String cubicMillimeterToMilliliter(double cubicMillimeter) {
        double milliliter = cubicMillimeter*1000;
        return String.valueOf(milliliter);
    }

    private String cubicMillimeterToLiter(double cubicMillimeter) {
        double liter = cubicMillimeter / 1e+6;
        return String.valueOf(liter);
    }

    private String cubicMillimeterToCubicFoot(double cubicMillimeter) {
        double cubicFoot = cubicMillimeter / 2.832;
        return String.valueOf(cubicFoot);
    }

    private String cubicMillimeterToCubicInch(double cubicMillimeter) {
        double cubicInch =cubicMillimeter / 16390;
        return String.valueOf(cubicInch);
    }

    private String cubicMillimeterToCubicMeter(double cubicMillimeter) {
        double cubicMeter = cubicMillimeter / 1e+9;
        return String.valueOf(cubicMeter);
    }

    //milliliter v
    private String milliliterToLiter(double milliliter) {
        double liter = milliliter / 1000;
        return String.valueOf(liter);
    }

    private String milliliterToCubicFoot(double milliliter) {
        double cubicFoot = milliliter / 28320;
        return String.valueOf(cubicFoot);
    }

    private String milliliterToCubicInch(double milliliter) {
        double cubicInch = milliliter / 16.387;
        return String.valueOf(cubicInch);
    }

    private String milliliterToCubicMeter(double milliliter) {
        double cubicMeter = milliliter / 1e+6;
        return String.valueOf(cubicMeter);
    }

    private String milliliterToCubicMillimeter(double milliliter) {
        double cubicMillimeter = milliliter * 1000;
        return String.valueOf(cubicMillimeter);
    }

    //liter v
    private String literToCubicFoot(double liter) {
        double cubicFoot = liter / 28.317;
        return String.valueOf(cubicFoot);
    }

    private String literToCubicInch(double liter) {
        double cubicInch = liter *  61.024;
        return String.valueOf(cubicInch);
    }

    private String literToCubicMeter(double liter) {
        double cubicMeter = liter/ 1000;
        return String.valueOf(cubicMeter);
    }

    private String literToCubicMillimeter(double liter) {
        double cubicMillimeter = liter * 1e+6;
        return String.valueOf(cubicMillimeter);
    }

    private String literToMilliliter(double liter) {
        double milliliter = liter * 1000;
        return String.valueOf(milliliter);
    }

    //cubicFoot v
    private String cubicFootToCubicInch(double cubicFoot) {
        double cubicInch = cubicFoot * 1728;
        return String.valueOf(cubicInch);
    }

    private String cubicFootToCubicMeter(double cubicFoot) {
        double cubicMeter = cubicFoot / 35.315;
        return String.valueOf(cubicMeter);
    }

    private String cubicFootToCubicMillimeter(double cubicFoot) {
        double cubicMillimeter = cubicFoot *  2.832;
        return String.valueOf(cubicMillimeter);
    }

    private String cubicFootToMilliliter(double cubicFoot) {
        double milliliter = cubicFoot * 28320;
        return String.valueOf(milliliter);
    }

    private String cubicFootToLiter(double cubicFoot) {
        double liter = cubicFoot * 28.317;
        return String.valueOf(liter);
    }

    //cubicInch v
    private String cubicInchToCubicMeter(double cubicInch) {
        double cubicMeter = cubicInch / 61020;
        return String.valueOf(cubicMeter);
    }

    private String cubicInchToCubicMillimeter(double cubicInch) {
        double cubicMillimeter = cubicInch/1e+12;
        return String.valueOf(cubicMillimeter);
    }

    private String cubicInchToMilliliter(double cubicInch) {
        double milliliter = cubicInch * 16390;
        return String.valueOf(milliliter);
    }

    private String cubicInchToLiter(double cubicInch) {
        double liter = cubicInch / 61.024;
        return String.valueOf(liter);
    }

    private String cubicInchToFoot(double cubicInch) {
        double cubicFoot = cubicInch / 1728;
        return String.valueOf(cubicFoot);
    }

}