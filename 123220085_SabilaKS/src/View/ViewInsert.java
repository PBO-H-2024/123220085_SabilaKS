/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public class ViewInsert extends JFrame {
    JLabel ltitle=new JLabel(" Internship Program");
    
    //applicants identity
    JLabel lname=new JLabel("Name");
    JTextField fname=new JTextField();
    
    //internship candidate
    JLabel li=new JLabel ("Internship Candidate ");
    JRadioButton rad=new JRadioButton ("Android Developer");
    JRadioButton rwd=new JRadioButton ("Web Developer");
    
    //input tests score
    JLabel lwe=new JLabel (" 1. Writing Exam");
    JTextField fwe=new JTextField ();
    JLabel lct=new JLabel (" 2. Coding Test");
    JTextField fct=new JTextField ();
    JLabel lit=new JLabel (" 3. Interview Test");
    JTextField fit=new JTextField ();
    
    public JButton badd=new JButton (" Add");
    
    //constructor
    public ViewInsert(){
        setSize(500,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //group candidate
        ButtonGroup candidate=new ButtonGroup();
        candidate.add(rad);
        candidate.add(rwd);
        
        //add data
        add(ltitle);
        add(lname);
        add(fname);
        add(li);
        add(rad);
        add(rwd);
        add(lwe);
        add(fwe);
        add(lct);
        add(fct);
        add(lit);
        add(fit);
        add(badd);
        
        //set visualization
        ltitle.setBounds(60,10,120,20);
        lname.setBounds(10,30,250,20);
        fname.setBounds(80,30,120,20);
        li.setBounds(10,50,150,20);
        rad.setBounds(150,50,150,20);
        rwd.setBounds(150,70,120,20);
        lwe.setBounds(50,100,120,20);
        fwe.setBounds(180,100,60,20);
        lct.setBounds(50,130,140,20);
        fct.setBounds(180,130,60,20);
        lit.setBounds(50,160,140,20);
        fit.setBounds(180,160,60,20);
        badd.setBounds(80,200,120,20);               
    }
    
    //setter and getter
    public JLabel getLtitle() {
        return ltitle;
    }

    public void setLtitle(JLabel ltitle) {
        this.ltitle = ltitle;
    }

    public JLabel getLname() {
        return lname;
    }

    public void setLname(JLabel lname) {
        this.lname = lname;
    }

    public JTextField getFname() {
        return fname;
    }

    public void setFname(JTextField fname) {
        this.fname = fname;
    }

    public JLabel getLi() {
        return li;
    }

    public void setLi(JLabel li) {
        this.li = li;
    }

    public JRadioButton getRad() {
        return rad;
    }

    public void setRad(JRadioButton rad) {
        this.rad = rad;
    }

    public JRadioButton getRwd() {
        return rwd;
    }

    public void setRwd(JRadioButton rwd) {
        this.rwd = rwd;
    }

    public JLabel getLwe() {
        return lwe;
    }

    public void setLwe(JLabel lwe) {
        this.lwe = lwe;
    }

    public JTextField getFwe() {
        return fwe;
    }

    public void setFwe(JTextField fwe) {
        this.fwe = fwe;
    }

    public JLabel getLct() {
        return lct;
    }

    public void setLct(JLabel lct) {
        this.lct = lct;
    }

    public JTextField getFct() {
        return fct;
    }

    public void setFct(JTextField fct) {
        this.fct = fct;
    }

    public JLabel getLit() {
        return lit;
    }

    public void setLit(JLabel lit) {
        this.lit = lit;
    }

    public JTextField getFit() {
        return fit;
    }

    public void setFit(JTextField fit) {
        this.fit = fit;
    }

    public JButton getBadd() {
        return badd;
    }

    public void setBadd(JButton badd) {
        this.badd = badd;
    }
    
}

