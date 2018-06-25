using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IT.Shared.LogDAL
{
    public class Connection
    {
        public static SqlCommand CreateCommand(string environment)
        {

            SqlCommand cmd;
            try
            {
              //  NameValueCollection settings = (NameValueCollection)ConfigurationManager.GetSection("MYConfig");
             //   String constring = settings["DEV"];
                // string SqlConnection = "data source=mssql06.ca.sunlife;user id=SQLSiteLogging;password=fluff";
                SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["CLISiteLoggingConnectionString"].ConnectionString);
                //    con.Open();
                //    SqlCommand cmd = new SqlCommand("select  * from tmessage ", con);
                //SqlDataReader dr   =cmd.ExecuteReader();
                //   int i= dr.FieldCount;
                cmd = new SqlCommand();
                cmd.Connection = con;
                cmd.CommandType = System.Data.CommandType.Text;
            }
            catch (SqlException ex)
            {
                throw ex;
            }

           

            return cmd;
        }


    }
}
