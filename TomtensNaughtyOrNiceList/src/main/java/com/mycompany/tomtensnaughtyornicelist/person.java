//        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomtedatabasedemoiot?serverTimezone=UTC", "root", "Hinsaringen39");){
//            
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT id, name, nice FROM child");
//            
//            
//            System.out.print("Choose an name: ");
//            String person = input.nextLine().trim();
//            System.out.println("You have choosen " + person);
//            
//            
//            
//            while(rs.next()){
//                x = rs.getInt("id");
//                s = rs.getString("name");
//                b = rs.getBoolean("nice");
//                
//              
//                
//                mylist.add(x +" "+ s +" "+ b);
//            
//            }
//          
//            System.out.println("before for "+mylist.size());
//           
//            for(int i = 0; i < mylist.size(); i++){
//                String tempname = mylist.get(i);
//                System.out.println("tempname "+tempname);
//                System.out.println("person "+person);
//                
//                if(tempname.equalsIgnoreCase(person)){
//                    
//                    System.out.println(person + b);
//                }
//                else{
//                    System.out.println("I found nothing!");
//                }
//            }
//            
//          
//            
//                       
//            
//         
//                
//             
//        }
//         catch(Exception e){
//             e.printStackTrace();
//            System.out.println("Cant Connect SomeThing Whent Wrong");
//        }
//    }