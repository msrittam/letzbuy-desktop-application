import javax.swing.*;import java.awt.*;import java.awt.event.*;class Java2 extends JFrame implements ActionListener{
public JButton all0, all1, all2, all3, all4, all5, all6, all7, all8, all9, all10, all11, all12;public JTextArea combo5, combo6, combo7, combo8;
public ImageIcon macbook, dellinspiron, dellvostro, lenovoidea, canon1500, canon1300, nikon, canon1200, usha3811, bajaj7600, bajaj1000,
 boach3501, oppo, apple, samsung, honour, samsung62, hair58, whrilpool62, lloydwash, haier52l3, haier195l5, whirlrefri, lg668l, hitachiac,
 bluestarac, lloydac, voltasac, ifb17, bajaj17, ifb20, samsung23, hindware1, hindware2, elica1, elica2, dishwa1, dishwa2, bosch1, bosch2,
 mitv, vutv, oneplus55, lgtv;public  JLabel oppo1, apple1, samsung1, honour1;public Java2(){setBounds( 0, 0, 1320, 720);
setDefaultCloseOperation(EXIT_ON_CLOSE);setLayout(null); JLabel title = new JLabel("CHOOSE THE CATEGORY THAT YOU WANT"); 
title.setBounds( 150, 0, 1170, 50); title.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 50));title.setForeground(Color.white);
add(title); all0 = new JButton("Back");all0.setBounds(1200, 10,90, 40);all0.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25)); 
all0.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all0.addActionListener(this);    add(all0);all1 = new JButton("All Electronics"
);all1.setBounds(60, 100,250, 40);all1.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25)); all1.setBorder(BorderFactory.
createLineBorder(Color.white, 4)); all1.addActionListener(this);    add(all1);all2 = new JButton("laptops"); all2.setBounds(370, 100,250, 40);
all2.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25)); all2.setBorder(BorderFactory.createLineBorder(Color.white, 4)); 
all2.addActionListener(this); add(all2);all3 = new JButton("Cameras"); all3.setBounds(680, 100,250, 40);  all3.setFont(new Font("TimesRoman", 
Font.BOLD+Font.ITALIC, 25));all3.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all3.addActionListener(this);  add(all3);
all4 = new JButton("Food Processors"); all4.setBounds(990, 100,250, 40);  all4.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25)); 
all4.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all4.addActionListener(this);  add(all4);all5 = new JButton("Mobiles"); 
all5.setBounds(60, 190,250, 40);all5.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25)); all5.setBorder(BorderFactory.
createLineBorder(Color.white, 4)); all5.addActionListener(this);   add(all5);all6 = new JButton("Washing Machines"); all6.setBounds
(370, 190,250, 40);all6.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25)); all6.setBorder(BorderFactory.createLineBorder(Color.
white, 4)); all6.addActionListener(this);    add(all6);all7 = new JButton("Refrigerators"); all7.setBounds(680, 190,250, 40);all7.setFont
(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25));all7.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all7.addActionListener
(this);   add(all7);all8 = new JButton("Air Conditioners"); all8.setBounds(990, 190,250, 40);   all8.setFont(new Font("TimesRoman", 
Font.BOLD+Font.ITALIC, 25));all8.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all8.addActionListener(this);add(all8);
all9 = new JButton("Microwave Ovens"); all9.setBounds(60, 280,250, 40); all9.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25));
all9.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all9.addActionListener(this);  add(all9);all10 = new JButton("Chimneys"); 
all10.setBounds(370, 280,250, 40);all10.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25));all10.setBorder(BorderFactory.
createLineBorder(Color.white, 4)); all10.addActionListener(this);   add(all10);all11 = new JButton("Dish Washers"); all11.setBounds(680, 
280,250, 40);all11.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 25));all11.setBorder(BorderFactory.createLineBorder(Color.white, 4)); 
all11.addActionListener(this);   add(all11);all12 = new JButton("Televisions"); all12.setBounds(990, 280,250, 40);  all12.setFont(new Font
("TimesRoman", Font.BOLD+Font.ITALIC, 25));all12.setBorder(BorderFactory.createLineBorder(Color.white, 4)); all12.addActionListener(this); 
add(all12);apple1= new  JLabel();apple1.setBounds(60, 370, 250,150);add(apple1);samsung1= new  JLabel();samsung1.setBounds(370, 370, 250,150);
add(samsung1);honour1= new  JLabel();honour1.setBounds(680, 370, 250,150);add(honour1);oppo1= new  JLabel();oppo1.setBounds(990, 370, 250,150);
add(oppo1);combo5 = new JTextArea(); combo5.setBounds(60, 570, 250,100); combo5.setFont(new Font("TimesRoman", Font.ITALIC,15));
combo5.setEditable(false);combo5.setLineWrap(true);  add(combo5);combo6 = new JTextArea(); combo6.setBounds(370, 570, 250,100);
combo6.setFont(new Font("TimesRoman", Font.ITALIC,15)); combo6.setEditable(false); combo6.setLineWrap(true); add(combo6);
combo7 = new JTextArea(); combo7.setBounds(680, 570, 250,100); combo7.setFont(new Font("TimesRoman", Font.ITALIC,15));combo7.setEditable
(false); combo7.setLineWrap(true); add(combo7);combo8 = new JTextArea(); combo8.setBounds(990, 570, 250,100); 
combo8.setFont(new Font("TimesRoman", Font.ITALIC,15));combo8.setEditable(false); combo8.setLineWrap(true); add(combo8);
macbook=new ImageIcon("camera/macbook.jpg");dellinspiron=new ImageIcon("camera/dellinspiron.jpg");
dellvostro=new ImageIcon("camera/dellvostro.jpg");lenovoidea=new ImageIcon("camera/lenovoidea.jpg");
canon1500=new ImageIcon("camera/canon1500.jpg");canon1300=new ImageIcon("camera/canon1300.jpg");nikon=new ImageIcon("camera/nikon.png");
canon1200=new ImageIcon("camera/canon1200.jpg");usha3811=new ImageIcon("camera/usha3811.jpg");bajaj7600=new ImageIcon("camera/bajaj7600.jpg");
bajaj1000=new ImageIcon("camera/bajaj1000.jpeg");boach3501=new ImageIcon("camera/boach3501.jpg");apple=new ImageIcon("camera/apple.jpg");
samsung=new ImageIcon("camera/samsung.jpg");honour=new ImageIcon("camera/honour.jpg");oppo=new ImageIcon("camera/oppo reno.jpg");
samsung62=new ImageIcon("camera/samsung62.jpg");hair58=new ImageIcon("camera/hair58.jpg");whrilpool62=new ImageIcon("camera/whrilpool62.jpg");
lloydwash=new ImageIcon("camera/lloydwash.png");haier52l3=new ImageIcon("camera/haier52l3.png");haier195l5=new ImageIcon("camera/haier195l5.jpg");
whirlrefri=new ImageIcon("camera/whirlrefri.png");lg668l=new ImageIcon("camera/lg668l.jpeg");hitachiac=new ImageIcon("camera/hitachiac.jpg");
bluestarac=new ImageIcon("camera/bluestarac.jpg");lloydac=new ImageIcon("camera/lloydac.jpeg");voltasac=new ImageIcon("camera/voltasac.jpg");
ifb17=new ImageIcon("camera/ifb17.jpg");bajaj17=new ImageIcon("camera/bajaj17.jpg");ifb20=new ImageIcon("camera/ifb20.png");
samsung23=new ImageIcon("camera/samsung23.png");hindware1=new ImageIcon("camera/hindware1.png");hindware2=new ImageIcon("camera/hindware2.png");
elica1=new ImageIcon("camera/elica1.png");elica2=new ImageIcon("camera/elica2.png");dishwa1=new ImageIcon("camera/dishwa1.png");
dishwa2=new ImageIcon("camera/dishwa2.png");bosch1=new ImageIcon("camera/bosch1.png");bosch2=new ImageIcon("camera/bosch2.png");
mitv=new ImageIcon("camera/mitv.png");vutv=new ImageIcon("camera/vutv.jpg");oneplus55=new ImageIcon("camera/oneplus55.jpg");
lgtv=new ImageIcon("camera/lgtv.png");ImageIcon img=new ImageIcon("camera/popup.jpg");JLabel our= new JLabel(img);
our.setIcon(new ImageIcon(img.getImage().getScaledInstance( 1320, 720,Image.SCALE_SMOOTH)));our.setBounds( 0, 0, 1320, 720);add(our);
setVisible(true);} public void actionPerformed(ActionEvent e) {if(e.getSource() == all1) 
{ apple1.setIcon(new ImageIcon(ifb17.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(samsung.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(elica1.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(lgtv.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" LFB17L Solo\n Price in Shoponn:10,490\n Price in Gadgets Now:8,500\n Price in Flipkart:8,490\n Price in SmartPrix:7,768");
combo6.setText(" Samsung GalaxyZ Flip\n Price in Croma:115,890\n Price in iNfinityPhone:113,900\n Price in OnShopDeal:135,640\n Price in Amazon:140,998");
combo7.setText(" Elica Chimny StripBf 60SS\n Price in Flipkart:51,000\n Price in Croma:48,000\n Price in Helmet Don:45,999\n Price in UBuy India:54,114");
combo8.setText(" LG(55)4K SmartTV\n Price in Amazon:61,990\n Price in Flipkart:84,900\n Price in Croma:79,314\n Price in imastudent:96,500");
}else if(e.getSource() == all2){apple1.setIcon(new ImageIcon(macbook.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(dellinspiron.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(dellvostro.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(lenovoidea.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Apple Macbook Air\n Price in Amazon:61,990\n Price in Flipkart:84,900\n Price in Croma:79,314\n Price in imastudent:96,500");
combo6.setText(" Dell Inspiron 3567\n Price in ShopClues:29,299\n Price in Amazon:27,490\n Price in Flipkart:27,990\n Price in Arashi Futures:32,000");
combo7.setText(" Dell Vostro 3581\n Price in Flipkart:27,990\n Price in Croma:29,240\n Price in Paytm Mall:26,990\n Price in TataCLiQ:26,990");
combo8.setText(" Lenovo Ideapad 5145\n Price in Croma:30,994\n Price in Flipkart:32,990\n Price in Lenovo India:27,040\n Price in Shoponn:22,790");
}else if(e.getSource() == all3){apple1.setIcon(new ImageIcon(canon1500.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(canon1300.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(nikon.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(canon1200.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Canon EOS 1500D 24.1MP\n Price in VTraders:35,00\n Price in Helmet Don:32,999\n Price in RelianceDigital:29,990\n Price in Flipkart:29,990");
combo6.setText(" Canon EOS 1300D 18MP\n Price in Flipkart:41,695\n Price in buythevalue:29,693\n Price in TeckPot:36,095\n Price in UBuy India:38,066");
combo7.setText(" Nikon D5300 24.2MP\n Price in Flipkart:51,000\n Price in Croma:48,000\n Price in Helmet Don:45,999\n Price in UBuy India:54,114");
combo8.setText(" Canon EOS 1200D 18MP\n Price in Flipkart:41,695\n Price in Helmet Don:38,999\n Price in EassyMall:39,762\n Price in cart2india:27,000");
}else if(e.getSource() == all4){apple1.setIcon(new ImageIcon(usha3811.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(bajaj7600.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(bajaj1000.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(boach3501.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Usha FP 3811\n Price in Flipkart:9,576\n Price in Croma:7,499\n Price in Jantacart:5,399\n Price in Shoponn:7,453");
combo6.setText(" Bajaj FX7 600\n Price in Bajajelectrical:6,244\n Price in Flipkart:5,400\n Price in Helmet Don:5,290\n Price in Shoponn:5,376");
combo7.setText(" Bajaj FX 1000\n Price in Flipkart:8,850\n Price in Croma:7,299\n Price in Shoponn:7,868\n Price in Helmet Don:7,740");
combo8.setText(" Bosch MCM3501M\n Price in Flipkart:8,349\n Price in Croma:6,490\n Price in Bosch Home:9,199\n Price in Paytm Mall:6,488");
}if(e.getSource() == all5) { apple1.setIcon(new ImageIcon(apple.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(samsung.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(honour.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(oppo.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" IPhone XS\n Price in Flipkart:62,999\n Price in Gadgets Now:78,300\n Price in JaldiFatafat:59,999\n Price in Helmet Don:129,900");
combo6.setText(" Samsung GalaxyZ Flip\n Price in Croma:115,890\n Price in iNfinityPhone:113,900\n Price in OnShopDeal:135,640\n Price in Amazon:140,998");
combo7.setText(" Honr 9X\n Price in Amazon:13,999\n Price in Flipkart:13,999\n Price in Gadgets Now:14,443\n Price in GeekBuying:15,702");
combo8.setText(" Oppo Reno3 Pro\n Price in Flipkart:31,990\n Price in SupremeMob:29,999\n Price in Croma:31,990\n Price in TataCLiQ:30,999");
}else if(e.getSource() == all6){apple1.setIcon(new ImageIcon(samsung62.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(hair58.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(whrilpool62.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(lloydwash.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Samsung WA62M4100HY\n Price in Flipkart:15,100\n Price in Croma:15,400\n Price in TataCLiQ:17,126\n Price in Zefo:11,399");
combo6.setText(" Haier HWM 58020\n Price in ShopClues:12,938\n Price in Croma:14,690\n Price in Flipkart:11,799\n Price in Vijay Sales:10,990");
combo7.setText(" Whirlpool WHITE MAGIC\n Price in TataCLiQ:13,490\n Price in Flipkart:13,999\n Price in Vijay Sales:16,200\n Price in Croma:15,990");
combo8.setText(" Lloyd LWMS65LT\n Price in Shoponn:10,490\n Price in Gadgets Now:8,500\n Price in Flipkart:8,490\n Price in SmartPrix:7,768");
}else if(e.getSource() == all7){apple1.setIcon(new ImageIcon(haier52l3.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(haier195l5.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(whirlrefri.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(lg668l.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Haier52L 3Star\n Price in Amazon:7,250\n Price in Peedee:6,500\n Price in Flipkart:7,690\n Price in EassyMall:4,181");
combo6.setText(" Haier195L 5Star\n Price in Flipkart:13,490\n Price in ShopClues:14,882\n Price in Croma:15,500\n Price in Peedee:16,500");
combo7.setText(" Whirlpool245L 2Star\n Price in Flipkart:20,400\n Price in TataCLiQ:19,990\n Price in JaldiFatafat:19,490\n Price in Shoponn:14,658");
combo8.setText(" LG668L Frost Free\n Price in Croma:106,550\n Price in JaldiFatafat:99,990\n Price in Flipkart:99,990\n Price in Reliance:109,990");
}else if(e.getSource() == all8){apple1.setIcon(new ImageIcon(hitachiac.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(bluestarac.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(lloydac.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(voltasac.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Hitachi Window AC\n Price in Croma:33,290\n Price in Vijay Sales:23,990\n Price in ShopClues:34,690\n Price in Ajjao:35,990");
combo6.setText(" Bluestar Window AC\n Price in ShopClues:30,610\n Price in Vijay Sales:23,990\n Price in Croma:28,490\n Price in Ajjao:27,990");
combo7.setText(" LLOYD Window AC\n Price in ShopClues:25,475\n Price in Croma:25,990\n Price in Shoponn:36,990\n Price in TataCLiQ:37,989");
combo8.setText(" Voltas Window AC\n Price in ShopClues:24,339\n Price in VijaySales:26,990\n Price in Croma:28,490\n Price in Ajjao:27,990");
}else if(e.getSource() == all9){apple1.setIcon(new ImageIcon(ifb17.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(bajaj17.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(ifb20.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(samsung23.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" LFB17L Solo\n Price in Shoponn:10,490\n Price in Gadgets Now:8,500\n Price in Flipkart:8,490\n Price in SmartPrix:7,768");
combo6.setText(" Bajaj17L Solo\n Price in ShopClues:12,938\n Price in Croma:14,690\n Price in Flipkart:11,799\n Price in Vijay Sales:10,990");
combo7.setText(" LFB20L Convection\n Price in TataCLiQ:13,490\n Price in Flipkart:13,999\n Price in Vijay Sales:16,200\n Price in Croma:15,990");
combo8.setText(" Samsung23L Solo\n Price in Flipkart:15,100\n Price in Croma:15,400\n Price in TataCLiQ:17,126\n Price in Zefo:11,399");
}else if(e.getSource() == all10){apple1.setIcon(new ImageIcon(hindware1.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(hindware2.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(elica1.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(elica2.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Hindware Chimny CleoHac 60SS\n Price in VTraders:35,00\n Price in Helmet Don:32,999\n Price in RelianceDigital:29,990\n Price in Flipkart:29,990");
combo6.setText(" Hindware Chimny Model Elena\n Price in Flipkart:41,695\n Price in buythevalue:29,693\n Price in TeckPot:36,095\n Price in UBuy India:38,066");
combo7.setText(" Elica Chimny StripBf 60SS\n Price in Flipkart:51,000\n Price in Croma:48,000\n Price in Helmet Don:45,999\n Price in UBuy India:54,114");
combo8.setText(" Elica Chimny TcgSlim 60SS\n Price in Flipkart:41,695\n Price in Helmet Don:38,999\n Price in EassyMall:39,762\n Price in cart2india:27,000");
}else if(e.getSource() == all11){apple1.setIcon(new ImageIcon(dishwa1.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(dishwa2.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(bosch1.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(bosch2.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Voltas Beko 14Kg\n Price in Croma:33,290\n Price in Vijay Sales:23,990\n Price in ShopClues:34,690\n Price in Ajjao:35,990");
combo6.setText(" Voltas Beko 07Kg\n Price in ShopClues:30,610\n Price in Vijay Sales:23,990\n Price in Croma:28,490\n Price in Ajjao:27,990");
combo7.setText(" Bosch12 Fully Automatic\n Price in ShopClues:25,475\n Price in Croma:25,990\n Price in Shoponn:36,990\n Price in TataCLiQ:37,989");
combo8.setText(" LFB12 Fully Automatic\n Price in ShopClues:24,339\n Price in VijaySales:26,990\n Price in Croma:28,490\n Price in Ajjao:27,990");
}else if(e.getSource() == all12){apple1.setIcon(new ImageIcon(mitv.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
samsung1.setIcon(new ImageIcon(vutv.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
honour1.setIcon(new ImageIcon(oneplus55.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
oppo1.setIcon(new ImageIcon(lgtv.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH)));
combo5.setText(" Mi(32)HD SmartTV\n Price in Croma:30,994\n Price in Flipkart:32,990\n Price in Lenovo India:27,040\n Price in Shoponn:22,790");
combo6.setText(" Vu(32)HD SmartTV\n Price in ShopClues:29,299\n Price in Amazon:27,490\n Price in Flipkart:27,990\n Price in Arashi Futures:32,000");
combo7.setText(" Oneplus(55)4K SmartTV\n Price in Flipkart:27,990\n Price in Croma:29,240\n Price in Paytm Mall:26,990\n Price in TataCLiQ:26,990");
combo8.setText(" LG(55)4K SmartTV\n Price in Amazon:61,990\n Price in Flipkart:84,900\n Price in Croma:79,314\n Price in imastudent:96,500");
}else if(e.getSource() == all0){    }} }class SuperSale{ public static void main(String[] args) throws Exception { Java2 f = new Java2(); } }  