package dev.lopez.Daos;

import dev.lopez.models.RequestForm;
import dev.lopez.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;

public class FormRepo {

    private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    //insert new request form
    public RequestForm insertForm ( String status, String eventType, String eventLocation,
                                   String description, Double eventCost, Timestamp dateSubmitted, Timestamp dateOccur,
                                    String justification, String gradeFormat, String gradeCutOff,
                                   String gradeReceived) throws SQLException {


            //should user id be provided or you can get (user id is fk in form table)
        try (Connection conn = cu.getConnection()){

            String sql = "insert into \"TRMS\".form values (default, default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) returning *";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, status);
            ps.setString(2, eventType);
            ps.setString(3, eventLocation);
            ps.setString(4, description);
            ps.setDouble(5,eventCost);
            ps.setTimestamp(6, dateSubmitted);
            ps.setTimestamp(7, dateOccur);
            ps.setString(8,justification);
            ps.setString(9, gradeFormat);
            ps.setString(10,gradeCutOff);
            ps.setString(11,gradeReceived);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){

                RequestForm f = new RequestForm();
                f.setFormId(rs.getInt("form_id")); //1
                f.setUserid(rs.getInt("user_id"));
                f.setStatus(rs.getString("status"));
                f.setEventType(rs.getString("event_type"));
                f.setEventLocation(rs.getString("event_location"));
                f.setDescription(rs.getString("description"));
                f.setEventCost(rs.getDouble("event_cost"));
                f.setDateOccur(rs.getTimestamp("date_submit"));
                f.setDateSubmitted(rs.getTimestamp("date_occur"));
                f.setJustification(rs.getString("justification"));
                f.setGradeFormat(rs.getString("format"));
                f.setGradeCutOff(rs.getString("cutoff"));
                f.setGradeReceived(rs.getString("received"));

                    return f;



            }
            }
            return null;

        }

    public RequestForm getByFormId (Integer formId){
        //try with resources-- a way to intialize a resource that will then be closed after we are done with it
        try (Connection conn = cu.getConnection()) {

            String sql = "select * from \"TRMS\".form where form_id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, formId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                RequestForm f = new RequestForm(


                        rs.getInt("form_id"), //1
                rs.getInt("user_id"),
                rs.getString("status"),
                rs.getString("event_type"),
                rs.getString("event_location"),
                rs.getString("description"),
                rs.getDouble("event_cost"),
                rs.getTimestamp("date_submit"),
                rs.getTimestamp("date_occur"),
                rs.getString("justification"),
                rs.getString("format"),
                rs.getString("cutoff"),
                rs.getString("received")

                );


                return f;
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


       public RequestForm insertGrade (String gradeReceived){

           try (Connection conn = cu.getConnection()) {

               String sql = "insert into \"TRMS\".customers values (default, ?, ?, ?) returning *";
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, gradeReceived);

               ResultSet rs = ps.executeQuery();

               if (rs.next()) {

                   RequestForm f = new RequestForm();
                   f.setGradeReceived(rs.getString("received"));


                   return f;

               }

           } catch (SQLException e) {
               e.printStackTrace();
           }

           return null;





       }






    }



