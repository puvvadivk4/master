using IT.Shared.LogEntities;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using IT.Shared.WebDatabase;
using System.Configuration;
using System.Collections.Specialized;

namespace IT.Shared.LogDAL
{
   public class LogDAL
    {
        public List<Error> ErrorDAL(Error error,String environment)
        {
            List<Error> errorObj = null;
            SqlCommand cmd = null;

            try
            {           
                cmd = Connection.CreateCommand(environment);
                cmd.CommandText = "Select Description,SessionKey,DebugInfo,StackInfo,ExceptionInfo,GeneralInfo from tError where AppName=" + error.AppName+ "Severity="+error.Severity;         

                cmd.Connection.Open();
                SqlDataReader reader = cmd.ExecuteReader();
                if (reader.HasRows)
                {
                    errorObj = new List<Error>();

                    while (reader.Read())
                    {
                        errorObj.Add(
                            new Error
                            {

                                Description = reader["Description"].ToString(),
                                SessionKey = reader["SessionKey"].ToString(),
                                DebugInfo=reader["DebugInfo"].ToString(),
                                StackInfo = reader["StackInfo"].ToString(),
                                ExceptionInfo = reader["ExceptionInfo"].ToString(),
                                GeneralInfo = reader["GeneralInfo"].ToString()

                            }
                            );
                    }
                }
                else
                {
                   //Throwing the exception  which is to be handled
                }

            
           
            }
            catch (SqlException ex)
            {
                throw ex;//Throwing the exception to the SqlExceptions which is to be handled
            }
            finally
            {
                cmd.Connection.Close();
            }
            return errorObj;
        }
        public List<Message> MessagDAL(Message message, String environment)
        {
            List<Message> messageObj = null;
            SqlCommand cmd = null;

            try
            {

                // List<Message> ds = (WebDatabase.WebDatabase.RunSQLQuery<Message>("", "slect * from tmessage", null, false)).ToList();


                cmd = Connection.CreateCommand(environment);
                cmd.CommandText = "Select Source,Message from tMessage where AppName=" + "'" + message.AppName + "'";

                cmd.Connection.Open();
                SqlDataReader reader = cmd.ExecuteReader();
                if (reader.HasRows)
                {
                    messageObj = new List<Message>();

                    while (reader.Read())
                    {
                        messageObj.Add(
                            new Message()
                            {

                                Source = reader["Source"].ToString(),
                                MessageData = reader["Message"].ToString()
                            }
                            );
                    }
                }



            }
            catch (SqlException ex)
            {
                throw ex;//Throwing the exception to the SqlExceptions which is to be handled
            }
            finally {
                cmd.Connection.Close();
            }
            return messageObj;
        }
        
    }
}
