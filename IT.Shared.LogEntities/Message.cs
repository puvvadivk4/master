using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IT.Shared.LogEntities
{/*
    [Id]
      ,[AppName]
      ,[Source]
      ,[Message]
      ,[DateTime]
      ,[MachineName]
      ,[SessionKey]*/
   public class Message
    {
      //  private Guid _ID;
        public Guid ID
        {
            get;
            set;
            
        }
     //   private string _AppName="IndividualclientWCF";
        public string AppName
        {
            get;set;
        }
      //  private string _Source;
        public string Source
        {
            get;
            set;
        }
   //     private string _Message;
        public string MessageData
        {
            get;
            set;
        }
     //   private DateTime _DateTime;
        public DateTime DateTime
        {
            get;
            set;
        }
     //   private string _MachineName;
        public string MachineName
        {
            get;
            set;
        }
     //   private string _SessionKey;
        public string SessionKey
        {
            get;
            set;
        }
    }
}
