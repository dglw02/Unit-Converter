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

public class weight_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Kilogram";
    String toUnit = "Kilogram";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Kilogram",
            "Gram",
            "MilliGram",
            "Gram",
            "Tonne", "Giga Gram"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_cal);

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
                            et_toUnit.setText(kilogramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilogramToMilliGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilogramToGGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilogramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilogramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gramToMilliGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gramToGGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(milliGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(milliGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(milliGramToGGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(milliGramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(milliGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gGramToMilliGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gGramToTonne(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tonneToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tonneToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tonneToMilliGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tonneToGGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tonneToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gigaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gigaGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gigaGramToMilliGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gigaGramToGGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gigaGramToTonne(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "MilliGram",
                        "Gram",
                        "Tonne", "Giga Gram"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "MilliGram",
                        "Gram",
                        "Tonne", "Giga Gram"
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

    //Kilogram v
    private String kilogramToGram(double kilogram) {
        double gram = kilogram * 1000;
        return String.valueOf(gram);
    }

    private String kilogramToMilliGram(double kilogram) {
        double milliGram = kilogram * 1E+6;
        return String.valueOf(milliGram);
    }

    private String kilogramToGGram(double kilogram) {
        double gGram = kilogram * 1000;
        return String.valueOf(gGram);
    }

    private String kilogramToTonne(double kilogram) {
        double tonne = kilogram / 1000;
        return String.valueOf(tonne);
    }

    private String kilogramToGigaGram(double kilogram) {
        double gigaGram = kilogram / 1000000;
        return String.valueOf(gigaGram);
    }

    //Gram v
    private String gramToMilliGram(double gram) {
        double milliGram = gram * 1000;
        return String.valueOf(milliGram);
    }

    private String gramToGGram(double gram) {
        double gGram = gram * 1;
        return String.valueOf(gGram);
    }

    private String gramToTonne(double gram) {
        double tonne = gram / 1E+6;
        return String.valueOf(tonne);
    }

    private String gramToGigaGram(double gram) {
        double gigaGram = gram / 1E+9;
        return String.valueOf(gigaGram);
    }

    private String gramToKiloGram(double gram) {
        double kiloGram = gram * 0.001;
        return String.valueOf(kiloGram);
    }

    //milli Gram v
    private String milliGramToGGram(double milliGram) {
        double gGram = milliGram / 1000;
        return String.valueOf(gGram);
    }

    private String milliGramToTonne(double milliGram) {
        double tonne = milliGram / 1e+9;
        return String.valueOf(tonne);
    }

    private String milliGramToGigaGram(double milliGram) {
        double gigaGram = milliGram / 1e+12;
        return String.valueOf(gigaGram);
    }

    private String milliGramToKiloGram(double milliGram) {
        double kiloGram = milliGram / 1e+6;
        return String.valueOf(kiloGram);
    }

    private String milliGramToGram(double milliGram) {
        double gram = milliGram * 0.001;
        return String.valueOf(gram);
    }

    //Gram v
    private String gGramToTonne(double gGram) {
        double tonne = gGram / 1E+6;
        return String.valueOf(tonne);
    }

    private String gGramToGigaGram(double gGram) {
        double gigaGram = gGram / 1E+9;
        return String.valueOf(gigaGram);
    }

    private String gGramToKiloGram(double gGram) {
        double kiloGram = gGram * 0.001;
        return String.valueOf(kiloGram);
    }

    private String gGramToGram(double gGram) {
        double Gram = gGram * 1;
        return String.valueOf(Gram);
    }

    private String gGramToMilliGram(double gGram) {
        double milliGram = gGram * 1000;
        return String.valueOf(milliGram);
    }

    //Tonne V
    private String tonneToGigaGram(double tonne) {
        double gigaGram = tonne / 1000;
        return String.valueOf(gigaGram);
    }

    private String tonneToKiloGram(double tonne) {
        double kiloGram = tonne * 1000;
        return String.valueOf(kiloGram);
    }

    private String tonneToGram(double tonne) {
        double Gram = tonne * 1e+6;
        return String.valueOf(Gram);
    }

    private String tonneToMilliGram(double tonne) {
        double milliGram = tonne * 1e+9;
        return String.valueOf(milliGram);
    }

    private String tonneToGGram(double tonne) {
        double gGram = tonne * 1E+6;
        return String.valueOf(gGram);
    }

    //Giga Gramv
    private String gigaGramToKiloGram(double gigaGram) {
        double kiloGram = gigaGram * 1e+6;
        return String.valueOf(kiloGram);
    }

    private String gigaGramToGram(double gigaGram) {
        double Gram = gigaGram * 1e+9;
        return String.valueOf(Gram);
    }

    private String gigaGramToMilliGram(double gigaGram) {
        double milliGram = gigaGram * 1e+12;
        return String.valueOf(milliGram);
    }

    private String gigaGramToGGram(double gigaGram) {
        double gGram = gigaGram / 1e+9;
        return String.valueOf(gGram);
    }

    private String gigaGramToTonne(double gigaGram) {
        double tonne = gigaGram * 1000;
        return String.valueOf(tonne);
    }

}