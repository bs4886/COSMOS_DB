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
            
      ID.put("최고관리자", "최고관리자");      
      PS.put("1234", "1234");

      System.out.println("데이터베이스 0.01ver");
      System.out.println("아이디와 비밀번호를 입력하세요");

      while (true) {
         System.out.print("아이디:");
         String id = sc.nextLine();

         if (ID.containsKey(id)) {
            break;
         } else {
            System.out.println("입력하신 아이디가 존재하지 않습니다.\n");
         }
      }
      while (true) {
         System.out.print("비밀번호 :");
         String password = sc.nextLine();

         if (PS.containsKey(password)) {
            break;
         } else {
            System.out.println("비밀번호가 틀렸습니다.\n");
         }
      }
      System.out.println("환영합니다. \n로그인 되었습니다. \n현재 지원되는 명령어를 보시려면 [도움말]을 입력하세요");
   }
   public void 사용자생성(){
      String 생성자;
      String 비밀번호;
      System.out.println("생성하실 사용자 이름을 입력하세요");
      생성자 = sc.nextLine();
      ID.put(생성자, 생성자);
      System.out.println("비밀번호를 입력하세요");
      비밀번호 = sc.nextLine();
      PS.put(비밀번호, 비밀번호);
      System.out.println(생성자 + "===> 이름으로 사용자가 생성되었습니다. \n새로운 사용자로 로그인하실려면 로그아웃해주세요");
   }
}

class 명령어 {
   static Set<String> data = new HashSet<String>(); //첫번쨰 테이블
   static Set<String> table1 = new HashSet<String>(); // 테이블 이름
   static Set<String> table2 = new HashSet<String>(); //두번째 테이블
   Scanner sc = new Scanner(System.in);
   String 이름; //첫번째 테이블
   String 이름1; //두번째 테이블
   static  String 칼럼이름[]=new String[99];
   static String 테이블이름[]=new String[99];
   static String 칼럼이름2[]=new String[99];
   static String 테이블이름2[]=new String[99];
   static Set<String> table1_칼럼 = new HashSet<String>();
   static Set<String> table2_칼럼 = new HashSet<String>();
   static Set<String> table1_1 = new HashSet<String>();
   static Set<String> table1_2 = new HashSet<String>();
   static Set<String> table1_3 = new HashSet<String>();
   static Set<String> table1_4 = new HashSet<String>();
   static Set<String> table2_1 = new HashSet<String>();
   static Set<String> table2_2 = new HashSet<String>();
   static Set<String> table2_3 = new HashSet<String>();
   static Set<String> table2_4 = new HashSet<String>();

   void 도움말() {       
      System.out.println(
      "\n데이터베이스 0.01ver\n" 
      + "현재 지원되는 명령어 모음\n"
      + "  ㅡㅡㅡㅡㅡㅡㅡ  \n"
      + "+데이터 입력\n"
      + "+모든 테이블출력\n"
      + "+데이터 출력\n"
      + "+데이터 수정\n"
      + "+데이터 삭제\n"
      + "+데이터 전체삭제\n"
      + "+테이블 생성\n"
      + "+테이블 삭제\n"
      + "+사용자 생성\n"
      + "+저장하기\n"
      + "+로그아웃\n"
      + "+종료\n"
      );
   }

   void 데이터출력() {
         long start = System.currentTimeMillis();

         System.out.println("데이터를 출력하실 테이블을 입력하세요." + table1);
         String r = sc.nextLine();
         if (r.equals(이름)) {
            long end = System.currentTimeMillis();

            System.out.println(
            "\n테이블 이름 : "+이름+"\n" 
            + 칼럼이름[1] + ":"+ table1_1+ "\n"
            + 칼럼이름[2] + ":"+ table1_2+ "\n"
            + 칼럼이름[3] + ":"+ table1_3+ "\n"
            + 칼럼이름[4] + ":"+ table1_4
            +"  (sec: " + ( end - start )/10000.0 +")" + "\n"
            );

         }
         if (r.equals(이름1)) {
            long end = System.currentTimeMillis();

            System.out.println(
            "\n테이블 이름 : "+이름+"\n" 
            + 칼럼이름2[1] + ":"+ table2_1+ "\n"
            + 칼럼이름2[2] + ":"+ table2_2+ "\n"
            + 칼럼이름2[3] + ":"+ table2_3+ "\n"
            + 칼럼이름2[4] + ":"+ table2_4
            +"  (sec: " + ( end - start )/10000.0 +")" + "\n" 
            );
         }
      }

   void 데이터입력1() {
         long start = System.currentTimeMillis();
         System.out.println("\n선택된 테이블===>" + 이름 + "\n\n데이터를 입력하실칼럼을 선택하세요.\n"+table1_칼럼);
         String K = sc.nextLine();
         System.out.println("");
         if(K.equals(칼럼이름[1])){
            System.out.println("선택된칼럼:" +칼럼이름[1]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
           StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];
            for (int l = 0; l < k; l++) {
            	p[l] = st.nextToken();
               table1_1.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n 총입력된 데이터 :" + table1_1 + "\n");
            }
         if(K.equals(칼럼이름[2])){
            System.out.println("선택된칼럼:" +칼럼이름[2]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table1_2.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n 총입력된 데이터 :" + table1_2 + "\n");
            }
         if(K.equals(칼럼이름[3])){
            System.out.println("선택된칼럼:" +칼럼이름[3]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {
               p[l] = st.nextToken();
               table1_3.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n총 입력된 데이터 :" + table1_3 + "\n");
            }
         if(K.equals(칼럼이름[4])){
            System.out.println("선택된칼럼:" +칼럼이름[4]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {
               p[l] = st.nextToken();
               table1_4.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n총 입력된 데이터 :" + table1_4 + "\n");
            }
      }

   void 데이터입력2() {
         long start = System.currentTimeMillis();

         System.out.println("\n선택된 테이블===>" + 이름1 + "\n\n데이터를 입력하실칼럼을 선택하세요.\n"+table2_칼럼);    
         String K = sc.nextLine();
         System.out.println("");
         
         if(K.equals(칼럼이름2[1])){
            System.out.println("선택된칼럼:" +칼럼이름2[1]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_1.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n총 입력된 데이터 :" + table2_1 + "\n");
            }
         if(K.equals(칼럼이름2[2])){
            System.out.println("선택된칼럼:" +칼럼이름2[2]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_2.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n총 입력된 데이터 :" + table2_2 + "\n");
            }
         if(K.equals(칼럼이름2[3])){
            System.out.println("선택된칼럼:" +칼럼이름2[3]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_3.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n총 입력된 데이터 :" + table2_3 + "\n");
            }
         if(K.equals(칼럼이름2[4])){
            System.out.println("선택된칼럼:" +칼럼이름2[4]+"\n\n데이터를입력하세요.\n");
            String 데이터=sc.nextLine();
            System.out.println("");
            
            StringTokenizer st = new StringTokenizer(데이터, ",");
            int k = st.countTokens();
            String p[] = new String[k];

            for (int l = 0; l < k; l++) {

               p[l] = st.nextToken();
               table2_4.add(p[l]);
               }
            long end = System.currentTimeMillis();
            System.out.println("데이터가" + k + "건 입력되었습니다."
                  + "(sec:"  + ( end - start )/10000.0 +")\n"+"\n 총입력된 데이터 :" + table2_4 + "\n");
            }   }

   void 데이터입력할때() {
         if (table1.size() == 0) {
             System.out.println("\n현재 데이터를 입력할 테이블이없습니다. \n테이블 생성 명령을 통해 테이블을 생성하세요.\n");
          }
          if (table1.size() == 1) {
             데이터입력1();
          }
          if (table1.size() > 1) {
             System.out.println("데이터를 입력하실 테이블을 입력하세요." + table1+"\n");
             String a = sc.nextLine();
             if (a.equals(이름)) {
                데이터입력1();
             }
             if (a.equals(이름1)) {
                데이터입력2();
             }
          }
       }
   void 데이터삭제1() {
         long start = System.currentTimeMillis();

         System.out.println("데이터를 삭제하실 칼럼을 선택하세요." +table1_칼럼);
         String 입력=sc.nextLine();
         if(입력.equals(칼럼이름[1])){
            System.out.println("삭제하실 데이터를 입력하세요."+table1_1);
            String D = sc.nextLine();
            table1_1.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(입력.equals(칼럼이름[2])){
            System.out.println("삭제하실 데이터를 입력하세요."+table1_2);
            String D = sc.nextLine();
            table1_2.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(입력.equals(칼럼이름[3])){
            System.out.println("삭제하실 데이터를 입력하세요."+table1_3);
            String D = sc.nextLine();
            table1_3.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(입력.equals(칼럼이름[4])){
            System.out.println("삭제하실 데이터를 입력하세요."+table1_4);
            String D = sc.nextLine();
            table1_4.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         

      }
   void 데이터삭제2() {

         long start = System.currentTimeMillis();

         System.out.println("데이터를 삭제하실 칼럼을 선택하세요." +table2_칼럼);
         String 입력=sc.nextLine();
         if(입력.equals(칼럼이름2[1])){
            System.out.println("삭제하실 데이터를 입력하세요."+table2_1);
            String D = sc.nextLine();
            table2_1.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(입력.equals(칼럼이름2[2])){
            System.out.println("삭제하실 데이터를 입력하세요."+table2_2);
            String D = sc.nextLine();
            table2_2.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(입력.equals(칼럼이름2[3])){
            System.out.println("삭제하실 데이터를 입력하세요."+table2_3);
            String D = sc.nextLine();
            table2_3.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         if(입력.equals(칼럼이름2[4])){
            System.out.println("삭제하실 데이터를 입력하세요."+table2_4);
            String D = sc.nextLine();
            table2_4.remove(D);
            long end = System.currentTimeMillis();
            System.out.println("\n"+D+"데이터를 삭제하였습니다. (sec:"  + ( end - start )/10000.0 +")");
         }
         
      }
   void 데이터삭제할때() {
         if (table1.size() == 0) {
             System.out.println("\n현재 데이터를 삭제할 테이블이없습니다. 테이블 생성 명령을 통해 테이블을 생성하세요.");
          }
          if (table1.size() == 1) {
             데이터삭제1();
          }
          if (table1.size() > 1) {
             System.out.println("\n데이터를 입력하실 테이블을 입력하세요." + table1);
             String a = sc.nextLine();
             if (a.equals(이름)) {
                데이터삭제1();
             }
             if (a.equals(이름1)) {
                데이터삭제2();
             }
          }
       }

   void 데이터전체삭제1() {
         long start = System.currentTimeMillis();
         
         long end = System.currentTimeMillis();
         System.out.println("\n"+이름+"테이블의\n"+table1_칼럼+" 칼럼의 데이터가  전체삭제되었습니다."
               + "\n" + table1_1 + "==> 칼럼의 모든데이터가 삭제되었습니다.\n"
                  + table1_2 + "==> 칼럼의 모든데이터가 삭제되었습니다.\n"
                  +table1_3 + "==> 칼럼의 모든데이터가 삭제되었습니다.\n"
                  +table1_4 + "==> 테이블의 모든데이터가 삭제되었습니다. (sec:"  + ( end - start )/10000.0 +")\n");
         table1_1.clear();
         table1_2.clear();
         table1_3.clear();
         table1_4.clear();
         
      }

   void 데이터전체삭제2() {
         long start = System.currentTimeMillis();
         
         long end = System.currentTimeMillis();
         System.out.println("\n"+이름1+"테이블의\n"+table2_칼럼+"칼럼의 모든데이타가 전체삭제되었습니다."
               + "\n" + table2_1 + "==> 칼럼의 모든데이터가 삭제되었습니다.\n"
                  + table2_2 + "==> 칼럼의 모든데이터가 삭제되었습니다.\n"
                  +table2_3 + "==> 칼럼의 모든데이터가 삭제되었습니다.\n"
               +table2_4 + "==> 칼럼의 모든데이터가 삭제되었습니다. (sec:"  + ( end - start )/10000.0 +")\n");
         table2_1.clear();
         table2_2.clear();
         table2_3.clear();
         table2_4.clear();
         
        }

   void 데이터전체삭제할때() {
         if (table1.size() == 0) {
             System.out.println("\n현재 데이터를 삭제할 테이블이없습니다. \n테이블 생성 명령을 통해 테이블을 생성하세요.");
          }
          if (table1.size() == 1) {
             데이터전체삭제1();
          }
          if (table1.size() > 1) {
             System.out.println("\n삭제하실 테이블을 입력하세요." + table1);
             String a = sc.nextLine();
             if (a.equals(이름)) {
                데이터전체삭제1();
             }
             if (a.equals(이름1)) {
                데이터전체삭제2();
             }
          }
      }
   void  데이터수정1() {
         long start = System.currentTimeMillis();
         System.out.println("변경하실데이터가 있는 칼럼을 선택하세요.  " + table1_칼럼);
         String 수정값=sc.nextLine();
         if(수정값.equals(칼럼이름[1])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table1_1);
            String 수정;
            수정 = sc.nextLine();
            table1_1.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table1_1.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
               
         }
         if(수정값.equals(칼럼이름[2])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table1_2);
            String 수정;
            수정 = sc.nextLine();
            table1_2.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table1_2.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
            }
         if(수정값.equals(칼럼이름[3])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table1_3);
            String 수정;
            수정 = sc.nextLine();
            table1_3.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table1_3.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
               
         }
         if(수정값.equals(칼럼이름[4])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table1_4);
            String 수정;
            수정 = sc.nextLine();
            table1_4.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table1_4.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
               
         }
      }
   void 데이터수정2() {
         long start = System.currentTimeMillis();
         System.out.println("변경하실데이터가 있는 칼럼을 선택하세요.  " + table1_칼럼);
         String 수정값=sc.nextLine();
         if(수정값.equals(칼럼이름2[1])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table2_1);
            String 수정;
            수정 = sc.nextLine();
            table2_1.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table2_1.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
               
         }
         if(수정값.equals(칼럼이름2[2])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table2_2);
            String 수정;
            수정 = sc.nextLine();
            table2_2.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table2_2.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
            }
         if(수정값.equals(칼럼이름2[3])){
            System.out.println("변경하실 데이터를 입력하세요.  "+table2_3);
            String 수정;
            수정 = sc.nextLine();
            table2_3.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table2_3.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
               
         }
         if(수정값.equals(칼럼이름2[4])){
            System.out.println("변경하실 데이터를 입력하세요. "+table2_4);
            String 수정;
            수정 = sc.nextLine();
            table2_4.remove(수정);
            System.out.println("\n변경할 데이터를 입력하세요.");
            String 변경;
            변경 = sc.nextLine();
            table2_4.add(변경);
            long end = System.currentTimeMillis();
            System.out.println("\n데이터가 수정되었습니다.(sec:"  + ( end - start )/10000.0 +") \n" + 수정 + "==>" + 변경 + "\n");
               
         }  }
   void 데이터수정할때() {
         if (table1.size() == 0) {
             System.out.println("\n데이터를 수정할 테이블이 없습니다.");
          }
          if (table1.size() == 1) {
             데이터수정1();
          }
          if (table1.size() > 1) {
             System.out.println("\n데이터를 수정하실 테이블을 입력하세요." + table1);
             String O = sc.nextLine();
             if (O.equals(이름)) {
                데이터수정1();
             }
             if (O.equals(이름1)) {
                데이터수정2();
             }
          }

       }
   void 테이블생성() {
       
	   while (true) {
             if (table1.size() == 0) {
                long start = System.currentTimeMillis();
                int 테이블갯수=table1.size();
                System.out.println("\n테이블이름과 칼럼이름을 입력하세요.");
                테이블이름[테이블갯수] = sc.nextLine();
                StringTokenizer St=new StringTokenizer(테이블이름[테이블갯수], ",");
                int 칼럼갯수=St.countTokens();
                이름=St.nextToken();
                for (int l = 1; l < 칼럼갯수; l++) {

                   칼럼이름[l] = St.nextToken();
                   table1_칼럼.add(칼럼이름[l]);
                }
                
                long end = System.currentTimeMillis();
                System.out.println("\n" +"테이블 생성되었습니다. :"+이름+"  (sec:"  + ( end - start )/10000.0 +")\n");
                System.out.print("생성된 칼럼:");
                for (int i = 1; i<칼럼갯수; i++) {
                   System.out.print(칼럼이름[i]+" ");
                }
                System.out.println("\n");
                table1.add(이름);
                break;
             }
             if (table1_칼럼.size() >= 1) {
                long start = System.currentTimeMillis();
                System.out.println("\n테이블이름과 칼럼이름을 입력하세요.");
                테이블이름[1] = sc.nextLine();
                StringTokenizer St1=new StringTokenizer(테이블이름[1], ",");
                int 칼럼갯수=St1.countTokens();
                이름1=St1.nextToken();
                for (int l = 1; l < 칼럼갯수; l++) {

                   칼럼이름2[l] = St1.nextToken();
                   table2_칼럼.add(칼럼이름2[l]);
                }
                
                long end = System.currentTimeMillis();
                System.out.println("\n" +"테이블 생성되었습니다. :"+이름1+"  (sec:"  + ( end - start )/10000.0 +")\n");
                System.out.print("생성된 칼럼:");
                for (int i = 1; i<칼럼갯수; i++) {
                   System.out.print(칼럼이름2[i]+" ");
                }
                System.out.println("\n");
                table1.add(이름1);
                break;
             }
          }
       }

   void 모든테이블출력() {
         long start = System.currentTimeMillis();
         
         long end = System.currentTimeMillis();
         
         System.out.println(table1+"   (sec:"  + ( end - start )/10000.0 +")");
      }

   void 테이블삭제() {
         long start = System.currentTimeMillis();
         
         System.out.println("\n삭제하실 테이블을 입력하세요." + table1);
         String 삭제 = sc.nextLine();
         table1.remove(삭제);
         if (삭제.equals(이름)) {
            long end = System.currentTimeMillis();
            
            System.out.println("\n" + 이름 + "테이블 과 그안의 데이터가 삭제되었습니다.  (sec:"  + ( end - start )/10000.0 +")\n");
            table1.clear();
            table1_칼럼.clear();
            table1_1.clear();
            table1_2.clear();
            table1_3.clear();
            table1_4.clear();
            }
         if (삭제.equals(이름1)) 
         {
            long end = System.currentTimeMillis();
            System.out.println("\n" + 이름1 + "테이블과 그안의 데이터가 삭제되었습니다.  (sec:"  + ( end - start )/10000.0 +")\n");
            table2.clear();
            table2_칼럼.clear();
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
      
      JFileChooser 파일선택 = new JFileChooser();
      JTextArea 텍스트 = new JTextArea();
      
      
      id login = new id();
      login.id();
      명령어 명령어 = new 명령어();
    
      while (true) {

         System.out.print("\n"+"COSMOS_DB>");

         String 명령;
         명령 = sc.nextLine();

         if (명령.equals("도움말")) {
            명령어.도움말();
         }
         if (명령.equals("저장하기")) {
            
            int res = 파일선택.showSaveDialog(텍스트);

            if (res == 0) {
               File temp = 파일선택.getSelectedFile();
               String saveFile = temp.getPath();
               System.out.println(saveFile + ".txt ==> 에 저장되었습니다.");
               if (!saveFile.contains(".txt"))
                  saveFile = saveFile + ".txt";
               try {
                  FileWriter fw = new FileWriter(saveFile);
                  fw.write(텍스트.getText().replaceAll("\n", "\r\n")); // 띄어쓰기용, 수정 필요 없음
                  fw.write("테이블 이름 : "+명령어.이름); //테이블 이름 입력
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름[1]+":"+명령어.table1_1); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름[2]+":"+명령어.table1_2); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름[3]+":"+명령어.table1_3); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름[4]+":"+명령어.table1_4); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  
                  fw.write("테이블 이름 2: "+명령어.이름1); //테이블 이름 입력
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름2[1]+":"+명령어.table2_1); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름2[2]+":"+명령어.table2_2); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름2[3]+":"+명령어.table2_3); // 배열에 있는 값 
                  fw.write("\r\n"); // 칸 띄어쓰기
                  fw.write(명령어.칼럼이름2[4]+":"+명령어.table2_4); // 배열에 있는 값 
                  	
                  fw.close();
               } catch (IOException e1) {
                  e1.printStackTrace();
               }
            }
         }         
         if (명령.equals("데이터 출력")) {
            명령어.데이터출력();
            }
         if (명령.equals("데이터 입력")) {
            명령어.데이터입력할때();
         }
         if (명령.equals("데이터 삭제")) {
            명령어.데이터삭제할때();
         }
         if (명령.equals("데이터 전체삭제")) {
            명령어.데이터전체삭제할때();
         }
         if (명령.equals("데이터 수정")) {
            명령어.데이터수정할때();
         }
         if (명령.equals("테이블 생성")) {
            명령어.테이블생성();
         }
         if (명령.equals("모든 테이블출력")) {
            명령어.모든테이블출력();
         }
         if (명령.equals("테이블 삭제")) {
            명령어.테이블삭제();
         }
         if (명령.equals("사용자 생성")) {
            login.사용자생성();
            }         
         if (명령.equals("로그아웃")) {
            login.id();
         }
         if (명령.equals("종료")) {
            System.out.println("프로그램을 종료합니다.\n감사합니다.");
            break;
         }
      }
      System.exit(0);
   }
}