import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

import org.omg.Messaging.SyncScopeHelper;


class id {
   static Map<String, String> ID = new Hashtable<String, String>();
   static Map<String, String> PS = new Hashtable<String, String>();
   static Scanner sc = new Scanner(System.in);
   public static void id() {
            
      ID.put("�ְ������", "�ְ������");      
      PS.put("1234", "1234");

      System.out.println("�����ͺ��̽� 0.01ver");
      System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");

      while (true) {
         System.out.print("���̵�:");
         String id = sc.nextLine();

         if (ID.containsKey(id)) {
            break;
         } else {
            System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.\n");
         }
      }
      while (true) {
         System.out.print("��й�ȣ :");
         String password = sc.nextLine();

         if (PS.containsKey(password)) {
            break;
         } else {
            System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
         }
      }
      System.out.println("ȯ���մϴ�. \n�α��� �Ǿ����ϴ�. \n���� �����Ǵ� ��ɾ ���÷��� [����]�� �Է��ϼ���");
   }
   public void ����ڻ���(){
      String ������;
      String ��й�ȣ;
      System.out.println("�����Ͻ� ����� �̸��� �Է��ϼ���");
      ������ = sc.nextLine();
      ID.put(������, ������);
      System.out.println("��й�ȣ�� �Է��ϼ���");
      ��й�ȣ = sc.nextLine();
      PS.put(��й�ȣ, ��й�ȣ);
      System.out.println(������ + "===> �̸����� ����ڰ� �����Ǿ����ϴ�. \n���ο� ����ڷ� �α����ϽǷ��� �α׾ƿ����ּ���");
   }
}

class ��ɾ� {
   static Set<String> data = new HashSet<String>(); //ù���� ���̺�
   static Set<String> table1 = new HashSet<String>(); // ���̺� �̸�
   static Set<String> table2 = new HashSet<String>(); //�ι�° ���̺�
   Scanner sc = new Scanner(System.in);
   String �̸�; //ù��° ���̺�
   String �̸�1; //�ι�° ���̺�
   static  String Į���̸�[]=new String[99];
   static String ���̺��̸�[]=new String[99];
   static String Į���̸�2[]=new String[99];
   static String ���̺��̸�2[]=new String[99];
   static Set<String> table1_Į�� = new HashSet<String>();
   static Set<String> table2_Į�� = new HashSet<String>();
   static Set<String> table1_1 = new HashSet<String>();
   static Set<String> table1_2 = new HashSet<String>();
   static Set<String> table1_3 = new HashSet<String>();
   static Set<String> table1_4 = new HashSet<String>();
   static Set<String> table2_1 = new HashSet<String>();
   static Set<String> table2_2 = new HashSet<String>();
   static Set<String> table2_3 = new HashSet<String>();
   static Set<String> table2_4 = new HashSet<String>();

   void ����() {       
      System.out.println(
      "\n�����ͺ��̽� 0.01ver\n" 
      + "���� �����Ǵ� ��ɾ� ����\n"
      + "  �ѤѤѤѤѤѤ�  \n"
      + "+������ �Է�\n"
      + "+��� ���̺����\n"
      + "+������ ���\n"
      + "+������ ����\n"
      + "+������ ����\n"
      + "+������ ��ü����\n"
      + "+���̺� ����\n"
      + "+���̺� ����\n"
      + "+����� ����\n"
      + "+�����ϱ�\n"
      + "+�α׾ƿ�\n"
      + "+����\n"
      );
   }

   void ���������() {
         long start = System.currentTimeMillis();

         System.out.println("�����͸� ����Ͻ� ���̺��� �Է��ϼ���." + table1);
         String r = sc.nextLine();
         if (r.equals(�̸�)) {
            long end = System.currentTimeMillis();

            System.out.println(
            "\n���̺� �̸� : "+�̸�+"\n" 
            + Į���̸�[1] + ":"+ table1_1+ "\n"
            + Į���̸�[2] + ":"+ table1_2+ "\n"
            + Į���̸�[3] + ":"+ table1_3+ "\n"
            + Į���̸�[4] + ":"+ table1_4
            +"  (sec: " + ( end - start )/10000.0 +")" + "\n"
            );

         }
         if (r.equals(�̸�1)) {
            long end = System.currentTimeMillis();

            System.out.println(
            "\n���̺� �̸� : "+�̸�+"\n" 
            + Į���̸�2[1] + ":"+ table2_1+ "\n"
            + Į���̸�2[2] + ":"+ table2_2+ "\n"
            + Į���̸�2[3] + ":"+ table2_3+ "\n"
            + Į���̸�2[4] + ":"+ table2_4
            +"  (sec: " + ( end - start )/10000.0 +")" + "\n" 
            );
         }
      }

   void �������Է�1() {
         long start = System.currentTimeMillis();
         System.out.println("\n���õ� ���̺�===>" + �̸� + "\n\n�����͸� �Է��Ͻ�Į���� �����ϼ���.\n"+table1_Į��);
         String K = sc.nextLine();
         System.out.println("");
         if(K.equals(Į���̸�[1])){
            System.out.println("���õ�Į��:" +Į���̸�[1]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
           StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];
            for (int l = 0; l < k; l++) {
            	p[l] = st.nextToken();
               table1_1.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n ���Էµ� ������ :" + table1_1 + "\n");
            }
         if(K.equals(Į���̸�[2])){
            System.out.println("���õ�Į��:" +Į���̸�[2]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table1_2.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n ���Էµ� ������ :" + table1_2 + "\n");
            }
         if(K.equals(Į���̸�[3])){
            System.out.println("���õ�Į��:" +Į���̸�[3]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {
               p[l] = st.nextToken();
               table1_3.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n�� �Էµ� ������ :" + table1_3 + "\n");
            }
         if(K.equals(Į���̸�[4])){
            System.out.println("���õ�Į��:" +Į���̸�[4]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {
               p[l] = st.nextToken();
               table1_4.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n�� �Էµ� ������ :" + table1_4 + "\n");
            }
      }

   void �������Է�2() {
         long start = System.currentTimeMillis();

         System.out.println("\n���õ� ���̺�===>" + �̸�1 + "\n\n�����͸� �Է��Ͻ�Į���� �����ϼ���.\n"+table2_Į��);    
         String K = sc.nextLine();
         System.out.println("");
         
         if(K.equals(Į���̸�2[1])){
            System.out.println("���õ�Į��:" +Į���̸�2[1]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_1.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n�� �Էµ� ������ :" + table2_1 + "\n");
            }
         if(K.equals(Į���̸�2[2])){
            System.out.println("���õ�Į��:" +Į���̸�2[2]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_2.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n�� �Էµ� ������ :" + table2_2 + "\n");
            }
         if(K.equals(Į���̸�2[3])){
            System.out.println("���õ�Į��:" +Į���̸�2[3]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_3.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n�� �Էµ� ������ :" + table2_3 + "\n");
            }
         if(K.equals(Į���̸�2[4])){
            System.out.println("���õ�Į��:" +Į���̸�2[4]+"\n\n�����͸��Է��ϼ���.\n");
            String ������=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(������, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_4.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("�����Ͱ�" + k + "�� �ԷµǾ����ϴ�."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n ���Էµ� ������ :" + table2_4 + "\n");
            }   }

   void �������Է��Ҷ�() {
         if (table1.size() == 0) {
             System.out.println("\n���� �����͸� �Է��� ���̺��̾����ϴ�. \n���̺� ���� ����� ���� ���̺��� �����ϼ���.\n");
          }
          if (table1.size() == 1) {
             �������Է�1();
          }
          if (table1.size() > 1) {
             System.out.println("�����͸� �Է��Ͻ� ���̺��� �Է��ϼ���." + table1+"\n");
             String a = sc.nextLine();
             if (a.equals(�̸�)) {
                �������Է�1();
             }
             if (a.equals(�̸�1)) {
                �������Է�2();
             }
          }
       }
   void �����ͻ���1() {
         long start = System.currentTimeMillis();

         System.out.println("�����͸� �����Ͻ� Į���� �����ϼ���." +table1_Į��);
         String �Է�=sc.nextLine();
         if(�Է�.equals(Į���̸�[1])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table1_1);
            String D = sc.nextLine();
            table1_1.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(�Է�.equals(Į���̸�[2])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table1_2);
            String D = sc.nextLine();
            table1_2.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(�Է�.equals(Į���̸�[3])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table1_3);
            String D = sc.nextLine();
            table1_3.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(�Է�.equals(Į���̸�[4])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table1_4);
            String D = sc.nextLine();
            table1_4.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         

      }
   void �����ͻ���2() {

         long start = System.currentTimeMillis();

         System.out.println("�����͸� �����Ͻ� Į���� �����ϼ���." +table2_Į��);
         String �Է�=sc.nextLine();
         if(�Է�.equals(Į���̸�2[1])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table2_1);
            String D = sc.nextLine();
            table2_1.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(�Է�.equals(Į���̸�2[2])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table2_2);
            String D = sc.nextLine();
            table2_2.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(�Է�.equals(Į���̸�2[3])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table2_3);
            String D = sc.nextLine();
            table2_3.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(�Է�.equals(Į���̸�2[4])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���."+table2_4);
            String D = sc.nextLine();
            table2_4.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"�����͸� �����Ͽ����ϴ�. (sec:"  + ( end - start )/10000.0 +")");
         }
         
      }
   void �����ͻ����Ҷ�() {
         if (table1.size() == 0) {
             System.out.println("\n���� �����͸� ������ ���̺��̾����ϴ�. ���̺� ���� ����� ���� ���̺��� �����ϼ���.");
          }
          if (table1.size() == 1) {
             �����ͻ���1();
          }
          if (table1.size() > 1) {
             System.out.println("\n�����͸� �Է��Ͻ� ���̺��� �Է��ϼ���." + table1);
             String a = sc.nextLine();
             if (a.equals(�̸�)) {
                �����ͻ���1();
             }
             if (a.equals(�̸�1)) {
                �����ͻ���2();
             }
          }
       }

   void ��������ü����1() {
         long start = System.currentTimeMillis();
         
         long end = System.currentTimeMillis();
         System.out.println("\n"+�̸�+"���̺���\n"+table1_Į��+" Į���� �����Ͱ�  ��ü�����Ǿ����ϴ�."
               + "\n" + table1_1 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�.\n"
                  + table1_2 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�.\n"
                  +table1_3 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�.\n"
                  +table1_4 + "==> ���̺��� ��絥���Ͱ� �����Ǿ����ϴ�. (sec:"  + ( end - start )/10000.0 +")\n");
         table1_1.clear();
         table1_2.clear();
         table1_3.clear();
         table1_4.clear();
         
      }

   void ��������ü����2() {
         long start = System.currentTimeMillis();
         
         long end = System.currentTimeMillis();
         System.out.println("\n"+�̸�1+"���̺���\n"+table2_Į��+"Į���� ��絥��Ÿ�� ��ü�����Ǿ����ϴ�."
               + "\n" + table2_1 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�.\n"
                  + table2_2 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�.\n"
                  +table2_3 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�.\n"
               +table2_4 + "==> Į���� ��絥���Ͱ� �����Ǿ����ϴ�. (sec:"  + ( end - start )/10000.0 +")\n");
         table2_1.clear();
         table2_2.clear();
         table2_3.clear();
         table2_4.clear();
         
        }

   void ��������ü�����Ҷ�() {
         if (table1.size() == 0) {
             System.out.println("\n���� �����͸� ������ ���̺��̾����ϴ�. \n���̺� ���� ����� ���� ���̺��� �����ϼ���.");
          }
          if (table1.size() == 1) {
             ��������ü����1();
          }
          if (table1.size() > 1) {
             System.out.println("\n�����Ͻ� ���̺��� �Է��ϼ���." + table1);
             String a = sc.nextLine();
             if (a.equals(�̸�)) {
                ��������ü����1();
             }
             if (a.equals(�̸�1)) {
                ��������ü����2();
             }
          }
      }
   void  �����ͼ���1() {
         long start = System.currentTimeMillis();
         System.out.println("�����Ͻǵ����Ͱ� �ִ� Į���� �����ϼ���.  " + table1_Į��);
         String ������=sc.nextLine();
         if(������.equals(Į���̸�[1])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table1_1);
            String ����;
            ���� = sc.nextLine();
            table1_1.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table1_1.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
               
         }
         if(������.equals(Į���̸�[2])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table1_2);
            String ����;
            ���� = sc.nextLine();
            table1_2.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table1_2.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
            }
         if(������.equals(Į���̸�[3])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table1_3);
            String ����;
            ���� = sc.nextLine();
            table1_3.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table1_3.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
               
         }
         if(������.equals(Į���̸�[4])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table1_4);
            String ����;
            ���� = sc.nextLine();
            table1_4.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table1_4.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
               
         }
      }
   void �����ͼ���2() {
         long start = System.currentTimeMillis();
         System.out.println("�����Ͻǵ����Ͱ� �ִ� Į���� �����ϼ���.  " + table1_Į��);
         String ������=sc.nextLine();
         if(������.equals(Į���̸�2[1])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table2_1);
            String ����;
            ���� = sc.nextLine();
            table2_1.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table2_1.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
               
         }
         if(������.equals(Į���̸�2[2])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table2_2);
            String ����;
            ���� = sc.nextLine();
            table2_2.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table2_2.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
            }
         if(������.equals(Į���̸�2[3])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���.  "+table2_3);
            String ����;
            ���� = sc.nextLine();
            table2_3.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table2_3.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
               
         }
         if(������.equals(Į���̸�2[4])){
            System.out.println("�����Ͻ� �����͸� �Է��ϼ���. "+table2_4);
            String ����;
            ���� = sc.nextLine();
            table2_4.remove(����);
            System.out.println("\n������ �����͸� �Է��ϼ���.");
            String ����;
            ���� = sc.nextLine();
            table2_4.add(����);
            long end = System.currentTimeMillis();
            System.out.println("\n�����Ͱ� �����Ǿ����ϴ�.(sec:"  + ( end - start )/10000.0 +") \n" + ���� + "==>" + ���� + "\n");
               
         }  }
   void �����ͼ����Ҷ�() {
         if (table1.size() == 0) {
             System.out.println("\n�����͸� ������ ���̺��� �����ϴ�.");
          }
          if (table1.size() == 1) {
             �����ͼ���1();
          }
          if (table1.size() > 1) {
             System.out.println("\n�����͸� �����Ͻ� ���̺��� �Է��ϼ���." + table1);
             String O = sc.nextLine();
             if (O.equals(�̸�)) {
                �����ͼ���1();
             }
             if (O.equals(�̸�1)) {
                �����ͼ���2();
             }
          }

       }
   void ���̺����() {
       
	   while (true) {
             if (table1.size() == 0) {
                long start = System.currentTimeMillis();
                int ���̺���=table1.size();
                System.out.println("\n���̺��̸��� Į���̸��� �Է��ϼ���.");
                ���̺��̸�[���̺���] = sc.nextLine();
                StringTokenizer St=new StringTokenizer(���̺��̸�[���̺���], ",");
                int Į������=St.countTokens();
                �̸�=St.nextToken();
                for (int l = 1; l < Į������; l++) {

                   Į���̸�[l] = St.nextToken();
                   table1_Į��.add(Į���̸�[l]);
                }
                
                long end = System.currentTimeMillis();
                System.out.println("\n" +"���̺� �����Ǿ����ϴ�. :"+�̸�+"  (sec:"  + ( end - start )/10000.0 +")\n");
                System.out.print("������ Į��:");
                for (int i = 1; i<Į������; i++) {
                   System.out.print(Į���̸�[i]+" ");
                }
                System.out.println("\n");
                table1.add(�̸�);
                break;
             }
             if (table1_Į��.size() >= 1) {
                long start = System.currentTimeMillis();
                System.out.println("\n���̺��̸��� Į���̸��� �Է��ϼ���.");
                ���̺��̸�[1] = sc.nextLine();
                StringTokenizer St1=new StringTokenizer(���̺��̸�[1], ",");
                int Į������=St1.countTokens();
                �̸�1=St1.nextToken();
                for (int l = 1; l < Į������; l++) {

                   Į���̸�2[l] = St1.nextToken();
                   table2_Į��.add(Į���̸�2[l]);
                }
                
                long end = System.currentTimeMillis();
                System.out.println("\n" +"���̺� �����Ǿ����ϴ�. :"+�̸�1+"  (sec:"  + ( end - start )/10000.0 +")\n");
                System.out.print("������ Į��:");
                for (int i = 1; i<Į������; i++) {
                   System.out.print(Į���̸�2[i]+" ");
                }
                System.out.println("\n");
                table1.add(�̸�1);
                break;
             }
          }
       }

   void ������̺����() {
         long start = System.currentTimeMillis();
         
         long end = System.currentTimeMillis();
         
         System.out.println(table1+"   (sec:"  + ( end - start )/10000.0 +")");
      }

   void ���̺����() {
         long start = System.currentTimeMillis();
         
         System.out.println("\n�����Ͻ� ���̺��� �Է��ϼ���." + table1);
         String ���� = sc.nextLine();
         table1.remove(����);
         if (����.equals(�̸�)) {
            long end = System.currentTimeMillis();
            
            System.out.println("\n" + �̸� + "���̺� �� �׾��� �����Ͱ� �����Ǿ����ϴ�.  (sec:"  + ( end - start )/10000.0 +")\n");
            table1.clear();
            table1_Į��.clear();
            table1_1.clear();
            table1_2.clear();
            table1_3.clear();
            table1_4.clear();
            }
         if (����.equals(�̸�1)) 
         {
            long end = System.currentTimeMillis();
            System.out.println("\n" + �̸�1 + "���̺�� �׾��� �����Ͱ� �����Ǿ����ϴ�.  (sec:"  + ( end - start )/10000.0 +")\n");
            table2.clear();
            table2_Į��.clear();
            table2_1.clear();
            table2_2.clear();
            table2_3.clear();
            table2_4.clear();
         }
      }
}

public class DB {
   public static void main(String[] args)  {
      
      Scanner sc = new Scanner(System.in);
      
      Map<String, String> ID = new Hashtable<String, String>();
      Map<String, String> PS = new Hashtable<String, String>();
      
      JFileChooser ���ϼ��� = new JFileChooser();
      JTextArea �ؽ�Ʈ = new JTextArea();
      
      
      id login = new id();
      login.id();
      ��ɾ� ��ɾ� = new ��ɾ�();
    
      while (true) {

         System.out.print("\n"+"COSMOS_DB>");

         String ���;
         ��� = sc.nextLine();

         if (���.equals("����")) {
            ��ɾ�.����();
         }
         if (���.equals("�����ϱ�")) {
            
            int res = ���ϼ���.showSaveDialog(�ؽ�Ʈ);

            if (res == 0) {
               File temp = ���ϼ���.getSelectedFile();
               String saveFile = temp.getPath();
               System.out.println(saveFile + ".txt ==> �� ����Ǿ����ϴ�.");
               if (!saveFile.contains(".txt"))
                  saveFile = saveFile + ".txt";
               try {
                  FileWriter fw = new FileWriter(saveFile);
                  fw.write(�ؽ�Ʈ.getText().replaceAll("\n", "\r\n")); // �����, ���� �ʿ� ����
                  fw.write("���̺� �̸� : "+��ɾ�.�̸�); //���̺� �̸� �Է�
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�[1]+":"+��ɾ�.table1_1); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�[2]+":"+��ɾ�.table1_2); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�[3]+":"+��ɾ�.table1_3); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�[4]+":"+��ɾ�.table1_4); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  
                  fw.write("���̺� �̸� 2: "+��ɾ�.�̸�1); //���̺� �̸� �Է�
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�2[1]+":"+��ɾ�.table2_1); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�2[2]+":"+��ɾ�.table2_2); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�2[3]+":"+��ɾ�.table2_3); // �迭�� �ִ� �� 
                  fw.write("\r\n"); // ĭ ����
                  fw.write(��ɾ�.Į���̸�2[4]+":"+��ɾ�.table2_4); // �迭�� �ִ� �� 
                  	
                  fw.close();
               } catch (IOException e1) {
                  e1.printStackTrace();
               }
            }
         }         
         if (���.equals("������ ���")) {
            ��ɾ�.���������();
            }
         if (���.equals("������ �Է�")) {
            ��ɾ�.�������Է��Ҷ�();
         }
         if (���.equals("������ ����")) {
            ��ɾ�.�����ͻ����Ҷ�();
         }
         if (���.equals("������ ��ü����")) {
            ��ɾ�.��������ü�����Ҷ�();
         }
         if (���.equals("������ ����")) {
            ��ɾ�.�����ͼ����Ҷ�();
         }
         if (���.equals("���̺� ����")) {
            ��ɾ�.���̺����();
         }
         if (���.equals("��� ���̺����")) {
            ��ɾ�.������̺����();
         }
         if (���.equals("���̺� ����")) {
            ��ɾ�.���̺����();
         }
         if (���.equals("����� ����")) {
            login.����ڻ���();
            }         
         if (���.equals("�α׾ƿ�")) {
            login.id();
         }
         if (���.equals("����")) {
            System.out.println("���α׷��� �����մϴ�.\n�����մϴ�.");
            break;
         }
      }
      System.exit(0);
   }
}