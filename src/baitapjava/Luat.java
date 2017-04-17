/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

public class Luat
{
   public String vp;
   public String vt;
   public Luat()
   {}
   public Luat(String vt,String vp)
   {
       this.vt=vt;
       this.vp=vp;
   }
   
   public String toString()
   {
       return(this.vt+"  ->  "+this.vp);
   }
}

