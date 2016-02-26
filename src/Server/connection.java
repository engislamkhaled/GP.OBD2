package Server;


import javax.servlet.annotation.WebServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.*;
 
@Path("/conn")

public class connection {
  static class request{
	 
	 
	 String id;
	 String op1;
	 String op2;
	 String ope;
	 String res;
	 String status;
	 
	 public request(String i,String o1,String o2,String oe,String rs,String stat)
	 {id=i;
	 op1=o1;
	 op2=o2;
	 ope=oe;
	 res=rs;
	 status=stat;
		 
	 }
	 
	 
 }

public static String send="";
public static String display;
public static int id;

public static List <request> op = new ArrayList<request>();

		@GET
	@Produces("application/json")
 		  public Response connect(@PathParam("f") float f1) throws JSONException 
 	 	  {
 			  String result;
 	 		  if(send=="")
 	 		  {
 	 		  		result="Queue empty";
 	 		  }
 	 		  
 	 		  else { result =send;
 	 		  
 	 		  for (int i=0;i<op.size();i++)
 	 		  {
 	 			 op.get(i).status="in progress";
 	 		 
 	 				System.out.println("ID"+op.get(i).id+" Status "+op.get(i).status);
				}}
 	 	
 	 		  return Response.status(200).entity(result).build();
 	 		  
 		  }
 		  public void StringAppending(String string1)
 		  {
 			  
 		  }
		  public void  Addition(String n1, String n2)
		  {
			  
			  id=id+1;
			  String x;
			  x=Integer.toString(id);
			 request l=new request(x,n1,n2,"+","0","pending");
			  op.add(l);
			  System.out.println("ID "+op.get(id-1).id+" Status "+op.get(id-1).status);
			 
			   connection.send+=id+"/"+"+"+"/"+n1+"/"+n2+",";
			  
			  //System.out.println(send);
		  }
 		  public void  Subtraction(String n1, String n2)
 		  {
 			 id=id+1;
 			String x;
			  x=Integer.toString(id);
			  request s=new request(x,n1,n2,"-","0","pending");
			  op.add(s);
			  System.out.println("ID "+op.get(id-1).id+" Status "+op.get(id-1).status);
			
 			  send+=id+"/"+"-"+"/"+n1+"/"+n2+",";
 			  
 		  }
 		  public void Shutdown  ()
 		  {
 			 id=id+1;
 			String x;
			  x=Integer.toString(id);
			  request s=new request(x,"0","0","0","0","pending");
			  op.add(s);
 			  send+=id+"/"+"S"+"/"+"0"+"/"+"0"+",";
 			 //System.out.println(send);
 		  }
 		  public void  Reboot()
 		  {
 			 id=id+1;
 			String x;
			  x=Integer.toString(id);
			  request s=new request(x,"0","0","0","0","pending");
			  op.add(s);
 			  send+=id+"/"+"R"+"/"+"0"+"/"+"0"+",";
 		  }
 		  public void clearSend()
 		  {
 			  
 			  send="";
 			  id=0;
 		  }
 		  
 		  
 			@Path("{c}/{f}/{n}/{x}/{d}")
 			@GET
 			@Produces("application/json")
 			public void displayresult(@PathParam("c") String c, @PathParam("f") String  f, @PathParam("n") String  n,@PathParam("x") String  x,@PathParam("d") String  d) 
 		 {
 			if(c.equals("clear"))
 			{
 				clearSend();
 			}
 			else
 			{
 				
 	 	 		  for (int i=0;i<op.size();i++)
 	 	 		  {
 	 	 			 
 	 	 			  if(c.equals(op.get(i).id) )
 	 	 		  { op.get(i).status="Answered";
 	 	 			display="ID= "+c+"  Operation= "+f+" Operand1= "+n+" Operand2= "+x+"  Result=  "+d+" Status "+ op.get(i).status;
 	 	 			  
 	 	 		  }
 	 	 			  
 	 	 		  }
 				System.out.println(display);
 			}
 		}	  
 	}

