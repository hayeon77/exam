import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Join extends JPanel
{
 @SuppressWarnings("deprecation")
public static void main(String[] args)
 {
  JFrame frame = new JFrame("회원가입");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().add(new layoutPanel());
  frame.pack();
  frame.show();
 }
}
class layoutPanel extends JPanel
{
 public layoutPanel()
 {
  JPanel panel1 = new JPanel();
  JPanel panel2 = new JPanel();
  JPanel panel3 = new JPanel();
  JPanel panel4 = new JPanel();
  JPanel panel5 = new JPanel();
  JLabel label1 = new JLabel("통일 신문사에 오신 것을 환영합니다.");
  JLabel label2 = new JLabel("성명: ");
  JLabel label3 = new JLabel("성별 ");
  JLabel label4 = new JLabel("E-mail: ");
  JLabel label5 = new JLabel("관심 분야");
  JLabel label6 = new JLabel("");
  JTextField textfield1 = new JTextField("");
  JTextField textfield2 = new JTextField("");
  JRadioButton radiobutton1 = new JRadioButton("남자");
  JRadioButton radiobutton2 = new JRadioButton("여자");
  JCheckBox checkbox1 = new JCheckBox("스포츠");
  JCheckBox checkbox2 = new JCheckBox("게임");
  JCheckBox checkbox3 = new JCheckBox("영화");
  JCheckBox checkbox4 = new JCheckBox("여행");
  JCheckBox checkbox5 = new JCheckBox("기타");
  JButton button = new JButton("제출");
  button.addActionListener( new ButtonListener() );
  this.setLayout(new GridBagLayout());
  GridBagConstraints c = new GridBagConstraints();
  c.fill = GridBagConstraints.BOTH;
  c.gridx = 0;
  c.gridy = 0;
  c.gridwidth = 2;
  c.gridheight = 1;
  c.weightx = 1;
  c.weighty = 1;
  this.add(label1, c);
//  this.add(panel1);
  c.fill = GridBagConstraints.BOTH;
  c.gridx = 0;
  c.gridy = 1;
  c.gridwidth = 1;
  c.gridheight = 1;
  c.weightx = 1;
  c.weighty = 1;
  this.add(panel2, c);
  panel2.setLayout(new GridLayout(4,2));
  panel2.add(label2);
  panel2.add(textfield1);
  panel2.add(label3);
  panel2.add(radiobutton1);
  panel2.add(label6);
  panel2.add(radiobutton2);
  panel2.add(label4);
  panel2.add(textfield2);
  c.fill = GridBagConstraints.BOTH;
  c.gridx = 1;
  c.gridy = 1;
  c.gridwidth = 1;
  c.gridheight = 1;
  c.weightx = 1;
  c.weighty = 1;
  this.add(panel3, c);
  panel3.setLayout(new GridLayout(6,1));
  panel3.add(label5);
  panel3.add(checkbox1);
  panel3.add(checkbox2);
  panel3.add(checkbox3);
  panel3.add(checkbox4);
  panel3.add(checkbox5);
  c.fill = GridBagConstraints.BOTH;
  c.gridx = 0;
  c.gridy = 2;
  c.gridwidth = 2;
  c.gridheight = 1;
  c.weightx = 1;
  c.weighty = 1;
  this.add(panel4, c);
  panel4.add(button);
  setPreferredSize(new Dimension(400,300));
 }
 private class ButtonListener implements ActionListener
 {
  public void actionPerformed(ActionEvent event)
  {
  JOptionPane.showMessageDialog( layoutPanel.this, "본사의 회원으로 가입해 주셔서 감사합니다" );
//   Dialog dialog = new Dialog("본사의 회원으로 가입해 주셔서 감사합니다");
//   dialog.setVisible(true);
  }
 }
}