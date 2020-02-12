/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author shahe
 */
class RoomInfo {
    private short Floor_no,Room_no;
    private String Status,Assigned_to;

    public RoomInfo(short Floor_no,short Room_no,String Status,String Assigned_to)
{   
    this.Floor_no=Floor_no;
    this.Room_no=Room_no;
    this.Status=Status;
    this.Assigned_to=Assigned_to;
}
    public short getFloor_no(){
     return Floor_no;   
    }
    public short getRoom_no(){
    return Room_no;
    }
    public String getStatus(){
    return Status;
    }
    public String getAssigned_to(){
    return Assigned_to;
    }
}
