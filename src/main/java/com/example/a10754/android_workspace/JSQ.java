package com.example.a10754.android_workspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.*;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class JSQ extends AppCompatActivity implements View.OnClickListener {
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    private Button jia, jian, cheng, chu, sin, cos, tan, kaifang, jiecheng;
    private Button C, CE, delete, deng, dian;
    private TextView input, output;
    private StringBuilder jisuanshulie = new StringBuilder();     //为了能够在界面显示，string不能在界面显示

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsq);
        getButton();
    }

    /**
     * 按钮，输出框的初始化
     * TODO 添加新按钮时
     */
    private void getButton() {
        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        num0 = (Button) findViewById(R.id.num0);
        jia = (Button) findViewById(R.id.jia);
        jian = (Button) findViewById(R.id.jian);
        cheng = (Button) findViewById(R.id.cheng);
        chu = (Button) findViewById(R.id.chu);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        C = (Button) findViewById(R.id.C);
        CE = (Button) findViewById(R.id.CE);
        deng = (Button) findViewById(R.id.deng);
        dian = (Button) findViewById(R.id.dian);
        delete = (Button) findViewById(R.id.delete);
        kaifang = (Button) findViewById(R.id.kaifang);
        jiecheng = (Button) findViewById(R.id.jiecheng);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num0.setOnClickListener(this);
        C.setOnClickListener(this);
        CE.setOnClickListener(this);
        delete.setOnClickListener(this);
        jia.setOnClickListener(this);
        jian.setOnClickListener(this);
        cheng.setOnClickListener(this);
        chu.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        dian.setOnClickListener(this);
        deng.setOnClickListener(this);
        kaifang.setOnClickListener(this);
        jiecheng.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num1:
                jisuanshulie = jisuanshulie.append("1");
                input.setText(jisuanshulie);
                break;
            case R.id.num2://222225552
                jisuanshulie.append("2");
                input.setText(jisuanshulie);
                break;
            case R.id.num3:
                jisuanshulie.append("3");
                input.setText(jisuanshulie);
                break;
            case R.id.num4:
                jisuanshulie.append("4");
                input.setText(jisuanshulie);
                break;
            case R.id.num5:
                jisuanshulie.append("5");
                input.setText(jisuanshulie);
                break;
            case R.id.num6:
                jisuanshulie.append("6");
                input.setText(jisuanshulie);
                break;
            case R.id.num7:
                jisuanshulie.append("7");
                input.setText(jisuanshulie);
                break;
            case R.id.num8:
                jisuanshulie.append("8");
                input.setText(jisuanshulie);
                break;
            case R.id.num9:
                jisuanshulie.append("9");
                input.setText(jisuanshulie);
                break;
            case R.id.num0:
                jisuanshulie.append("0");
                input.setText(jisuanshulie);
                break;
            case R.id.dian:
                if (jisuanshulie.length() == 0) {
                    input.setText(jisuanshulie);
                    break;
                } else {
                    if (!Character.isDigit(jisuanshulie.charAt(jisuanshulie.length() - 1))) {
                        jisuanshulie.append("0");
                        input.setText(jisuanshulie);
                    }
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '.') {
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        String temp = new String(jisuanshulie);
                        boolean flag = false;
                        ArrayList<String> cuttemp = cutString(temp);
                        for (int j = 0; j < cuttemp.get(cuttemp.size() - 1).length(); j++) {
                            if (cuttemp.get(cuttemp.size() - 1).charAt(j) == '.') {
                                flag = true;
                            }
                        }
                        if (flag == true) {
                            input.setText(jisuanshulie);
                        } else {
                            jisuanshulie.append(".");
                            input.setText(jisuanshulie);
                            break;
                        }
                    }

                    break;
                }
            case R.id.jia:
                if (jisuanshulie.length() == 0) {
                    input.setText(jisuanshulie);
                    break;
                } else {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '.') {
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        jisuanshulie.append("+");
                        input.setText(jisuanshulie);
                        break;
                    }
                }
            case R.id.jian:
                if (jisuanshulie.length() == 0) {
                    input.setText(jisuanshulie);
                    break;
                } else {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '.') {
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        jisuanshulie.append("-");
                        input.setText(jisuanshulie);
                        break;
                    }
                }
            case R.id.cheng:
                if (jisuanshulie.length() == 0) {
                    input.setText(jisuanshulie);
                    break;
                } else {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '.') {
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        jisuanshulie.append("*");
                        input.setText(jisuanshulie);
                        break;
                    }
                }
            case R.id.chu:
                if (jisuanshulie.length() == 0) {
                    input.setText(jisuanshulie);
                    break;
                } else {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '.') {
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        jisuanshulie.append("/");
                        input.setText(jisuanshulie);
                        break;
                    }
                }
            case R.id.sin:
                if (jisuanshulie.length() > 0) {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/') {
                        jisuanshulie.append("sin");
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        input.setText("error,not complete");
                        break;
                    }
                } else {
                    jisuanshulie.append("sin");
                    input.setText(jisuanshulie);
                    break;
                }
            case R.id.cos:
                if (jisuanshulie.length() > 0) {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/') {
                        jisuanshulie.append("cos");
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        input.setText("error,not complete");
                        break;
                    }
                } else {
                    jisuanshulie.append("cos");
                    input.setText(jisuanshulie);
                    break;
                }
            case R.id.tan:
                if (jisuanshulie.length() > 0) {
                    if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/') {
                        jisuanshulie.append("tan");
                        input.setText(jisuanshulie);
                        break;
                    } else {
                        input.setText("error,not complete");
                        break;
                    }
                } else {
                    jisuanshulie.append("tan");
                    input.setText(jisuanshulie);
                    break;
                }

            case R.id.kaifang:
                if (jisuanshulie.length() > 0) {
                    String jieguo = new String(jisuanshulie);
                    if (jieguo.contains("/0")) {
                        output.setText("error,no/0");
                        jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                    } else {
                        if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/') {
                            output.setText("error,not complete");
                            jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                        } else {
                            jieguo = jisuan(jisuanshulie);
                            jieguo = DoubleToString(Math.sqrt(StringtoDouble(jieguo)));
                            output.setText(jieguo);
                            jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                            jisuanshulie.append(jieguo);
                        }
                    }
                }
                break;
            //TODO:bug
            case R.id.jiecheng:
                Double number;
                if (jisuanshulie.length() > 0) {
                    String jieguo = new String(jisuanshulie);
                    if (jieguo.contains("/0")) {
                        output.setText("error,no/0");
                        jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                    } else {

                        if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/') {
                            output.setText("error,not complete");
                            jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                        } else {
                            jieguo = jisuan(jisuanshulie);
                            if (jieguo.length() > 1) {
                                if (jieguo.charAt(jieguo.length() - 1) == '0' && jieguo.charAt(jieguo.length() - 2) == '.') {
                                    number = jiecheng(jieguo);
                                    if (number == -1.0) {
                                        output.setText("error!input <0");
                                        break;
                                    }
                                    jieguo = DoubleToString(number);
                                    output.setText(jieguo);
                                    jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                                    jisuanshulie.append(jieguo);
                                } else {
                                    if (isInteger(jieguo)) {
                                        number = jiecheng(jieguo);
                                        if (number == -1.0) {
                                            output.setText("error!input <0");
                                            break;
                                        }
                                        jieguo = DoubleToString(number);
                                        output.setText(jieguo);
                                        jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                                        jisuanshulie.append(jieguo);
                                    } else {
                                        output.setText("not Integer!");
                                        jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                                        jisuanshulie.append("");
                                    }
                                }
                            } else {
                                if (isInteger(jieguo)) {
                                    number = jiecheng(jieguo);
                                    if (number == -1.0) {
                                        output.setText("error!input <0");
                                        break;
                                    }
                                    jieguo = DoubleToString(number);
                                    output.setText(jieguo);
                                    jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                                    jisuanshulie.append(jieguo);
                                } else {
                                    output.setText("not Integer!");
                                    jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                                    jisuanshulie.append("");
                                }
                            }
                        }
                    }
                }

                break;
            case R.id.C:
                jisuanshulie.delete(0, jisuanshulie.length());
                output.setText(jisuanshulie);
                input.setText(jisuanshulie);
                break;
            case R.id.CE:
                jisuanshulie.delete(0, jisuanshulie.length());
                output.setText(jisuanshulie);
                input.setText(jisuanshulie);
                break;
            case R.id.delete:
                if (jisuanshulie.length() > 0) {
                    jisuanshulie.delete(jisuanshulie.length() - 1, jisuanshulie.length());
                    input.setText(jisuanshulie);
                    break;
                } else {
                    input.setText(jisuanshulie);
                    break;
                }
            case R.id.deng:
                if (jisuanshulie.length() > 0) {
                    String jieguo = new String(jisuanshulie);
                    if (jieguo.contains("/0")) {
                        output.setText("error,no/0");
                        jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                    } else {
                        if (jisuanshulie.charAt(jisuanshulie.length() - 1) == '+' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '-' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '*' || jisuanshulie.charAt(jisuanshulie.length() - 1) == '/') {
                            output.setText("error,not complete");
                            jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                        } else {
                            jieguo = jisuan(jisuanshulie);
                            output.setText(jieguo);
                            jisuanshulie = jisuanshulie.delete(0, jisuanshulie.length());
                            jisuanshulie.append(jieguo);
                        }
                    }
                }
                break;
            default:
                break;
        }

    }

    final public String easyjisuan(String numa, int fuhao, String numb) {
        double num1 = new Double(numa);
        double num2 = new Double(numb);
        double num3;
        switch (fuhao) {
            case 1:
                num3 = num1 + num2;
                return "" + num3;
            case 2:
                num3 = num1 - num2;
                return "" + num3;
            case 3:
                num3 = num1 * num2;
                return "" + num3;
            case 4:
                num3 = num1 / num2;
                return "" + num3;
            default:
                return "error";
        }
    }

    /**
     * 得到初始计算数列，转换为排序好的计算数列
     * -1+3/5-5=====0-1+3/5-5
     * cixu[]========[2,1,4,2]
     * smallnum=====[0,1,3,5,5]
     * <p>
     * 2+4*5-8/7
     * cixu[]=====[1,3,2,4]
     * small=====[2,4,5,8,7]
     * for(int i=0;i<cixu.length;i++){
     * if(cixu[i]==3){
     * small.i=easyjisuan(small.i,cixu[i],small.i+1);
     * small.(i+1)="0"
     * cixu[i]=0;
     * rightnow==cixu[1,0,2,4]
     * rightnow==small=[2,20,0,8,7]
     * if(cixu[i]==4){
     * small.i=easyjisuan(small.i,cixu[i],small.i+1);
     * small.(i+1)="0"
     * cixu[i]=0;
     * rightnow==cixu[1,1,2,1]
     * rightnow==small=[2,20,0,1.111,0]
     * <p>
     * }
     * }
     * 三角函数
     * EX:5+6*sin30-9/8
     * cixu[]==0,0,1,0,0
     * smallnum==5,6,sin30,9,8
     * ->cixu[0,0,0,0,0]
     * ->smallnum=5,6,0.5,9,8
     * ->cixu[1,3,sin,2,4]
     *
     * @param n
     * @return
     */
    public String jisuan(StringBuilder n) {
        String jisuanshulie = "" + n;
        ArrayList<String> jisuanshulie_aftercut = new ArrayList<String>();
        int cixu[] = new int[99];                       //运算符次序控制数组
        int cixujug = 0;                                //运算符次序位置控制
        jisuanshulie_aftercut = cutString(jisuanshulie);
        ArrayList<String> smallnum = new ArrayList<String>();
        smallnum = jisuanshulie_aftercut;
        /**
         * TODO 无法进行连续三角函数运算
         */
        for (int i = 0; i < n.length(); i++) {
            if (jisuanshulie.charAt(i) == 's') {
                cixu[cixujug] = 1;
                cixujug++;
            }
            if (jisuanshulie.charAt(i) == 'c') {
                cixu[cixujug] = 2;
                cixujug++;

            }
            if (jisuanshulie.charAt(i) == 't') {
                cixu[cixujug] = 3;
                cixujug++;

            }
            if (jisuanshulie.charAt(i) == '+') {
                cixu[cixujug] = 0;                  //加法
                cixujug++;

            }
            if (jisuanshulie.charAt(i) == '-') {
                cixu[cixujug] = 0;                  //减法
                cixujug++;

            }
            if (jisuanshulie.charAt(i) == '*') {
                cixu[cixujug] = 0;                  //乘法
                cixujug++;

            }
            if (jisuanshulie.charAt(i) == '/') {
                cixu[cixujug] = 0;                  //除法
                cixujug++;
            }
        }
        //8-sin9-6
        //sin9+9+sin6+cos5
        //cixu[]==1,0,0,1,2
        //smallnum[]==9,9,6,5//每两个0跳过一次
        for (int i = 0; i < cixujug; i++) {         //三角函数最优先计算

            if (cixu[i] == 1) {
                smallnum.set(i, DoubleToString(Math.sin(SCTStringToDouble(smallnum.get(i)))));
                cixu[i] = 0;
                i++;
            }
            if (cixu[i] == 2) {
                smallnum.set(i, DoubleToString(Math.cos(SCTStringToDouble(smallnum.get(i)))));
                cixu[i] = 0;
                i++;
            }
            if (cixu[i] == 3) {
                smallnum.set(i, DoubleToString(Math.tan(SCTStringToDouble(smallnum.get(i)))));
                cixu[i] = 0;
                i++;
            }
        }

        cixu = new int[99];
        cixujug = 0;
        if (jisuanshulie.charAt(0) != '-') {            //开始计算数列
            for (int i = 0; i < n.length(); i++) {                           //2+4*5-8/7
                if (jisuanshulie.charAt(i) == '+') {
                    cixu[cixujug] = 1;                  //加法
                    cixujug++;
                }
                if (jisuanshulie.charAt(i) == '-') {
                    cixu[cixujug] = 2;                  //减法
                    cixujug++;

                }
                if (jisuanshulie.charAt(i) == '*') {
                    cixu[cixujug] = 3;                  //乘法
                    cixujug++;

                }
                if (jisuanshulie.charAt(i) == '/') {
                    cixu[cixujug] = 4;                  //除法
                    cixujug++;
                }
                if (jisuanshulie.charAt(i) == 's') {
                    i = i + 2;
                }
                if (jisuanshulie.charAt(i) == 'c') {
                    i = i + 2;
                }
                if (jisuanshulie.charAt(i) == 't') {
                    i = i + 2;
                }
            }
        } else {
            for (int i = 0; i < jisuanshulie.length(); i++) {
                if (jisuanshulie.charAt(i) == '+') {
                    cixu[cixujug] = 1;                  //加法
                }
                if (jisuanshulie.charAt(i) == '-') {
                    cixu[cixujug] = 2;                  //减法
                    cixujug++;
                }
                if (jisuanshulie.charAt(i) == '*') {
                    cixu[cixujug] = 3;                  //乘法
                    cixujug++;
                }
                if (jisuanshulie.charAt(i) == '/') {
                    cixu[cixujug] = 4;                  //除法
                    cixujug++;
                }
                if (jisuanshulie.charAt(i) == 's') {
                    i = i + 2;
                }
                if (jisuanshulie.charAt(i) == 'c') {
                    i = i + 2;
                }
                if (jisuanshulie.charAt(i) == 't') {
                    i = i + 2;
                }
            }
        }

        for (int i = 0; i < cixujug; i++) {         //乘除法优先计算
            if (cixu[i] == 3) {
                smallnum.set(i + 1, easyjisuan(smallnum.get(i), cixu[i], smallnum.get(i + 1)));
                smallnum.set(i, "0");
                cixu[i] = 1;
                if (i > 0) {
                    if (cixu[i - 1] == 2) {
                        cixu[i] = 2;
                    }
                }
            }
            if (cixu[i] == 4) {
                smallnum.set(i + 1, easyjisuan(smallnum.get(i), cixu[i], smallnum.get(i + 1)));
                smallnum.set(i, "0");
                cixu[i] = 1;
                if (i > 0) {
                    if (cixu[i - 1] == 2) {
                        cixu[i] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < cixujug; i++) {
            if (cixu[i] == 1) {
                smallnum.set(i + 1, easyjisuan(smallnum.get(i), cixu[i], smallnum.get(i + 1)));
                smallnum.set(i, "0");
                cixu[i] = 1;
            }
            if (cixu[i] == 2) {
                smallnum.set(i + 1, easyjisuan(smallnum.get(i), cixu[i], smallnum.get(i + 1)));
                smallnum.set(i, "0");
                cixu[i] = 1;
            }
        }
        return smallnum.get(smallnum.size() - 1);
    }

    public ArrayList<String> cutString(String needTocut) {
        ArrayList<String> cut = new ArrayList<String>();
        String temp = "";
        int mark = 0;
        for (int i = 0; i < needTocut.length(); i++) {
            if (needTocut.charAt(i) != '+' && needTocut.charAt(i) != '-' && needTocut.charAt(i) != '*' && needTocut.charAt(i) != '/') {
                temp = temp + needTocut.charAt(i);
            } else {
                cut.add(temp);
                temp = "";
                mark = i + 1;
            }
        }//3+sin3//sin3+sin3
        temp = "";
        for (int i = mark; i < needTocut.length(); i++) {
            temp = temp + needTocut.charAt(i);
        }

        cut.add(temp);
        return cut;
    }

    public String DoubleToString(Double num) {
        String temp = "" + num;
        return temp;

    }

    public Double SCTStringToDouble(String num) {
        String temp = num.substring(3, num.length());
        Double number = new Double(temp);
        return number;
    }

    public Double StringtoDouble(String num) {
        Double number = new Double(num);
        return number;
    }

    public Double jiecheng(String num) {
        Double number = new Double(num);
        if (number < 0) {
            return -1.0;
        }
        if (number == 0) {
            return 1.0;
        }
        for (Double i = number - 1; i > 0; i--) {
            number = number * i;
        }
        return number;
    }

    public static boolean isInteger(String num) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(num).matches();
    }
}
